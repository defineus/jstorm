/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package backtype.storm.generated;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2017-2-22")
public class Bolt implements org.apache.thrift.TBase<Bolt, Bolt._Fields>, java.io.Serializable, Cloneable, Comparable<Bolt> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Bolt");

  private static final org.apache.thrift.protocol.TField BOLT_OBJECT_FIELD_DESC = new org.apache.thrift.protocol.TField("bolt_object", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField COMMON_FIELD_DESC = new org.apache.thrift.protocol.TField("common", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BoltStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BoltTupleSchemeFactory());
  }

  private ComponentObject bolt_object; // required
  private ComponentCommon common; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BOLT_OBJECT((short)1, "bolt_object"),
    COMMON((short)2, "common");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // BOLT_OBJECT
          return BOLT_OBJECT;
        case 2: // COMMON
          return COMMON;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BOLT_OBJECT, new org.apache.thrift.meta_data.FieldMetaData("bolt_object", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ComponentObject.class)));
    tmpMap.put(_Fields.COMMON, new org.apache.thrift.meta_data.FieldMetaData("common", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ComponentCommon.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Bolt.class, metaDataMap);
  }

  public Bolt() {
  }

  public Bolt(
    ComponentObject bolt_object,
    ComponentCommon common)
  {
    this();
    this.bolt_object = bolt_object;
    this.common = common;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Bolt(Bolt other) {
    if (other.is_set_bolt_object()) {
      this.bolt_object = new ComponentObject(other.bolt_object);
    }
    if (other.is_set_common()) {
      this.common = new ComponentCommon(other.common);
    }
  }

  public Bolt deepCopy() {
    return new Bolt(this);
  }

  @Override
  public void clear() {
    this.bolt_object = null;
    this.common = null;
  }

  public ComponentObject get_bolt_object() {
    return this.bolt_object;
  }

  public void set_bolt_object(ComponentObject bolt_object) {
    this.bolt_object = bolt_object;
  }

  public void unset_bolt_object() {
    this.bolt_object = null;
  }

  /** Returns true if field bolt_object is set (has been assigned a value) and false otherwise */
  public boolean is_set_bolt_object() {
    return this.bolt_object != null;
  }

  public void set_bolt_object_isSet(boolean value) {
    if (!value) {
      this.bolt_object = null;
    }
  }

  public ComponentCommon get_common() {
    return this.common;
  }

  public void set_common(ComponentCommon common) {
    this.common = common;
  }

  public void unset_common() {
    this.common = null;
  }

  /** Returns true if field common is set (has been assigned a value) and false otherwise */
  public boolean is_set_common() {
    return this.common != null;
  }

  public void set_common_isSet(boolean value) {
    if (!value) {
      this.common = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case BOLT_OBJECT:
      if (value == null) {
        unset_bolt_object();
      } else {
        set_bolt_object((ComponentObject)value);
      }
      break;

    case COMMON:
      if (value == null) {
        unset_common();
      } else {
        set_common((ComponentCommon)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BOLT_OBJECT:
      return get_bolt_object();

    case COMMON:
      return get_common();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case BOLT_OBJECT:
      return is_set_bolt_object();
    case COMMON:
      return is_set_common();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Bolt)
      return this.equals((Bolt)that);
    return false;
  }

  public boolean equals(Bolt that) {
    if (that == null)
      return false;

    boolean this_present_bolt_object = true && this.is_set_bolt_object();
    boolean that_present_bolt_object = true && that.is_set_bolt_object();
    if (this_present_bolt_object || that_present_bolt_object) {
      if (!(this_present_bolt_object && that_present_bolt_object))
        return false;
      if (!this.bolt_object.equals(that.bolt_object))
        return false;
    }

    boolean this_present_common = true && this.is_set_common();
    boolean that_present_common = true && that.is_set_common();
    if (this_present_common || that_present_common) {
      if (!(this_present_common && that_present_common))
        return false;
      if (!this.common.equals(that.common))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_bolt_object = true && (is_set_bolt_object());
    list.add(present_bolt_object);
    if (present_bolt_object)
      list.add(bolt_object);

    boolean present_common = true && (is_set_common());
    list.add(present_common);
    if (present_common)
      list.add(common);

    return list.hashCode();
  }

  @Override
  public int compareTo(Bolt other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(is_set_bolt_object()).compareTo(other.is_set_bolt_object());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_bolt_object()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bolt_object, other.bolt_object);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_common()).compareTo(other.is_set_common());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_common()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.common, other.common);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Bolt(");
    boolean first = true;

    sb.append("bolt_object:");
    if (this.bolt_object == null) {
      sb.append("null");
    } else {
      sb.append(this.bolt_object);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("common:");
    if (this.common == null) {
      sb.append("null");
    } else {
      sb.append(this.common);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!is_set_bolt_object()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'bolt_object' is unset! Struct:" + toString());
    }

    if (!is_set_common()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'common' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (common != null) {
      common.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class BoltStandardSchemeFactory implements SchemeFactory {
    public BoltStandardScheme getScheme() {
      return new BoltStandardScheme();
    }
  }

  private static class BoltStandardScheme extends StandardScheme<Bolt> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Bolt struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BOLT_OBJECT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.bolt_object = new ComponentObject();
              struct.bolt_object.read(iprot);
              struct.set_bolt_object_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COMMON
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.common = new ComponentCommon();
              struct.common.read(iprot);
              struct.set_common_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Bolt struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.bolt_object != null) {
        oprot.writeFieldBegin(BOLT_OBJECT_FIELD_DESC);
        struct.bolt_object.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.common != null) {
        oprot.writeFieldBegin(COMMON_FIELD_DESC);
        struct.common.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BoltTupleSchemeFactory implements SchemeFactory {
    public BoltTupleScheme getScheme() {
      return new BoltTupleScheme();
    }
  }

  private static class BoltTupleScheme extends TupleScheme<Bolt> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Bolt struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.bolt_object.write(oprot);
      struct.common.write(oprot);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Bolt struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.bolt_object = new ComponentObject();
      struct.bolt_object.read(iprot);
      struct.set_bolt_object_isSet(true);
      struct.common = new ComponentCommon();
      struct.common.read(iprot);
      struct.set_common_isSet(true);
    }
  }

}

