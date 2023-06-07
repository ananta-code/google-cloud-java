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
// source: google/analytics/admin/v1beta/analytics_admin.proto

package com.google.analytics.admin.v1beta;

/**
 *
 *
 * <pre>
 * Request message for ListAccounts RPC.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1beta.ListAccountsRequest}
 */
public final class ListAccountsRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1beta.ListAccountsRequest)
    ListAccountsRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListAccountsRequest.newBuilder() to construct.
  private ListAccountsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListAccountsRequest() {
    pageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListAccountsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.admin.v1beta.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1beta_ListAccountsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1beta.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1beta_ListAccountsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1beta.ListAccountsRequest.class,
            com.google.analytics.admin.v1beta.ListAccountsRequest.Builder.class);
  }

  public static final int PAGE_SIZE_FIELD_NUMBER = 1;
  private int pageSize_ = 0;
  /**
   *
   *
   * <pre>
   * The maximum number of resources to return. The service may return
   * fewer than this value, even if there are additional pages.
   * If unspecified, at most 50 resources will be returned.
   * The maximum value is 200; (higher values will be coerced to the maximum)
   * </pre>
   *
   * <code>int32 page_size = 1;</code>
   *
   * @return The pageSize.
   */
  @java.lang.Override
  public int getPageSize() {
    return pageSize_;
  }

  public static final int PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object pageToken_ = "";
  /**
   *
   *
   * <pre>
   * A page token, received from a previous `ListAccounts` call.
   * Provide this to retrieve the subsequent page.
   * When paginating, all other parameters provided to `ListAccounts` must
   * match the call that provided the page token.
   * </pre>
   *
   * <code>string page_token = 2;</code>
   *
   * @return The pageToken.
   */
  @java.lang.Override
  public java.lang.String getPageToken() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A page token, received from a previous `ListAccounts` call.
   * Provide this to retrieve the subsequent page.
   * When paginating, all other parameters provided to `ListAccounts` must
   * match the call that provided the page token.
   * </pre>
   *
   * <code>string page_token = 2;</code>
   *
   * @return The bytes for pageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPageTokenBytes() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      pageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SHOW_DELETED_FIELD_NUMBER = 3;
  private boolean showDeleted_ = false;
  /**
   *
   *
   * <pre>
   * Whether to include soft-deleted (ie: "trashed") Accounts in the
   * results. Accounts can be inspected to determine whether they are deleted or
   * not.
   * </pre>
   *
   * <code>bool show_deleted = 3;</code>
   *
   * @return The showDeleted.
   */
  @java.lang.Override
  public boolean getShowDeleted() {
    return showDeleted_;
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
    if (pageSize_ != 0) {
      output.writeInt32(1, pageSize_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, pageToken_);
    }
    if (showDeleted_ != false) {
      output.writeBool(3, showDeleted_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pageSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, pageSize_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, pageToken_);
    }
    if (showDeleted_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, showDeleted_);
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
    if (!(obj instanceof com.google.analytics.admin.v1beta.ListAccountsRequest)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1beta.ListAccountsRequest other =
        (com.google.analytics.admin.v1beta.ListAccountsRequest) obj;

    if (getPageSize() != other.getPageSize()) return false;
    if (!getPageToken().equals(other.getPageToken())) return false;
    if (getShowDeleted() != other.getShowDeleted()) return false;
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
    hash = (37 * hash) + PAGE_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getPageSize();
    hash = (37 * hash) + PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getPageToken().hashCode();
    hash = (37 * hash) + SHOW_DELETED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getShowDeleted());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1beta.ListAccountsRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1beta.ListAccountsRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1beta.ListAccountsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1beta.ListAccountsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1beta.ListAccountsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1beta.ListAccountsRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1beta.ListAccountsRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1beta.ListAccountsRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1beta.ListAccountsRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1beta.ListAccountsRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1beta.ListAccountsRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1beta.ListAccountsRequest parseFrom(
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
      com.google.analytics.admin.v1beta.ListAccountsRequest prototype) {
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
   * Request message for ListAccounts RPC.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1beta.ListAccountsRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1beta.ListAccountsRequest)
      com.google.analytics.admin.v1beta.ListAccountsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1beta.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1beta_ListAccountsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1beta.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1beta_ListAccountsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1beta.ListAccountsRequest.class,
              com.google.analytics.admin.v1beta.ListAccountsRequest.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1beta.ListAccountsRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      pageSize_ = 0;
      pageToken_ = "";
      showDeleted_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1beta.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1beta_ListAccountsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1beta.ListAccountsRequest getDefaultInstanceForType() {
      return com.google.analytics.admin.v1beta.ListAccountsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1beta.ListAccountsRequest build() {
      com.google.analytics.admin.v1beta.ListAccountsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1beta.ListAccountsRequest buildPartial() {
      com.google.analytics.admin.v1beta.ListAccountsRequest result =
          new com.google.analytics.admin.v1beta.ListAccountsRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.analytics.admin.v1beta.ListAccountsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.pageSize_ = pageSize_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pageToken_ = pageToken_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.showDeleted_ = showDeleted_;
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
      if (other instanceof com.google.analytics.admin.v1beta.ListAccountsRequest) {
        return mergeFrom((com.google.analytics.admin.v1beta.ListAccountsRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1beta.ListAccountsRequest other) {
      if (other == com.google.analytics.admin.v1beta.ListAccountsRequest.getDefaultInstance())
        return this;
      if (other.getPageSize() != 0) {
        setPageSize(other.getPageSize());
      }
      if (!other.getPageToken().isEmpty()) {
        pageToken_ = other.pageToken_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getShowDeleted() != false) {
        setShowDeleted(other.getShowDeleted());
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
                pageSize_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                pageToken_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 24:
              {
                showDeleted_ = input.readBool();
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

    private int pageSize_;
    /**
     *
     *
     * <pre>
     * The maximum number of resources to return. The service may return
     * fewer than this value, even if there are additional pages.
     * If unspecified, at most 50 resources will be returned.
     * The maximum value is 200; (higher values will be coerced to the maximum)
     * </pre>
     *
     * <code>int32 page_size = 1;</code>
     *
     * @return The pageSize.
     */
    @java.lang.Override
    public int getPageSize() {
      return pageSize_;
    }
    /**
     *
     *
     * <pre>
     * The maximum number of resources to return. The service may return
     * fewer than this value, even if there are additional pages.
     * If unspecified, at most 50 resources will be returned.
     * The maximum value is 200; (higher values will be coerced to the maximum)
     * </pre>
     *
     * <code>int32 page_size = 1;</code>
     *
     * @param value The pageSize to set.
     * @return This builder for chaining.
     */
    public Builder setPageSize(int value) {

      pageSize_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The maximum number of resources to return. The service may return
     * fewer than this value, even if there are additional pages.
     * If unspecified, at most 50 resources will be returned.
     * The maximum value is 200; (higher values will be coerced to the maximum)
     * </pre>
     *
     * <code>int32 page_size = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPageSize() {
      bitField0_ = (bitField0_ & ~0x00000001);
      pageSize_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object pageToken_ = "";
    /**
     *
     *
     * <pre>
     * A page token, received from a previous `ListAccounts` call.
     * Provide this to retrieve the subsequent page.
     * When paginating, all other parameters provided to `ListAccounts` must
     * match the call that provided the page token.
     * </pre>
     *
     * <code>string page_token = 2;</code>
     *
     * @return The pageToken.
     */
    public java.lang.String getPageToken() {
      java.lang.Object ref = pageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A page token, received from a previous `ListAccounts` call.
     * Provide this to retrieve the subsequent page.
     * When paginating, all other parameters provided to `ListAccounts` must
     * match the call that provided the page token.
     * </pre>
     *
     * <code>string page_token = 2;</code>
     *
     * @return The bytes for pageToken.
     */
    public com.google.protobuf.ByteString getPageTokenBytes() {
      java.lang.Object ref = pageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        pageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A page token, received from a previous `ListAccounts` call.
     * Provide this to retrieve the subsequent page.
     * When paginating, all other parameters provided to `ListAccounts` must
     * match the call that provided the page token.
     * </pre>
     *
     * <code>string page_token = 2;</code>
     *
     * @param value The pageToken to set.
     * @return This builder for chaining.
     */
    public Builder setPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      pageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A page token, received from a previous `ListAccounts` call.
     * Provide this to retrieve the subsequent page.
     * When paginating, all other parameters provided to `ListAccounts` must
     * match the call that provided the page token.
     * </pre>
     *
     * <code>string page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPageToken() {
      pageToken_ = getDefaultInstance().getPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A page token, received from a previous `ListAccounts` call.
     * Provide this to retrieve the subsequent page.
     * When paginating, all other parameters provided to `ListAccounts` must
     * match the call that provided the page token.
     * </pre>
     *
     * <code>string page_token = 2;</code>
     *
     * @param value The bytes for pageToken to set.
     * @return This builder for chaining.
     */
    public Builder setPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      pageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private boolean showDeleted_;
    /**
     *
     *
     * <pre>
     * Whether to include soft-deleted (ie: "trashed") Accounts in the
     * results. Accounts can be inspected to determine whether they are deleted or
     * not.
     * </pre>
     *
     * <code>bool show_deleted = 3;</code>
     *
     * @return The showDeleted.
     */
    @java.lang.Override
    public boolean getShowDeleted() {
      return showDeleted_;
    }
    /**
     *
     *
     * <pre>
     * Whether to include soft-deleted (ie: "trashed") Accounts in the
     * results. Accounts can be inspected to determine whether they are deleted or
     * not.
     * </pre>
     *
     * <code>bool show_deleted = 3;</code>
     *
     * @param value The showDeleted to set.
     * @return This builder for chaining.
     */
    public Builder setShowDeleted(boolean value) {

      showDeleted_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Whether to include soft-deleted (ie: "trashed") Accounts in the
     * results. Accounts can be inspected to determine whether they are deleted or
     * not.
     * </pre>
     *
     * <code>bool show_deleted = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearShowDeleted() {
      bitField0_ = (bitField0_ & ~0x00000004);
      showDeleted_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1beta.ListAccountsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1beta.ListAccountsRequest)
  private static final com.google.analytics.admin.v1beta.ListAccountsRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1beta.ListAccountsRequest();
  }

  public static com.google.analytics.admin.v1beta.ListAccountsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListAccountsRequest> PARSER =
      new com.google.protobuf.AbstractParser<ListAccountsRequest>() {
        @java.lang.Override
        public ListAccountsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListAccountsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListAccountsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1beta.ListAccountsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
