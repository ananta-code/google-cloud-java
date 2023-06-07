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
// source: google/cloud/accessapproval/v1/accessapproval.proto

package com.google.cloud.accessapproval.v1;

/**
 *
 *
 * <pre>
 * Home office and physical location of the principal.
 * </pre>
 *
 * Protobuf type {@code google.cloud.accessapproval.v1.AccessLocations}
 */
public final class AccessLocations extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.accessapproval.v1.AccessLocations)
    AccessLocationsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AccessLocations.newBuilder() to construct.
  private AccessLocations(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AccessLocations() {
    principalOfficeCountry_ = "";
    principalPhysicalLocationCountry_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AccessLocations();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.accessapproval.v1.AccessApprovalProto
        .internal_static_google_cloud_accessapproval_v1_AccessLocations_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.accessapproval.v1.AccessApprovalProto
        .internal_static_google_cloud_accessapproval_v1_AccessLocations_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.accessapproval.v1.AccessLocations.class,
            com.google.cloud.accessapproval.v1.AccessLocations.Builder.class);
  }

  public static final int PRINCIPAL_OFFICE_COUNTRY_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object principalOfficeCountry_ = "";
  /**
   *
   *
   * <pre>
   * The "home office" location of the principal. A two-letter country code
   * (ISO 3166-1 alpha-2), such as "US", "DE" or "GB" or a region code. In some
   * limited situations Google systems may refer refer to a region code instead
   * of a country code.
   * Possible Region Codes:
   *
   *   * ASI: Asia
   *   * EUR: Europe
   *   * OCE: Oceania
   *   * AFR: Africa
   *   * NAM: North America
   *   * SAM: South America
   *   * ANT: Antarctica
   *   * ANY: Any location
   * </pre>
   *
   * <code>string principal_office_country = 1;</code>
   *
   * @return The principalOfficeCountry.
   */
  @java.lang.Override
  public java.lang.String getPrincipalOfficeCountry() {
    java.lang.Object ref = principalOfficeCountry_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      principalOfficeCountry_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The "home office" location of the principal. A two-letter country code
   * (ISO 3166-1 alpha-2), such as "US", "DE" or "GB" or a region code. In some
   * limited situations Google systems may refer refer to a region code instead
   * of a country code.
   * Possible Region Codes:
   *
   *   * ASI: Asia
   *   * EUR: Europe
   *   * OCE: Oceania
   *   * AFR: Africa
   *   * NAM: North America
   *   * SAM: South America
   *   * ANT: Antarctica
   *   * ANY: Any location
   * </pre>
   *
   * <code>string principal_office_country = 1;</code>
   *
   * @return The bytes for principalOfficeCountry.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPrincipalOfficeCountryBytes() {
    java.lang.Object ref = principalOfficeCountry_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      principalOfficeCountry_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRINCIPAL_PHYSICAL_LOCATION_COUNTRY_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object principalPhysicalLocationCountry_ = "";
  /**
   *
   *
   * <pre>
   * Physical location of the principal at the time of the access. A
   * two-letter country code (ISO 3166-1 alpha-2), such as "US", "DE" or "GB" or
   * a region code. In some limited situations Google systems may refer refer to
   * a region code instead of a country code.
   * Possible Region Codes:
   *
   *   * ASI: Asia
   *   * EUR: Europe
   *   * OCE: Oceania
   *   * AFR: Africa
   *   * NAM: North America
   *   * SAM: South America
   *   * ANT: Antarctica
   *   * ANY: Any location
   * </pre>
   *
   * <code>string principal_physical_location_country = 2;</code>
   *
   * @return The principalPhysicalLocationCountry.
   */
  @java.lang.Override
  public java.lang.String getPrincipalPhysicalLocationCountry() {
    java.lang.Object ref = principalPhysicalLocationCountry_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      principalPhysicalLocationCountry_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Physical location of the principal at the time of the access. A
   * two-letter country code (ISO 3166-1 alpha-2), such as "US", "DE" or "GB" or
   * a region code. In some limited situations Google systems may refer refer to
   * a region code instead of a country code.
   * Possible Region Codes:
   *
   *   * ASI: Asia
   *   * EUR: Europe
   *   * OCE: Oceania
   *   * AFR: Africa
   *   * NAM: North America
   *   * SAM: South America
   *   * ANT: Antarctica
   *   * ANY: Any location
   * </pre>
   *
   * <code>string principal_physical_location_country = 2;</code>
   *
   * @return The bytes for principalPhysicalLocationCountry.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPrincipalPhysicalLocationCountryBytes() {
    java.lang.Object ref = principalPhysicalLocationCountry_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      principalPhysicalLocationCountry_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(principalOfficeCountry_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, principalOfficeCountry_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(principalPhysicalLocationCountry_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(
          output, 2, principalPhysicalLocationCountry_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(principalOfficeCountry_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, principalOfficeCountry_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(principalPhysicalLocationCountry_)) {
      size +=
          com.google.protobuf.GeneratedMessageV3.computeStringSize(
              2, principalPhysicalLocationCountry_);
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
    if (!(obj instanceof com.google.cloud.accessapproval.v1.AccessLocations)) {
      return super.equals(obj);
    }
    com.google.cloud.accessapproval.v1.AccessLocations other =
        (com.google.cloud.accessapproval.v1.AccessLocations) obj;

    if (!getPrincipalOfficeCountry().equals(other.getPrincipalOfficeCountry())) return false;
    if (!getPrincipalPhysicalLocationCountry().equals(other.getPrincipalPhysicalLocationCountry()))
      return false;
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
    hash = (37 * hash) + PRINCIPAL_OFFICE_COUNTRY_FIELD_NUMBER;
    hash = (53 * hash) + getPrincipalOfficeCountry().hashCode();
    hash = (37 * hash) + PRINCIPAL_PHYSICAL_LOCATION_COUNTRY_FIELD_NUMBER;
    hash = (53 * hash) + getPrincipalPhysicalLocationCountry().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.accessapproval.v1.AccessLocations parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.accessapproval.v1.AccessLocations parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.accessapproval.v1.AccessLocations parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.accessapproval.v1.AccessLocations parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.accessapproval.v1.AccessLocations parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.accessapproval.v1.AccessLocations parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.accessapproval.v1.AccessLocations parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.accessapproval.v1.AccessLocations parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.accessapproval.v1.AccessLocations parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.accessapproval.v1.AccessLocations parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.accessapproval.v1.AccessLocations parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.accessapproval.v1.AccessLocations parseFrom(
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

  public static Builder newBuilder(com.google.cloud.accessapproval.v1.AccessLocations prototype) {
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
   * Home office and physical location of the principal.
   * </pre>
   *
   * Protobuf type {@code google.cloud.accessapproval.v1.AccessLocations}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.accessapproval.v1.AccessLocations)
      com.google.cloud.accessapproval.v1.AccessLocationsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.accessapproval.v1.AccessApprovalProto
          .internal_static_google_cloud_accessapproval_v1_AccessLocations_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.accessapproval.v1.AccessApprovalProto
          .internal_static_google_cloud_accessapproval_v1_AccessLocations_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.accessapproval.v1.AccessLocations.class,
              com.google.cloud.accessapproval.v1.AccessLocations.Builder.class);
    }

    // Construct using com.google.cloud.accessapproval.v1.AccessLocations.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      principalOfficeCountry_ = "";
      principalPhysicalLocationCountry_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.accessapproval.v1.AccessApprovalProto
          .internal_static_google_cloud_accessapproval_v1_AccessLocations_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.accessapproval.v1.AccessLocations getDefaultInstanceForType() {
      return com.google.cloud.accessapproval.v1.AccessLocations.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.accessapproval.v1.AccessLocations build() {
      com.google.cloud.accessapproval.v1.AccessLocations result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.accessapproval.v1.AccessLocations buildPartial() {
      com.google.cloud.accessapproval.v1.AccessLocations result =
          new com.google.cloud.accessapproval.v1.AccessLocations(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.accessapproval.v1.AccessLocations result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.principalOfficeCountry_ = principalOfficeCountry_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.principalPhysicalLocationCountry_ = principalPhysicalLocationCountry_;
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
      if (other instanceof com.google.cloud.accessapproval.v1.AccessLocations) {
        return mergeFrom((com.google.cloud.accessapproval.v1.AccessLocations) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.accessapproval.v1.AccessLocations other) {
      if (other == com.google.cloud.accessapproval.v1.AccessLocations.getDefaultInstance())
        return this;
      if (!other.getPrincipalOfficeCountry().isEmpty()) {
        principalOfficeCountry_ = other.principalOfficeCountry_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getPrincipalPhysicalLocationCountry().isEmpty()) {
        principalPhysicalLocationCountry_ = other.principalPhysicalLocationCountry_;
        bitField0_ |= 0x00000002;
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
                principalOfficeCountry_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                principalPhysicalLocationCountry_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

    private java.lang.Object principalOfficeCountry_ = "";
    /**
     *
     *
     * <pre>
     * The "home office" location of the principal. A two-letter country code
     * (ISO 3166-1 alpha-2), such as "US", "DE" or "GB" or a region code. In some
     * limited situations Google systems may refer refer to a region code instead
     * of a country code.
     * Possible Region Codes:
     *
     *   * ASI: Asia
     *   * EUR: Europe
     *   * OCE: Oceania
     *   * AFR: Africa
     *   * NAM: North America
     *   * SAM: South America
     *   * ANT: Antarctica
     *   * ANY: Any location
     * </pre>
     *
     * <code>string principal_office_country = 1;</code>
     *
     * @return The principalOfficeCountry.
     */
    public java.lang.String getPrincipalOfficeCountry() {
      java.lang.Object ref = principalOfficeCountry_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        principalOfficeCountry_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The "home office" location of the principal. A two-letter country code
     * (ISO 3166-1 alpha-2), such as "US", "DE" or "GB" or a region code. In some
     * limited situations Google systems may refer refer to a region code instead
     * of a country code.
     * Possible Region Codes:
     *
     *   * ASI: Asia
     *   * EUR: Europe
     *   * OCE: Oceania
     *   * AFR: Africa
     *   * NAM: North America
     *   * SAM: South America
     *   * ANT: Antarctica
     *   * ANY: Any location
     * </pre>
     *
     * <code>string principal_office_country = 1;</code>
     *
     * @return The bytes for principalOfficeCountry.
     */
    public com.google.protobuf.ByteString getPrincipalOfficeCountryBytes() {
      java.lang.Object ref = principalOfficeCountry_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        principalOfficeCountry_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The "home office" location of the principal. A two-letter country code
     * (ISO 3166-1 alpha-2), such as "US", "DE" or "GB" or a region code. In some
     * limited situations Google systems may refer refer to a region code instead
     * of a country code.
     * Possible Region Codes:
     *
     *   * ASI: Asia
     *   * EUR: Europe
     *   * OCE: Oceania
     *   * AFR: Africa
     *   * NAM: North America
     *   * SAM: South America
     *   * ANT: Antarctica
     *   * ANY: Any location
     * </pre>
     *
     * <code>string principal_office_country = 1;</code>
     *
     * @param value The principalOfficeCountry to set.
     * @return This builder for chaining.
     */
    public Builder setPrincipalOfficeCountry(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      principalOfficeCountry_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The "home office" location of the principal. A two-letter country code
     * (ISO 3166-1 alpha-2), such as "US", "DE" or "GB" or a region code. In some
     * limited situations Google systems may refer refer to a region code instead
     * of a country code.
     * Possible Region Codes:
     *
     *   * ASI: Asia
     *   * EUR: Europe
     *   * OCE: Oceania
     *   * AFR: Africa
     *   * NAM: North America
     *   * SAM: South America
     *   * ANT: Antarctica
     *   * ANY: Any location
     * </pre>
     *
     * <code>string principal_office_country = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPrincipalOfficeCountry() {
      principalOfficeCountry_ = getDefaultInstance().getPrincipalOfficeCountry();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The "home office" location of the principal. A two-letter country code
     * (ISO 3166-1 alpha-2), such as "US", "DE" or "GB" or a region code. In some
     * limited situations Google systems may refer refer to a region code instead
     * of a country code.
     * Possible Region Codes:
     *
     *   * ASI: Asia
     *   * EUR: Europe
     *   * OCE: Oceania
     *   * AFR: Africa
     *   * NAM: North America
     *   * SAM: South America
     *   * ANT: Antarctica
     *   * ANY: Any location
     * </pre>
     *
     * <code>string principal_office_country = 1;</code>
     *
     * @param value The bytes for principalOfficeCountry to set.
     * @return This builder for chaining.
     */
    public Builder setPrincipalOfficeCountryBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      principalOfficeCountry_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object principalPhysicalLocationCountry_ = "";
    /**
     *
     *
     * <pre>
     * Physical location of the principal at the time of the access. A
     * two-letter country code (ISO 3166-1 alpha-2), such as "US", "DE" or "GB" or
     * a region code. In some limited situations Google systems may refer refer to
     * a region code instead of a country code.
     * Possible Region Codes:
     *
     *   * ASI: Asia
     *   * EUR: Europe
     *   * OCE: Oceania
     *   * AFR: Africa
     *   * NAM: North America
     *   * SAM: South America
     *   * ANT: Antarctica
     *   * ANY: Any location
     * </pre>
     *
     * <code>string principal_physical_location_country = 2;</code>
     *
     * @return The principalPhysicalLocationCountry.
     */
    public java.lang.String getPrincipalPhysicalLocationCountry() {
      java.lang.Object ref = principalPhysicalLocationCountry_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        principalPhysicalLocationCountry_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Physical location of the principal at the time of the access. A
     * two-letter country code (ISO 3166-1 alpha-2), such as "US", "DE" or "GB" or
     * a region code. In some limited situations Google systems may refer refer to
     * a region code instead of a country code.
     * Possible Region Codes:
     *
     *   * ASI: Asia
     *   * EUR: Europe
     *   * OCE: Oceania
     *   * AFR: Africa
     *   * NAM: North America
     *   * SAM: South America
     *   * ANT: Antarctica
     *   * ANY: Any location
     * </pre>
     *
     * <code>string principal_physical_location_country = 2;</code>
     *
     * @return The bytes for principalPhysicalLocationCountry.
     */
    public com.google.protobuf.ByteString getPrincipalPhysicalLocationCountryBytes() {
      java.lang.Object ref = principalPhysicalLocationCountry_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        principalPhysicalLocationCountry_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Physical location of the principal at the time of the access. A
     * two-letter country code (ISO 3166-1 alpha-2), such as "US", "DE" or "GB" or
     * a region code. In some limited situations Google systems may refer refer to
     * a region code instead of a country code.
     * Possible Region Codes:
     *
     *   * ASI: Asia
     *   * EUR: Europe
     *   * OCE: Oceania
     *   * AFR: Africa
     *   * NAM: North America
     *   * SAM: South America
     *   * ANT: Antarctica
     *   * ANY: Any location
     * </pre>
     *
     * <code>string principal_physical_location_country = 2;</code>
     *
     * @param value The principalPhysicalLocationCountry to set.
     * @return This builder for chaining.
     */
    public Builder setPrincipalPhysicalLocationCountry(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      principalPhysicalLocationCountry_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Physical location of the principal at the time of the access. A
     * two-letter country code (ISO 3166-1 alpha-2), such as "US", "DE" or "GB" or
     * a region code. In some limited situations Google systems may refer refer to
     * a region code instead of a country code.
     * Possible Region Codes:
     *
     *   * ASI: Asia
     *   * EUR: Europe
     *   * OCE: Oceania
     *   * AFR: Africa
     *   * NAM: North America
     *   * SAM: South America
     *   * ANT: Antarctica
     *   * ANY: Any location
     * </pre>
     *
     * <code>string principal_physical_location_country = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPrincipalPhysicalLocationCountry() {
      principalPhysicalLocationCountry_ =
          getDefaultInstance().getPrincipalPhysicalLocationCountry();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Physical location of the principal at the time of the access. A
     * two-letter country code (ISO 3166-1 alpha-2), such as "US", "DE" or "GB" or
     * a region code. In some limited situations Google systems may refer refer to
     * a region code instead of a country code.
     * Possible Region Codes:
     *
     *   * ASI: Asia
     *   * EUR: Europe
     *   * OCE: Oceania
     *   * AFR: Africa
     *   * NAM: North America
     *   * SAM: South America
     *   * ANT: Antarctica
     *   * ANY: Any location
     * </pre>
     *
     * <code>string principal_physical_location_country = 2;</code>
     *
     * @param value The bytes for principalPhysicalLocationCountry to set.
     * @return This builder for chaining.
     */
    public Builder setPrincipalPhysicalLocationCountryBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      principalPhysicalLocationCountry_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.accessapproval.v1.AccessLocations)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.accessapproval.v1.AccessLocations)
  private static final com.google.cloud.accessapproval.v1.AccessLocations DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.accessapproval.v1.AccessLocations();
  }

  public static com.google.cloud.accessapproval.v1.AccessLocations getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AccessLocations> PARSER =
      new com.google.protobuf.AbstractParser<AccessLocations>() {
        @java.lang.Override
        public AccessLocations parsePartialFrom(
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

  public static com.google.protobuf.Parser<AccessLocations> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AccessLocations> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.accessapproval.v1.AccessLocations getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
