// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/samebasename/single_level.proto
package com.squareup.wire.protos.single_level;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

import static com.squareup.wire.Message.Label.REPEATED;

public final class Bars extends Message {

  public static final List<Bar> DEFAULT_BARS = Collections.emptyList();

  @ProtoField(tag = 1, label = REPEATED)
  public final List<Bar> bars;

  private Bars(Builder builder) {
    super(builder);
    this.bars = immutableCopyOf(builder.bars);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Bars)) return false;
    return equals(bars, ((Bars) other).bars);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    return result != 0 ? result : (hashCode = bars != null ? bars.hashCode() : 1);
  }

  public static final class Builder extends Message.Builder<Bars> {

    public List<Bar> bars;

    public Builder() {
    }

    public Builder(Bars message) {
      super(message);
      if (message == null) return;
      this.bars = copyOf(message.bars);
    }

    public Builder bars(List<Bar> bars) {
      this.bars = bars;
      return this;
    }

    @Override
    public Bars build() {
      return new Bars(this);
    }
  }
}
