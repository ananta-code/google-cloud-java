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
// source: google/cloud/tpu/v2/cloud_tpu.proto

package com.google.cloud.tpu.v2;

/**
 *
 *
 * <pre>
 * Sets the scheduling options for this node.
 * </pre>
 *
 * Protobuf type {@code google.cloud.tpu.v2.SchedulingConfig}
 */
public final class SchedulingConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.tpu.v2.SchedulingConfig)
    SchedulingConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SchedulingConfig.newBuilder() to construct.
  private SchedulingConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SchedulingConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SchedulingConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.tpu.v2.CloudTpuProto
        .internal_static_google_cloud_tpu_v2_SchedulingConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.tpu.v2.CloudTpuProto
        .internal_static_google_cloud_tpu_v2_SchedulingConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.tpu.v2.SchedulingConfig.class,
            com.google.cloud.tpu.v2.SchedulingConfig.Builder.class);
  }

  public static final int PREEMPTIBLE_FIELD_NUMBER = 1;
  private boolean preemptible_ = false;
  /**
   *
   *
   * <pre>
   * Defines whether the node is preemptible.
   * </pre>
   *
   * <code>bool preemptible = 1;</code>
   *
   * @return The preemptible.
   */
  @java.lang.Override
  public boolean getPreemptible() {
    return preemptible_;
  }

  public static final int RESERVED_FIELD_NUMBER = 2;
  private boolean reserved_ = false;
  /**
   *
   *
   * <pre>
   * Whether the node is created under a reservation.
   * </pre>
   *
   * <code>bool reserved = 2;</code>
   *
   * @return The reserved.
   */
  @java.lang.Override
  public boolean getReserved() {
    return reserved_;
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
    if (preemptible_ != false) {
      output.writeBool(1, preemptible_);
    }
    if (reserved_ != false) {
      output.writeBool(2, reserved_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (preemptible_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, preemptible_);
    }
    if (reserved_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, reserved_);
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
    if (!(obj instanceof com.google.cloud.tpu.v2.SchedulingConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.tpu.v2.SchedulingConfig other = (com.google.cloud.tpu.v2.SchedulingConfig) obj;

    if (getPreemptible() != other.getPreemptible()) return false;
    if (getReserved() != other.getReserved()) return false;
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
    hash = (37 * hash) + PREEMPTIBLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getPreemptible());
    hash = (37 * hash) + RESERVED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getReserved());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.tpu.v2.SchedulingConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tpu.v2.SchedulingConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tpu.v2.SchedulingConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tpu.v2.SchedulingConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tpu.v2.SchedulingConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tpu.v2.SchedulingConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tpu.v2.SchedulingConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.tpu.v2.SchedulingConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.tpu.v2.SchedulingConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.tpu.v2.SchedulingConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.tpu.v2.SchedulingConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.tpu.v2.SchedulingConfig parseFrom(
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

  public static Builder newBuilder(com.google.cloud.tpu.v2.SchedulingConfig prototype) {
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
   * Sets the scheduling options for this node.
   * </pre>
   *
   * Protobuf type {@code google.cloud.tpu.v2.SchedulingConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.tpu.v2.SchedulingConfig)
      com.google.cloud.tpu.v2.SchedulingConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.tpu.v2.CloudTpuProto
          .internal_static_google_cloud_tpu_v2_SchedulingConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.tpu.v2.CloudTpuProto
          .internal_static_google_cloud_tpu_v2_SchedulingConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.tpu.v2.SchedulingConfig.class,
              com.google.cloud.tpu.v2.SchedulingConfig.Builder.class);
    }

    // Construct using com.google.cloud.tpu.v2.SchedulingConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      preemptible_ = false;
      reserved_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.tpu.v2.CloudTpuProto
          .internal_static_google_cloud_tpu_v2_SchedulingConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.tpu.v2.SchedulingConfig getDefaultInstanceForType() {
      return com.google.cloud.tpu.v2.SchedulingConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.tpu.v2.SchedulingConfig build() {
      com.google.cloud.tpu.v2.SchedulingConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.tpu.v2.SchedulingConfig buildPartial() {
      com.google.cloud.tpu.v2.SchedulingConfig result =
          new com.google.cloud.tpu.v2.SchedulingConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.tpu.v2.SchedulingConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.preemptible_ = preemptible_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.reserved_ = reserved_;
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
      if (other instanceof com.google.cloud.tpu.v2.SchedulingConfig) {
        return mergeFrom((com.google.cloud.tpu.v2.SchedulingConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.tpu.v2.SchedulingConfig other) {
      if (other == com.google.cloud.tpu.v2.SchedulingConfig.getDefaultInstance()) return this;
      if (other.getPreemptible() != false) {
        setPreemptible(other.getPreemptible());
      }
      if (other.getReserved() != false) {
        setReserved(other.getReserved());
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
                preemptible_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                reserved_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

    private boolean preemptible_;
    /**
     *
     *
     * <pre>
     * Defines whether the node is preemptible.
     * </pre>
     *
     * <code>bool preemptible = 1;</code>
     *
     * @return The preemptible.
     */
    @java.lang.Override
    public boolean getPreemptible() {
      return preemptible_;
    }
    /**
     *
     *
     * <pre>
     * Defines whether the node is preemptible.
     * </pre>
     *
     * <code>bool preemptible = 1;</code>
     *
     * @param value The preemptible to set.
     * @return This builder for chaining.
     */
    public Builder setPreemptible(boolean value) {

      preemptible_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Defines whether the node is preemptible.
     * </pre>
     *
     * <code>bool preemptible = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPreemptible() {
      bitField0_ = (bitField0_ & ~0x00000001);
      preemptible_ = false;
      onChanged();
      return this;
    }

    private boolean reserved_;
    /**
     *
     *
     * <pre>
     * Whether the node is created under a reservation.
     * </pre>
     *
     * <code>bool reserved = 2;</code>
     *
     * @return The reserved.
     */
    @java.lang.Override
    public boolean getReserved() {
      return reserved_;
    }
    /**
     *
     *
     * <pre>
     * Whether the node is created under a reservation.
     * </pre>
     *
     * <code>bool reserved = 2;</code>
     *
     * @param value The reserved to set.
     * @return This builder for chaining.
     */
    public Builder setReserved(boolean value) {

      reserved_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Whether the node is created under a reservation.
     * </pre>
     *
     * <code>bool reserved = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearReserved() {
      bitField0_ = (bitField0_ & ~0x00000002);
      reserved_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.tpu.v2.SchedulingConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.tpu.v2.SchedulingConfig)
  private static final com.google.cloud.tpu.v2.SchedulingConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.tpu.v2.SchedulingConfig();
  }

  public static com.google.cloud.tpu.v2.SchedulingConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SchedulingConfig> PARSER =
      new com.google.protobuf.AbstractParser<SchedulingConfig>() {
        @java.lang.Override
        public SchedulingConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<SchedulingConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SchedulingConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.tpu.v2.SchedulingConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
