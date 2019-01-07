package facade;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Stack;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.LexerNoViableAltException;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import sugarVisitors.ToAst;
import tools.Assertions;
import antlrGenerated.L42Lexer;
import antlrGenerated.L42Parser;
import antlrGenerated.L42Parser.NudeEContext;
import ast.ErrorMessage;
import ast.ErrorMessage.ParsingError;
import ast.Expression;
import facade.Parser.ParData.State;
/*
 **NOT WHAT I'm doing**
Implement the interface ANTLRErrorListener. You may extend BaseErrorListener for that. Collect the errors and append them to a list.
Call parser.removeErrorListeners() to remove the default listeners
Call parser.addErrorListener(yourListenerInstance) to add your own listener
Parse your input
Now, for the lexer, you may either do the same thing removeErrorListeners/addErrorListener, or add the following rule at the end:

UNKNOWN_CHAR : . ;
With this rule, the lexer will never fail (it will generate UNKNOWN_CHAR tokens when it can't do anything else) and all errors will be generated by the parser (because it won't know what to do with these UNKNOWN_CHAR tokens). I recommend this approach.

http://stackoverflow.com/questions/25832429/how-get-error-messages-of-antlr-parsing/25838580#25838580

 You should get a ParseCancellationException, which wraps a RecognitionException with the error message. Also, this answer of mine could be related.

 * */
public class Parser {
  private static NudeEContext parseCtx(String s){
    LoggedPrintStream lpsErr = LoggedPrintStream.create(System.err);
    System.setErr(lpsErr);
    try{
      NudeEContext ctxResult = getParser(s).nudeE();
      if(lpsErr.buf.length()!=0){
        throw new ParseCancellationException("\n\n------------------------------------\nCurrent file: "+Parser.fileName+"\nParsing error:\n"+lpsErr.buf.toString());
        }
      return ctxResult;
      }
    finally{System.setErr(lpsErr.underlying);}
    }
  private static String fileName=null;
  public static String getFileName(){
    return fileName;
    }
  public synchronized static Expression parse(String fileName,String s){
    String old=Parser.fileName;
    Parser.fileName=fileName;
    try{
      checkForTab(s);
      checkForBalancedParenthesis(s);
      s = replaceORoundWithTab(s);
      NudeEContext ctxResult=parseCtx(s);
      Expression result=ctxResult.accept(new ToAst());
      return result;
      }
    finally{Parser.fileName=old;}
  }
  private static void checkForTab(String s) {
    if(s.contains("\t")){throw new ErrorMessage.InvalidCharacter(getFileName(),
        "Tab ('\\t') is an invalid character in 42");}
  }
  public static antlrGenerated.L42Parser getParser(String s){
    ANTLRInputStream in = new ANTLRInputStream(s);
    antlrGenerated.L42Lexer l=new antlrGenerated.L42Lexer(in);/*{
      @Override public void recover(LexerNoViableAltException e) {
        throw new IllegalArgumentException(e); // Bail out
      }
    @Override public void recover(RecognitionException re) {
        throw new IllegalArgumentException(re); // Bail out
      }};*/
    CommonTokenStream t = new CommonTokenStream(l);
    antlrGenerated.L42Parser p=new antlrGenerated.L42Parser(t);
//    p.setErrorHandler(new BailErrorStrategy());
    return p;
  }

static final class Pos  {
    Pos(int line, int pos, facade.Parser.ParData.State state) {
      this.line = line;   this.pos = pos;   this.state = state;  }
    final int line;
    final int pos;
    final ParData.State state;
    }
  static class ParData{
    int currentLine=1;
    int currentPos=0;
    public static enum State{ None,CommSL,CommML,StrSL,StrMLText,StrMLPadding,Round,Square,Curly}
    Stack<Pos>s=new Stack<>(); {push(State.None);}
     //Stack<ErrorMessage.ParsingError>lastPar=new Stack<ErrorMessage.ParsingError>();


    void nextPos(){currentPos+=1;}

