/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.pickme.events.trip.trip_created;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Filters extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -1088927447804951419L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Filters\",\"namespace\":\"com.pickme.events.trip.trip_created\",\"fields\":[{\"name\":\"driver\",\"type\":{\"type\":\"record\",\"name\":\"DriverFilter\",\"fields\":[{\"name\":\"language_id\",\"type\":\"int\"}]}},{\"name\":\"vehicle\",\"type\":{\"type\":\"record\",\"name\":\"Vehicle\",\"fields\":[{\"name\":\"company_id\",\"type\":\"int\"},{\"name\":\"brand_id\",\"type\":\"int\"},{\"name\":\"color_id\",\"type\":\"int\"}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Filters> ENCODER =
      new BinaryMessageEncoder<Filters>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Filters> DECODER =
      new BinaryMessageDecoder<Filters>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Filters> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Filters> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Filters>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Filters to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Filters from a ByteBuffer. */
  public static Filters fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public com.pickme.events.trip.trip_created.DriverFilter driver;
  @Deprecated public com.pickme.events.trip.trip_created.Vehicle vehicle;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Filters() {}

  /**
   * All-args constructor.
   * @param driver The new value for driver
   * @param vehicle The new value for vehicle
   */
  public Filters(com.pickme.events.trip.trip_created.DriverFilter driver, com.pickme.events.trip.trip_created.Vehicle vehicle) {
    this.driver = driver;
    this.vehicle = vehicle;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return driver;
    case 1: return vehicle;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: driver = (com.pickme.events.trip.trip_created.DriverFilter)value$; break;
    case 1: vehicle = (com.pickme.events.trip.trip_created.Vehicle)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'driver' field.
   * @return The value of the 'driver' field.
   */
  public com.pickme.events.trip.trip_created.DriverFilter getDriver() {
    return driver;
  }

  /**
   * Sets the value of the 'driver' field.
   * @param value the value to set.
   */
  public void setDriver(com.pickme.events.trip.trip_created.DriverFilter value) {
    this.driver = value;
  }

  /**
   * Gets the value of the 'vehicle' field.
   * @return The value of the 'vehicle' field.
   */
  public com.pickme.events.trip.trip_created.Vehicle getVehicle() {
    return vehicle;
  }

  /**
   * Sets the value of the 'vehicle' field.
   * @param value the value to set.
   */
  public void setVehicle(com.pickme.events.trip.trip_created.Vehicle value) {
    this.vehicle = value;
  }

  /**
   * Creates a new Filters RecordBuilder.
   * @return A new Filters RecordBuilder
   */
  public static com.pickme.events.trip.trip_created.Filters.Builder newBuilder() {
    return new com.pickme.events.trip.trip_created.Filters.Builder();
  }

  /**
   * Creates a new Filters RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Filters RecordBuilder
   */
  public static com.pickme.events.trip.trip_created.Filters.Builder newBuilder(com.pickme.events.trip.trip_created.Filters.Builder other) {
    return new com.pickme.events.trip.trip_created.Filters.Builder(other);
  }

  /**
   * Creates a new Filters RecordBuilder by copying an existing Filters instance.
   * @param other The existing instance to copy.
   * @return A new Filters RecordBuilder
   */
  public static com.pickme.events.trip.trip_created.Filters.Builder newBuilder(com.pickme.events.trip.trip_created.Filters other) {
    return new com.pickme.events.trip.trip_created.Filters.Builder(other);
  }

  /**
   * RecordBuilder for Filters instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Filters>
    implements org.apache.avro.data.RecordBuilder<Filters> {

    private com.pickme.events.trip.trip_created.DriverFilter driver;
    private com.pickme.events.trip.trip_created.DriverFilter.Builder driverBuilder;
    private com.pickme.events.trip.trip_created.Vehicle vehicle;
    private com.pickme.events.trip.trip_created.Vehicle.Builder vehicleBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.pickme.events.trip.trip_created.Filters.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.driver)) {
        this.driver = data().deepCopy(fields()[0].schema(), other.driver);
        fieldSetFlags()[0] = true;
      }
      if (other.hasDriverBuilder()) {
        this.driverBuilder = com.pickme.events.trip.trip_created.DriverFilter.newBuilder(other.getDriverBuilder());
      }
      if (isValidValue(fields()[1], other.vehicle)) {
        this.vehicle = data().deepCopy(fields()[1].schema(), other.vehicle);
        fieldSetFlags()[1] = true;
      }
      if (other.hasVehicleBuilder()) {
        this.vehicleBuilder = com.pickme.events.trip.trip_created.Vehicle.newBuilder(other.getVehicleBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing Filters instance
     * @param other The existing instance to copy.
     */
    private Builder(com.pickme.events.trip.trip_created.Filters other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.driver)) {
        this.driver = data().deepCopy(fields()[0].schema(), other.driver);
        fieldSetFlags()[0] = true;
      }
      this.driverBuilder = null;
      if (isValidValue(fields()[1], other.vehicle)) {
        this.vehicle = data().deepCopy(fields()[1].schema(), other.vehicle);
        fieldSetFlags()[1] = true;
      }
      this.vehicleBuilder = null;
    }

    /**
      * Gets the value of the 'driver' field.
      * @return The value.
      */
    public com.pickme.events.trip.trip_created.DriverFilter getDriver() {
      return driver;
    }

    /**
      * Sets the value of the 'driver' field.
      * @param value The value of 'driver'.
      * @return This builder.
      */
    public com.pickme.events.trip.trip_created.Filters.Builder setDriver(com.pickme.events.trip.trip_created.DriverFilter value) {
      validate(fields()[0], value);
      this.driverBuilder = null;
      this.driver = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'driver' field has been set.
      * @return True if the 'driver' field has been set, false otherwise.
      */
    public boolean hasDriver() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'driver' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.pickme.events.trip.trip_created.DriverFilter.Builder getDriverBuilder() {
      if (driverBuilder == null) {
        if (hasDriver()) {
          setDriverBuilder(com.pickme.events.trip.trip_created.DriverFilter.newBuilder(driver));
        } else {
          setDriverBuilder(com.pickme.events.trip.trip_created.DriverFilter.newBuilder());
        }
      }
      return driverBuilder;
    }

    /**
     * Sets the Builder instance for the 'driver' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.pickme.events.trip.trip_created.Filters.Builder setDriverBuilder(com.pickme.events.trip.trip_created.DriverFilter.Builder value) {
      clearDriver();
      driverBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'driver' field has an active Builder instance
     * @return True if the 'driver' field has an active Builder instance
     */
    public boolean hasDriverBuilder() {
      return driverBuilder != null;
    }

    /**
      * Clears the value of the 'driver' field.
      * @return This builder.
      */
    public com.pickme.events.trip.trip_created.Filters.Builder clearDriver() {
      driver = null;
      driverBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'vehicle' field.
      * @return The value.
      */
    public com.pickme.events.trip.trip_created.Vehicle getVehicle() {
      return vehicle;
    }

    /**
      * Sets the value of the 'vehicle' field.
      * @param value The value of 'vehicle'.
      * @return This builder.
      */
    public com.pickme.events.trip.trip_created.Filters.Builder setVehicle(com.pickme.events.trip.trip_created.Vehicle value) {
      validate(fields()[1], value);
      this.vehicleBuilder = null;
      this.vehicle = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'vehicle' field has been set.
      * @return True if the 'vehicle' field has been set, false otherwise.
      */
    public boolean hasVehicle() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'vehicle' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.pickme.events.trip.trip_created.Vehicle.Builder getVehicleBuilder() {
      if (vehicleBuilder == null) {
        if (hasVehicle()) {
          setVehicleBuilder(com.pickme.events.trip.trip_created.Vehicle.newBuilder(vehicle));
        } else {
          setVehicleBuilder(com.pickme.events.trip.trip_created.Vehicle.newBuilder());
        }
      }
      return vehicleBuilder;
    }

    /**
     * Sets the Builder instance for the 'vehicle' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.pickme.events.trip.trip_created.Filters.Builder setVehicleBuilder(com.pickme.events.trip.trip_created.Vehicle.Builder value) {
      clearVehicle();
      vehicleBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'vehicle' field has an active Builder instance
     * @return True if the 'vehicle' field has an active Builder instance
     */
    public boolean hasVehicleBuilder() {
      return vehicleBuilder != null;
    }

    /**
      * Clears the value of the 'vehicle' field.
      * @return This builder.
      */
    public com.pickme.events.trip.trip_created.Filters.Builder clearVehicle() {
      vehicle = null;
      vehicleBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Filters build() {
      try {
        Filters record = new Filters();
        if (driverBuilder != null) {
          record.driver = this.driverBuilder.build();
        } else {
          record.driver = fieldSetFlags()[0] ? this.driver : (com.pickme.events.trip.trip_created.DriverFilter) defaultValue(fields()[0]);
        }
        if (vehicleBuilder != null) {
          record.vehicle = this.vehicleBuilder.build();
        } else {
          record.vehicle = fieldSetFlags()[1] ? this.vehicle : (com.pickme.events.trip.trip_created.Vehicle) defaultValue(fields()[1]);
        }
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Filters>
    WRITER$ = (org.apache.avro.io.DatumWriter<Filters>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Filters>
    READER$ = (org.apache.avro.io.DatumReader<Filters>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
