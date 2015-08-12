/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package tachyon.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-8-12")
public class Command implements org.apache.thrift.TBase<Command, Command._Fields>, java.io.Serializable, Cloneable, Comparable<Command> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Command");

  private static final org.apache.thrift.protocol.TField M_COMMAND_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("mCommandType", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField M_DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("mData", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CommandStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CommandTupleSchemeFactory());
  }

  /**
   * 
   * @see CommandType
   */
  public CommandType mCommandType; // required
  public List<Long> mData; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see CommandType
     */
    M_COMMAND_TYPE((short)1, "mCommandType"),
    M_DATA((short)2, "mData");

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
        case 1: // M_COMMAND_TYPE
          return M_COMMAND_TYPE;
        case 2: // M_DATA
          return M_DATA;
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
    tmpMap.put(_Fields.M_COMMAND_TYPE, new org.apache.thrift.meta_data.FieldMetaData("mCommandType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, CommandType.class)));
    tmpMap.put(_Fields.M_DATA, new org.apache.thrift.meta_data.FieldMetaData("mData", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Command.class, metaDataMap);
  }

  public Command() {
  }

  public Command(
    CommandType mCommandType,
    List<Long> mData)
  {
    this();
    this.mCommandType = mCommandType;
    this.mData = mData;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Command(Command other) {
    if (other.isSetMCommandType()) {
      this.mCommandType = other.mCommandType;
    }
    if (other.isSetMData()) {
      List<Long> __this__mData = new ArrayList<Long>(other.mData);
      this.mData = __this__mData;
    }
  }

  public Command deepCopy() {
    return new Command(this);
  }

  @Override
  public void clear() {
    this.mCommandType = null;
    this.mData = null;
  }

  /**
   * 
   * @see CommandType
   */
  public CommandType getMCommandType() {
    return this.mCommandType;
  }

  /**
   * 
   * @see CommandType
   */
  public Command setMCommandType(CommandType mCommandType) {
    this.mCommandType = mCommandType;
    return this;
  }

  public void unsetMCommandType() {
    this.mCommandType = null;
  }

  /** Returns true if field mCommandType is set (has been assigned a value) and false otherwise */
  public boolean isSetMCommandType() {
    return this.mCommandType != null;
  }

  public void setMCommandTypeIsSet(boolean value) {
    if (!value) {
      this.mCommandType = null;
    }
  }

  public int getMDataSize() {
    return (this.mData == null) ? 0 : this.mData.size();
  }

  public java.util.Iterator<Long> getMDataIterator() {
    return (this.mData == null) ? null : this.mData.iterator();
  }

  public void addToMData(long elem) {
    if (this.mData == null) {
      this.mData = new ArrayList<Long>();
    }
    this.mData.add(elem);
  }

  public List<Long> getMData() {
    return this.mData;
  }

  public Command setMData(List<Long> mData) {
    this.mData = mData;
    return this;
  }

  public void unsetMData() {
    this.mData = null;
  }

  /** Returns true if field mData is set (has been assigned a value) and false otherwise */
  public boolean isSetMData() {
    return this.mData != null;
  }

  public void setMDataIsSet(boolean value) {
    if (!value) {
      this.mData = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case M_COMMAND_TYPE:
      if (value == null) {
        unsetMCommandType();
      } else {
        setMCommandType((CommandType)value);
      }
      break;

    case M_DATA:
      if (value == null) {
        unsetMData();
      } else {
        setMData((List<Long>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case M_COMMAND_TYPE:
      return getMCommandType();

    case M_DATA:
      return getMData();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case M_COMMAND_TYPE:
      return isSetMCommandType();
    case M_DATA:
      return isSetMData();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Command)
      return this.equals((Command)that);
    return false;
  }

  public boolean equals(Command that) {
    if (that == null)
      return false;

    boolean this_present_mCommandType = true && this.isSetMCommandType();
    boolean that_present_mCommandType = true && that.isSetMCommandType();
    if (this_present_mCommandType || that_present_mCommandType) {
      if (!(this_present_mCommandType && that_present_mCommandType))
        return false;
      if (!this.mCommandType.equals(that.mCommandType))
        return false;
    }

    boolean this_present_mData = true && this.isSetMData();
    boolean that_present_mData = true && that.isSetMData();
    if (this_present_mData || that_present_mData) {
      if (!(this_present_mData && that_present_mData))
        return false;
      if (!this.mData.equals(that.mData))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_mCommandType = true && (isSetMCommandType());
    list.add(present_mCommandType);
    if (present_mCommandType)
      list.add(mCommandType.getValue());

    boolean present_mData = true && (isSetMData());
    list.add(present_mData);
    if (present_mData)
      list.add(mData);

    return list.hashCode();
  }

  @Override
  public int compareTo(Command other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetMCommandType()).compareTo(other.isSetMCommandType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMCommandType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mCommandType, other.mCommandType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMData()).compareTo(other.isSetMData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMData()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mData, other.mData);
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
    StringBuilder sb = new StringBuilder("Command(");
    boolean first = true;

    sb.append("mCommandType:");
    if (this.mCommandType == null) {
      sb.append("null");
    } else {
      sb.append(this.mCommandType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("mData:");
    if (this.mData == null) {
      sb.append("null");
    } else {
      sb.append(this.mData);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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

  private static class CommandStandardSchemeFactory implements SchemeFactory {
    public CommandStandardScheme getScheme() {
      return new CommandStandardScheme();
    }
  }

  private static class CommandStandardScheme extends StandardScheme<Command> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Command struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // M_COMMAND_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.mCommandType = tachyon.thrift.CommandType.findByValue(iprot.readI32());
              struct.setMCommandTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // M_DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list40 = iprot.readListBegin();
                struct.mData = new ArrayList<Long>(_list40.size);
                long _elem41;
                for (int _i42 = 0; _i42 < _list40.size; ++_i42)
                {
                  _elem41 = iprot.readI64();
                  struct.mData.add(_elem41);
                }
                iprot.readListEnd();
              }
              struct.setMDataIsSet(true);
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

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Command struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.mCommandType != null) {
        oprot.writeFieldBegin(M_COMMAND_TYPE_FIELD_DESC);
        oprot.writeI32(struct.mCommandType.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.mData != null) {
        oprot.writeFieldBegin(M_DATA_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, struct.mData.size()));
          for (long _iter43 : struct.mData)
          {
            oprot.writeI64(_iter43);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CommandTupleSchemeFactory implements SchemeFactory {
    public CommandTupleScheme getScheme() {
      return new CommandTupleScheme();
    }
  }

  private static class CommandTupleScheme extends TupleScheme<Command> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Command struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetMCommandType()) {
        optionals.set(0);
      }
      if (struct.isSetMData()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetMCommandType()) {
        oprot.writeI32(struct.mCommandType.getValue());
      }
      if (struct.isSetMData()) {
        {
          oprot.writeI32(struct.mData.size());
          for (long _iter44 : struct.mData)
          {
            oprot.writeI64(_iter44);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Command struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.mCommandType = tachyon.thrift.CommandType.findByValue(iprot.readI32());
        struct.setMCommandTypeIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list45 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, iprot.readI32());
          struct.mData = new ArrayList<Long>(_list45.size);
          long _elem46;
          for (int _i47 = 0; _i47 < _list45.size; ++_i47)
          {
            _elem46 = iprot.readI64();
            struct.mData.add(_elem46);
          }
        }
        struct.setMDataIsSet(true);
      }
    }
  }

}

