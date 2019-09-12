// Generated by delombok at Wed Sep 11 22:11:15 PETT 2019
package is.L42.generated;

public final class CT {
  private final ST st;
  private final Half.T t;

  @java.lang.SuppressWarnings("all")
  public CT(final ST st, final Half.T t) {
    this.st = st;
    this.t = t;
  }

  @java.lang.SuppressWarnings("all")
  public ST st() {
    return this.st;
  }

  @java.lang.SuppressWarnings("all")
  public Half.T t() {
    return this.t;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public boolean equals(final java.lang.Object o) {
    if (o == this) return true;
    if (!(o instanceof CT)) return false;
    final CT other = (CT) o;
    final java.lang.Object this$st = this.st();
    final java.lang.Object other$st = other.st();
    if (this$st == null ? other$st != null : !this$st.equals(other$st)) return false;
    final java.lang.Object this$t = this.t();
    final java.lang.Object other$t = other.t();
    if (this$t == null ? other$t != null : !this$t.equals(other$t)) return false;
    return true;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final java.lang.Object $st = this.st();
    result = result * PRIME + ($st == null ? 43 : $st.hashCode());
    final java.lang.Object $t = this.t();
    result = result * PRIME + ($t == null ? 43 : $t.hashCode());
    return result;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public java.lang.String toString() {
    return "CT(st=" + this.st() + ", t=" + this.t() + ")";
  }

  @java.lang.SuppressWarnings("all")
  public CT withSt(final ST st) {
    return this.st == st ? this : new CT(st, this.t);
  }

  @java.lang.SuppressWarnings("all")
  public CT withT(final Half.T t) {
    return this.t == t ? this : new CT(this.st, t);
  }
}
