// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/redacted_test.proto at 34:1
package com.squareup.wire.protos.redacted;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.TagMap;
import com.squareup.wire.WireField;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public final class RedactedChild extends Message<RedactedChild> {
  public static final ProtoAdapter<RedactedChild> ADAPTER = ProtoAdapter.newMessageAdapter(RedactedChild.class);

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_A = "";

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String a;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.protos.redacted.Redacted#ADAPTER"
  )
  public final Redacted b;

  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.protos.redacted.NotRedacted#ADAPTER"
  )
  public final NotRedacted c;

  public RedactedChild(String a, Redacted b, NotRedacted c) {
    this(a, b, c, TagMap.EMPTY);
  }

  public RedactedChild(String a, Redacted b, NotRedacted c, TagMap tagMap) {
    super(tagMap);
    this.a = a;
    this.b = b;
    this.c = c;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof RedactedChild)) return false;
    RedactedChild o = (RedactedChild) other;
    return equals(tagMap(), o.tagMap())
        && equals(a, o.a)
        && equals(b, o.b)
        && equals(c, o.c);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = tagMap().hashCode();
      result = result * 37 + (a != null ? a.hashCode() : 0);
      result = result * 37 + (b != null ? b.hashCode() : 0);
      result = result * 37 + (c != null ? c.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  public static final class Builder extends com.squareup.wire.Message.Builder<RedactedChild, Builder> {
    public String a;

    public Redacted b;

    public NotRedacted c;

    public Builder() {
    }

    public Builder(RedactedChild message) {
      super(message);
      if (message == null) return;
      this.a = message.a;
      this.b = message.b;
      this.c = message.c;
    }

    public Builder a(String a) {
      this.a = a;
      return this;
    }

    public Builder b(Redacted b) {
      this.b = b;
      return this;
    }

    public Builder c(NotRedacted c) {
      this.c = c;
      return this;
    }

    @Override
    public RedactedChild build() {
      return new RedactedChild(a, b, c, buildTagMap());
    }
  }
}
