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
// source: google/cloud/automl/v1beta1/image.proto

package com.google.cloud.automl.v1beta1;

/**
 *
 *
 * <pre>
 * Dataset metadata that is specific to image classification.
 * </pre>
 *
 * Protobuf type {@code google.cloud.automl.v1beta1.ImageClassificationDatasetMetadata}
 */
public final class ImageClassificationDatasetMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.automl.v1beta1.ImageClassificationDatasetMetadata)
    ImageClassificationDatasetMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ImageClassificationDatasetMetadata.newBuilder() to construct.
  private ImageClassificationDatasetMetadata(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ImageClassificationDatasetMetadata() {
    classificationType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ImageClassificationDatasetMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.automl.v1beta1.ImageProto
        .internal_static_google_cloud_automl_v1beta1_ImageClassificationDatasetMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.automl.v1beta1.ImageProto
        .internal_static_google_cloud_automl_v1beta1_ImageClassificationDatasetMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.automl.v1beta1.ImageClassificationDatasetMetadata.class,
            com.google.cloud.automl.v1beta1.ImageClassificationDatasetMetadata.Builder.class);
  }

  public static final int CLASSIFICATION_TYPE_FIELD_NUMBER = 1;
  private int classificationType_ = 0;
  /**
   *
   *
   * <pre>
   * Required. Type of the classification problem.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.ClassificationType classification_type = 1;</code>
   *
   * @return The enum numeric value on the wire for classificationType.
   */
  @java.lang.Override
  public int getClassificationTypeValue() {
    return classificationType_;
  }
  /**
   *
   *
   * <pre>
   * Required. Type of the classification problem.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.ClassificationType classification_type = 1;</code>
   *
   * @return The classificationType.
   */
  @java.lang.Override
  public com.google.cloud.automl.v1beta1.ClassificationProto.ClassificationType
      getClassificationType() {
    com.google.cloud.automl.v1beta1.ClassificationProto.ClassificationType result =
        com.google.cloud.automl.v1beta1.ClassificationProto.ClassificationType.forNumber(
            classificationType_);
    return result == null
        ? com.google.cloud.automl.v1beta1.ClassificationProto.ClassificationType.UNRECOGNIZED
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
    if (classificationType_
        != com.google.cloud.automl.v1beta1.ClassificationProto.ClassificationType
            .CLASSIFICATION_TYPE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, classificationType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (classificationType_
        != com.google.cloud.automl.v1beta1.ClassificationProto.ClassificationType
            .CLASSIFICATION_TYPE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, classificationType_);
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
    if (!(obj instanceof com.google.cloud.automl.v1beta1.ImageClassificationDatasetMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.automl.v1beta1.ImageClassificationDatasetMetadata other =
        (com.google.cloud.automl.v1beta1.ImageClassificationDatasetMetadata) obj;

    if (classificationType_ != other.classificationType_) return false;
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
    hash = (37 * hash) + CLASSIFICATION_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + classificationType_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.automl.v1beta1.ImageClassificationDatasetMetadata parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.ImageClassificationDatasetMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.ImageClassificationDatasetMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.ImageClassificationDatasetMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.ImageClassificationDatasetMetadata parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.ImageClassificationDatasetMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.ImageClassificationDatasetMetadata parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.ImageClassificationDatasetMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.ImageClassificationDatasetMetadata
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.ImageClassificationDatasetMetadata
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.ImageClassificationDatasetMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.ImageClassificationDatasetMetadata parseFrom(
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
      com.google.cloud.automl.v1beta1.ImageClassificationDatasetMetadata prototype) {
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
   * Dataset metadata that is specific to image classification.
   * </pre>
   *
   * Protobuf type {@code google.cloud.automl.v1beta1.ImageClassificationDatasetMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.automl.v1beta1.ImageClassificationDatasetMetadata)
      com.google.cloud.automl.v1beta1.ImageClassificationDatasetMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.automl.v1beta1.ImageProto
          .internal_static_google_cloud_automl_v1beta1_ImageClassificationDatasetMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.automl.v1beta1.ImageProto
          .internal_static_google_cloud_automl_v1beta1_ImageClassificationDatasetMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.automl.v1beta1.ImageClassificationDatasetMetadata.class,
              com.google.cloud.automl.v1beta1.ImageClassificationDatasetMetadata.Builder.class);
    }

    // Construct using
    // com.google.cloud.automl.v1beta1.ImageClassificationDatasetMetadata.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      classificationType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.automl.v1beta1.ImageProto
          .internal_static_google_cloud_automl_v1beta1_ImageClassificationDatasetMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.ImageClassificationDatasetMetadata
        getDefaultInstanceForType() {
      return com.google.cloud.automl.v1beta1.ImageClassificationDatasetMetadata
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.ImageClassificationDatasetMetadata build() {
      com.google.cloud.automl.v1beta1.ImageClassificationDatasetMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.ImageClassificationDatasetMetadata buildPartial() {
      com.google.cloud.automl.v1beta1.ImageClassificationDatasetMetadata result =
          new com.google.cloud.automl.v1beta1.ImageClassificationDatasetMetadata(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.automl.v1beta1.ImageClassificationDatasetMetadata result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.classificationType_ = classificationType_;
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
      if (other instanceof com.google.cloud.automl.v1beta1.ImageClassificationDatasetMetadata) {
        return mergeFrom(
            (com.google.cloud.automl.v1beta1.ImageClassificationDatasetMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.automl.v1beta1.ImageClassificationDatasetMetadata other) {
      if (other
          == com.google.cloud.automl.v1beta1.ImageClassificationDatasetMetadata
              .getDefaultInstance()) return this;
      if (other.classificationType_ != 0) {
        setClassificationTypeValue(other.getClassificationTypeValue());
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
                classificationType_ = input.readEnum();
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

    private int classificationType_ = 0;
    /**
     *
     *
     * <pre>
     * Required. Type of the classification problem.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.ClassificationType classification_type = 1;</code>
     *
     * @return The enum numeric value on the wire for classificationType.
     */
    @java.lang.Override
    public int getClassificationTypeValue() {
      return classificationType_;
    }
    /**
     *
     *
     * <pre>
     * Required. Type of the classification problem.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.ClassificationType classification_type = 1;</code>
     *
     * @param value The enum numeric value on the wire for classificationType to set.
     * @return This builder for chaining.
     */
    public Builder setClassificationTypeValue(int value) {
      classificationType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Type of the classification problem.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.ClassificationType classification_type = 1;</code>
     *
     * @return The classificationType.
     */
    @java.lang.Override
    public com.google.cloud.automl.v1beta1.ClassificationProto.ClassificationType
        getClassificationType() {
      com.google.cloud.automl.v1beta1.ClassificationProto.ClassificationType result =
          com.google.cloud.automl.v1beta1.ClassificationProto.ClassificationType.forNumber(
              classificationType_);
      return result == null
          ? com.google.cloud.automl.v1beta1.ClassificationProto.ClassificationType.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Required. Type of the classification problem.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.ClassificationType classification_type = 1;</code>
     *
     * @param value The classificationType to set.
     * @return This builder for chaining.
     */
    public Builder setClassificationType(
        com.google.cloud.automl.v1beta1.ClassificationProto.ClassificationType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      classificationType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Type of the classification problem.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.ClassificationType classification_type = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearClassificationType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      classificationType_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.automl.v1beta1.ImageClassificationDatasetMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.automl.v1beta1.ImageClassificationDatasetMetadata)
  private static final com.google.cloud.automl.v1beta1.ImageClassificationDatasetMetadata
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.automl.v1beta1.ImageClassificationDatasetMetadata();
  }

  public static com.google.cloud.automl.v1beta1.ImageClassificationDatasetMetadata
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImageClassificationDatasetMetadata> PARSER =
      new com.google.protobuf.AbstractParser<ImageClassificationDatasetMetadata>() {
        @java.lang.Override
        public ImageClassificationDatasetMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<ImageClassificationDatasetMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImageClassificationDatasetMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.automl.v1beta1.ImageClassificationDatasetMetadata
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
