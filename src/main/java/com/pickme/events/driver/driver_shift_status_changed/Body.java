/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.pickme.events.driver.driver_shift_status_changed;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Body extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 4881379753446084618L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Body\",\"namespace\":\"com.pickme.events.driver.driver_shift_status_changed\",\"fields\":[{\"name\":\"driver_id\",\"type\":\"int\"},{\"name\":\"status\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Body> ENCODER =
      new BinaryMessageEncoder<Body>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Body> DECODER =
      new BinaryMessageDecoder<Body>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Body> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Body> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Body>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Body to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Body from a ByteBuffer. */
  public static Body fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public int driver_id;
  @Deprecated public java.lang.CharSequence status;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Body() {}

  /**
   * All-args constructor.
   * @param driver_id The new value for driver_id
   * @param status The new value for status
   */
  public Body(java.lang.Integer driver_id, java.lang.CharSequence status) {
    this.driver_id = driver_id;
    this.status = status;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return driver_id;
    case 1: return status;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: driver_id = (java.lang.Integer)value$; break;
    case 1: status = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'driver_id' field.
   * @return The value of the 'driver_id' field.
   */
  public java.lang.Integer getDriverId() {
    return driver_id;
  }

  /**
   * Sets the value of the 'driver_id' field.
   * @param value the value to set.
   */
  public void setDriverId(java.lang.Integer value) {
    this.driver_id = value;
  }

  /**
   * Gets the value of the 'status' field.
   * @return The value of the 'status' field.
   */
  public java.lang.CharSequence getStatus() {
    return status;
  }

  /**
   * Sets the value of the 'status' field.
   * @param value the value to set.
   */
  public void setStatus(java.lang.CharSequence value) {
    this.status = value;
  }

  /**
   * Creates a new Body RecordBuilder.
   * @return A new Body RecordBuilder
   */
  public static com.pickme.events.driver.driver_shift_status_changed.Body.Builder newBuilder() {
    return new com.pickme.events.driver.driver_shift_status_changed.Body.Builder();
  }

  /**
   * Creates a new Body RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Body RecordBuilder
   */
  public static com.pickme.events.driver.driver_shift_status_changed.Body.Builder newBuilder(com.pickme.events.driver.driver_shift_status_changed.Body.Builder other) {
    return new com.pickme.events.driver.driver_shift_status_changed.Body.Builder(other);
  }

  /**
   * Creates a new Body RecordBuilder by copying an existing Body instance.
   * @param other The existing instance to copy.
   * @return A new Body RecordBuilder
   */
  public static com.pickme.events.driver.driver_shift_status_changed.Body.Builder newBuilder(com.pickme.events.driver.driver_shift_status_changed.Body other) {
    return new com.pickme.events.driver.driver_shift_status_changed.Body.Builder(other);
  }

  /**
   * RecordBuilder for Body instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Body>
    implements org.apache.avro.data.RecordBuilder<Body> {

    private int driver_id;
    private java.lang.CharSequence status;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.pickme.events.driver.driver_shift_status_changed.Body.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.driver_id)) {
        this.driver_id = data().deepCopy(fields()[0].schema(), other.driver_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.status)) {
        this.status = data().deepCopy(fields()[1].schema(), other.status);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Body instance
     * @param other The existing instance to copy.
     */
    private Builder(com.pickme.events.driver.driver_shift_status_changed.Body other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.driver_id)) {
        this.driver_id = data().deepCopy(fields()[0].schema(), other.driver_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.status)) {
        this.status = data().deepCopy(fields()[1].schema(), other.status);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'driver_id' field.
      * @return The value.
      */
    public java.lang.Integer getDriverId() {
      return driver_id;
    }

    /**
      * Sets the value of the 'driver_id' field.
      * @param value The value of 'driver_id'.
      * @return This builder.
      */
    public com.pickme.events.driver.driver_shift_status_changed.Body.Builder setDriverId(int value) {
      validate(fields()[0], value);
      this.driver_id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'driver_id' field has been set.
      * @return True if the 'driver_id' field has been set, false otherwise.
      */
    public boolean hasDriverId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'driver_id' field.
      * @return This builder.
      */
    public com.pickme.events.driver.driver_shift_status_changed.Body.Builder clearDriverId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'status' field.
      * @return The value.
      */
    public java.lang.CharSequence getStatus() {
      return status;
    }

    /**
      * Sets the value of the 'status' field.
      * @param value The value of 'status'.
      * @return This builder.
      */
    public com.pickme.events.driver.driver_shift_status_changed.Body.Builder setStatus(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.status = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'status' field has been set.
      * @return True if the 'status' field has been set, false otherwise.
      */
    public boolean hasStatus() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'status' field.
      * @return This builder.
      */
    public com.pickme.events.driver.driver_shift_status_changed.Body.Builder clearStatus() {
      status = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Body build() {
      try {
        Body record = new Body();
        record.driver_id = fieldSetFlags()[0] ? this.driver_id : (java.lang.Integer) defaultValue(fields()[0]);
        record.status = fieldSetFlags()[1] ? this.status : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Body>
    WRITER$ = (org.apache.avro.io.DatumWriter<Body>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Body>
    READER$ = (org.apache.avro.io.DatumReader<Body>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
