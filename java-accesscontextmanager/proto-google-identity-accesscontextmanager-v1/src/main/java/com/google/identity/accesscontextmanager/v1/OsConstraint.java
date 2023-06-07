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
// source: google/identity/accesscontextmanager/v1/access_level.proto

package com.google.identity.accesscontextmanager.v1;

/**
 *
 *
 * <pre>
 * A restriction on the OS type and version of devices making requests.
 * </pre>
 *
 * Protobuf type {@code google.identity.accesscontextmanager.v1.OsConstraint}
 */
public final class OsConstraint extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.identity.accesscontextmanager.v1.OsConstraint)
    OsConstraintOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use OsConstraint.newBuilder() to construct.
  private OsConstraint(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private OsConstraint() {
    osType_ = 0;
    minimumVersion_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new OsConstraint();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.identity.accesscontextmanager.v1.AccessLevelProto
        .internal_static_google_identity_accesscontextmanager_v1_OsConstraint_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.identity.accesscontextmanager.v1.AccessLevelProto
        .internal_static_google_identity_accesscontextmanager_v1_OsConstraint_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.identity.accesscontextmanager.v1.OsConstraint.class,
            com.google.identity.accesscontextmanager.v1.OsConstraint.Builder.class);
  }

  public static final int OS_TYPE_FIELD_NUMBER = 1;
  private int osType_ = 0;
  /**
   *
   *
   * <pre>
   * Required. The allowed OS type.
   * </pre>
   *
   * <code>.google.identity.accesscontextmanager.type.OsType os_type = 1;</code>
   *
   * @return The enum numeric value on the wire for osType.
   */
  @java.lang.Override
  public int getOsTypeValue() {
    return osType_;
  }
  /**
   *
   *
   * <pre>
   * Required. The allowed OS type.
   * </pre>
   *
   * <code>.google.identity.accesscontextmanager.type.OsType os_type = 1;</code>
   *
   * @return The osType.
   */
  @java.lang.Override
  public com.google.identity.accesscontextmanager.type.OsType getOsType() {
    com.google.identity.accesscontextmanager.type.OsType result =
        com.google.identity.accesscontextmanager.type.OsType.forNumber(osType_);
    return result == null
        ? com.google.identity.accesscontextmanager.type.OsType.UNRECOGNIZED
        : result;
  }

  public static final int MINIMUM_VERSION_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object minimumVersion_ = "";
  /**
   *
   *
   * <pre>
   * The minimum allowed OS version. If not set, any version of this OS
   * satisfies the constraint. Format: `"major.minor.patch"`.
   * Examples: `"10.5.301"`, `"9.2.1"`.
   * </pre>
   *
   * <code>string minimum_version = 2;</code>
   *
   * @return The minimumVersion.
   */
  @java.lang.Override
  public java.lang.String getMinimumVersion() {
    java.lang.Object ref = minimumVersion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      minimumVersion_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The minimum allowed OS version. If not set, any version of this OS
   * satisfies the constraint. Format: `"major.minor.patch"`.
   * Examples: `"10.5.301"`, `"9.2.1"`.
   * </pre>
   *
   * <code>string minimum_version = 2;</code>
   *
   * @return The bytes for minimumVersion.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getMinimumVersionBytes() {
    java.lang.Object ref = minimumVersion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      minimumVersion_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REQUIRE_VERIFIED_CHROME_OS_FIELD_NUMBER = 3;
  private boolean requireVerifiedChromeOs_ = false;
  /**
   *
   *
   * <pre>
   * Only allows requests from devices with a verified Chrome OS.
   * Verifications includes requirements that the device is enterprise-managed,
   * conformant to domain policies, and the caller has permission to call
   * the API targeted by the request.
   * </pre>
   *
   * <code>bool require_verified_chrome_os = 3;</code>
   *
   * @return The requireVerifiedChromeOs.
   */
  @java.lang.Override
  public boolean getRequireVerifiedChromeOs() {
    return requireVerifiedChromeOs_;
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
    if (osType_
        != com.google.identity.accesscontextmanager.type.OsType.OS_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, osType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(minimumVersion_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, minimumVersion_);
    }
    if (requireVerifiedChromeOs_ != false) {
      output.writeBool(3, requireVerifiedChromeOs_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (osType_
        != com.google.identity.accesscontextmanager.type.OsType.OS_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, osType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(minimumVersion_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, minimumVersion_);
    }
    if (requireVerifiedChromeOs_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, requireVerifiedChromeOs_);
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
    if (!(obj instanceof com.google.identity.accesscontextmanager.v1.OsConstraint)) {
      return super.equals(obj);
    }
    com.google.identity.accesscontextmanager.v1.OsConstraint other =
        (com.google.identity.accesscontextmanager.v1.OsConstraint) obj;

    if (osType_ != other.osType_) return false;
    if (!getMinimumVersion().equals(other.getMinimumVersion())) return false;
    if (getRequireVerifiedChromeOs() != other.getRequireVerifiedChromeOs()) return false;
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
    hash = (37 * hash) + OS_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + osType_;
    hash = (37 * hash) + MINIMUM_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getMinimumVersion().hashCode();
    hash = (37 * hash) + REQUIRE_VERIFIED_CHROME_OS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getRequireVerifiedChromeOs());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.identity.accesscontextmanager.v1.OsConstraint parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.identity.accesscontextmanager.v1.OsConstraint parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.identity.accesscontextmanager.v1.OsConstraint parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.identity.accesscontextmanager.v1.OsConstraint parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.identity.accesscontextmanager.v1.OsConstraint parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.identity.accesscontextmanager.v1.OsConstraint parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.identity.accesscontextmanager.v1.OsConstraint parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.identity.accesscontextmanager.v1.OsConstraint parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.identity.accesscontextmanager.v1.OsConstraint parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.identity.accesscontextmanager.v1.OsConstraint parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.identity.accesscontextmanager.v1.OsConstraint parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.identity.accesscontextmanager.v1.OsConstraint parseFrom(
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
      com.google.identity.accesscontextmanager.v1.OsConstraint prototype) {
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
   * A restriction on the OS type and version of devices making requests.
   * </pre>
   *
   * Protobuf type {@code google.identity.accesscontextmanager.v1.OsConstraint}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.identity.accesscontextmanager.v1.OsConstraint)
      com.google.identity.accesscontextmanager.v1.OsConstraintOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.identity.accesscontextmanager.v1.AccessLevelProto
          .internal_static_google_identity_accesscontextmanager_v1_OsConstraint_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.identity.accesscontextmanager.v1.AccessLevelProto
          .internal_static_google_identity_accesscontextmanager_v1_OsConstraint_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.identity.accesscontextmanager.v1.OsConstraint.class,
              com.google.identity.accesscontextmanager.v1.OsConstraint.Builder.class);
    }

    // Construct using com.google.identity.accesscontextmanager.v1.OsConstraint.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      osType_ = 0;
      minimumVersion_ = "";
      requireVerifiedChromeOs_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.identity.accesscontextmanager.v1.AccessLevelProto
          .internal_static_google_identity_accesscontextmanager_v1_OsConstraint_descriptor;
    }

    @java.lang.Override
    public com.google.identity.accesscontextmanager.v1.OsConstraint getDefaultInstanceForType() {
      return com.google.identity.accesscontextmanager.v1.OsConstraint.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.identity.accesscontextmanager.v1.OsConstraint build() {
      com.google.identity.accesscontextmanager.v1.OsConstraint result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.identity.accesscontextmanager.v1.OsConstraint buildPartial() {
      com.google.identity.accesscontextmanager.v1.OsConstraint result =
          new com.google.identity.accesscontextmanager.v1.OsConstraint(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.identity.accesscontextmanager.v1.OsConstraint result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.osType_ = osType_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.minimumVersion_ = minimumVersion_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.requireVerifiedChromeOs_ = requireVerifiedChromeOs_;
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
      if (other instanceof com.google.identity.accesscontextmanager.v1.OsConstraint) {
        return mergeFrom((com.google.identity.accesscontextmanager.v1.OsConstraint) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.identity.accesscontextmanager.v1.OsConstraint other) {
      if (other == com.google.identity.accesscontextmanager.v1.OsConstraint.getDefaultInstance())
        return this;
      if (other.osType_ != 0) {
        setOsTypeValue(other.getOsTypeValue());
      }
      if (!other.getMinimumVersion().isEmpty()) {
        minimumVersion_ = other.minimumVersion_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getRequireVerifiedChromeOs() != false) {
        setRequireVerifiedChromeOs(other.getRequireVerifiedChromeOs());
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
                osType_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                minimumVersion_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 24:
              {
                requireVerifiedChromeOs_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
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

    private int osType_ = 0;
    /**
     *
     *
     * <pre>
     * Required. The allowed OS type.
     * </pre>
     *
     * <code>.google.identity.accesscontextmanager.type.OsType os_type = 1;</code>
     *
     * @return The enum numeric value on the wire for osType.
     */
    @java.lang.Override
    public int getOsTypeValue() {
      return osType_;
    }
    /**
     *
     *
     * <pre>
     * Required. The allowed OS type.
     * </pre>
     *
     * <code>.google.identity.accesscontextmanager.type.OsType os_type = 1;</code>
     *
     * @param value The enum numeric value on the wire for osType to set.
     * @return This builder for chaining.
     */
    public Builder setOsTypeValue(int value) {
      osType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The allowed OS type.
     * </pre>
     *
     * <code>.google.identity.accesscontextmanager.type.OsType os_type = 1;</code>
     *
     * @return The osType.
     */
    @java.lang.Override
    public com.google.identity.accesscontextmanager.type.OsType getOsType() {
      com.google.identity.accesscontextmanager.type.OsType result =
          com.google.identity.accesscontextmanager.type.OsType.forNumber(osType_);
      return result == null
          ? com.google.identity.accesscontextmanager.type.OsType.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Required. The allowed OS type.
     * </pre>
     *
     * <code>.google.identity.accesscontextmanager.type.OsType os_type = 1;</code>
     *
     * @param value The osType to set.
     * @return This builder for chaining.
     */
    public Builder setOsType(com.google.identity.accesscontextmanager.type.OsType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      osType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The allowed OS type.
     * </pre>
     *
     * <code>.google.identity.accesscontextmanager.type.OsType os_type = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOsType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      osType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object minimumVersion_ = "";
    /**
     *
     *
     * <pre>
     * The minimum allowed OS version. If not set, any version of this OS
     * satisfies the constraint. Format: `"major.minor.patch"`.
     * Examples: `"10.5.301"`, `"9.2.1"`.
     * </pre>
     *
     * <code>string minimum_version = 2;</code>
     *
     * @return The minimumVersion.
     */
    public java.lang.String getMinimumVersion() {
      java.lang.Object ref = minimumVersion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        minimumVersion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The minimum allowed OS version. If not set, any version of this OS
     * satisfies the constraint. Format: `"major.minor.patch"`.
     * Examples: `"10.5.301"`, `"9.2.1"`.
     * </pre>
     *
     * <code>string minimum_version = 2;</code>
     *
     * @return The bytes for minimumVersion.
     */
    public com.google.protobuf.ByteString getMinimumVersionBytes() {
      java.lang.Object ref = minimumVersion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        minimumVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The minimum allowed OS version. If not set, any version of this OS
     * satisfies the constraint. Format: `"major.minor.patch"`.
     * Examples: `"10.5.301"`, `"9.2.1"`.
     * </pre>
     *
     * <code>string minimum_version = 2;</code>
     *
     * @param value The minimumVersion to set.
     * @return This builder for chaining.
     */
    public Builder setMinimumVersion(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      minimumVersion_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The minimum allowed OS version. If not set, any version of this OS
     * satisfies the constraint. Format: `"major.minor.patch"`.
     * Examples: `"10.5.301"`, `"9.2.1"`.
     * </pre>
     *
     * <code>string minimum_version = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMinimumVersion() {
      minimumVersion_ = getDefaultInstance().getMinimumVersion();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The minimum allowed OS version. If not set, any version of this OS
     * satisfies the constraint. Format: `"major.minor.patch"`.
     * Examples: `"10.5.301"`, `"9.2.1"`.
     * </pre>
     *
     * <code>string minimum_version = 2;</code>
     *
     * @param value The bytes for minimumVersion to set.
     * @return This builder for chaining.
     */
    public Builder setMinimumVersionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      minimumVersion_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private boolean requireVerifiedChromeOs_;
    /**
     *
     *
     * <pre>
     * Only allows requests from devices with a verified Chrome OS.
     * Verifications includes requirements that the device is enterprise-managed,
     * conformant to domain policies, and the caller has permission to call
     * the API targeted by the request.
     * </pre>
     *
     * <code>bool require_verified_chrome_os = 3;</code>
     *
     * @return The requireVerifiedChromeOs.
     */
    @java.lang.Override
    public boolean getRequireVerifiedChromeOs() {
      return requireVerifiedChromeOs_;
    }
    /**
     *
     *
     * <pre>
     * Only allows requests from devices with a verified Chrome OS.
     * Verifications includes requirements that the device is enterprise-managed,
     * conformant to domain policies, and the caller has permission to call
     * the API targeted by the request.
     * </pre>
     *
     * <code>bool require_verified_chrome_os = 3;</code>
     *
     * @param value The requireVerifiedChromeOs to set.
     * @return This builder for chaining.
     */
    public Builder setRequireVerifiedChromeOs(boolean value) {

      requireVerifiedChromeOs_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Only allows requests from devices with a verified Chrome OS.
     * Verifications includes requirements that the device is enterprise-managed,
     * conformant to domain policies, and the caller has permission to call
     * the API targeted by the request.
     * </pre>
     *
     * <code>bool require_verified_chrome_os = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRequireVerifiedChromeOs() {
      bitField0_ = (bitField0_ & ~0x00000004);
      requireVerifiedChromeOs_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.identity.accesscontextmanager.v1.OsConstraint)
  }

  // @@protoc_insertion_point(class_scope:google.identity.accesscontextmanager.v1.OsConstraint)
  private static final com.google.identity.accesscontextmanager.v1.OsConstraint DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.identity.accesscontextmanager.v1.OsConstraint();
  }

  public static com.google.identity.accesscontextmanager.v1.OsConstraint getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OsConstraint> PARSER =
      new com.google.protobuf.AbstractParser<OsConstraint>() {
        @java.lang.Override
        public OsConstraint parsePartialFrom(
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

  public static com.google.protobuf.Parser<OsConstraint> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OsConstraint> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.identity.accesscontextmanager.v1.OsConstraint getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
