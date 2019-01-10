// Generated by delombok at Mon Nov 26 09:57:26 NZDT 2018
package tools;

import ast.NonNull;
import java.lang.Iterable;
import java.util.stream.Stream;

public class ListFormatter {
  private final StringBuilder result = new StringBuilder();
  @NonNull
  private String header = "";
  @NonNull
  private String prefix = "";
  @NonNull
  private String suffix = "";
  @NonNull
  private String seperator = "";
  @NonNull
  private String footer = "";
  private int count = 0;
  private final boolean skipEmptyList;
  private final boolean skipEmptyElements;

  public ListFormatter() {
    this(true, true);
  }

  public ListFormatter append(String s) {
    if (this.skipEmptyElements && s.isEmpty()) {
      return this;
    }
    if (this.count == 0) {
      this.result.append(this.header);
    } else {
      this.result.append(this.seperator);
    }
    this.result.append(this.prefix).append(s).append(this.suffix);
    this.count += 1;
    return this;
  }

  public <T> ListFormatter append(Iterable<T> ss) {
    for (Object s : ss) {
      this.append(s.toString());
    }
    return this;
  }

  public <T> ListFormatter append(Stream<T> ss) {
    Iterable<T> i = ss::iterator;
    return this.append(i);
  }

  // returns an empty string if 'record' was never called
  // Otherwise, returns:
  //    header + (prefix + s1 + suffix) + seperator + ... + seperator + (prefix + sm + suffix) + footer
  // where msg1 ... msgn where the non-empty arguments passed to record (in order)
  @Override
  public String toString() {
    String r = this.result.toString();
    if (!this.skipEmptyList || !r.isEmpty()) {
      r = r + footer;
    }
    return r;
  }

  @java.lang.SuppressWarnings("all")
  public ListFormatter(final boolean skipEmptyList, final boolean skipEmptyElements) {
    this.skipEmptyList = skipEmptyList;
    this.skipEmptyElements = skipEmptyElements;
  }

  @java.lang.SuppressWarnings("all")
  public ListFormatter header(final String header) {
    this.header = header;
    return this;
  }

  @java.lang.SuppressWarnings("all")
  public ListFormatter prefix(final String prefix) {
    this.prefix = prefix;
    return this;
  }

  @java.lang.SuppressWarnings("all")
  public ListFormatter suffix(final String suffix) {
    this.suffix = suffix;
    return this;
  }

  @java.lang.SuppressWarnings("all")
  public ListFormatter seperator(final String seperator) {
    this.seperator = seperator;
    return this;
  }

  @java.lang.SuppressWarnings("all")
  public ListFormatter footer(final String footer) {
    this.footer = footer;
    return this;
  }

  @java.lang.SuppressWarnings("all")
  public int count() {
    return this.count;
  }
}