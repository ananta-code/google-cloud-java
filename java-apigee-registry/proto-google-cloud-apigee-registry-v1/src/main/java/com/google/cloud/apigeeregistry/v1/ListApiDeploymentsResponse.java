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
// source: google/cloud/apigeeregistry/v1/registry_service.proto

package com.google.cloud.apigeeregistry.v1;

/**
 *
 *
 * <pre>
 * Response message for ListApiDeployments.
 * </pre>
 *
 * Protobuf type {@code google.cloud.apigeeregistry.v1.ListApiDeploymentsResponse}
 */
public final class ListApiDeploymentsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.apigeeregistry.v1.ListApiDeploymentsResponse)
    ListApiDeploymentsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListApiDeploymentsResponse.newBuilder() to construct.
  private ListApiDeploymentsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListApiDeploymentsResponse() {
    apiDeployments_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListApiDeploymentsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.apigeeregistry.v1.RegistryServiceProto
        .internal_static_google_cloud_apigeeregistry_v1_ListApiDeploymentsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.apigeeregistry.v1.RegistryServiceProto
        .internal_static_google_cloud_apigeeregistry_v1_ListApiDeploymentsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.apigeeregistry.v1.ListApiDeploymentsResponse.class,
            com.google.cloud.apigeeregistry.v1.ListApiDeploymentsResponse.Builder.class);
  }

  public static final int API_DEPLOYMENTS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.apigeeregistry.v1.ApiDeployment> apiDeployments_;
  /**
   *
   *
   * <pre>
   * The deployments from the specified publisher.
   * </pre>
   *
   * <code>repeated .google.cloud.apigeeregistry.v1.ApiDeployment api_deployments = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.apigeeregistry.v1.ApiDeployment> getApiDeploymentsList() {
    return apiDeployments_;
  }
  /**
   *
   *
   * <pre>
   * The deployments from the specified publisher.
   * </pre>
   *
   * <code>repeated .google.cloud.apigeeregistry.v1.ApiDeployment api_deployments = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.apigeeregistry.v1.ApiDeploymentOrBuilder>
      getApiDeploymentsOrBuilderList() {
    return apiDeployments_;
  }
  /**
   *
   *
   * <pre>
   * The deployments from the specified publisher.
   * </pre>
   *
   * <code>repeated .google.cloud.apigeeregistry.v1.ApiDeployment api_deployments = 1;</code>
   */
  @java.lang.Override
  public int getApiDeploymentsCount() {
    return apiDeployments_.size();
  }
  /**
   *
   *
   * <pre>
   * The deployments from the specified publisher.
   * </pre>
   *
   * <code>repeated .google.cloud.apigeeregistry.v1.ApiDeployment api_deployments = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.apigeeregistry.v1.ApiDeployment getApiDeployments(int index) {
    return apiDeployments_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The deployments from the specified publisher.
   * </pre>
   *
   * <code>repeated .google.cloud.apigeeregistry.v1.ApiDeployment api_deployments = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.apigeeregistry.v1.ApiDeploymentOrBuilder getApiDeploymentsOrBuilder(
      int index) {
    return apiDeployments_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < apiDeployments_.size(); i++) {
      output.writeMessage(1, apiDeployments_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < apiDeployments_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, apiDeployments_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.apigeeregistry.v1.ListApiDeploymentsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.apigeeregistry.v1.ListApiDeploymentsResponse other =
        (com.google.cloud.apigeeregistry.v1.ListApiDeploymentsResponse) obj;

    if (!getApiDeploymentsList().equals(other.getApiDeploymentsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getApiDeploymentsCount() > 0) {
      hash = (37 * hash) + API_DEPLOYMENTS_FIELD_NUMBER;
      hash = (53 * hash) + getApiDeploymentsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.apigeeregistry.v1.ListApiDeploymentsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.apigeeregistry.v1.ListApiDeploymentsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.apigeeregistry.v1.ListApiDeploymentsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.apigeeregistry.v1.ListApiDeploymentsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.apigeeregistry.v1.ListApiDeploymentsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.apigeeregistry.v1.ListApiDeploymentsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.apigeeregistry.v1.ListApiDeploymentsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.apigeeregistry.v1.ListApiDeploymentsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.apigeeregistry.v1.ListApiDeploymentsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.apigeeregistry.v1.ListApiDeploymentsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.apigeeregistry.v1.ListApiDeploymentsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.apigeeregistry.v1.ListApiDeploymentsResponse parseFrom(
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
      com.google.cloud.apigeeregistry.v1.ListApiDeploymentsResponse prototype) {
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
   * Response message for ListApiDeployments.
   * </pre>
   *
   * Protobuf type {@code google.cloud.apigeeregistry.v1.ListApiDeploymentsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.apigeeregistry.v1.ListApiDeploymentsResponse)
      com.google.cloud.apigeeregistry.v1.ListApiDeploymentsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.apigeeregistry.v1.RegistryServiceProto
          .internal_static_google_cloud_apigeeregistry_v1_ListApiDeploymentsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.apigeeregistry.v1.RegistryServiceProto
          .internal_static_google_cloud_apigeeregistry_v1_ListApiDeploymentsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.apigeeregistry.v1.ListApiDeploymentsResponse.class,
              com.google.cloud.apigeeregistry.v1.ListApiDeploymentsResponse.Builder.class);
    }

    // Construct using com.google.cloud.apigeeregistry.v1.ListApiDeploymentsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (apiDeploymentsBuilder_ == null) {
        apiDeployments_ = java.util.Collections.emptyList();
      } else {
        apiDeployments_ = null;
        apiDeploymentsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.apigeeregistry.v1.RegistryServiceProto
          .internal_static_google_cloud_apigeeregistry_v1_ListApiDeploymentsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.apigeeregistry.v1.ListApiDeploymentsResponse
        getDefaultInstanceForType() {
      return com.google.cloud.apigeeregistry.v1.ListApiDeploymentsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.apigeeregistry.v1.ListApiDeploymentsResponse build() {
      com.google.cloud.apigeeregistry.v1.ListApiDeploymentsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.apigeeregistry.v1.ListApiDeploymentsResponse buildPartial() {
      com.google.cloud.apigeeregistry.v1.ListApiDeploymentsResponse result =
          new com.google.cloud.apigeeregistry.v1.ListApiDeploymentsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.apigeeregistry.v1.ListApiDeploymentsResponse result) {
      if (apiDeploymentsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          apiDeployments_ = java.util.Collections.unmodifiableList(apiDeployments_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.apiDeployments_ = apiDeployments_;
      } else {
        result.apiDeployments_ = apiDeploymentsBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.apigeeregistry.v1.ListApiDeploymentsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.apigeeregistry.v1.ListApiDeploymentsResponse) {
        return mergeFrom((com.google.cloud.apigeeregistry.v1.ListApiDeploymentsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.apigeeregistry.v1.ListApiDeploymentsResponse other) {
      if (other
          == com.google.cloud.apigeeregistry.v1.ListApiDeploymentsResponse.getDefaultInstance())
        return this;
      if (apiDeploymentsBuilder_ == null) {
        if (!other.apiDeployments_.isEmpty()) {
          if (apiDeployments_.isEmpty()) {
            apiDeployments_ = other.apiDeployments_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureApiDeploymentsIsMutable();
            apiDeployments_.addAll(other.apiDeployments_);
          }
          onChanged();
        }
      } else {
        if (!other.apiDeployments_.isEmpty()) {
          if (apiDeploymentsBuilder_.isEmpty()) {
            apiDeploymentsBuilder_.dispose();
            apiDeploymentsBuilder_ = null;
            apiDeployments_ = other.apiDeployments_;
            bitField0_ = (bitField0_ & ~0x00000001);
            apiDeploymentsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getApiDeploymentsFieldBuilder()
                    : null;
          } else {
            apiDeploymentsBuilder_.addAllMessages(other.apiDeployments_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
                com.google.cloud.apigeeregistry.v1.ApiDeployment m =
                    input.readMessage(
                        com.google.cloud.apigeeregistry.v1.ApiDeployment.parser(),
                        extensionRegistry);
                if (apiDeploymentsBuilder_ == null) {
                  ensureApiDeploymentsIsMutable();
                  apiDeployments_.add(m);
                } else {
                  apiDeploymentsBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();
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

    private java.util.List<com.google.cloud.apigeeregistry.v1.ApiDeployment> apiDeployments_ =
        java.util.Collections.emptyList();

    private void ensureApiDeploymentsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        apiDeployments_ =
            new java.util.ArrayList<com.google.cloud.apigeeregistry.v1.ApiDeployment>(
                apiDeployments_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.apigeeregistry.v1.ApiDeployment,
            com.google.cloud.apigeeregistry.v1.ApiDeployment.Builder,
            com.google.cloud.apigeeregistry.v1.ApiDeploymentOrBuilder>
        apiDeploymentsBuilder_;

    /**
     *
     *
     * <pre>
     * The deployments from the specified publisher.
     * </pre>
     *
     * <code>repeated .google.cloud.apigeeregistry.v1.ApiDeployment api_deployments = 1;</code>
     */
    public java.util.List<com.google.cloud.apigeeregistry.v1.ApiDeployment>
        getApiDeploymentsList() {
      if (apiDeploymentsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(apiDeployments_);
      } else {
        return apiDeploymentsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The deployments from the specified publisher.
     * </pre>
     *
     * <code>repeated .google.cloud.apigeeregistry.v1.ApiDeployment api_deployments = 1;</code>
     */
    public int getApiDeploymentsCount() {
      if (apiDeploymentsBuilder_ == null) {
        return apiDeployments_.size();
      } else {
        return apiDeploymentsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The deployments from the specified publisher.
     * </pre>
     *
     * <code>repeated .google.cloud.apigeeregistry.v1.ApiDeployment api_deployments = 1;</code>
     */
    public com.google.cloud.apigeeregistry.v1.ApiDeployment getApiDeployments(int index) {
      if (apiDeploymentsBuilder_ == null) {
        return apiDeployments_.get(index);
      } else {
        return apiDeploymentsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The deployments from the specified publisher.
     * </pre>
     *
     * <code>repeated .google.cloud.apigeeregistry.v1.ApiDeployment api_deployments = 1;</code>
     */
    public Builder setApiDeployments(
        int index, com.google.cloud.apigeeregistry.v1.ApiDeployment value) {
      if (apiDeploymentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureApiDeploymentsIsMutable();
        apiDeployments_.set(index, value);
        onChanged();
      } else {
        apiDeploymentsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The deployments from the specified publisher.
     * </pre>
     *
     * <code>repeated .google.cloud.apigeeregistry.v1.ApiDeployment api_deployments = 1;</code>
     */
    public Builder setApiDeployments(
        int index, com.google.cloud.apigeeregistry.v1.ApiDeployment.Builder builderForValue) {
      if (apiDeploymentsBuilder_ == null) {
        ensureApiDeploymentsIsMutable();
        apiDeployments_.set(index, builderForValue.build());
        onChanged();
      } else {
        apiDeploymentsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The deployments from the specified publisher.
     * </pre>
     *
     * <code>repeated .google.cloud.apigeeregistry.v1.ApiDeployment api_deployments = 1;</code>
     */
    public Builder addApiDeployments(com.google.cloud.apigeeregistry.v1.ApiDeployment value) {
      if (apiDeploymentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureApiDeploymentsIsMutable();
        apiDeployments_.add(value);
        onChanged();
      } else {
        apiDeploymentsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The deployments from the specified publisher.
     * </pre>
     *
     * <code>repeated .google.cloud.apigeeregistry.v1.ApiDeployment api_deployments = 1;</code>
     */
    public Builder addApiDeployments(
        int index, com.google.cloud.apigeeregistry.v1.ApiDeployment value) {
      if (apiDeploymentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureApiDeploymentsIsMutable();
        apiDeployments_.add(index, value);
        onChanged();
      } else {
        apiDeploymentsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The deployments from the specified publisher.
     * </pre>
     *
     * <code>repeated .google.cloud.apigeeregistry.v1.ApiDeployment api_deployments = 1;</code>
     */
    public Builder addApiDeployments(
        com.google.cloud.apigeeregistry.v1.ApiDeployment.Builder builderForValue) {
      if (apiDeploymentsBuilder_ == null) {
        ensureApiDeploymentsIsMutable();
        apiDeployments_.add(builderForValue.build());
        onChanged();
      } else {
        apiDeploymentsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The deployments from the specified publisher.
     * </pre>
     *
     * <code>repeated .google.cloud.apigeeregistry.v1.ApiDeployment api_deployments = 1;</code>
     */
    public Builder addApiDeployments(
        int index, com.google.cloud.apigeeregistry.v1.ApiDeployment.Builder builderForValue) {
      if (apiDeploymentsBuilder_ == null) {
        ensureApiDeploymentsIsMutable();
        apiDeployments_.add(index, builderForValue.build());
        onChanged();
      } else {
        apiDeploymentsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The deployments from the specified publisher.
     * </pre>
     *
     * <code>repeated .google.cloud.apigeeregistry.v1.ApiDeployment api_deployments = 1;</code>
     */
    public Builder addAllApiDeployments(
        java.lang.Iterable<? extends com.google.cloud.apigeeregistry.v1.ApiDeployment> values) {
      if (apiDeploymentsBuilder_ == null) {
        ensureApiDeploymentsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, apiDeployments_);
        onChanged();
      } else {
        apiDeploymentsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The deployments from the specified publisher.
     * </pre>
     *
     * <code>repeated .google.cloud.apigeeregistry.v1.ApiDeployment api_deployments = 1;</code>
     */
    public Builder clearApiDeployments() {
      if (apiDeploymentsBuilder_ == null) {
        apiDeployments_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        apiDeploymentsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The deployments from the specified publisher.
     * </pre>
     *
     * <code>repeated .google.cloud.apigeeregistry.v1.ApiDeployment api_deployments = 1;</code>
     */
    public Builder removeApiDeployments(int index) {
      if (apiDeploymentsBuilder_ == null) {
        ensureApiDeploymentsIsMutable();
        apiDeployments_.remove(index);
        onChanged();
      } else {
        apiDeploymentsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The deployments from the specified publisher.
     * </pre>
     *
     * <code>repeated .google.cloud.apigeeregistry.v1.ApiDeployment api_deployments = 1;</code>
     */
    public com.google.cloud.apigeeregistry.v1.ApiDeployment.Builder getApiDeploymentsBuilder(
        int index) {
      return getApiDeploymentsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The deployments from the specified publisher.
     * </pre>
     *
     * <code>repeated .google.cloud.apigeeregistry.v1.ApiDeployment api_deployments = 1;</code>
     */
    public com.google.cloud.apigeeregistry.v1.ApiDeploymentOrBuilder getApiDeploymentsOrBuilder(
        int index) {
      if (apiDeploymentsBuilder_ == null) {
        return apiDeployments_.get(index);
      } else {
        return apiDeploymentsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The deployments from the specified publisher.
     * </pre>
     *
     * <code>repeated .google.cloud.apigeeregistry.v1.ApiDeployment api_deployments = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.apigeeregistry.v1.ApiDeploymentOrBuilder>
        getApiDeploymentsOrBuilderList() {
      if (apiDeploymentsBuilder_ != null) {
        return apiDeploymentsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(apiDeployments_);
      }
    }
    /**
     *
     *
     * <pre>
     * The deployments from the specified publisher.
     * </pre>
     *
     * <code>repeated .google.cloud.apigeeregistry.v1.ApiDeployment api_deployments = 1;</code>
     */
    public com.google.cloud.apigeeregistry.v1.ApiDeployment.Builder addApiDeploymentsBuilder() {
      return getApiDeploymentsFieldBuilder()
          .addBuilder(com.google.cloud.apigeeregistry.v1.ApiDeployment.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The deployments from the specified publisher.
     * </pre>
     *
     * <code>repeated .google.cloud.apigeeregistry.v1.ApiDeployment api_deployments = 1;</code>
     */
    public com.google.cloud.apigeeregistry.v1.ApiDeployment.Builder addApiDeploymentsBuilder(
        int index) {
      return getApiDeploymentsFieldBuilder()
          .addBuilder(index, com.google.cloud.apigeeregistry.v1.ApiDeployment.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The deployments from the specified publisher.
     * </pre>
     *
     * <code>repeated .google.cloud.apigeeregistry.v1.ApiDeployment api_deployments = 1;</code>
     */
    public java.util.List<com.google.cloud.apigeeregistry.v1.ApiDeployment.Builder>
        getApiDeploymentsBuilderList() {
      return getApiDeploymentsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.apigeeregistry.v1.ApiDeployment,
            com.google.cloud.apigeeregistry.v1.ApiDeployment.Builder,
            com.google.cloud.apigeeregistry.v1.ApiDeploymentOrBuilder>
        getApiDeploymentsFieldBuilder() {
      if (apiDeploymentsBuilder_ == null) {
        apiDeploymentsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.apigeeregistry.v1.ApiDeployment,
                com.google.cloud.apigeeregistry.v1.ApiDeployment.Builder,
                com.google.cloud.apigeeregistry.v1.ApiDeploymentOrBuilder>(
                apiDeployments_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        apiDeployments_ = null;
      }
      return apiDeploymentsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.apigeeregistry.v1.ListApiDeploymentsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.apigeeregistry.v1.ListApiDeploymentsResponse)
  private static final com.google.cloud.apigeeregistry.v1.ListApiDeploymentsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.apigeeregistry.v1.ListApiDeploymentsResponse();
  }

  public static com.google.cloud.apigeeregistry.v1.ListApiDeploymentsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListApiDeploymentsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListApiDeploymentsResponse>() {
        @java.lang.Override
        public ListApiDeploymentsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListApiDeploymentsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListApiDeploymentsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.apigeeregistry.v1.ListApiDeploymentsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
