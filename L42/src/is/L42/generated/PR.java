// Generated by delombok at Wed Sep 25 22:13:26 PETT 2019
package is.L42.generated;

import java.util.List;
import is.L42.common.Program;

public final class PR {
  private final List<CT> ctz;
  private final Program p;

  @java.lang.SuppressWarnings("all")
  public PR(final List<CT> ctz, final Program p) {
    this.ctz = ctz;
    this.p = p;
  }

  @java.lang.SuppressWarnings("all")
  public List<CT> ctz() {
    return this.ctz;
  }

  @java.lang.SuppressWarnings("all")
  public Program p() {
    return this.p;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public boolean equals(final java.lang.Object o) {
    if (o == this) return true;
    if (!(o instanceof PR)) return false;
    final PR other = (PR) o;
    final java.lang.Object this$ctz = this.ctz();
    final java.lang.Object other$ctz = other.ctz();
    if (this$ctz == null ? other$ctz != null : !this$ctz.equals(other$ctz)) return false;
    final java.lang.Object this$p = this.p();
    final java.lang.Object other$p = other.p();
    if (this$p == null ? other$p != null : !this$p.equals(other$p)) return false;
    return true;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final java.lang.Object $ctz = this.ctz();
    result = result * PRIME + ($ctz == null ? 43 : $ctz.hashCode());
    final java.lang.Object $p = this.p();
    result = result * PRIME + ($p == null ? 43 : $p.hashCode());
    return result;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public java.lang.String toString() {
    return "PR(ctz=" + this.ctz() + ", p=" + this.p() + ")";
  }

  @java.lang.SuppressWarnings("all")
  public PR withCtz(final List<CT> ctz) {
    return this.ctz == ctz ? this : new PR(ctz, this.p);
  }

  @java.lang.SuppressWarnings("all")
  public PR withP(final Program p) {
    return this.p == p ? this : new PR(this.ctz, p);
  }
}