    boolean fails(State... fs){
      Pos cs=s.peek();
      for (State si:fs){if (si==cs.state){return true;}  }
      return false;
      }
    void failPadding(String token){
      if(fails(State.StrMLPadding)){
        throw new ErrorMessage.InvalidCharacterInMultilineStringIndentation(
          Parser.fileName,this.currentLine,this.currentPos,token);}}
    boolean popIf(State ...ps){
      Pos cs=s.peek();
      for (State si:ps){
        if (si==cs.state){s.pop();return true;}
        }
      return false;
      }
    void swapIf(State ns,State ...ss){
      Pos cs=s.peek();
      for (State si:ss){
        if (si==cs.state){s.pop();push(ns);return;}
        }
      }
    boolean pushIf(State pushed,State ... ps){
      Pos cs=s.peek();
      for (State si:ps){
        if (si==cs.state){push(pushed);return true;}
        }
      return false;
      }
    void push(State state){
      s.push(new Pos(this.currentLine,this.currentPos,state));
      }

    private void parMismatch(State s2) {
      String token2=s2==State.Round?")":s.peek().state==State.Square?"]":"}";
      if(s.peek().state==State.None){
        throw new ErrorMessage.UnopenedParenthesis(Parser.fileName,currentLine,currentPos,token2);}
      String token1=s.peek().state==State.Round?"(":s.peek().state==State.Square?"[":"{";
      throw new ErrorMessage.ParenthesisMismatchRange(fileName,
        s.peek().line,s.peek().pos, token1, this.currentLine,this.currentPos, token2);
    }

    void newLine(){//\n
      currentLine+=1;
      currentPos=0;
      //fail in StrSL
      if(fails(State.StrSL)){throw new ErrorMessage.UnclosedStringLiteral(
        fileName, currentLine,currentPos,"\n");}
      //swap StrMLPadding if State.StrMLText
      swapIf(State.StrMLPadding,State.StrMLText);
      //pop inCommSL
      popIf(State.CommSL);
      }

    void singleQuote(){// '
      //fail in Round,Square,Curly
      if(fails(State.Round,State.Square,State.Curly)){
        throw new ErrorMessage.InvalidCharacterOutOfString(
          Parser.fileName,this.currentLine,this.currentPos,"\'");
        }
      //swap in StrMLPadding, push StrMLText
      swapIf(State.StrMLText,State.StrMLPadding);
      }
    void doubleQuote(){// "
      //pop in StrSL,StrMLPadding
      if(popIf(State.StrSL,State.StrMLPadding)){return;}
      //push State.StrSL if State.Round,State.Square,State.Curly
      if(pushIf(State.StrSL,State.None,State.Round,State.Square,State.Curly)){return;}
      }
    void doubleQuoteNL(){// "
      //pop in StrSL,StrMLPadding
      if(popIf(State.StrSL,State.StrMLPadding)){return;}
      //push State.StrSL if State.Round,State.Square,State.Curly
      if(pushIf(State.StrMLPadding,State.None,State.Round,State.Square,State.Curly)){return;}
      }
    void barBar(){// //
      //fail in StrMLPadding
      failPadding("//");
      //push CommSL in Round,Square,Curly
      if(pushIf(State.CommSL,State.None,State.Round,State.Square,State.Curly)){return;}
      }
    void barStarO(){// /*
      //fail in StrMLPadding
      failPadding("/*");
      //push CommML in Round,Square,Curly
      if(pushIf(State.CommML,State.None,State.Round,State.Square,State.Curly)){return;}
      }
    void barStarC(){// */
      //fail in StrMLPadding, Round,Square,Curly
      failPadding("*/");
      //pop in CommML
      if(popIf(State.CommML)){return;}
      }
    void oRound(){// (
      //fail in StrMLPadding
      failPadding("(");
      //push Round in Round,Square,Curly
      if(pushIf(State.Round,State.None,State.Round,State.Square,State.Curly)){return;}
      }
    void cRound(){// )
      //fail in StrMLPadding
      failPadding(")");
      //pop in Round
      if(popIf(State.Round)){return;}
      if(fails(State.None,State.Square,State.Curly)){ parMismatch(State.Round);}
      }
   void oSquare(){// [
      //fail in StrMLPadding
      failPadding("(");
      //push Square in Round,Square,Curly
      if(pushIf(State.Square,State.None,State.Round,State.Square,State.Curly)){return;}
      }
    void cSquare(){// ]
      //fail in StrMLPadding
      failPadding("[");
      //pop in Square
      if(popIf(State.Square)){return;}
      if(fails(State.None,State.Round,State.Curly)){ parMismatch(State.Square);}
      }
  void oCurly(){// {
      //fail in StrMLPadding
      failPadding("{");
      //push Curly in Round,Square,Curly
      if(pushIf(State.Curly,State.None,State.Round,State.Square,State.Curly)){return;}
      }
    void cCurly(){// }
      //fail in StrMLPadding
      failPadding("(");
      //pop in Curly
      if(popIf(State.Curly)){return;}
      if(fails(State.None,State.Round,State.Square)){ parMismatch(State.Curly);}

      }
    void space(){//all ok
      }
    void comma(){//all ok
      }
    void nonSpacing(String c){
      failPadding(c);
      }
  }

