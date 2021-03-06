/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.pickme.events.trip;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class TraceId extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -3572751774820962270L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TraceId\",\"namespace\":\"com.pickme.events.trip\",\"fields\":[{\"name\":\"high\",\"type\":\"long\",\"default\":0},{\"name\":\"low\",\"type\":\"long\",\"default\":0}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<TraceId> ENCODER =
      new BinaryMessageEncoder<TraceId>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<TraceId> DECODER =
      new BinaryMessageDecoder<TraceId>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<TraceId> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<TraceId> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<TraceId>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this TraceId to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a TraceId from a ByteBuffer. */
  public static TraceId fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public long high;
  @Deprecated public long low;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public TraceId() {}

  /**
   * All-args constructor.
   * @param high The new value for high
   * @param low The new value for low
   */
  public TraceId(java.lang.Long high, java.lang.Long low) {
    this.high = high;
    this.low = low;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return high;
    case 1: return low;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: high = (java.lang.Long)value$; break;
    case 1: low = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'high' field.
   * @return The value of the 'high' field.
   */
  public java.lang.Long getHigh() {
    return high;
  }

  /**
   * Sets the value of the 'high' field.
   * @param value the value to set.
   */
  public void setHigh(java.lang.Long value) {
    this.high = value;
  }

  /**
   * Gets the value of the 'low' field.
   * @return The value of the 'low' field.
   */
  public java.lang.Long getLow() {
    return low;
  }

  /**
   * Sets the value of the 'low' field.
   * @param value the value to set.
   */
  public void setLow(java.lang.Long value) {
    this.low = value;
  }

  /**
   * Creates a new TraceId RecordBuilder.
   * @return A new TraceId RecordBuilder
   */
  public static com.pickme.events.trip.TraceId.Builder newBuilder() {
    return new com.pickme.events.trip.TraceId.Builder();
  }

  /**
   * Creates a new TraceId RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new TraceId RecordBuilder
   */
  public static com.pickme.events.trip.TraceId.Builder newBuilder(com.pickme.events.trip.TraceId.Builder other) {
    return new com.pickme.events.trip.TraceId.Builder(other);
  }

  /**
   * Creates a new TraceId RecordBuilder by copying an existing TraceId instance.
   * @param other The existing instance to copy.
   * @return A new TraceId RecordBuilder
   */
  public static com.pickme.events.trip.TraceId.Builder newBuilder(com.pickme.events.trip.TraceId other) {
    return new com.pickme.events.trip.TraceId.Builder(other);
  }

  /**
   * RecordBuilder for TraceId instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TraceId>
    implements org.apache.avro.data.RecordBuilder<TraceId> {

    private long high;
    private long low;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.pickme.events.trip.TraceId.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.high)) {
        this.high = data().deepCopy(fields()[0].schema(), other.high);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.low)) {
        this.low = data().deepCopy(fields()[1].schema(), other.low);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing TraceId instance
     * @param other The existing instance to copy.
     */
    private Builder(com.pickme.events.trip.TraceId other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.high)) {
        this.high = data().deepCopy(fields()[0].schema(), other.high);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.low)) {
        this.low = data().deepCopy(fields()[1].schema(), other.low);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'high' field.
      * @return The value.
      */
    public java.lang.Long getHigh() {
      return high;
    }

    /**
      * Sets the value of the 'high' field.
      * @param value The value of 'high'.
      * @return This builder.
      */
    public com.pickme.events.trip.TraceId.Builder setHigh(long value) {
      validate(fields()[0], value);
      this.high = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'high' field has been set.
      * @return True if the 'high' field has been set, false otherwise.
      */
    public boolean hasHigh() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'high' field.
      * @return This builder.
      */
    public com.pickme.events.trip.TraceId.Builder clearHigh() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'low' field.
      * @return The value.
      */
    public java.lang.Long getLow() {
      return low;
    }

    /**
      * Sets the value of the 'low' field.
      * @param value The value of 'low'.
      * @return This builder.
      */
    public com.pickme.events.trip.TraceId.Builder setLow(long value) {
      validate(fields()[1], value);
      this.low = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'low' field has been set.
      * @return True if the 'low' field has been set, false otherwise.
      */
    public boolean hasLow() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'low' field.
      * @return This builder.
      */
    public com.pickme.events.trip.TraceId.Builder clearLow() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public TraceId build() {
      try {
        TraceId record = new TraceId();
        record.high = fieldSetFlags()[0] ? this.high : (java.lang.Long) defaultValue(fields()[0]);
        record.low = fieldSetFlags()[1] ? this.low : (java.lang.Long) defaultValue(fields()[1]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<TraceId>
    WRITER$ = (org.apache.avro.io.DatumWriter<TraceId>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<TraceId>
    READER$ = (org.apache.avro.io.DatumReader<TraceId>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
