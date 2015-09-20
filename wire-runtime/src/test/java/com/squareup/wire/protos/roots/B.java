// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/roots.proto at 39:1
package com.squareup.wire.protos.roots;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.TagMap;
import com.squareup.wire.WireField;
import java.lang.Object;
import java.lang.Override;

public final class B extends Message<B> {
  public static final ProtoAdapter<B> ADAPTER = ProtoAdapter.newMessageAdapter(B.class);

  private static final long serialVersionUID = 0L;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.protos.roots.C#ADAPTER",
      label = WireField.Label.REQUIRED
  )
  public final C c;

  public B(C c) {
    this(c, TagMap.EMPTY);
  }

  public B(C c, TagMap tagMap) {
    super(tagMap);
    this.c = c;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof B)) return false;
    B o = (B) other;
    return equals(tagMap(), o.tagMap())
        && equals(c, o.c);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = tagMap().hashCode();
      result = result * 37 + (c != null ? c.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  public static final class Builder extends com.squareup.wire.Message.Builder<B, Builder> {
    public C c;

    public Builder() {
    }

    public Builder(B message) {
      super(message);
      if (message == null) return;
      this.c = message.c;
    }

    public Builder c(C c) {
      this.c = c;
      return this;
    }

    @Override
    public B build() {
      if (c == null) {
        throw missingRequiredFields(c, "c");
      }
      return new B(c, buildTagMap());
    }
  }
}