  private static String replaceORoundWithTab(String s) {
    char[] toReplace=" ,\n+-*/({[<>=!~:".toCharArray();
    char[] source=s.toCharArray();
    char[] result=s.toCharArray();
    for(char c:toReplace){
      for(int i=1;i<source.length;i++){
        if (source[i]!='('){continue;}
        if (source[i-1]==c){result[i]='\t';}
      }
    }
    s=String.copyValueOf(result);
    return s;
  }
  static class LoggedPrintStream extends PrintStream {
    final StringBuilder buf;
    final PrintStream underlying;
    LoggedPrintStream(StringBuilder sb, OutputStream os, PrintStream ul) {
        super(os);
        this.buf = sb;
        this.underlying = ul;
    }
  private static LoggedPrintStream create(PrintStream toLog) {//from http://stackoverflow.com/questions/4334808/how-could-i-read-java-console-output-into-a-string-buffer
    try {
      final StringBuilder sb = new StringBuilder();
      Field f = FilterOutputStream.class.getDeclaredField("out");
      f.setAccessible(true);
      OutputStream psout = (OutputStream) f.get(toLog);
      return new LoggedPrintStream(sb, new FilterOutputStream(psout) {
        boolean lastIsSlash=false;
        public void write(int b) throws IOException {
          //TODO: hack to put back the "(" that was replaced with tab
          if(lastIsSlash && b=='\\'){
            lastIsSlash=false;
            super.write(b);
            sb.append((char) b);
            return;
          }
          if(lastIsSlash && b=='t'){
            lastIsSlash=false;
            super.write('(');
            sb.append((char) '(');
            return;}
          if(lastIsSlash){
            super.write('\\');
            sb.append((char) '\\');
            }
          lastIsSlash=b=='\\';
          if(!lastIsSlash){
            super.write(b);
            sb.append((char) b);
            }
          }
        }, toLog);
      }
    catch (NoSuchFieldException|IllegalArgumentException |IllegalAccessException e) {
      throw Assertions.codeNotReachable();
      }}}


  public static void checkForBalancedParenthesis(String s) {
  ParData d=new ParData();
  char[] cs=s.toCharArray();
  for(int i=0;i<cs.length;i++){
    char c=cs[i];
    char cp1=' ';
    d.nextPos();
    if(i+1<cs.length){cp1=cs[i+1];}
      switch (c){
      case '\n': d.newLine();
      break;case '/':
        if(cp1=='/'){i++;d.barBar();}
        else if(cp1=='*'){i++;d.barStarO();}
        else d.nonSpacing("/");
      break;case '{':d.oCurly();
      break;case '[':d.oSquare();
      break;case '(':d.oRound();
      break;case '}':d.cCurly();
      break;case ']':d.cSquare();
      break;case ')':d.cRound();
      break;case '\"':
        if(cp1=='\n'
        && ( d.s.peek().state==State.None
        ||d.s.peek().state==State.Round
        || d.s.peek().state==State.Square
        || d.s.peek().state==State.Curly)){i++;d.doubleQuoteNL();}
        else d.doubleQuote();
      break;case '\'':d.singleQuote();
      break;case '*':
        if(cp1=='/'){i++;d.barStarC();}
        else d.nonSpacing("*");
      break;case ' ':d.space();
      break;case ',':d.comma();
      break;default: d.nonSpacing(c+"");
    }
  }
  if(d.s.peek().state!=ParData.State.None){
  ParData.State f=d.s.peek().state;
  String token=f==ParData.State.Round?"(":f==ParData.State.Square?"[":f==ParData.State.Curly?"{":f==ParData.State.CommML?"/*":"string literal";
    throw new ErrorMessage.UnclosedParenthesis(fileName,d.s.peek().line,d.s.peek().pos,token);
    }
  }
}
