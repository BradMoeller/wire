// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: repeated_and_packed.proto at 20:1
package com.squareup.wire.protos;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.List;
import okio.ByteString;

public final class RepeatedAndPacked extends Message<RepeatedAndPacked, RepeatedAndPacked.Builder> {
  public static final ProtoAdapter<RepeatedAndPacked> ADAPTER = new ProtoAdapter<RepeatedAndPacked>(FieldEncoding.LENGTH_DELIMITED, RepeatedAndPacked.class) {
    @Override
    public int encodedSize(RepeatedAndPacked value) {
      return ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(201, value.rep_int32)
          + ProtoAdapter.INT32.asPacked().encodedSizeWithTag(301, value.pack_int32)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, RepeatedAndPacked value) throws IOException {
      if (value.rep_int32 != null) ProtoAdapter.INT32.asRepeated().encodeWithTag(writer, 201, value.rep_int32);
      if (value.pack_int32 != null) ProtoAdapter.INT32.asPacked().encodeWithTag(writer, 301, value.pack_int32);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public RepeatedAndPacked decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 201: builder.rep_int32.add(ProtoAdapter.INT32.decode(reader)); break;
          case 301: builder.pack_int32.add(ProtoAdapter.INT32.decode(reader)); break;
          default: {
            FieldEncoding fieldEncoding = reader.peekFieldEncoding();
            Object value = fieldEncoding.rawProtoAdapter().decode(reader);
            builder.addUnknownField(tag, fieldEncoding, value);
          }
        }
      }
      reader.endMessage(token);
      return builder.build();
    }

    @Override
    public RepeatedAndPacked redact(RepeatedAndPacked value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  };

  private static final long serialVersionUID = 0L;

  public final List<Integer> rep_int32;

  public final List<Integer> pack_int32;

  public RepeatedAndPacked(List<Integer> rep_int32, List<Integer> pack_int32) {
    this(rep_int32, pack_int32, ByteString.EMPTY);
  }

  public RepeatedAndPacked(List<Integer> rep_int32, List<Integer> pack_int32, ByteString unknownFields) {
    super(unknownFields);
    this.rep_int32 = immutableCopyOf("rep_int32", rep_int32);
    this.pack_int32 = immutableCopyOf("pack_int32", pack_int32);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.rep_int32 = copyOf("rep_int32", rep_int32);
    builder.pack_int32 = copyOf("pack_int32", pack_int32);
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof RepeatedAndPacked)) return false;
    RepeatedAndPacked o = (RepeatedAndPacked) other;
    return equals(unknownFields(), o.unknownFields())
        && equals(rep_int32, o.rep_int32)
        && equals(pack_int32, o.pack_int32);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (rep_int32 != null ? rep_int32.hashCode() : 1);
      result = result * 37 + (pack_int32 != null ? pack_int32.hashCode() : 1);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (rep_int32 != null) builder.append(", rep_int32=").append(rep_int32);
    if (pack_int32 != null) builder.append(", pack_int32=").append(pack_int32);
    return builder.replace(0, 2, "RepeatedAndPacked{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<RepeatedAndPacked, Builder> {
    public List<Integer> rep_int32;

    public List<Integer> pack_int32;

    public Builder() {
      rep_int32 = newMutableList();
      pack_int32 = newMutableList();
    }

    public Builder rep_int32(List<Integer> rep_int32) {
      checkElementsNotNull(rep_int32);
      this.rep_int32 = rep_int32;
      return this;
    }

    public Builder pack_int32(List<Integer> pack_int32) {
      checkElementsNotNull(pack_int32);
      this.pack_int32 = pack_int32;
      return this;
    }

    @Override
    public RepeatedAndPacked build() {
      return new RepeatedAndPacked(rep_int32, pack_int32, buildUnknownFields());
    }
  }
}
