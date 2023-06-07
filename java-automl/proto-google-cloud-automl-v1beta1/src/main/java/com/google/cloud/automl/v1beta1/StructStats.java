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
// source: google/cloud/automl/v1beta1/data_stats.proto

package com.google.cloud.automl.v1beta1;

/**
 *
 *
 * <pre>
 * The data statistics of a series of STRUCT values.
 * </pre>
 *
 * Protobuf type {@code google.cloud.automl.v1beta1.StructStats}
 */
public final class StructStats extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.automl.v1beta1.StructStats)
    StructStatsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use StructStats.newBuilder() to construct.
  private StructStats(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private StructStats() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new StructStats();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.automl.v1beta1.DataStatsOuterClass
        .internal_static_google_cloud_automl_v1beta1_StructStats_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(int number) {
    switch (number) {
      case 1:
        return internalGetFieldStats();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.automl.v1beta1.DataStatsOuterClass
        .internal_static_google_cloud_automl_v1beta1_StructStats_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.automl.v1beta1.StructStats.class,
            com.google.cloud.automl.v1beta1.StructStats.Builder.class);
  }

  public static final int FIELD_STATS_FIELD_NUMBER = 1;

  private static final class FieldStatsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
            java.lang.String, com.google.cloud.automl.v1beta1.DataStats>
        defaultEntry =
            com.google.protobuf.MapEntry
                .<java.lang.String, com.google.cloud.automl.v1beta1.DataStats>newDefaultInstance(
                    com.google.cloud.automl.v1beta1.DataStatsOuterClass
                        .internal_static_google_cloud_automl_v1beta1_StructStats_FieldStatsEntry_descriptor,
                    com.google.protobuf.WireFormat.FieldType.STRING,
                    "",
                    com.google.protobuf.WireFormat.FieldType.MESSAGE,
                    com.google.cloud.automl.v1beta1.DataStats.getDefaultInstance());
  }

  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<java.lang.String, com.google.cloud.automl.v1beta1.DataStats>
      fieldStats_;

  private com.google.protobuf.MapField<java.lang.String, com.google.cloud.automl.v1beta1.DataStats>
      internalGetFieldStats() {
    if (fieldStats_ == null) {
      return com.google.protobuf.MapField.emptyMapField(FieldStatsDefaultEntryHolder.defaultEntry);
    }
    return fieldStats_;
  }

  public int getFieldStatsCount() {
    return internalGetFieldStats().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * Map from a field name of the struct to data stats aggregated over series
   * of all data in that field across all the structs.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.automl.v1beta1.DataStats&gt; field_stats = 1;</code>
   */
  @java.lang.Override
  public boolean containsFieldStats(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    return internalGetFieldStats().getMap().containsKey(key);
  }
  /** Use {@link #getFieldStatsMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, com.google.cloud.automl.v1beta1.DataStats>
      getFieldStats() {
    return getFieldStatsMap();
  }
  /**
   *
   *
   * <pre>
   * Map from a field name of the struct to data stats aggregated over series
   * of all data in that field across all the structs.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.automl.v1beta1.DataStats&gt; field_stats = 1;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, com.google.cloud.automl.v1beta1.DataStats>
      getFieldStatsMap() {
    return internalGetFieldStats().getMap();
  }
  /**
   *
   *
   * <pre>
   * Map from a field name of the struct to data stats aggregated over series
   * of all data in that field across all the structs.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.automl.v1beta1.DataStats&gt; field_stats = 1;</code>
   */
  @java.lang.Override
  public /* nullable */ com.google.cloud.automl.v1beta1.DataStats getFieldStatsOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.automl.v1beta1.DataStats defaultValue) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, com.google.cloud.automl.v1beta1.DataStats> map =
        internalGetFieldStats().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * Map from a field name of the struct to data stats aggregated over series
   * of all data in that field across all the structs.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.automl.v1beta1.DataStats&gt; field_stats = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.automl.v1beta1.DataStats getFieldStatsOrThrow(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, com.google.cloud.automl.v1beta1.DataStats> map =
        internalGetFieldStats().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output, internalGetFieldStats(), FieldStatsDefaultEntryHolder.defaultEntry, 1);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, com.google.cloud.automl.v1beta1.DataStats> entry :
        internalGetFieldStats().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, com.google.cloud.automl.v1beta1.DataStats>
          fieldStats__ =
              FieldStatsDefaultEntryHolder.defaultEntry
                  .newBuilderForType()
                  .setKey(entry.getKey())
                  .setValue(entry.getValue())
                  .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, fieldStats__);
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
    if (!(obj instanceof com.google.cloud.automl.v1beta1.StructStats)) {
      return super.equals(obj);
    }
    com.google.cloud.automl.v1beta1.StructStats other =
        (com.google.cloud.automl.v1beta1.StructStats) obj;

    if (!internalGetFieldStats().equals(other.internalGetFieldStats())) return false;
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
    if (!internalGetFieldStats().getMap().isEmpty()) {
      hash = (37 * hash) + FIELD_STATS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetFieldStats().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.automl.v1beta1.StructStats parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.StructStats parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.StructStats parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.StructStats parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.StructStats parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.StructStats parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.StructStats parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.StructStats parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.StructStats parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.StructStats parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.StructStats parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.StructStats parseFrom(
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

  public static Builder newBuilder(com.google.cloud.automl.v1beta1.StructStats prototype) {
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
   * The data statistics of a series of STRUCT values.
   * </pre>
   *
   * Protobuf type {@code google.cloud.automl.v1beta1.StructStats}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.automl.v1beta1.StructStats)
      com.google.cloud.automl.v1beta1.StructStatsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.automl.v1beta1.DataStatsOuterClass
          .internal_static_google_cloud_automl_v1beta1_StructStats_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(int number) {
      switch (number) {
        case 1:
          return internalGetFieldStats();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
      switch (number) {
        case 1:
          return internalGetMutableFieldStats();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.automl.v1beta1.DataStatsOuterClass
          .internal_static_google_cloud_automl_v1beta1_StructStats_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.automl.v1beta1.StructStats.class,
              com.google.cloud.automl.v1beta1.StructStats.Builder.class);
    }

    // Construct using com.google.cloud.automl.v1beta1.StructStats.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      internalGetMutableFieldStats().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.automl.v1beta1.DataStatsOuterClass
          .internal_static_google_cloud_automl_v1beta1_StructStats_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.StructStats getDefaultInstanceForType() {
      return com.google.cloud.automl.v1beta1.StructStats.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.StructStats build() {
      com.google.cloud.automl.v1beta1.StructStats result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.StructStats buildPartial() {
      com.google.cloud.automl.v1beta1.StructStats result =
          new com.google.cloud.automl.v1beta1.StructStats(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.automl.v1beta1.StructStats result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.fieldStats_ = internalGetFieldStats();
        result.fieldStats_.makeImmutable();
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
      if (other instanceof com.google.cloud.automl.v1beta1.StructStats) {
        return mergeFrom((com.google.cloud.automl.v1beta1.StructStats) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.automl.v1beta1.StructStats other) {
      if (other == com.google.cloud.automl.v1beta1.StructStats.getDefaultInstance()) return this;
      internalGetMutableFieldStats().mergeFrom(other.internalGetFieldStats());
      bitField0_ |= 0x00000001;
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
            case 10:
              {
                com.google.protobuf.MapEntry<
                        java.lang.String, com.google.cloud.automl.v1beta1.DataStats>
                    fieldStats__ =
                        input.readMessage(
                            FieldStatsDefaultEntryHolder.defaultEntry.getParserForType(),
                            extensionRegistry);
                internalGetMutableFieldStats()
                    .getMutableMap()
                    .put(fieldStats__.getKey(), fieldStats__.getValue());
                bitField0_ |= 0x00000001;
                break;
              } // case 10
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

    private com.google.protobuf.MapField<
            java.lang.String, com.google.cloud.automl.v1beta1.DataStats>
        fieldStats_;

    private com.google.protobuf.MapField<
            java.lang.String, com.google.cloud.automl.v1beta1.DataStats>
        internalGetFieldStats() {
      if (fieldStats_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            FieldStatsDefaultEntryHolder.defaultEntry);
      }
      return fieldStats_;
    }

    private com.google.protobuf.MapField<
            java.lang.String, com.google.cloud.automl.v1beta1.DataStats>
        internalGetMutableFieldStats() {
      if (fieldStats_ == null) {
        fieldStats_ =
            com.google.protobuf.MapField.newMapField(FieldStatsDefaultEntryHolder.defaultEntry);
      }
      if (!fieldStats_.isMutable()) {
        fieldStats_ = fieldStats_.copy();
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return fieldStats_;
    }

    public int getFieldStatsCount() {
      return internalGetFieldStats().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * Map from a field name of the struct to data stats aggregated over series
     * of all data in that field across all the structs.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.automl.v1beta1.DataStats&gt; field_stats = 1;</code>
     */
    @java.lang.Override
    public boolean containsFieldStats(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      return internalGetFieldStats().getMap().containsKey(key);
    }
    /** Use {@link #getFieldStatsMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.cloud.automl.v1beta1.DataStats>
        getFieldStats() {
      return getFieldStatsMap();
    }
    /**
     *
     *
     * <pre>
     * Map from a field name of the struct to data stats aggregated over series
     * of all data in that field across all the structs.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.automl.v1beta1.DataStats&gt; field_stats = 1;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, com.google.cloud.automl.v1beta1.DataStats>
        getFieldStatsMap() {
      return internalGetFieldStats().getMap();
    }
    /**
     *
     *
     * <pre>
     * Map from a field name of the struct to data stats aggregated over series
     * of all data in that field across all the structs.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.automl.v1beta1.DataStats&gt; field_stats = 1;</code>
     */
    @java.lang.Override
    public /* nullable */ com.google.cloud.automl.v1beta1.DataStats getFieldStatsOrDefault(
        java.lang.String key,
        /* nullable */
        com.google.cloud.automl.v1beta1.DataStats defaultValue) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, com.google.cloud.automl.v1beta1.DataStats> map =
          internalGetFieldStats().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * Map from a field name of the struct to data stats aggregated over series
     * of all data in that field across all the structs.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.automl.v1beta1.DataStats&gt; field_stats = 1;</code>
     */
    @java.lang.Override
    public com.google.cloud.automl.v1beta1.DataStats getFieldStatsOrThrow(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, com.google.cloud.automl.v1beta1.DataStats> map =
          internalGetFieldStats().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearFieldStats() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableFieldStats().getMutableMap().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Map from a field name of the struct to data stats aggregated over series
     * of all data in that field across all the structs.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.automl.v1beta1.DataStats&gt; field_stats = 1;</code>
     */
    public Builder removeFieldStats(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      internalGetMutableFieldStats().getMutableMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.cloud.automl.v1beta1.DataStats>
        getMutableFieldStats() {
      bitField0_ |= 0x00000001;
      return internalGetMutableFieldStats().getMutableMap();
    }
    /**
     *
     *
     * <pre>
     * Map from a field name of the struct to data stats aggregated over series
     * of all data in that field across all the structs.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.automl.v1beta1.DataStats&gt; field_stats = 1;</code>
     */
    public Builder putFieldStats(
        java.lang.String key, com.google.cloud.automl.v1beta1.DataStats value) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      if (value == null) {
        throw new NullPointerException("map value");
      }
      internalGetMutableFieldStats().getMutableMap().put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Map from a field name of the struct to data stats aggregated over series
     * of all data in that field across all the structs.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.automl.v1beta1.DataStats&gt; field_stats = 1;</code>
     */
    public Builder putAllFieldStats(
        java.util.Map<java.lang.String, com.google.cloud.automl.v1beta1.DataStats> values) {
      internalGetMutableFieldStats().getMutableMap().putAll(values);
      bitField0_ |= 0x00000001;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.automl.v1beta1.StructStats)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.automl.v1beta1.StructStats)
  private static final com.google.cloud.automl.v1beta1.StructStats DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.automl.v1beta1.StructStats();
  }

  public static com.google.cloud.automl.v1beta1.StructStats getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StructStats> PARSER =
      new com.google.protobuf.AbstractParser<StructStats>() {
        @java.lang.Override
        public StructStats parsePartialFrom(
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

  public static com.google.protobuf.Parser<StructStats> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StructStats> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.automl.v1beta1.StructStats getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
