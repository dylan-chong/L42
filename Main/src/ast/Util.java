// Generated by delombok at Sat Feb 18 07:00:36 ICT 2017
package ast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ast.Ast.Doc;
import ast.Ast.MethodSelector;
import ast.Ast.Path;
import ast.Ast.Stage;
import ast.ExpCore.*;
import ast.ExpCore.ClassB.Member;
import ast.Util.InvalidMwtAsState;

public class Util {


	public static final class PrivatePedex {
		private final int family;
		private final int number;

		@java.beans.ConstructorProperties({"family", "number"})
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public PrivatePedex(final int family, final int number) {
			this.family = family;
			this.number = number;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public int getFamily() {
			return this.family;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public int getNumber() {
			return this.number;
		}

		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public boolean equals(final java.lang.Object o) {
			if (o == this) return true;
			if (!(o instanceof Util.PrivatePedex)) return false;
			final PrivatePedex other = (PrivatePedex)o;
			if (this.getFamily() != other.getFamily()) return false;
			if (this.getNumber() != other.getNumber()) return false;
			return true;
		}

		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public int hashCode() {
			final int PRIME = 59;
			int result = 1;
			result = result * PRIME + this.getFamily();
			result = result * PRIME + this.getNumber();
			return result;
		}

		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public java.lang.String toString() {
			return "Util.PrivatePedex(family=" + this.getFamily() + ", number=" + this.getNumber() + ")";
		}
	}

	public static final class InfoAboutMs {
		@NonNull
		private final java.util.List<Path> allSuper;
		@NonNull
		private final Path original;
		@NonNull
		private final ast.Ast.MethodType mt;

		@java.beans.ConstructorProperties({"allSuper", "original", "mt"})
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public InfoAboutMs(@NonNull final java.util.List<Path> allSuper, @NonNull final Path original, @NonNull final ast.Ast.MethodType mt) {
			if (allSuper == null) {
				throw new java.lang.NullPointerException("allSuper");
			}
			if (original == null) {
				throw new java.lang.NullPointerException("original");
			}
			if (mt == null) {
				throw new java.lang.NullPointerException("mt");
			}
			this.allSuper = allSuper;
			this.original = original;
			this.mt = mt;
		}

		@NonNull
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public java.util.List<Path> getAllSuper() {
			return this.allSuper;
		}

		@NonNull
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public Path getOriginal() {
			return this.original;
		}

		@NonNull
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public ast.Ast.MethodType getMt() {
			return this.mt;
		}

		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public boolean equals(final java.lang.Object o) {
			if (o == this) return true;
			if (!(o instanceof Util.InfoAboutMs)) return false;
			final InfoAboutMs other = (InfoAboutMs)o;
			final java.lang.Object this$allSuper = this.getAllSuper();
			final java.lang.Object other$allSuper = other.getAllSuper();
			if (this$allSuper == null ? other$allSuper != null : !this$allSuper.equals(other$allSuper)) return false;
			final java.lang.Object this$original = this.getOriginal();
			final java.lang.Object other$original = other.getOriginal();
			if (this$original == null ? other$original != null : !this$original.equals(other$original)) return false;
			final java.lang.Object this$mt = this.getMt();
			final java.lang.Object other$mt = other.getMt();
			if (this$mt == null ? other$mt != null : !this$mt.equals(other$mt)) return false;
			return true;
		}

		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public int hashCode() {
			final int PRIME = 59;
			int result = 1;
			final java.lang.Object $allSuper = this.getAllSuper();
			result = result * PRIME + ($allSuper == null ? 0 : $allSuper.hashCode());
			final java.lang.Object $original = this.getOriginal();
			result = result * PRIME + ($original == null ? 0 : $original.hashCode());
			final java.lang.Object $mt = this.getMt();
			result = result * PRIME + ($mt == null ? 0 : $mt.hashCode());
			return result;
		}

		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public java.lang.String toString() {
			return "Util.InfoAboutMs(allSuper=" + this.getAllSuper() + ", original=" + this.getOriginal() + ", mt=" + this.getMt() + ")";
		}
	}

	public static final class InvalidMwtAsState {
		@NonNull
		private final String reason;
		@NonNull
		private final ExpCore.ClassB.MethodWithType mwt;

		@java.beans.ConstructorProperties({"reason", "mwt"})
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public InvalidMwtAsState(@NonNull final String reason, @NonNull final ExpCore.ClassB.MethodWithType mwt) {
			if (reason == null) {
				throw new java.lang.NullPointerException("reason");
			}
			if (mwt == null) {
				throw new java.lang.NullPointerException("mwt");
			}
			this.reason = reason;
			this.mwt = mwt;
		}

		@NonNull
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public String getReason() {
			return this.reason;
		}

		@NonNull
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public ExpCore.ClassB.MethodWithType getMwt() {
			return this.mwt;
		}

		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public boolean equals(final java.lang.Object o) {
			if (o == this) return true;
			if (!(o instanceof Util.InvalidMwtAsState)) return false;
			final InvalidMwtAsState other = (InvalidMwtAsState)o;
			final java.lang.Object this$reason = this.getReason();
			final java.lang.Object other$reason = other.getReason();
			if (this$reason == null ? other$reason != null : !this$reason.equals(other$reason)) return false;
			final java.lang.Object this$mwt = this.getMwt();
			final java.lang.Object other$mwt = other.getMwt();
			if (this$mwt == null ? other$mwt != null : !this$mwt.equals(other$mwt)) return false;
			return true;
		}

		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public int hashCode() {
			final int PRIME = 59;
			int result = 1;
			final java.lang.Object $reason = this.getReason();
			result = result * PRIME + ($reason == null ? 0 : $reason.hashCode());
			final java.lang.Object $mwt = this.getMwt();
			result = result * PRIME + ($mwt == null ? 0 : $mwt.hashCode());
			return result;
		}

		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public java.lang.String toString() {
			return "Util.InvalidMwtAsState(reason=" + this.getReason() + ", mwt=" + this.getMwt() + ")";
		}
	}

	public static final class PathMwt {
		@NonNull
		private final Path original;
		@NonNull
		private final ast.ExpCore.ClassB.MethodWithType mwt;

		public String toString() {
			return "" + this.original + "::" + sugarVisitors.ToFormattedText.of(this.mwt).trim().replace("\n", "");
		}

		@java.beans.ConstructorProperties({"original", "mwt"})
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public PathMwt(@NonNull final Path original, @NonNull final ast.ExpCore.ClassB.MethodWithType mwt) {
			if (original == null) {
				throw new java.lang.NullPointerException("original");
			}
			if (mwt == null) {
				throw new java.lang.NullPointerException("mwt");
			}
			this.original = original;
			this.mwt = mwt;
		}

		@NonNull
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public Path getOriginal() {
			return this.original;
		}

		@NonNull
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public ast.ExpCore.ClassB.MethodWithType getMwt() {
			return this.mwt;
		}

		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public boolean equals(final java.lang.Object o) {
			if (o == this) return true;
			if (!(o instanceof Util.PathMwt)) return false;
			final PathMwt other = (PathMwt)o;
			final java.lang.Object this$original = this.getOriginal();
			final java.lang.Object other$original = other.getOriginal();
			if (this$original == null ? other$original != null : !this$original.equals(other$original)) return false;
			final java.lang.Object this$mwt = this.getMwt();
			final java.lang.Object other$mwt = other.getMwt();
			if (this$mwt == null ? other$mwt != null : !this$mwt.equals(other$mwt)) return false;
			return true;
		}

		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public int hashCode() {
			final int PRIME = 59;
			int result = 1;
			final java.lang.Object $original = this.getOriginal();
			result = result * PRIME + ($original == null ? 0 : $original.hashCode());
			final java.lang.Object $mwt = this.getMwt();
			result = result * PRIME + ($mwt == null ? 0 : $mwt.hashCode());
			return result;
		}
	}

	public static final class CsMx {
		@NonNull
		private final java.util.List<String> cs;
		@NonNull
		private final MethodSelector ms;

		public String toString() {
			String prefix = "This0";
			if (!cs.isEmpty()) {
				prefix = String.join(".", cs);
			}
			return prefix + "::" + ms;
		}

		@java.beans.ConstructorProperties({"cs", "ms"})
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public CsMx(@NonNull final java.util.List<String> cs, @NonNull final MethodSelector ms) {
			if (cs == null) {
				throw new java.lang.NullPointerException("cs");
			}
			if (ms == null) {
				throw new java.lang.NullPointerException("ms");
			}
			this.cs = cs;
			this.ms = ms;
		}

		@NonNull
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public java.util.List<String> getCs() {
			return this.cs;
		}

		@NonNull
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public MethodSelector getMs() {
			return this.ms;
		}

		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public boolean equals(final java.lang.Object o) {
			if (o == this) return true;
			if (!(o instanceof Util.CsMx)) return false;
			final CsMx other = (CsMx)o;
			final java.lang.Object this$cs = this.getCs();
			final java.lang.Object other$cs = other.getCs();
			if (this$cs == null ? other$cs != null : !this$cs.equals(other$cs)) return false;
			final java.lang.Object this$ms = this.getMs();
			final java.lang.Object other$ms = other.getMs();
			if (this$ms == null ? other$ms != null : !this$ms.equals(other$ms)) return false;
			return true;
		}

		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public int hashCode() {
			final int PRIME = 59;
			int result = 1;
			final java.lang.Object $cs = this.getCs();
			result = result * PRIME + ($cs == null ? 0 : $cs.hashCode());
			final java.lang.Object $ms = this.getMs();
			result = result * PRIME + ($ms == null ? 0 : $ms.hashCode());
			return result;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public CsMx withCs(@NonNull final java.util.List<String> cs) {
			if (cs == null) {
				throw new java.lang.NullPointerException("cs");
			}
			return this.cs == cs ? this : new CsMx(cs, this.ms);
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public CsMx withMs(@NonNull final MethodSelector ms) {
			if (ms == null) {
				throw new java.lang.NullPointerException("ms");
			}
			return this.ms == ms ? this : new CsMx(this.cs, ms);
		}
	}

	public static final class PathMx {
		@NonNull
		private final Path path;
		@NonNull
		private final MethodSelector ms;

		public String toString() {
			return "" + path + "::" + ms;
		}

		@java.beans.ConstructorProperties({"path", "ms"})
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public PathMx(@NonNull final Path path, @NonNull final MethodSelector ms) {
			if (path == null) {
				throw new java.lang.NullPointerException("path");
			}
			if (ms == null) {
				throw new java.lang.NullPointerException("ms");
			}
			this.path = path;
			this.ms = ms;
		}

		@NonNull
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public Path getPath() {
			return this.path;
		}

		@NonNull
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public MethodSelector getMs() {
			return this.ms;
		}

		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public boolean equals(final java.lang.Object o) {
			if (o == this) return true;
			if (!(o instanceof Util.PathMx)) return false;
			final PathMx other = (PathMx)o;
			final java.lang.Object this$path = this.getPath();
			final java.lang.Object other$path = other.getPath();
			if (this$path == null ? other$path != null : !this$path.equals(other$path)) return false;
			final java.lang.Object this$ms = this.getMs();
			final java.lang.Object other$ms = other.getMs();
			if (this$ms == null ? other$ms != null : !this$ms.equals(other$ms)) return false;
			return true;
		}

		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public int hashCode() {
			final int PRIME = 59;
			int result = 1;
			final java.lang.Object $path = this.getPath();
			result = result * PRIME + ($path == null ? 0 : $path.hashCode());
			final java.lang.Object $ms = this.getMs();
			result = result * PRIME + ($ms == null ? 0 : $ms.hashCode());
			return result;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public PathMx withPath(@NonNull final Path path) {
			if (path == null) {
				throw new java.lang.NullPointerException("path");
			}
			return this.path == path ? this : new PathMx(path, this.ms);
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public PathMx withMs(@NonNull final MethodSelector ms) {
			if (ms == null) {
				throw new java.lang.NullPointerException("ms");
			}
			return this.ms == ms ? this : new PathMx(this.path, ms);
		}
	}

	public static final class PathMxMx {
		@NonNull
		private final Path path;
		@NonNull
		private final MethodSelector ms1;
		@NonNull
		private final MethodSelector ms2;

		@java.beans.ConstructorProperties({"path", "ms1", "ms2"})
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public PathMxMx(@NonNull final Path path, @NonNull final MethodSelector ms1, @NonNull final MethodSelector ms2) {
			if (path == null) {
				throw new java.lang.NullPointerException("path");
			}
			if (ms1 == null) {
				throw new java.lang.NullPointerException("ms1");
			}
			if (ms2 == null) {
				throw new java.lang.NullPointerException("ms2");
			}
			this.path = path;
			this.ms1 = ms1;
			this.ms2 = ms2;
		}

		@NonNull
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public Path getPath() {
			return this.path;
		}

		@NonNull
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public MethodSelector getMs1() {
			return this.ms1;
		}

		@NonNull
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public MethodSelector getMs2() {
			return this.ms2;
		}

		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public boolean equals(final java.lang.Object o) {
			if (o == this) return true;
			if (!(o instanceof Util.PathMxMx)) return false;
			final PathMxMx other = (PathMxMx)o;
			final java.lang.Object this$path = this.getPath();
			final java.lang.Object other$path = other.getPath();
			if (this$path == null ? other$path != null : !this$path.equals(other$path)) return false;
			final java.lang.Object this$ms1 = this.getMs1();
			final java.lang.Object other$ms1 = other.getMs1();
			if (this$ms1 == null ? other$ms1 != null : !this$ms1.equals(other$ms1)) return false;
			final java.lang.Object this$ms2 = this.getMs2();
			final java.lang.Object other$ms2 = other.getMs2();
			if (this$ms2 == null ? other$ms2 != null : !this$ms2.equals(other$ms2)) return false;
			return true;
		}

		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public int hashCode() {
			final int PRIME = 59;
			int result = 1;
			final java.lang.Object $path = this.getPath();
			result = result * PRIME + ($path == null ? 0 : $path.hashCode());
			final java.lang.Object $ms1 = this.getMs1();
			result = result * PRIME + ($ms1 == null ? 0 : $ms1.hashCode());
			final java.lang.Object $ms2 = this.getMs2();
			result = result * PRIME + ($ms2 == null ? 0 : $ms2.hashCode());
			return result;
		}

		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public java.lang.String toString() {
			return "Util.PathMxMx(path=" + this.getPath() + ", ms1=" + this.getMs1() + ", ms2=" + this.getMs2() + ")";
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public PathMxMx withPath(@NonNull final Path path) {
			if (path == null) {
				throw new java.lang.NullPointerException("path");
			}
			return this.path == path ? this : new PathMxMx(path, this.ms1, this.ms2);
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public PathMxMx withMs1(@NonNull final MethodSelector ms1) {
			if (ms1 == null) {
				throw new java.lang.NullPointerException("ms1");
			}
			return this.ms1 == ms1 ? this : new PathMxMx(this.path, ms1, this.ms2);
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public PathMxMx withMs2(@NonNull final MethodSelector ms2) {
			if (ms2 == null) {
				throw new java.lang.NullPointerException("ms2");
			}
			return this.ms2 == ms2 ? this : new PathMxMx(this.path, this.ms1, ms2);
		}
	}

	public static final class PathPath {
		@NonNull
		private final Path path1;
		@NonNull
		private final Path path2;

		public String toString() {
			return "" + path1 + "->" + path2;
		}

		@java.beans.ConstructorProperties({"path1", "path2"})
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public PathPath(@NonNull final Path path1, @NonNull final Path path2) {
			if (path1 == null) {
				throw new java.lang.NullPointerException("path1");
			}
			if (path2 == null) {
				throw new java.lang.NullPointerException("path2");
			}
			this.path1 = path1;
			this.path2 = path2;
		}

		@NonNull
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public Path getPath1() {
			return this.path1;
		}

		@NonNull
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public Path getPath2() {
			return this.path2;
		}

		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public boolean equals(final java.lang.Object o) {
			if (o == this) return true;
			if (!(o instanceof Util.PathPath)) return false;
			final PathPath other = (PathPath)o;
			final java.lang.Object this$path1 = this.getPath1();
			final java.lang.Object other$path1 = other.getPath1();
			if (this$path1 == null ? other$path1 != null : !this$path1.equals(other$path1)) return false;
			final java.lang.Object this$path2 = this.getPath2();
			final java.lang.Object other$path2 = other.getPath2();
			if (this$path2 == null ? other$path2 != null : !this$path2.equals(other$path2)) return false;
			return true;
		}

		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public int hashCode() {
			final int PRIME = 59;
			int result = 1;
			final java.lang.Object $path1 = this.getPath1();
			result = result * PRIME + ($path1 == null ? 0 : $path1.hashCode());
			final java.lang.Object $path2 = this.getPath2();
			result = result * PRIME + ($path2 == null ? 0 : $path2.hashCode());
			return result;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public PathPath withPath1(@NonNull final Path path1) {
			if (path1 == null) {
				throw new java.lang.NullPointerException("path1");
			}
			return this.path1 == path1 ? this : new PathPath(path1, this.path2);
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public PathPath withPath2(@NonNull final Path path2) {
			if (path2 == null) {
				throw new java.lang.NullPointerException("path2");
			}
			return this.path2 == path2 ? this : new PathPath(this.path1, path2);
		}
	}

	public static class PathSPath {
		@NonNull
		Path path;
		@NonNull
		java.util.Set<Path> pathsSet;

		public String toString() {
			return "" + path + "->" + pathsSet;
		}

		@java.beans.ConstructorProperties({"path", "pathsSet"})
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public PathSPath(@NonNull final Path path, @NonNull final java.util.Set<Path> pathsSet) {
			if (path == null) {
				throw new java.lang.NullPointerException("path");
			}
			if (pathsSet == null) {
				throw new java.lang.NullPointerException("pathsSet");
			}
			this.path = path;
			this.pathsSet = pathsSet;
		}

		@NonNull
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public Path getPath() {
			return this.path;
		}

		@NonNull
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public java.util.Set<Path> getPathsSet() {
			return this.pathsSet;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public void setPath(@NonNull final Path path) {
			if (path == null) {
				throw new java.lang.NullPointerException("path");
			}
			this.path = path;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public void setPathsSet(@NonNull final java.util.Set<Path> pathsSet) {
			if (pathsSet == null) {
				throw new java.lang.NullPointerException("pathsSet");
			}
			this.pathsSet = pathsSet;
		}

		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public boolean equals(final java.lang.Object o) {
			if (o == this) return true;
			if (!(o instanceof Util.PathSPath)) return false;
			final PathSPath other = (PathSPath)o;
			if (!other.canEqual((java.lang.Object)this)) return false;
			final java.lang.Object this$path = this.getPath();
			final java.lang.Object other$path = other.getPath();
			if (this$path == null ? other$path != null : !this$path.equals(other$path)) return false;
			final java.lang.Object this$pathsSet = this.getPathsSet();
			final java.lang.Object other$pathsSet = other.getPathsSet();
			if (this$pathsSet == null ? other$pathsSet != null : !this$pathsSet.equals(other$pathsSet)) return false;
			return true;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		protected boolean canEqual(final java.lang.Object other) {
			return other instanceof Util.PathSPath;
		}

		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public int hashCode() {
			final int PRIME = 59;
			int result = 1;
			final java.lang.Object $path = this.getPath();
			result = result * PRIME + ($path == null ? 0 : $path.hashCode());
			final java.lang.Object $pathsSet = this.getPathsSet();
			result = result * PRIME + ($pathsSet == null ? 0 : $pathsSet.hashCode());
			return result;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public PathSPath withPath(@NonNull final Path path) {
			if (path == null) {
				throw new java.lang.NullPointerException("path");
			}
			return this.path == path ? this : new PathSPath(path, this.pathsSet);
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public PathSPath withPathsSet(@NonNull final java.util.Set<Path> pathsSet) {
			if (pathsSet == null) {
				throw new java.lang.NullPointerException("pathsSet");
			}
			return this.pathsSet == pathsSet ? this : new PathSPath(this.path, pathsSet);
		}
	}

	public static class SPathSPath {
		@NonNull
		Path src;
		@NonNull
		ClassB.MethodWithType mwt1;
		@NonNull
		ClassB.MethodWithType mwt2;

		@java.beans.ConstructorProperties({"src", "mwt1", "mwt2"})
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public SPathSPath(@NonNull final Path src, @NonNull final ClassB.MethodWithType mwt1, @NonNull final ClassB.MethodWithType mwt2) {
			if (src == null) {
				throw new java.lang.NullPointerException("src");
			}
			if (mwt1 == null) {
				throw new java.lang.NullPointerException("mwt1");
			}
			if (mwt2 == null) {
				throw new java.lang.NullPointerException("mwt2");
			}
			this.src = src;
			this.mwt1 = mwt1;
			this.mwt2 = mwt2;
		}

		@NonNull
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public Path getSrc() {
			return this.src;
		}

		@NonNull
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public ClassB.MethodWithType getMwt1() {
			return this.mwt1;
		}

		@NonNull
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public ClassB.MethodWithType getMwt2() {
			return this.mwt2;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public void setSrc(@NonNull final Path src) {
			if (src == null) {
				throw new java.lang.NullPointerException("src");
			}
			this.src = src;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public void setMwt1(@NonNull final ClassB.MethodWithType mwt1) {
			if (mwt1 == null) {
				throw new java.lang.NullPointerException("mwt1");
			}
			this.mwt1 = mwt1;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public void setMwt2(@NonNull final ClassB.MethodWithType mwt2) {
			if (mwt2 == null) {
				throw new java.lang.NullPointerException("mwt2");
			}
			this.mwt2 = mwt2;
		}

		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public boolean equals(final java.lang.Object o) {
			if (o == this) return true;
			if (!(o instanceof Util.SPathSPath)) return false;
			final SPathSPath other = (SPathSPath)o;
			if (!other.canEqual((java.lang.Object)this)) return false;
			final java.lang.Object this$src = this.getSrc();
			final java.lang.Object other$src = other.getSrc();
			if (this$src == null ? other$src != null : !this$src.equals(other$src)) return false;
			final java.lang.Object this$mwt1 = this.getMwt1();
			final java.lang.Object other$mwt1 = other.getMwt1();
			if (this$mwt1 == null ? other$mwt1 != null : !this$mwt1.equals(other$mwt1)) return false;
			final java.lang.Object this$mwt2 = this.getMwt2();
			final java.lang.Object other$mwt2 = other.getMwt2();
			if (this$mwt2 == null ? other$mwt2 != null : !this$mwt2.equals(other$mwt2)) return false;
			return true;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		protected boolean canEqual(final java.lang.Object other) {
			return other instanceof Util.SPathSPath;
		}

		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public int hashCode() {
			final int PRIME = 59;
			int result = 1;
			final java.lang.Object $src = this.getSrc();
			result = result * PRIME + ($src == null ? 0 : $src.hashCode());
			final java.lang.Object $mwt1 = this.getMwt1();
			result = result * PRIME + ($mwt1 == null ? 0 : $mwt1.hashCode());
			final java.lang.Object $mwt2 = this.getMwt2();
			result = result * PRIME + ($mwt2 == null ? 0 : $mwt2.hashCode());
			return result;
		}

		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public java.lang.String toString() {
			return "Util.SPathSPath(src=" + this.getSrc() + ", mwt1=" + this.getMwt1() + ", mwt2=" + this.getMwt2() + ")";
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public SPathSPath withSrc(@NonNull final Path src) {
			if (src == null) {
				throw new java.lang.NullPointerException("src");
			}
			return this.src == src ? this : new SPathSPath(src, this.mwt1, this.mwt2);
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public SPathSPath withMwt1(@NonNull final ClassB.MethodWithType mwt1) {
			if (mwt1 == null) {
				throw new java.lang.NullPointerException("mwt1");
			}
			return this.mwt1 == mwt1 ? this : new SPathSPath(this.src, mwt1, this.mwt2);
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public SPathSPath withMwt2(@NonNull final ClassB.MethodWithType mwt2) {
			if (mwt2 == null) {
				throw new java.lang.NullPointerException("mwt2");
			}
			return this.mwt2 == mwt2 ? this : new SPathSPath(this.src, this.mwt1, mwt2);
		}
		//@NonNull List<Path> paths1; @NonNull List<Path> paths2;
		//public String toString(){return ""+paths1+"->"+paths2;}
	}

	public static class CachedStage {

		public String toString() {
			String result = "anonymus";
			if (!this.givenName.isEmpty()) {
				result = this.givenName;
			}
			if (this.stage == Stage.Less) {
				result = "-" + result;
			}
			if (this.stage == Stage.Plus) {
				result = "+" + result;
			}
			if (!this.coherent.isEmpty()) {
				result += "[not coherent:" + this.coherent + "]";
			}
			if (this.verified) {
				result += "[verified]";
			}
			result += "[";
			for (ClassB cb : new java.util.HashSet<>(this.dependencies)) {
				if (cb.getStage().stage == Stage.Less) {
					result += "-";
				}
				if (cb.getStage().stage == Stage.Plus) {
					result += "+";
				}
				if (cb.getStage().getGivenName().isEmpty()) {
					result += "?;";
				} else {
					result += cb.getStage().getGivenName() + ";";
				}
			}
			result += "]";
			return result;
		}
		boolean verified = false;
		boolean privateNormalized = false;
		final java.util.List<Integer> families = new java.util.ArrayList<>();
		@NonNull
		ast.Ast.Stage stage = Stage.None;
		final java.util.List<ClassB> dependencies = new java.util.ArrayList<>();
		java.util.List<PathMwt> inherited = null;
		java.util.List<Path> inheritedPaths = null;
		List<InvalidMwtAsState> coherent = Collections.emptyList();
		String givenName = "";

		public boolean isInheritedComputed() {
			return inherited != null;
		}

		public CachedStage copyMostStableInfo() {
			//to avoid the misdesigned clone
			CachedStage result = new CachedStage();
			result.verified = this.verified;
			result.privateNormalized = this.privateNormalized;
			result.families.addAll(this.families);
			return result;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public CachedStage() {
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public boolean isVerified() {
			return this.verified;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public boolean isPrivateNormalized() {
			return this.privateNormalized;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public java.util.List<Integer> getFamilies() {
			return this.families;
		}

		@NonNull
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public ast.Ast.Stage getStage() {
			return this.stage;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public java.util.List<ClassB> getDependencies() {
			return this.dependencies;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public java.util.List<PathMwt> getInherited() {
			return this.inherited;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public java.util.List<Path> getInheritedPaths() {
			return this.inheritedPaths;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public List<InvalidMwtAsState> getCoherent() {
			return this.coherent;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public String getGivenName() {
			return this.givenName;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public void setVerified(final boolean verified) {
			this.verified = verified;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public void setPrivateNormalized(final boolean privateNormalized) {
			this.privateNormalized = privateNormalized;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public void setStage(@NonNull final ast.Ast.Stage stage) {
			if (stage == null) {
				throw new java.lang.NullPointerException("stage");
			}
			this.stage = stage;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public void setInherited(final java.util.List<PathMwt> inherited) {
			this.inherited = inherited;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public void setInheritedPaths(final java.util.List<Path> inheritedPaths) {
			this.inheritedPaths = inheritedPaths;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public void setCoherent(final List<InvalidMwtAsState> coherent) {
			this.coherent = coherent;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public void setGivenName(final String givenName) {
			this.givenName = givenName;
		}

		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public boolean equals(final java.lang.Object o) {
			if (o == this) return true;
			if (!(o instanceof Util.CachedStage)) return false;
			final CachedStage other = (CachedStage)o;
			if (!other.canEqual((java.lang.Object)this)) return false;
			if (this.isVerified() != other.isVerified()) return false;
			if (this.isPrivateNormalized() != other.isPrivateNormalized()) return false;
			final java.lang.Object this$families = this.getFamilies();
			final java.lang.Object other$families = other.getFamilies();
			if (this$families == null ? other$families != null : !this$families.equals(other$families)) return false;
			final java.lang.Object this$stage = this.getStage();
			final java.lang.Object other$stage = other.getStage();
			if (this$stage == null ? other$stage != null : !this$stage.equals(other$stage)) return false;
			final java.lang.Object this$dependencies = this.getDependencies();
			final java.lang.Object other$dependencies = other.getDependencies();
			if (this$dependencies == null ? other$dependencies != null : !this$dependencies.equals(other$dependencies)) return false;
			final java.lang.Object this$inherited = this.getInherited();
			final java.lang.Object other$inherited = other.getInherited();
			if (this$inherited == null ? other$inherited != null : !this$inherited.equals(other$inherited)) return false;
			final java.lang.Object this$inheritedPaths = this.getInheritedPaths();
			final java.lang.Object other$inheritedPaths = other.getInheritedPaths();
			if (this$inheritedPaths == null ? other$inheritedPaths != null : !this$inheritedPaths.equals(other$inheritedPaths)) return false;
			final java.lang.Object this$coherent = this.getCoherent();
			final java.lang.Object other$coherent = other.getCoherent();
			if (this$coherent == null ? other$coherent != null : !this$coherent.equals(other$coherent)) return false;
			final java.lang.Object this$givenName = this.getGivenName();
			final java.lang.Object other$givenName = other.getGivenName();
			if (this$givenName == null ? other$givenName != null : !this$givenName.equals(other$givenName)) return false;
			return true;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		protected boolean canEqual(final java.lang.Object other) {
			return other instanceof Util.CachedStage;
		}

		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public int hashCode() {
			final int PRIME = 59;
			int result = 1;
			result = result * PRIME + (this.isVerified() ? 79 : 97);
			result = result * PRIME + (this.isPrivateNormalized() ? 79 : 97);
			final java.lang.Object $families = this.getFamilies();
			result = result * PRIME + ($families == null ? 0 : $families.hashCode());
			final java.lang.Object $stage = this.getStage();
			result = result * PRIME + ($stage == null ? 0 : $stage.hashCode());
			final java.lang.Object $dependencies = this.getDependencies();
			result = result * PRIME + ($dependencies == null ? 0 : $dependencies.hashCode());
			final java.lang.Object $inherited = this.getInherited();
			result = result * PRIME + ($inherited == null ? 0 : $inherited.hashCode());
			final java.lang.Object $inheritedPaths = this.getInheritedPaths();
			result = result * PRIME + ($inheritedPaths == null ? 0 : $inheritedPaths.hashCode());
			final java.lang.Object $coherent = this.getCoherent();
			result = result * PRIME + ($coherent == null ? 0 : $coherent.hashCode());
			final java.lang.Object $givenName = this.getGivenName();
			result = result * PRIME + ($givenName == null ? 0 : $givenName.hashCode());
			return result;
		}
	}
	/* @Data public static class CachedMt{
	  ast.Ast.MethodType mt;
	  Path path;
  }*/
}