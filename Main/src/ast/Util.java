// Generated by delombok at Wed Aug 05 16:30:41 NZST 2015
package ast;

import lombok.NonNull;
import ast.Ast.MethodSelector;
import ast.Ast.Path;

public class Util {
  
  
  public static final class PathMx {
    @NonNull
    private final Path path;
    @NonNull
    private final MethodSelector ms;
    
    public String toString() {
      return "" + path + "." + ms;
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
    
    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public java.lang.String toString() {
      return "Util.PathPath(path1=" + this.getPath1() + ", path2=" + this.getPath2() + ")";
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
}