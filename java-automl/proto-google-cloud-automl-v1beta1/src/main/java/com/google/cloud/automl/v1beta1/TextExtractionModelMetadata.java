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
// source: google/cloud/automl/v1beta1/text.proto

package com.google.cloud.automl.v1beta1;

/**
 *
 *
 * <pre>
 * Model metadata that is specific to text extraction.
 * </pre>
 *
 * Protobuf type {@code google.cloud.automl.v1beta1.TextExtractionModelMetadata}
 */
public final class TextExtractionModelMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.automl.v1beta1.TextExtractionModelMetadata)
    TextExtractionModelMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TextExtractionModelMetadata.newBuilder() to construct.
  private TextExtractionModelMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TextExtractionModelMetadata() {
    modelHint_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TextExtractionModelMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.automl.v1beta1.TextProto
        .internal_static_google_cloud_automl_v1beta1_TextExtractionModelMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.automl.v1beta1.TextProto
        .internal_static_google_cloud_automl_v1beta1_TextExtractionModelMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.automl.v1beta1.TextExtractionModelMetadata.class,
            com.google.cloud.automl.v1beta1.TextExtractionModelMetadata.Builder.class);
  }

  public static final int MODEL_HINT_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object modelHint_ = "";
  /**
   *
   *
   * <pre>
   * Indicates the scope of model use case.
   *
   * * `default`: Use to train a general text extraction model. Default value.
   *
   * * `health_care`: Use to train a text extraction model that is tuned for
   *   healthcare applications.
   * </pre>
   *
   * <code>string model_hint = 3;</code>
   *
   * @return The modelHint.
   */
  @java.lang.Override
  public java.lang.String getModelHint() {
    java.lang.Object ref = modelHint_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      modelHint_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Indicates the scope of model use case.
   *
   * * `default`: Use to train a general text extraction model. Default value.
   *
   * * `health_care`: Use to train a text extraction model that is tuned for
   *   healthcare applications.
   * </pre>
   *
   * <code>string model_hint = 3;</code>
   *
   * @return The bytes for modelHint.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getModelHintBytes() {
    java.lang.Object ref = modelHint_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      modelHint_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(modelHint_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, modelHint_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(modelHint_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, modelHint_);
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
    if (!(obj instanceof com.google.cloud.automl.v1beta1.TextExtractionModelMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.automl.v1beta1.TextExtractionModelMetadata other =
        (com.google.cloud.automl.v1beta1.TextExtractionModelMetadata) obj;

    if (!getModelHint().equals(other.getModelHint())) return false;
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
    hash = (37 * hash) + MODEL_HINT_FIELD_NUMBER;
    hash = (53 * hash) + getModelHint().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.automl.v1beta1.TextExtractionModelMetadata parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.TextExtractionModelMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.TextExtractionModelMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.TextExtractionModelMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.TextExtractionModelMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.TextExtractionModelMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.TextExtractionModelMetadata parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.TextExtractionModelMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.TextExtractionModelMetadata parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.TextExtractionModelMetadata parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.TextExtractionModelMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.TextExtractionModelMetadata parseFrom(
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
      com.google.cloud.automl.v1beta1.TextExtractionModelMetadata prototype) {
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
   * Model metadata that is specific to text extraction.
   * </pre>
   *
   * Protobuf type {@code google.cloud.automl.v1beta1.TextExtractionModelMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.automl.v1beta1.TextExtractionModelMetadata)
      com.google.cloud.automl.v1beta1.TextExtractionModelMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.automl.v1beta1.TextProto
          .internal_static_google_cloud_automl_v1beta1_TextExtractionModelMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.automl.v1beta1.TextProto
          .internal_static_google_cloud_automl_v1beta1_TextExtractionModelMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.automl.v1beta1.TextExtractionModelMetadata.class,
              com.google.cloud.automl.v1beta1.TextExtractionModelMetadata.Builder.class);
    }

    // Construct using com.google.cloud.automl.v1beta1.TextExtractionModelMetadata.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      modelHint_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.automl.v1beta1.TextProto
          .internal_static_google_cloud_automl_v1beta1_TextExtractionModelMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.TextExtractionModelMetadata getDefaultInstanceForType() {
      return com.google.cloud.automl.v1beta1.TextExtractionModelMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.TextExtractionModelMetadata build() {
      com.google.cloud.automl.v1beta1.TextExtractionModelMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.TextExtractionModelMetadata buildPartial() {
      com.google.cloud.automl.v1beta1.TextExtractionModelMetadata result =
          new com.google.cloud.automl.v1beta1.TextExtractionModelMetadata(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.automl.v1beta1.TextExtractionModelMetadata result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.modelHint_ = modelHint_;
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
      if (other instanceof com.google.cloud.automl.v1beta1.TextExtractionModelMetadata) {
        return mergeFrom((com.google.cloud.automl.v1beta1.TextExtractionModelMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.automl.v1beta1.TextExtractionModelMetadata other) {
      if (other == com.google.cloud.automl.v1beta1.TextExtractionModelMetadata.getDefaultInstance())
        return this;
      if (!other.getModelHint().isEmpty()) {
        modelHint_ = other.modelHint_;
        bitField0_ |= 0x00000001;
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
            case 26:
              {
                modelHint_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
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

    private java.lang.Object modelHint_ = "";
    /**
     *
     *
     * <pre>
     * Indicates the scope of model use case.
     *
     * * `default`: Use to train a general text extraction model. Default value.
     *
     * * `health_care`: Use to train a text extraction model that is tuned for
     *   healthcare applications.
     * </pre>
     *
     * <code>string model_hint = 3;</code>
     *
     * @return The modelHint.
     */
    public java.lang.String getModelHint() {
      java.lang.Object ref = modelHint_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        modelHint_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Indicates the scope of model use case.
     *
     * * `default`: Use to train a general text extraction model. Default value.
     *
     * * `health_care`: Use to train a text extraction model that is tuned for
     *   healthcare applications.
     * </pre>
     *
     * <code>string model_hint = 3;</code>
     *
     * @return The bytes for modelHint.
     */
    public com.google.protobuf.ByteString getModelHintBytes() {
      java.lang.Object ref = modelHint_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        modelHint_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Indicates the scope of model use case.
     *
     * * `default`: Use to train a general text extraction model. Default value.
     *
     * * `health_care`: Use to train a text extraction model that is tuned for
     *   healthcare applications.
     * </pre>
     *
     * <code>string model_hint = 3;</code>
     *
     * @param value The modelHint to set.
     * @return This builder for chaining.
     */
    public Builder setModelHint(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      modelHint_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Indicates the scope of model use case.
     *
     * * `default`: Use to train a general text extraction model. Default value.
     *
     * * `health_care`: Use to train a text extraction model that is tuned for
     *   healthcare applications.
     * </pre>
     *
     * <code>string model_hint = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearModelHint() {
      modelHint_ = getDefaultInstance().getModelHint();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Indicates the scope of model use case.
     *
     * * `default`: Use to train a general text extraction model. Default value.
     *
     * * `health_care`: Use to train a text extraction model that is tuned for
     *   healthcare applications.
     * </pre>
     *
     * <code>string model_hint = 3;</code>
     *
     * @param value The bytes for modelHint to set.
     * @return This builder for chaining.
     */
    public Builder setModelHintBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      modelHint_ = value;
      bitField0_ |= 0x00000001;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.automl.v1beta1.TextExtractionModelMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.automl.v1beta1.TextExtractionModelMetadata)
  private static final com.google.cloud.automl.v1beta1.TextExtractionModelMetadata DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.automl.v1beta1.TextExtractionModelMetadata();
  }

  public static com.google.cloud.automl.v1beta1.TextExtractionModelMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TextExtractionModelMetadata> PARSER =
      new com.google.protobuf.AbstractParser<TextExtractionModelMetadata>() {
        @java.lang.Override
        public TextExtractionModelMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<TextExtractionModelMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TextExtractionModelMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.automl.v1beta1.TextExtractionModelMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
