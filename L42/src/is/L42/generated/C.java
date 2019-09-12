// Generated by delombok at Wed Sep 11 22:11:15 PETT 2019
package is.L42.generated;

import is.L42.visitors.CloneVisitor;
import is.L42.visitors.CollectorVisitor;
import is.L42.visitors.Visitable;
import is.L42.common.Constants;

public final class C implements LDom, Visitable<C> {
  @Override
  public C accept(CloneVisitor cv) {
    return cv.visitC(this);
  }

  @Override
  public void accept(CollectorVisitor cv) {
    cv.visitC(this);
  }

  @Override
  public String toString() {
    return Constants.toS.apply(this);
  }

  @Override
  public boolean wf() {
    return Constants.wf.test(this);
  }

  private final String inner;
  private final int uniqueNum;

  @java.lang.SuppressWarnings("all")
  public C(final String inner, final int uniqueNum) {
    this.inner = inner;
    this.uniqueNum = uniqueNum;
  }

  @java.lang.SuppressWarnings("all")
  public String inner() {
    return this.inner;
  }

  @java.lang.SuppressWarnings("all")
  public int uniqueNum() {
    return this.uniqueNum;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public boolean equals(final java.lang.Object o) {
    if (o == this) return true;
    if (!(o instanceof C)) return false;
    final C other = (C) o;
    final java.lang.Object this$inner = this.inner();
    final java.lang.Object other$inner = other.inner();
    if (this$inner == null ? other$inner != null : !this$inner.equals(other$inner)) return false;
    if (this.uniqueNum() != other.uniqueNum()) return false;
    return true;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final java.lang.Object $inner = this.inner();
    result = result * PRIME + ($inner == null ? 43 : $inner.hashCode());
    result = result * PRIME + this.uniqueNum();
    return result;
  }

  @java.lang.SuppressWarnings("all")
  public C withInner(final String inner) {
    return this.inner == inner ? this : new C(inner, this.uniqueNum);
  }

  @java.lang.SuppressWarnings("all")
  public C withUniqueNum(final int uniqueNum) {
    return this.uniqueNum == uniqueNum ? this : new C(this.inner, uniqueNum);
  }
}
