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
// source: google/cloud/bigquery/analyticshub/v1/analyticshub.proto

package com.google.cloud.bigquery.analyticshub.v1;

/**
 *
 *
 * <pre>
 * Message for subscribing to a listing.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.analyticshub.v1.SubscribeListingRequest}
 */
public final class SubscribeListingRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.analyticshub.v1.SubscribeListingRequest)
    SubscribeListingRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SubscribeListingRequest.newBuilder() to construct.
  private SubscribeListingRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SubscribeListingRequest() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SubscribeListingRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.bigquery.analyticshub.v1.AnalyticsHubProto
        .internal_static_google_cloud_bigquery_analyticshub_v1_SubscribeListingRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.analyticshub.v1.AnalyticsHubProto
        .internal_static_google_cloud_bigquery_analyticshub_v1_SubscribeListingRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.analyticshub.v1.SubscribeListingRequest.class,
            com.google.cloud.bigquery.analyticshub.v1.SubscribeListingRequest.Builder.class);
  }

  private int destinationCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object destination_;

  public enum DestinationCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    DESTINATION_DATASET(3),
    DESTINATION_NOT_SET(0);
    private final int value;

    private DestinationCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DestinationCase valueOf(int value) {
      return forNumber(value);
    }

    public static DestinationCase forNumber(int value) {
      switch (value) {
        case 3:
          return DESTINATION_DATASET;
        case 0:
          return DESTINATION_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public DestinationCase getDestinationCase() {
    return DestinationCase.forNumber(destinationCase_);
  }

  public static final int DESTINATION_DATASET_FIELD_NUMBER = 3;
  /**
   *
   *
   * <pre>
   * BigQuery destination dataset to create for the subscriber.
   * </pre>
   *
   * <code>.google.cloud.bigquery.analyticshub.v1.DestinationDataset destination_dataset = 3;</code>
   *
   * @return Whether the destinationDataset field is set.
   */
  @java.lang.Override
  public boolean hasDestinationDataset() {
    return destinationCase_ == 3;
  }
  /**
   *
   *
   * <pre>
   * BigQuery destination dataset to create for the subscriber.
   * </pre>
   *
   * <code>.google.cloud.bigquery.analyticshub.v1.DestinationDataset destination_dataset = 3;</code>
   *
   * @return The destinationDataset.
   */
  @java.lang.Override
  public com.google.cloud.bigquery.analyticshub.v1.DestinationDataset getDestinationDataset() {
    if (destinationCase_ == 3) {
      return (com.google.cloud.bigquery.analyticshub.v1.DestinationDataset) destination_;
    }
    return com.google.cloud.bigquery.analyticshub.v1.DestinationDataset.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * BigQuery destination dataset to create for the subscriber.
   * </pre>
   *
   * <code>.google.cloud.bigquery.analyticshub.v1.DestinationDataset destination_dataset = 3;</code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.analyticshub.v1.DestinationDatasetOrBuilder
      getDestinationDatasetOrBuilder() {
    if (destinationCase_ == 3) {
      return (com.google.cloud.bigquery.analyticshub.v1.DestinationDataset) destination_;
    }
    return com.google.cloud.bigquery.analyticshub.v1.DestinationDataset.getDefaultInstance();
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Required. Resource name of the listing that you want to subscribe to.
   * e.g. `projects/myproject/locations/US/dataExchanges/123/listings/456`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
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
   * Required. Resource name of the listing that you want to subscribe to.
   * e.g. `projects/myproject/locations/US/dataExchanges/123/listings/456`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
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
    if (destinationCase_ == 3) {
      output.writeMessage(
          3, (com.google.cloud.bigquery.analyticshub.v1.DestinationDataset) destination_);
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
    if (destinationCase_ == 3) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              3, (com.google.cloud.bigquery.analyticshub.v1.DestinationDataset) destination_);
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
    if (!(obj instanceof com.google.cloud.bigquery.analyticshub.v1.SubscribeListingRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.analyticshub.v1.SubscribeListingRequest other =
        (com.google.cloud.bigquery.analyticshub.v1.SubscribeListingRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getDestinationCase().equals(other.getDestinationCase())) return false;
    switch (destinationCase_) {
      case 3:
        if (!getDestinationDataset().equals(other.getDestinationDataset())) return false;
        break;
      case 0:
      default:
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    switch (destinationCase_) {
      case 3:
        hash = (37 * hash) + DESTINATION_DATASET_FIELD_NUMBER;
        hash = (53 * hash) + getDestinationDataset().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.analyticshub.v1.SubscribeListingRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.SubscribeListingRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.SubscribeListingRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.SubscribeListingRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.SubscribeListingRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.SubscribeListingRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.SubscribeListingRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.SubscribeListingRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.SubscribeListingRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.SubscribeListingRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.SubscribeListingRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.SubscribeListingRequest parseFrom(
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
      com.google.cloud.bigquery.analyticshub.v1.SubscribeListingRequest prototype) {
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
   * Message for subscribing to a listing.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.analyticshub.v1.SubscribeListingRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.analyticshub.v1.SubscribeListingRequest)
      com.google.cloud.bigquery.analyticshub.v1.SubscribeListingRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.bigquery.analyticshub.v1.AnalyticsHubProto
          .internal_static_google_cloud_bigquery_analyticshub_v1_SubscribeListingRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.analyticshub.v1.AnalyticsHubProto
          .internal_static_google_cloud_bigquery_analyticshub_v1_SubscribeListingRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.analyticshub.v1.SubscribeListingRequest.class,
              com.google.cloud.bigquery.analyticshub.v1.SubscribeListingRequest.Builder.class);
    }

    // Construct using
    // com.google.cloud.bigquery.analyticshub.v1.SubscribeListingRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (destinationDatasetBuilder_ != null) {
        destinationDatasetBuilder_.clear();
      }
      name_ = "";
      destinationCase_ = 0;
      destination_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.bigquery.analyticshub.v1.AnalyticsHubProto
          .internal_static_google_cloud_bigquery_analyticshub_v1_SubscribeListingRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.analyticshub.v1.SubscribeListingRequest
        getDefaultInstanceForType() {
      return com.google.cloud.bigquery.analyticshub.v1.SubscribeListingRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.analyticshub.v1.SubscribeListingRequest build() {
      com.google.cloud.bigquery.analyticshub.v1.SubscribeListingRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.analyticshub.v1.SubscribeListingRequest buildPartial() {
      com.google.cloud.bigquery.analyticshub.v1.SubscribeListingRequest result =
          new com.google.cloud.bigquery.analyticshub.v1.SubscribeListingRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.bigquery.analyticshub.v1.SubscribeListingRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.name_ = name_;
      }
    }

    private void buildPartialOneofs(
        com.google.cloud.bigquery.analyticshub.v1.SubscribeListingRequest result) {
      result.destinationCase_ = destinationCase_;
      result.destination_ = this.destination_;
      if (destinationCase_ == 3 && destinationDatasetBuilder_ != null) {
        result.destination_ = destinationDatasetBuilder_.build();
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
      if (other instanceof com.google.cloud.bigquery.analyticshub.v1.SubscribeListingRequest) {
        return mergeFrom((com.google.cloud.bigquery.analyticshub.v1.SubscribeListingRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.bigquery.analyticshub.v1.SubscribeListingRequest other) {
      if (other
          == com.google.cloud.bigquery.analyticshub.v1.SubscribeListingRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      switch (other.getDestinationCase()) {
        case DESTINATION_DATASET:
          {
            mergeDestinationDataset(other.getDestinationDataset());
            break;
          }
        case DESTINATION_NOT_SET:
          {
            break;
          }
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
                bitField0_ |= 0x00000002;
                break;
              } // case 10
            case 26:
              {
                input.readMessage(
                    getDestinationDatasetFieldBuilder().getBuilder(), extensionRegistry);
                destinationCase_ = 3;
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

    private int destinationCase_ = 0;
    private java.lang.Object destination_;

    public DestinationCase getDestinationCase() {
      return DestinationCase.forNumber(destinationCase_);
    }

    public Builder clearDestination() {
      destinationCase_ = 0;
      destination_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.analyticshub.v1.DestinationDataset,
            com.google.cloud.bigquery.analyticshub.v1.DestinationDataset.Builder,
            com.google.cloud.bigquery.analyticshub.v1.DestinationDatasetOrBuilder>
        destinationDatasetBuilder_;
    /**
     *
     *
     * <pre>
     * BigQuery destination dataset to create for the subscriber.
     * </pre>
     *
     * <code>.google.cloud.bigquery.analyticshub.v1.DestinationDataset destination_dataset = 3;
     * </code>
     *
     * @return Whether the destinationDataset field is set.
     */
    @java.lang.Override
    public boolean hasDestinationDataset() {
      return destinationCase_ == 3;
    }
    /**
     *
     *
     * <pre>
     * BigQuery destination dataset to create for the subscriber.
     * </pre>
     *
     * <code>.google.cloud.bigquery.analyticshub.v1.DestinationDataset destination_dataset = 3;
     * </code>
     *
     * @return The destinationDataset.
     */
    @java.lang.Override
    public com.google.cloud.bigquery.analyticshub.v1.DestinationDataset getDestinationDataset() {
      if (destinationDatasetBuilder_ == null) {
        if (destinationCase_ == 3) {
          return (com.google.cloud.bigquery.analyticshub.v1.DestinationDataset) destination_;
        }
        return com.google.cloud.bigquery.analyticshub.v1.DestinationDataset.getDefaultInstance();
      } else {
        if (destinationCase_ == 3) {
          return destinationDatasetBuilder_.getMessage();
        }
        return com.google.cloud.bigquery.analyticshub.v1.DestinationDataset.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * BigQuery destination dataset to create for the subscriber.
     * </pre>
     *
     * <code>.google.cloud.bigquery.analyticshub.v1.DestinationDataset destination_dataset = 3;
     * </code>
     */
    public Builder setDestinationDataset(
        com.google.cloud.bigquery.analyticshub.v1.DestinationDataset value) {
      if (destinationDatasetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        destination_ = value;
        onChanged();
      } else {
        destinationDatasetBuilder_.setMessage(value);
      }
      destinationCase_ = 3;
      return this;
    }
    /**
     *
     *
     * <pre>
     * BigQuery destination dataset to create for the subscriber.
     * </pre>
     *
     * <code>.google.cloud.bigquery.analyticshub.v1.DestinationDataset destination_dataset = 3;
     * </code>
     */
    public Builder setDestinationDataset(
        com.google.cloud.bigquery.analyticshub.v1.DestinationDataset.Builder builderForValue) {
      if (destinationDatasetBuilder_ == null) {
        destination_ = builderForValue.build();
        onChanged();
      } else {
        destinationDatasetBuilder_.setMessage(builderForValue.build());
      }
      destinationCase_ = 3;
      return this;
    }
    /**
     *
     *
     * <pre>
     * BigQuery destination dataset to create for the subscriber.
     * </pre>
     *
     * <code>.google.cloud.bigquery.analyticshub.v1.DestinationDataset destination_dataset = 3;
     * </code>
     */
    public Builder mergeDestinationDataset(
        com.google.cloud.bigquery.analyticshub.v1.DestinationDataset value) {
      if (destinationDatasetBuilder_ == null) {
        if (destinationCase_ == 3
            && destination_
                != com.google.cloud.bigquery.analyticshub.v1.DestinationDataset
                    .getDefaultInstance()) {
          destination_ =
              com.google.cloud.bigquery.analyticshub.v1.DestinationDataset.newBuilder(
                      (com.google.cloud.bigquery.analyticshub.v1.DestinationDataset) destination_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          destination_ = value;
        }
        onChanged();
      } else {
        if (destinationCase_ == 3) {
          destinationDatasetBuilder_.mergeFrom(value);
        } else {
          destinationDatasetBuilder_.setMessage(value);
        }
      }
      destinationCase_ = 3;
      return this;
    }
    /**
     *
     *
     * <pre>
     * BigQuery destination dataset to create for the subscriber.
     * </pre>
     *
     * <code>.google.cloud.bigquery.analyticshub.v1.DestinationDataset destination_dataset = 3;
     * </code>
     */
    public Builder clearDestinationDataset() {
      if (destinationDatasetBuilder_ == null) {
        if (destinationCase_ == 3) {
          destinationCase_ = 0;
          destination_ = null;
          onChanged();
        }
      } else {
        if (destinationCase_ == 3) {
          destinationCase_ = 0;
          destination_ = null;
        }
        destinationDatasetBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * BigQuery destination dataset to create for the subscriber.
     * </pre>
     *
     * <code>.google.cloud.bigquery.analyticshub.v1.DestinationDataset destination_dataset = 3;
     * </code>
     */
    public com.google.cloud.bigquery.analyticshub.v1.DestinationDataset.Builder
        getDestinationDatasetBuilder() {
      return getDestinationDatasetFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * BigQuery destination dataset to create for the subscriber.
     * </pre>
     *
     * <code>.google.cloud.bigquery.analyticshub.v1.DestinationDataset destination_dataset = 3;
     * </code>
     */
    @java.lang.Override
    public com.google.cloud.bigquery.analyticshub.v1.DestinationDatasetOrBuilder
        getDestinationDatasetOrBuilder() {
      if ((destinationCase_ == 3) && (destinationDatasetBuilder_ != null)) {
        return destinationDatasetBuilder_.getMessageOrBuilder();
      } else {
        if (destinationCase_ == 3) {
          return (com.google.cloud.bigquery.analyticshub.v1.DestinationDataset) destination_;
        }
        return com.google.cloud.bigquery.analyticshub.v1.DestinationDataset.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * BigQuery destination dataset to create for the subscriber.
     * </pre>
     *
     * <code>.google.cloud.bigquery.analyticshub.v1.DestinationDataset destination_dataset = 3;
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.analyticshub.v1.DestinationDataset,
            com.google.cloud.bigquery.analyticshub.v1.DestinationDataset.Builder,
            com.google.cloud.bigquery.analyticshub.v1.DestinationDatasetOrBuilder>
        getDestinationDatasetFieldBuilder() {
      if (destinationDatasetBuilder_ == null) {
        if (!(destinationCase_ == 3)) {
          destination_ =
              com.google.cloud.bigquery.analyticshub.v1.DestinationDataset.getDefaultInstance();
        }
        destinationDatasetBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.bigquery.analyticshub.v1.DestinationDataset,
                com.google.cloud.bigquery.analyticshub.v1.DestinationDataset.Builder,
                com.google.cloud.bigquery.analyticshub.v1.DestinationDatasetOrBuilder>(
                (com.google.cloud.bigquery.analyticshub.v1.DestinationDataset) destination_,
                getParentForChildren(),
                isClean());
        destination_ = null;
      }
      destinationCase_ = 3;
      onChanged();
      return destinationDatasetBuilder_;
    }

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. Resource name of the listing that you want to subscribe to.
     * e.g. `projects/myproject/locations/US/dataExchanges/123/listings/456`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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
     * Required. Resource name of the listing that you want to subscribe to.
     * e.g. `projects/myproject/locations/US/dataExchanges/123/listings/456`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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
     * Required. Resource name of the listing that you want to subscribe to.
     * e.g. `projects/myproject/locations/US/dataExchanges/123/listings/456`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Resource name of the listing that you want to subscribe to.
     * e.g. `projects/myproject/locations/US/dataExchanges/123/listings/456`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Resource name of the listing that you want to subscribe to.
     * e.g. `projects/myproject/locations/US/dataExchanges/123/listings/456`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.analyticshub.v1.SubscribeListingRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.analyticshub.v1.SubscribeListingRequest)
  private static final com.google.cloud.bigquery.analyticshub.v1.SubscribeListingRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.analyticshub.v1.SubscribeListingRequest();
  }

  public static com.google.cloud.bigquery.analyticshub.v1.SubscribeListingRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SubscribeListingRequest> PARSER =
      new com.google.protobuf.AbstractParser<SubscribeListingRequest>() {
        @java.lang.Override
        public SubscribeListingRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<SubscribeListingRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SubscribeListingRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.analyticshub.v1.SubscribeListingRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
