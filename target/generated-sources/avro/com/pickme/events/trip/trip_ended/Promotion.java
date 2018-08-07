/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.pickme.events.trip.trip_ended;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Promotion extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 4034491261363312157L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Promotion\",\"namespace\":\"com.pickme.events.trip.trip_ended\",\"fields\":[{\"name\":\"type\",\"type\":\"string\"},{\"name\":\"code\",\"type\":\"string\"},{\"name\":\"discount_amount\",\"type\":\"float\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Promotion> ENCODER =
      new BinaryMessageEncoder<Promotion>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Promotion> DECODER =
      new BinaryMessageDecoder<Promotion>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Promotion> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Promotion> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Promotion>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Promotion to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Promotion from a ByteBuffer. */
  public static Promotion fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence type;
  @Deprecated public java.lang.CharSequence code;
  @Deprecated public float discount_amount;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Promotion() {}

  /**
   * All-args constructor.
   * @param type The new value for type
   * @param code The new value for code
   * @param discount_amount The new value for discount_amount
   */
  public Promotion(java.lang.CharSequence type, java.lang.CharSequence code, java.lang.Float discount_amount) {
    this.type = type;
    this.code = code;
    this.discount_amount = discount_amount;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return type;
    case 1: return code;
    case 2: return discount_amount;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: type = (java.lang.CharSequence)value$; break;
    case 1: code = (java.lang.CharSequence)value$; break;
    case 2: discount_amount = (java.lang.Float)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'type' field.
   * @return The value of the 'type' field.
   */
  public java.lang.CharSequence getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * @param value the value to set.
   */
  public void setType(java.lang.CharSequence value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'code' field.
   * @return The value of the 'code' field.
   */
  public java.lang.CharSequence getCode() {
    return code;
  }

  /**
   * Sets the value of the 'code' field.
   * @param value the value to set.
   */
  public void setCode(java.lang.CharSequence value) {
    this.code = value;
  }

  /**
   * Gets the value of the 'discount_amount' field.
   * @return The value of the 'discount_amount' field.
   */
  public java.lang.Float getDiscountAmount() {
    return discount_amount;
  }

  /**
   * Sets the value of the 'discount_amount' field.
   * @param value the value to set.
   */
  public void setDiscountAmount(java.lang.Float value) {
    this.discount_amount = value;
  }

  /**
   * Creates a new Promotion RecordBuilder.
   * @return A new Promotion RecordBuilder
   */
  public static com.pickme.events.trip.trip_ended.Promotion.Builder newBuilder() {
    return new com.pickme.events.trip.trip_ended.Promotion.Builder();
  }

  /**
   * Creates a new Promotion RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Promotion RecordBuilder
   */
  public static com.pickme.events.trip.trip_ended.Promotion.Builder newBuilder(com.pickme.events.trip.trip_ended.Promotion.Builder other) {
    return new com.pickme.events.trip.trip_ended.Promotion.Builder(other);
  }

  /**
   * Creates a new Promotion RecordBuilder by copying an existing Promotion instance.
   * @param other The existing instance to copy.
   * @return A new Promotion RecordBuilder
   */
  public static com.pickme.events.trip.trip_ended.Promotion.Builder newBuilder(com.pickme.events.trip.trip_ended.Promotion other) {
    return new com.pickme.events.trip.trip_ended.Promotion.Builder(other);
  }

  /**
   * RecordBuilder for Promotion instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Promotion>
    implements org.apache.avro.data.RecordBuilder<Promotion> {

    private java.lang.CharSequence type;
    private java.lang.CharSequence code;
    private float discount_amount;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.pickme.events.trip.trip_ended.Promotion.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.code)) {
        this.code = data().deepCopy(fields()[1].schema(), other.code);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.discount_amount)) {
        this.discount_amount = data().deepCopy(fields()[2].schema(), other.discount_amount);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Promotion instance
     * @param other The existing instance to copy.
     */
    private Builder(com.pickme.events.trip.trip_ended.Promotion other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.code)) {
        this.code = data().deepCopy(fields()[1].schema(), other.code);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.discount_amount)) {
        this.discount_amount = data().deepCopy(fields()[2].schema(), other.discount_amount);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'type' field.
      * @return The value.
      */
    public java.lang.CharSequence getType() {
      return type;
    }

    /**
      * Sets the value of the 'type' field.
      * @param value The value of 'type'.
      * @return This builder.
      */
    public com.pickme.events.trip.trip_ended.Promotion.Builder setType(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.type = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'type' field has been set.
      * @return True if the 'type' field has been set, false otherwise.
      */
    public boolean hasType() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'type' field.
      * @return This builder.
      */
    public com.pickme.events.trip.trip_ended.Promotion.Builder clearType() {
      type = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'code' field.
      * @return The value.
      */
    public java.lang.CharSequence getCode() {
      return code;
    }

    /**
      * Sets the value of the 'code' field.
      * @param value The value of 'code'.
      * @return This builder.
      */
    public com.pickme.events.trip.trip_ended.Promotion.Builder setCode(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.code = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'code' field has been set.
      * @return True if the 'code' field has been set, false otherwise.
      */
    public boolean hasCode() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'code' field.
      * @return This builder.
      */
    public com.pickme.events.trip.trip_ended.Promotion.Builder clearCode() {
      code = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'discount_amount' field.
      * @return The value.
      */
    public java.lang.Float getDiscountAmount() {
      return discount_amount;
    }

    /**
      * Sets the value of the 'discount_amount' field.
      * @param value The value of 'discount_amount'.
      * @return This builder.
      */
    public com.pickme.events.trip.trip_ended.Promotion.Builder setDiscountAmount(float value) {
      validate(fields()[2], value);
      this.discount_amount = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'discount_amount' field has been set.
      * @return True if the 'discount_amount' field has been set, false otherwise.
      */
    public boolean hasDiscountAmount() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'discount_amount' field.
      * @return This builder.
      */
    public com.pickme.events.trip.trip_ended.Promotion.Builder clearDiscountAmount() {
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Promotion build() {
      try {
        Promotion record = new Promotion();
        record.type = fieldSetFlags()[0] ? this.type : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.code = fieldSetFlags()[1] ? this.code : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.discount_amount = fieldSetFlags()[2] ? this.discount_amount : (java.lang.Float) defaultValue(fields()[2]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Promotion>
    WRITER$ = (org.apache.avro.io.DatumWriter<Promotion>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Promotion>
    READER$ = (org.apache.avro.io.DatumReader<Promotion>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}