package repl;

import java.awt.*; import java.awt.event.*;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

import javax.swing.*;

import facade.Configuration;
import facade.L42;
@SuppressWarnings("serial")
public class ReplGui extends JFrame {
 public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
 Configuration.loadAll();
 SwingUtilities.invokeLater(()-> {
 ReplGui g = new ReplGui();
 g.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
 g.getRootPane().setLayout(new BorderLayout());
 g.runB = new JButton("Run!");
 g.runB.addActionListener((e)->
   g.runCode()
   );
 g.getRootPane().add(g.runB, BorderLayout.SOUTH);
 g.buildGui(g.getRootPane());
 g.pack();
 g.setVisible(true);
 });
 }

JTextArea loadedSrc=new JTextArea(20, 50);
JTextArea newSrc=new JTextArea(2, 50);
{newSrc.setText("reuse L42.is/AdamTowel02\n"+
  "Main:{\n"+
  "  Debug(S\"hi!!\")\n"+        
  "  return ExitCode.normal()\n"+
  "}");
 }
JTextArea output=new JTextArea(20, 50);
JTextArea errors=new JTextArea(20, 50);
ReplState repl=null;
StringBuffer err=new StringBuffer();
boolean running=false;
JButton runB;
ExecutorService executor = Executors.newFixedThreadPool(1);
void runCode(){
  if(running){throw new Error("Was running");}
  running=true;
  runB.setText("Running");
  runB.setEnabled(false);
  /*Future<Object> future = */executor.submit(this::auxRunCode);
  }
void auxRunCode(){
  try{
  String code=newSrc.getText();
  if(repl==null){ repl=ReplState.start("{"+code+"}");}
  else{
    ReplState newR=repl.add(code);
    if(newR!=null){repl=newR;}
    }
  }
  catch(Throwable t){
     //somehow t.printstacktrace freeze stuff as well as inspecting t.cause
      System.out.println(
            ""+t+"\n"+
           Arrays.asList(t.getStackTrace()).stream()
           .map(e->e.toString()+"\n").reduce("",(a,b)->a+b));
      }
  finally{
    SwingUtilities.invokeLater(this::updateTextFields);
    }
  }
private void updateTextFields(){
  try{
    assert L42.record!=null:"d";
    assert err!=null:"a";
    assert errors!=null:"b";
    assert loadedSrc!=null:"c";
    output.setText(L42.record.toString());
    String newErr=err.toString();
    errors.setText(newErr);
    if(repl==null){return;}
    loadedSrc.setText(repl.originalS);
    }
  finally{
    this.running=false;
    runB.setEnabled(true);
    runB.setText("Run!");
    }
  }
private void doAndWait(Runnable r){
  try {executor.submit(r).get();}
  catch (InterruptedException | ExecutionException e) {
    throw new Error(e);
    }
  }
private PrintStream delegatePrintStream(PrintStream prs){
  return new PrintStream(prs){
    public void print(String s) {
//      doAndWait(()->{
//        prs.print(s);
        err.append(s);
//        });
      super.print(s);
      }
    public void println(String s) {
//      doAndWait(()->{
        String ss=s+"\n";
//        prs.println(ss);
        err.append(ss);
//        });
      super.println(s);
      }
    };
  }
void buildGui(JRootPane pane){
  JTabbedPane tabbedPane = new JTabbedPane();  
  loadedSrc.setEditable(false);
  output.setEditable(false);
  errors.setEditable(false);
  tabbedPane.addTab("new code", new JScrollPane(newSrc));
  tabbedPane.addTab("loaded", new JScrollPane(loadedSrc));
  tabbedPane.addTab("output", new JScrollPane(output));
  tabbedPane.addTab("errors", new JScrollPane(errors));
  newSrc.setFont(newSrc.getFont().deriveFont(40f));
  //System.out.println(System.out.getClass().getName());
  //System.out.println(System.err.getClass().getName());
  System.setOut(delegatePrintStream(System.out));
  System.setErr(delegatePrintStream(System.err));
  pane.add(tabbedPane,BorderLayout.CENTER);
  }
}