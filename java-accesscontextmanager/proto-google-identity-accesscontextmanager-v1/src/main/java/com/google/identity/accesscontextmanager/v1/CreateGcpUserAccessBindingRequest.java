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
// source: google/identity/accesscontextmanager/v1/access_context_manager.proto

package com.google.identity.accesscontextmanager.v1;

/**
 *
 *
 * <pre>
 * Request of [CreateGcpUserAccessBinding]
 * [google.identity.accesscontextmanager.v1.AccessContextManager.CreateGcpUserAccessBinding].
 * </pre>
 *
 * Protobuf type {@code google.identity.accesscontextmanager.v1.CreateGcpUserAccessBindingRequest}
 */
public final class CreateGcpUserAccessBindingRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.identity.accesscontextmanager.v1.CreateGcpUserAccessBindingRequest)
    CreateGcpUserAccessBindingRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateGcpUserAccessBindingRequest.newBuilder() to construct.
  private CreateGcpUserAccessBindingRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateGcpUserAccessBindingRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateGcpUserAccessBindingRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.identity.accesscontextmanager.v1.AccessContextManagerProto
        .internal_static_google_identity_accesscontextmanager_v1_CreateGcpUserAccessBindingRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.identity.accesscontextmanager.v1.AccessContextManagerProto
        .internal_static_google_identity_accesscontextmanager_v1_CreateGcpUserAccessBindingRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.identity.accesscontextmanager.v1.CreateGcpUserAccessBindingRequest.class,
            com.google.identity.accesscontextmanager.v1.CreateGcpUserAccessBindingRequest.Builder
                .class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. Example: "organizations/256"
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Example: "organizations/256"
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GCP_USER_ACCESS_BINDING_FIELD_NUMBER = 2;
  private com.google.identity.accesscontextmanager.v1.GcpUserAccessBinding gcpUserAccessBinding_;
  /**
   *
   *
   * <pre>
   * Required. [GcpUserAccessBinding]
   * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]
   * </pre>
   *
   * <code>
   * .google.identity.accesscontextmanager.v1.GcpUserAccessBinding gcp_user_access_binding = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the gcpUserAccessBinding field is set.
   */
  @java.lang.Override
  public boolean hasGcpUserAccessBinding() {
    return gcpUserAccessBinding_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. [GcpUserAccessBinding]
   * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]
   * </pre>
   *
   * <code>
   * .google.identity.accesscontextmanager.v1.GcpUserAccessBinding gcp_user_access_binding = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The gcpUserAccessBinding.
   */
  @java.lang.Override
  public com.google.identity.accesscontextmanager.v1.GcpUserAccessBinding
      getGcpUserAccessBinding() {
    return gcpUserAccessBinding_ == null
        ? com.google.identity.accesscontextmanager.v1.GcpUserAccessBinding.getDefaultInstance()
        : gcpUserAccessBinding_;
  }
  /**
   *
   *
   * <pre>
   * Required. [GcpUserAccessBinding]
   * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]
   * </pre>
   *
   * <code>
   * .google.identity.accesscontextmanager.v1.GcpUserAccessBinding gcp_user_access_binding = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.identity.accesscontextmanager.v1.GcpUserAccessBindingOrBuilder
      getGcpUserAccessBindingOrBuilder() {
    return gcpUserAccessBinding_ == null
        ? com.google.identity.accesscontextmanager.v1.GcpUserAccessBinding.getDefaultInstance()
        : gcpUserAccessBinding_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (gcpUserAccessBinding_ != null) {
      output.writeMessage(2, getGcpUserAccessBinding());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (gcpUserAccessBinding_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(2, getGcpUserAccessBinding());
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
    if (!(obj
        instanceof com.google.identity.accesscontextmanager.v1.CreateGcpUserAccessBindingRequest)) {
      return super.equals(obj);
    }
    com.google.identity.accesscontextmanager.v1.CreateGcpUserAccessBindingRequest other =
        (com.google.identity.accesscontextmanager.v1.CreateGcpUserAccessBindingRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasGcpUserAccessBinding() != other.hasGcpUserAccessBinding()) return false;
    if (hasGcpUserAccessBinding()) {
      if (!getGcpUserAccessBinding().equals(other.getGcpUserAccessBinding())) return false;
    }
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasGcpUserAccessBinding()) {
      hash = (37 * hash) + GCP_USER_ACCESS_BINDING_FIELD_NUMBER;
      hash = (53 * hash) + getGcpUserAccessBinding().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.identity.accesscontextmanager.v1.CreateGcpUserAccessBindingRequest
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.identity.accesscontextmanager.v1.CreateGcpUserAccessBindingRequest
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.identity.accesscontextmanager.v1.CreateGcpUserAccessBindingRequest
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.identity.accesscontextmanager.v1.CreateGcpUserAccessBindingRequest
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.identity.accesscontextmanager.v1.CreateGcpUserAccessBindingRequest
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.identity.accesscontextmanager.v1.CreateGcpUserAccessBindingRequest
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.identity.accesscontextmanager.v1.CreateGcpUserAccessBindingRequest
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.identity.accesscontextmanager.v1.CreateGcpUserAccessBindingRequest
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.identity.accesscontextmanager.v1.CreateGcpUserAccessBindingRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.identity.accesscontextmanager.v1.CreateGcpUserAccessBindingRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.identity.accesscontextmanager.v1.CreateGcpUserAccessBindingRequest
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.identity.accesscontextmanager.v1.CreateGcpUserAccessBindingRequest
      parseFrom(
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
      com.google.identity.accesscontextmanager.v1.CreateGcpUserAccessBindingRequest prototype) {
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
   * Request of [CreateGcpUserAccessBinding]
   * [google.identity.accesscontextmanager.v1.AccessContextManager.CreateGcpUserAccessBinding].
   * </pre>
   *
   * Protobuf type {@code google.identity.accesscontextmanager.v1.CreateGcpUserAccessBindingRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.identity.accesscontextmanager.v1.CreateGcpUserAccessBindingRequest)
      com.google.identity.accesscontextmanager.v1.CreateGcpUserAccessBindingRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.identity.accesscontextmanager.v1.AccessContextManagerProto
          .internal_static_google_identity_accesscontextmanager_v1_CreateGcpUserAccessBindingRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.identity.accesscontextmanager.v1.AccessContextManagerProto
          .internal_static_google_identity_accesscontextmanager_v1_CreateGcpUserAccessBindingRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.identity.accesscontextmanager.v1.CreateGcpUserAccessBindingRequest.class,
              com.google.identity.accesscontextmanager.v1.CreateGcpUserAccessBindingRequest.Builder
                  .class);
    }

    // Construct using
    // com.google.identity.accesscontextmanager.v1.CreateGcpUserAccessBindingRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      gcpUserAccessBinding_ = null;
      if (gcpUserAccessBindingBuilder_ != null) {
        gcpUserAccessBindingBuilder_.dispose();
        gcpUserAccessBindingBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.identity.accesscontextmanager.v1.AccessContextManagerProto
          .internal_static_google_identity_accesscontextmanager_v1_CreateGcpUserAccessBindingRequest_descriptor;
    }

    @java.lang.Override
    public com.google.identity.accesscontextmanager.v1.CreateGcpUserAccessBindingRequest
        getDefaultInstanceForType() {
      return com.google.identity.accesscontextmanager.v1.CreateGcpUserAccessBindingRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.identity.accesscontextmanager.v1.CreateGcpUserAccessBindingRequest build() {
      com.google.identity.accesscontextmanager.v1.CreateGcpUserAccessBindingRequest result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.identity.accesscontextmanager.v1.CreateGcpUserAccessBindingRequest
        buildPartial() {
      com.google.identity.accesscontextmanager.v1.CreateGcpUserAccessBindingRequest result =
          new com.google.identity.accesscontextmanager.v1.CreateGcpUserAccessBindingRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.identity.accesscontextmanager.v1.CreateGcpUserAccessBindingRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.gcpUserAccessBinding_ =
            gcpUserAccessBindingBuilder_ == null
                ? gcpUserAccessBinding_
                : gcpUserAccessBindingBuilder_.build();
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
      if (other
          instanceof
          com.google.identity.accesscontextmanager.v1.CreateGcpUserAccessBindingRequest) {
        return mergeFrom(
            (com.google.identity.accesscontextmanager.v1.CreateGcpUserAccessBindingRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.identity.accesscontextmanager.v1.CreateGcpUserAccessBindingRequest other) {
      if (other
          == com.google.identity.accesscontextmanager.v1.CreateGcpUserAccessBindingRequest
              .getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasGcpUserAccessBinding()) {
        mergeGcpUserAccessBinding(other.getGcpUserAccessBinding());
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
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(
                    getGcpUserAccessBindingFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. Example: "organizations/256"
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Example: "organizations/256"
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Example: "organizations/256"
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Example: "organizations/256"
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Example: "organizations/256"
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.identity.accesscontextmanager.v1.GcpUserAccessBinding gcpUserAccessBinding_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.identity.accesscontextmanager.v1.GcpUserAccessBinding,
            com.google.identity.accesscontextmanager.v1.GcpUserAccessBinding.Builder,
            com.google.identity.accesscontextmanager.v1.GcpUserAccessBindingOrBuilder>
        gcpUserAccessBindingBuilder_;
    /**
     *
     *
     * <pre>
     * Required. [GcpUserAccessBinding]
     * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]
     * </pre>
     *
     * <code>
     * .google.identity.accesscontextmanager.v1.GcpUserAccessBinding gcp_user_access_binding = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the gcpUserAccessBinding field is set.
     */
    public boolean hasGcpUserAccessBinding() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. [GcpUserAccessBinding]
     * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]
     * </pre>
     *
     * <code>
     * .google.identity.accesscontextmanager.v1.GcpUserAccessBinding gcp_user_access_binding = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The gcpUserAccessBinding.
     */
    public com.google.identity.accesscontextmanager.v1.GcpUserAccessBinding
        getGcpUserAccessBinding() {
      if (gcpUserAccessBindingBuilder_ == null) {
        return gcpUserAccessBinding_ == null
            ? com.google.identity.accesscontextmanager.v1.GcpUserAccessBinding.getDefaultInstance()
            : gcpUserAccessBinding_;
      } else {
        return gcpUserAccessBindingBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. [GcpUserAccessBinding]
     * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]
     * </pre>
     *
     * <code>
     * .google.identity.accesscontextmanager.v1.GcpUserAccessBinding gcp_user_access_binding = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setGcpUserAccessBinding(
        com.google.identity.accesscontextmanager.v1.GcpUserAccessBinding value) {
      if (gcpUserAccessBindingBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        gcpUserAccessBinding_ = value;
      } else {
        gcpUserAccessBindingBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. [GcpUserAccessBinding]
     * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]
     * </pre>
     *
     * <code>
     * .google.identity.accesscontextmanager.v1.GcpUserAccessBinding gcp_user_access_binding = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setGcpUserAccessBinding(
        com.google.identity.accesscontextmanager.v1.GcpUserAccessBinding.Builder builderForValue) {
      if (gcpUserAccessBindingBuilder_ == null) {
        gcpUserAccessBinding_ = builderForValue.build();
      } else {
        gcpUserAccessBindingBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. [GcpUserAccessBinding]
     * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]
     * </pre>
     *
     * <code>
     * .google.identity.accesscontextmanager.v1.GcpUserAccessBinding gcp_user_access_binding = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeGcpUserAccessBinding(
        com.google.identity.accesscontextmanager.v1.GcpUserAccessBinding value) {
      if (gcpUserAccessBindingBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && gcpUserAccessBinding_ != null
            && gcpUserAccessBinding_
                != com.google.identity.accesscontextmanager.v1.GcpUserAccessBinding
                    .getDefaultInstance()) {
          getGcpUserAccessBindingBuilder().mergeFrom(value);
        } else {
          gcpUserAccessBinding_ = value;
        }
      } else {
        gcpUserAccessBindingBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. [GcpUserAccessBinding]
     * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]
     * </pre>
     *
     * <code>
     * .google.identity.accesscontextmanager.v1.GcpUserAccessBinding gcp_user_access_binding = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearGcpUserAccessBinding() {
      bitField0_ = (bitField0_ & ~0x00000002);
      gcpUserAccessBinding_ = null;
      if (gcpUserAccessBindingBuilder_ != null) {
        gcpUserAccessBindingBuilder_.dispose();
        gcpUserAccessBindingBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. [GcpUserAccessBinding]
     * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]
     * </pre>
     *
     * <code>
     * .google.identity.accesscontextmanager.v1.GcpUserAccessBinding gcp_user_access_binding = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.identity.accesscontextmanager.v1.GcpUserAccessBinding.Builder
        getGcpUserAccessBindingBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getGcpUserAccessBindingFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. [GcpUserAccessBinding]
     * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]
     * </pre>
     *
     * <code>
     * .google.identity.accesscontextmanager.v1.GcpUserAccessBinding gcp_user_access_binding = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.identity.accesscontextmanager.v1.GcpUserAccessBindingOrBuilder
        getGcpUserAccessBindingOrBuilder() {
      if (gcpUserAccessBindingBuilder_ != null) {
        return gcpUserAccessBindingBuilder_.getMessageOrBuilder();
      } else {
        return gcpUserAccessBinding_ == null
            ? com.google.identity.accesscontextmanager.v1.GcpUserAccessBinding.getDefaultInstance()
            : gcpUserAccessBinding_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. [GcpUserAccessBinding]
     * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]
     * </pre>
     *
     * <code>
     * .google.identity.accesscontextmanager.v1.GcpUserAccessBinding gcp_user_access_binding = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.identity.accesscontextmanager.v1.GcpUserAccessBinding,
            com.google.identity.accesscontextmanager.v1.GcpUserAccessBinding.Builder,
            com.google.identity.accesscontextmanager.v1.GcpUserAccessBindingOrBuilder>
        getGcpUserAccessBindingFieldBuilder() {
      if (gcpUserAccessBindingBuilder_ == null) {
        gcpUserAccessBindingBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.identity.accesscontextmanager.v1.GcpUserAccessBinding,
                com.google.identity.accesscontextmanager.v1.GcpUserAccessBinding.Builder,
                com.google.identity.accesscontextmanager.v1.GcpUserAccessBindingOrBuilder>(
                getGcpUserAccessBinding(), getParentForChildren(), isClean());
        gcpUserAccessBinding_ = null;
      }
      return gcpUserAccessBindingBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.identity.accesscontextmanager.v1.CreateGcpUserAccessBindingRequest)
  }

  // @@protoc_insertion_point(class_scope:google.identity.accesscontextmanager.v1.CreateGcpUserAccessBindingRequest)
  private static final com.google.identity.accesscontextmanager.v1.CreateGcpUserAccessBindingRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.identity.accesscontextmanager.v1.CreateGcpUserAccessBindingRequest();
  }

  public static com.google.identity.accesscontextmanager.v1.CreateGcpUserAccessBindingRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateGcpUserAccessBindingRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateGcpUserAccessBindingRequest>() {
        @java.lang.Override
        public CreateGcpUserAccessBindingRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateGcpUserAccessBindingRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateGcpUserAccessBindingRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.identity.accesscontextmanager.v1.CreateGcpUserAccessBindingRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
