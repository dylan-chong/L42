// Generated by delombok at Tue Aug 13 20:40:54 PETT 2019
package is.L42.generated;

public final class X {
	private final String inner;

	@java.lang.SuppressWarnings("all")
	public X(final String inner) {
		this.inner = inner;
	}

	@java.lang.SuppressWarnings("all")
	public String inner() {
		return this.inner;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	public boolean equals(final java.lang.Object o) {
		if (o == this) return true;
		if (!(o instanceof X)) return false;
		final X other = (X) o;
		final java.lang.Object this$inner = this.inner();
		final java.lang.Object other$inner = other.inner();
		if (this$inner == null ? other$inner != null : !this$inner.equals(other$inner)) return false;
		return true;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final java.lang.Object $inner = this.inner();
		result = result * PRIME + ($inner == null ? 43 : $inner.hashCode());
		return result;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	public java.lang.String toString() {
		return "X(inner=" + this.inner() + ")";
	}

	@java.lang.SuppressWarnings("all")
	public X withInner(final String inner) {
		return this.inner == inner ? this : new X(inner);
	}
}
