/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/asset/v1/asset_service.proto

package com.google.cloud.asset.v1;

/**
 *
 *
 * <pre>
 * Specifications of BigQuery partitioned table as export destination.
 * </pre>
 *
 * Protobuf type {@code google.cloud.asset.v1.PartitionSpec}
 */
public final class PartitionSpec extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.asset.v1.PartitionSpec)
    PartitionSpecOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PartitionSpec.newBuilder() to construct.
  private PartitionSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PartitionSpec() {
    partitionKey_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PartitionSpec();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.asset.v1.AssetServiceProto
        .internal_static_google_cloud_asset_v1_PartitionSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.asset.v1.AssetServiceProto
        .internal_static_google_cloud_asset_v1_PartitionSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.asset.v1.PartitionSpec.class,
            com.google.cloud.asset.v1.PartitionSpec.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * This enum is used to determine the partition key column when exporting
   * assets to BigQuery partitioned table(s). Note that, if the partition key is
   * a timestamp column, the actual partition is based on its date value
   * (expressed in UTC. see details in
   * https://cloud.google.com/bigquery/docs/partitioned-tables#date_timestamp_partitioned_tables).
   * </pre>
   *
   * Protobuf enum {@code google.cloud.asset.v1.PartitionSpec.PartitionKey}
   */
  public enum PartitionKey implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Unspecified partition key. If used, it means using non-partitioned table.
     * </pre>
     *
     * <code>PARTITION_KEY_UNSPECIFIED = 0;</code>
     */
    PARTITION_KEY_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * The time when the snapshot is taken. If specified as partition key, the
     * result table(s) is partitoned by the additional timestamp column,
     * readTime. If [read_time] in ExportAssetsRequest is specified, the
     * readTime column's value will be the same as it. Otherwise, its value will
     * be the current time that is used to take the snapshot.
     * </pre>
     *
     * <code>READ_TIME = 1;</code>
     */
    READ_TIME(1),
    /**
     *
     *
     * <pre>
     * The time when the request is received and started to be processed. If
     * specified as partition key, the result table(s) is partitoned by the
     * requestTime column, an additional timestamp column representing when the
     * request was received.
     * </pre>
     *
     * <code>REQUEST_TIME = 2;</code>
     */
    REQUEST_TIME(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Unspecified partition key. If used, it means using non-partitioned table.
     * </pre>
     *
     * <code>PARTITION_KEY_UNSPECIFIED = 0;</code>
     */
    public static final int PARTITION_KEY_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * The time when the snapshot is taken. If specified as partition key, the
     * result table(s) is partitoned by the additional timestamp column,
     * readTime. If [read_time] in ExportAssetsRequest is specified, the
     * readTime column's value will be the same as it. Otherwise, its value will
     * be the current time that is used to take the snapshot.
     * </pre>
     *
     * <code>READ_TIME = 1;</code>
     */
    public static final int READ_TIME_VALUE = 1;
    /**
     *
     *
     * <pre>
     * The time when the request is received and started to be processed. If
     * specified as partition key, the result table(s) is partitoned by the
     * requestTime column, an additional timestamp column representing when the
     * request was received.
     * </pre>
     *
     * <code>REQUEST_TIME = 2;</code>
     */
    public static final int REQUEST_TIME_VALUE = 2;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static PartitionKey valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static PartitionKey forNumber(int value) {
      switch (value) {
        case 0:
          return PARTITION_KEY_UNSPECIFIED;
        case 1:
          return READ_TIME;
        case 2:
          return REQUEST_TIME;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PartitionKey> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<PartitionKey> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PartitionKey>() {
          public PartitionKey findValueByNumber(int number) {
            return PartitionKey.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.asset.v1.PartitionSpec.getDescriptor().getEnumTypes().get(0);
    }

    private static final PartitionKey[] VALUES = values();

    public static PartitionKey valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private PartitionKey(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.asset.v1.PartitionSpec.PartitionKey)
  }

  public static final int PARTITION_KEY_FIELD_NUMBER = 1;
  private int partitionKey_ = 0;
  /**
   *
   *
   * <pre>
   * The partition key for BigQuery partitioned table.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.PartitionSpec.PartitionKey partition_key = 1;</code>
   *
   * @return The enum numeric value on the wire for partitionKey.
   */
  @java.lang.Override
  public int getPartitionKeyValue() {
    return partitionKey_;
  }
  /**
   *
   *
   * <pre>
   * The partition key for BigQuery partitioned table.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.PartitionSpec.PartitionKey partition_key = 1;</code>
   *
   * @return The partitionKey.
   */
  @java.lang.Override
  public com.google.cloud.asset.v1.PartitionSpec.PartitionKey getPartitionKey() {
    com.google.cloud.asset.v1.PartitionSpec.PartitionKey result =
        com.google.cloud.asset.v1.PartitionSpec.PartitionKey.forNumber(partitionKey_);
    return result == null
        ? com.google.cloud.asset.v1.PartitionSpec.PartitionKey.UNRECOGNIZED
        : result;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (partitionKey_
        != com.google.cloud.asset.v1.PartitionSpec.PartitionKey.PARTITION_KEY_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, partitionKey_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (partitionKey_
        != com.google.cloud.asset.v1.PartitionSpec.PartitionKey.PARTITION_KEY_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, partitionKey_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.asset.v1.PartitionSpec)) {
      return super.equals(obj);
    }
    com.google.cloud.asset.v1.PartitionSpec other = (com.google.cloud.asset.v1.PartitionSpec) obj;

    if (partitionKey_ != other.partitionKey_) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PARTITION_KEY_FIELD_NUMBER;
    hash = (53 * hash) + partitionKey_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.asset.v1.PartitionSpec parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1.PartitionSpec parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.PartitionSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1.PartitionSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.PartitionSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1.PartitionSpec parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.PartitionSpec parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1.PartitionSpec parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.PartitionSpec parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1.PartitionSpec parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.PartitionSpec parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1.PartitionSpec parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.asset.v1.PartitionSpec prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Specifications of BigQuery partitioned table as export destination.
   * </pre>
   *
   * Protobuf type {@code google.cloud.asset.v1.PartitionSpec}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.asset.v1.PartitionSpec)
      com.google.cloud.asset.v1.PartitionSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.asset.v1.AssetServiceProto
          .internal_static_google_cloud_asset_v1_PartitionSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.asset.v1.AssetServiceProto
          .internal_static_google_cloud_asset_v1_PartitionSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.asset.v1.PartitionSpec.class,
              com.google.cloud.asset.v1.PartitionSpec.Builder.class);
    }

    // Construct using com.google.cloud.asset.v1.PartitionSpec.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      partitionKey_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.asset.v1.AssetServiceProto
          .internal_static_google_cloud_asset_v1_PartitionSpec_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.PartitionSpec getDefaultInstanceForType() {
      return com.google.cloud.asset.v1.PartitionSpec.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.PartitionSpec build() {
      com.google.cloud.asset.v1.PartitionSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.PartitionSpec buildPartial() {
      com.google.cloud.asset.v1.PartitionSpec result =
          new com.google.cloud.asset.v1.PartitionSpec(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.asset.v1.PartitionSpec result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.partitionKey_ = partitionKey_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.asset.v1.PartitionSpec) {
        return mergeFrom((com.google.cloud.asset.v1.PartitionSpec) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.asset.v1.PartitionSpec other) {
      if (other == com.google.cloud.asset.v1.PartitionSpec.getDefaultInstance()) return this;
      if (other.partitionKey_ != 0) {
        setPartitionKeyValue(other.getPartitionKeyValue());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8:
              {
                partitionKey_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private int partitionKey_ = 0;
    /**
     *
     *
     * <pre>
     * The partition key for BigQuery partitioned table.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.PartitionSpec.PartitionKey partition_key = 1;</code>
     *
     * @return The enum numeric value on the wire for partitionKey.
     */
    @java.lang.Override
    public int getPartitionKeyValue() {
      return partitionKey_;
    }
    /**
     *
     *
     * <pre>
     * The partition key for BigQuery partitioned table.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.PartitionSpec.PartitionKey partition_key = 1;</code>
     *
     * @param value The enum numeric value on the wire for partitionKey to set.
     * @return This builder for chaining.
     */
    public Builder setPartitionKeyValue(int value) {
      partitionKey_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The partition key for BigQuery partitioned table.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.PartitionSpec.PartitionKey partition_key = 1;</code>
     *
     * @return The partitionKey.
     */
    @java.lang.Override
    public com.google.cloud.asset.v1.PartitionSpec.PartitionKey getPartitionKey() {
      com.google.cloud.asset.v1.PartitionSpec.PartitionKey result =
          com.google.cloud.asset.v1.PartitionSpec.PartitionKey.forNumber(partitionKey_);
      return result == null
          ? com.google.cloud.asset.v1.PartitionSpec.PartitionKey.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The partition key for BigQuery partitioned table.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.PartitionSpec.PartitionKey partition_key = 1;</code>
     *
     * @param value The partitionKey to set.
     * @return This builder for chaining.
     */
    public Builder setPartitionKey(com.google.cloud.asset.v1.PartitionSpec.PartitionKey value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      partitionKey_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The partition key for BigQuery partitioned table.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.PartitionSpec.PartitionKey partition_key = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPartitionKey() {
      bitField0_ = (bitField0_ & ~0x00000001);
      partitionKey_ = 0;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.asset.v1.PartitionSpec)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.asset.v1.PartitionSpec)
  private static final com.google.cloud.asset.v1.PartitionSpec DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.asset.v1.PartitionSpec();
  }

  public static com.google.cloud.asset.v1.PartitionSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PartitionSpec> PARSER =
      new com.google.protobuf.AbstractParser<PartitionSpec>() {
        @java.lang.Override
        public PartitionSpec parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<PartitionSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PartitionSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.asset.v1.PartitionSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
