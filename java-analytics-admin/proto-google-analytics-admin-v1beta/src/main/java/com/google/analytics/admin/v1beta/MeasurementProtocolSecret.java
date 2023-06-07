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
// source: google/analytics/admin/v1beta/resources.proto

package com.google.analytics.admin.v1beta;

/**
 *
 *
 * <pre>
 * A secret value used for sending hits to Measurement Protocol.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1beta.MeasurementProtocolSecret}
 */
public final class MeasurementProtocolSecret extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1beta.MeasurementProtocolSecret)
    MeasurementProtocolSecretOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use MeasurementProtocolSecret.newBuilder() to construct.
  private MeasurementProtocolSecret(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MeasurementProtocolSecret() {
    name_ = "";
    displayName_ = "";
    secretValue_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new MeasurementProtocolSecret();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.admin.v1beta.ResourcesProto
        .internal_static_google_analytics_admin_v1beta_MeasurementProtocolSecret_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1beta.ResourcesProto
        .internal_static_google_analytics_admin_v1beta_MeasurementProtocolSecret_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1beta.MeasurementProtocolSecret.class,
            com.google.analytics.admin.v1beta.MeasurementProtocolSecret.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Output only. Resource name of this secret. This secret may be a child of
   * any type of stream. Format:
   * properties/{property}/dataStreams/{dataStream}/measurementProtocolSecrets/{measurementProtocolSecret}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. Resource name of this secret. This secret may be a child of
   * any type of stream. Format:
   * properties/{property}/dataStreams/{dataStream}/measurementProtocolSecrets/{measurementProtocolSecret}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DISPLAY_NAME_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object displayName_ = "";
  /**
   *
   *
   * <pre>
   * Required. Human-readable display name for this secret.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The displayName.
   */
  @java.lang.Override
  public java.lang.String getDisplayName() {
    java.lang.Object ref = displayName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      displayName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Human-readable display name for this secret.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for displayName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDisplayNameBytes() {
    java.lang.Object ref = displayName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      displayName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SECRET_VALUE_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object secretValue_ = "";
  /**
   *
   *
   * <pre>
   * Output only. The measurement protocol secret value. Pass this value to the
   * api_secret field of the Measurement Protocol API when sending hits to this
   * secret's parent property.
   * </pre>
   *
   * <code>string secret_value = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The secretValue.
   */
  @java.lang.Override
  public java.lang.String getSecretValue() {
    java.lang.Object ref = secretValue_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      secretValue_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. The measurement protocol secret value. Pass this value to the
   * api_secret field of the Measurement Protocol API when sending hits to this
   * secret's parent property.
   * </pre>
   *
   * <code>string secret_value = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for secretValue.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSecretValueBytes() {
    java.lang.Object ref = secretValue_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      secretValue_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(displayName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, displayName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(secretValue_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, secretValue_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(displayName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, displayName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(secretValue_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, secretValue_);
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
    if (!(obj instanceof com.google.analytics.admin.v1beta.MeasurementProtocolSecret)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1beta.MeasurementProtocolSecret other =
        (com.google.analytics.admin.v1beta.MeasurementProtocolSecret) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getDisplayName().equals(other.getDisplayName())) return false;
    if (!getSecretValue().equals(other.getSecretValue())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + DISPLAY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getDisplayName().hashCode();
    hash = (37 * hash) + SECRET_VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getSecretValue().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1beta.MeasurementProtocolSecret parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1beta.MeasurementProtocolSecret parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1beta.MeasurementProtocolSecret parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1beta.MeasurementProtocolSecret parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1beta.MeasurementProtocolSecret parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1beta.MeasurementProtocolSecret parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1beta.MeasurementProtocolSecret parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1beta.MeasurementProtocolSecret parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1beta.MeasurementProtocolSecret parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1beta.MeasurementProtocolSecret parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1beta.MeasurementProtocolSecret parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1beta.MeasurementProtocolSecret parseFrom(
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

  public static Builder newBuilder(
      com.google.analytics.admin.v1beta.MeasurementProtocolSecret prototype) {
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
   * A secret value used for sending hits to Measurement Protocol.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1beta.MeasurementProtocolSecret}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1beta.MeasurementProtocolSecret)
      com.google.analytics.admin.v1beta.MeasurementProtocolSecretOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1beta.ResourcesProto
          .internal_static_google_analytics_admin_v1beta_MeasurementProtocolSecret_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1beta.ResourcesProto
          .internal_static_google_analytics_admin_v1beta_MeasurementProtocolSecret_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1beta.MeasurementProtocolSecret.class,
              com.google.analytics.admin.v1beta.MeasurementProtocolSecret.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1beta.MeasurementProtocolSecret.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      displayName_ = "";
      secretValue_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1beta.ResourcesProto
          .internal_static_google_analytics_admin_v1beta_MeasurementProtocolSecret_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1beta.MeasurementProtocolSecret getDefaultInstanceForType() {
      return com.google.analytics.admin.v1beta.MeasurementProtocolSecret.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1beta.MeasurementProtocolSecret build() {
      com.google.analytics.admin.v1beta.MeasurementProtocolSecret result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1beta.MeasurementProtocolSecret buildPartial() {
      com.google.analytics.admin.v1beta.MeasurementProtocolSecret result =
          new com.google.analytics.admin.v1beta.MeasurementProtocolSecret(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.analytics.admin.v1beta.MeasurementProtocolSecret result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.displayName_ = displayName_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.secretValue_ = secretValue_;
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
      if (other instanceof com.google.analytics.admin.v1beta.MeasurementProtocolSecret) {
        return mergeFrom((com.google.analytics.admin.v1beta.MeasurementProtocolSecret) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1beta.MeasurementProtocolSecret other) {
      if (other == com.google.analytics.admin.v1beta.MeasurementProtocolSecret.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDisplayName().isEmpty()) {
        displayName_ = other.displayName_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getSecretValue().isEmpty()) {
        secretValue_ = other.secretValue_;
        bitField0_ |= 0x00000004;
        onChanged();
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
            case 10:
              {
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                displayName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                secretValue_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Output only. Resource name of this secret. This secret may be a child of
     * any type of stream. Format:
     * properties/{property}/dataStreams/{dataStream}/measurementProtocolSecrets/{measurementProtocolSecret}
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Resource name of this secret. This secret may be a child of
     * any type of stream. Format:
     * properties/{property}/dataStreams/{dataStream}/measurementProtocolSecrets/{measurementProtocolSecret}
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Resource name of this secret. This secret may be a child of
     * any type of stream. Format:
     * properties/{property}/dataStreams/{dataStream}/measurementProtocolSecrets/{measurementProtocolSecret}
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Resource name of this secret. This secret may be a child of
     * any type of stream. Format:
     * properties/{property}/dataStreams/{dataStream}/measurementProtocolSecrets/{measurementProtocolSecret}
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Resource name of this secret. This secret may be a child of
     * any type of stream. Format:
     * properties/{property}/dataStreams/{dataStream}/measurementProtocolSecrets/{measurementProtocolSecret}
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object displayName_ = "";
    /**
     *
     *
     * <pre>
     * Required. Human-readable display name for this secret.
     * </pre>
     *
     * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The displayName.
     */
    public java.lang.String getDisplayName() {
      java.lang.Object ref = displayName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        displayName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Human-readable display name for this secret.
     * </pre>
     *
     * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for displayName.
     */
    public com.google.protobuf.ByteString getDisplayNameBytes() {
      java.lang.Object ref = displayName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        displayName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Human-readable display name for this secret.
     * </pre>
     *
     * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The displayName to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      displayName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Human-readable display name for this secret.
     * </pre>
     *
     * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDisplayName() {
      displayName_ = getDefaultInstance().getDisplayName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Human-readable display name for this secret.
     * </pre>
     *
     * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for displayName to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      displayName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object secretValue_ = "";
    /**
     *
     *
     * <pre>
     * Output only. The measurement protocol secret value. Pass this value to the
     * api_secret field of the Measurement Protocol API when sending hits to this
     * secret's parent property.
     * </pre>
     *
     * <code>string secret_value = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The secretValue.
     */
    public java.lang.String getSecretValue() {
      java.lang.Object ref = secretValue_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        secretValue_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The measurement protocol secret value. Pass this value to the
     * api_secret field of the Measurement Protocol API when sending hits to this
     * secret's parent property.
     * </pre>
     *
     * <code>string secret_value = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for secretValue.
     */
    public com.google.protobuf.ByteString getSecretValueBytes() {
      java.lang.Object ref = secretValue_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        secretValue_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The measurement protocol secret value. Pass this value to the
     * api_secret field of the Measurement Protocol API when sending hits to this
     * secret's parent property.
     * </pre>
     *
     * <code>string secret_value = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The secretValue to set.
     * @return This builder for chaining.
     */
    public Builder setSecretValue(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      secretValue_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The measurement protocol secret value. Pass this value to the
     * api_secret field of the Measurement Protocol API when sending hits to this
     * secret's parent property.
     * </pre>
     *
     * <code>string secret_value = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSecretValue() {
      secretValue_ = getDefaultInstance().getSecretValue();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The measurement protocol secret value. Pass this value to the
     * api_secret field of the Measurement Protocol API when sending hits to this
     * secret's parent property.
     * </pre>
     *
     * <code>string secret_value = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for secretValue to set.
     * @return This builder for chaining.
     */
    public Builder setSecretValueBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      secretValue_ = value;
      bitField0_ |= 0x00000004;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1beta.MeasurementProtocolSecret)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1beta.MeasurementProtocolSecret)
  private static final com.google.analytics.admin.v1beta.MeasurementProtocolSecret DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1beta.MeasurementProtocolSecret();
  }

  public static com.google.analytics.admin.v1beta.MeasurementProtocolSecret getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MeasurementProtocolSecret> PARSER =
      new com.google.protobuf.AbstractParser<MeasurementProtocolSecret>() {
        @java.lang.Override
        public MeasurementProtocolSecret parsePartialFrom(
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

  public static com.google.protobuf.Parser<MeasurementProtocolSecret> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MeasurementProtocolSecret> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1beta.MeasurementProtocolSecret getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
