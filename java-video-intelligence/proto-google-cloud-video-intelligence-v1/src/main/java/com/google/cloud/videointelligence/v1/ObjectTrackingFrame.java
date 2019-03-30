// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1/video_intelligence.proto

package com.google.cloud.videointelligence.v1;

/**
 *
 *
 * <pre>
 * Video frame level annotations for object detection and tracking. This field
 * stores per frame location, time offset, and confidence.
 * </pre>
 *
 * Protobuf type {@code google.cloud.videointelligence.v1.ObjectTrackingFrame}
 */
public final class ObjectTrackingFrame extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.videointelligence.v1.ObjectTrackingFrame)
    ObjectTrackingFrameOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ObjectTrackingFrame.newBuilder() to construct.
  private ObjectTrackingFrame(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ObjectTrackingFrame() {}

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ObjectTrackingFrame(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
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
              com.google.cloud.videointelligence.v1.NormalizedBoundingBox.Builder subBuilder = null;
              if (normalizedBoundingBox_ != null) {
                subBuilder = normalizedBoundingBox_.toBuilder();
              }
              normalizedBoundingBox_ =
                  input.readMessage(
                      com.google.cloud.videointelligence.v1.NormalizedBoundingBox.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(normalizedBoundingBox_);
                normalizedBoundingBox_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              com.google.protobuf.Duration.Builder subBuilder = null;
              if (timeOffset_ != null) {
                subBuilder = timeOffset_.toBuilder();
              }
              timeOffset_ =
                  input.readMessage(com.google.protobuf.Duration.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(timeOffset_);
                timeOffset_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.videointelligence.v1.VideoIntelligenceServiceProto
        .internal_static_google_cloud_videointelligence_v1_ObjectTrackingFrame_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.videointelligence.v1.VideoIntelligenceServiceProto
        .internal_static_google_cloud_videointelligence_v1_ObjectTrackingFrame_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.videointelligence.v1.ObjectTrackingFrame.class,
            com.google.cloud.videointelligence.v1.ObjectTrackingFrame.Builder.class);
  }

  public static final int NORMALIZED_BOUNDING_BOX_FIELD_NUMBER = 1;
  private com.google.cloud.videointelligence.v1.NormalizedBoundingBox normalizedBoundingBox_;
  /**
   *
   *
   * <pre>
   * The normalized bounding box location of this object track for the frame.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.NormalizedBoundingBox normalized_bounding_box = 1;
   * </code>
   */
  public boolean hasNormalizedBoundingBox() {
    return normalizedBoundingBox_ != null;
  }
  /**
   *
   *
   * <pre>
   * The normalized bounding box location of this object track for the frame.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.NormalizedBoundingBox normalized_bounding_box = 1;
   * </code>
   */
  public com.google.cloud.videointelligence.v1.NormalizedBoundingBox getNormalizedBoundingBox() {
    return normalizedBoundingBox_ == null
        ? com.google.cloud.videointelligence.v1.NormalizedBoundingBox.getDefaultInstance()
        : normalizedBoundingBox_;
  }
  /**
   *
   *
   * <pre>
   * The normalized bounding box location of this object track for the frame.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.NormalizedBoundingBox normalized_bounding_box = 1;
   * </code>
   */
  public com.google.cloud.videointelligence.v1.NormalizedBoundingBoxOrBuilder
      getNormalizedBoundingBoxOrBuilder() {
    return getNormalizedBoundingBox();
  }

  public static final int TIME_OFFSET_FIELD_NUMBER = 2;
  private com.google.protobuf.Duration timeOffset_;
  /**
   *
   *
   * <pre>
   * The timestamp of the frame in microseconds.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_offset = 2;</code>
   */
  public boolean hasTimeOffset() {
    return timeOffset_ != null;
  }
  /**
   *
   *
   * <pre>
   * The timestamp of the frame in microseconds.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_offset = 2;</code>
   */
  public com.google.protobuf.Duration getTimeOffset() {
    return timeOffset_ == null ? com.google.protobuf.Duration.getDefaultInstance() : timeOffset_;
  }
  /**
   *
   *
   * <pre>
   * The timestamp of the frame in microseconds.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_offset = 2;</code>
   */
  public com.google.protobuf.DurationOrBuilder getTimeOffsetOrBuilder() {
    return getTimeOffset();
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
    if (normalizedBoundingBox_ != null) {
      output.writeMessage(1, getNormalizedBoundingBox());
    }
    if (timeOffset_ != null) {
      output.writeMessage(2, getTimeOffset());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (normalizedBoundingBox_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(1, getNormalizedBoundingBox());
    }
    if (timeOffset_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getTimeOffset());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.videointelligence.v1.ObjectTrackingFrame)) {
      return super.equals(obj);
    }
    com.google.cloud.videointelligence.v1.ObjectTrackingFrame other =
        (com.google.cloud.videointelligence.v1.ObjectTrackingFrame) obj;

    if (hasNormalizedBoundingBox() != other.hasNormalizedBoundingBox()) return false;
    if (hasNormalizedBoundingBox()) {
      if (!getNormalizedBoundingBox().equals(other.getNormalizedBoundingBox())) return false;
    }
    if (hasTimeOffset() != other.hasTimeOffset()) return false;
    if (hasTimeOffset()) {
      if (!getTimeOffset().equals(other.getTimeOffset())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasNormalizedBoundingBox()) {
      hash = (37 * hash) + NORMALIZED_BOUNDING_BOX_FIELD_NUMBER;
      hash = (53 * hash) + getNormalizedBoundingBox().hashCode();
    }
    if (hasTimeOffset()) {
      hash = (37 * hash) + TIME_OFFSET_FIELD_NUMBER;
      hash = (53 * hash) + getTimeOffset().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.videointelligence.v1.ObjectTrackingFrame parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1.ObjectTrackingFrame parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1.ObjectTrackingFrame parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1.ObjectTrackingFrame parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1.ObjectTrackingFrame parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1.ObjectTrackingFrame parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1.ObjectTrackingFrame parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1.ObjectTrackingFrame parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1.ObjectTrackingFrame parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1.ObjectTrackingFrame parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1.ObjectTrackingFrame parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1.ObjectTrackingFrame parseFrom(
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
      com.google.cloud.videointelligence.v1.ObjectTrackingFrame prototype) {
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
   * Video frame level annotations for object detection and tracking. This field
   * stores per frame location, time offset, and confidence.
   * </pre>
   *
   * Protobuf type {@code google.cloud.videointelligence.v1.ObjectTrackingFrame}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.videointelligence.v1.ObjectTrackingFrame)
      com.google.cloud.videointelligence.v1.ObjectTrackingFrameOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.videointelligence.v1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1_ObjectTrackingFrame_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.videointelligence.v1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1_ObjectTrackingFrame_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.videointelligence.v1.ObjectTrackingFrame.class,
              com.google.cloud.videointelligence.v1.ObjectTrackingFrame.Builder.class);
    }

    // Construct using com.google.cloud.videointelligence.v1.ObjectTrackingFrame.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (normalizedBoundingBoxBuilder_ == null) {
        normalizedBoundingBox_ = null;
      } else {
        normalizedBoundingBox_ = null;
        normalizedBoundingBoxBuilder_ = null;
      }
      if (timeOffsetBuilder_ == null) {
        timeOffset_ = null;
      } else {
        timeOffset_ = null;
        timeOffsetBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.videointelligence.v1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1_ObjectTrackingFrame_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1.ObjectTrackingFrame getDefaultInstanceForType() {
      return com.google.cloud.videointelligence.v1.ObjectTrackingFrame.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1.ObjectTrackingFrame build() {
      com.google.cloud.videointelligence.v1.ObjectTrackingFrame result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1.ObjectTrackingFrame buildPartial() {
      com.google.cloud.videointelligence.v1.ObjectTrackingFrame result =
          new com.google.cloud.videointelligence.v1.ObjectTrackingFrame(this);
      if (normalizedBoundingBoxBuilder_ == null) {
        result.normalizedBoundingBox_ = normalizedBoundingBox_;
      } else {
        result.normalizedBoundingBox_ = normalizedBoundingBoxBuilder_.build();
      }
      if (timeOffsetBuilder_ == null) {
        result.timeOffset_ = timeOffset_;
      } else {
        result.timeOffset_ = timeOffsetBuilder_.build();
      }
      onBuilt();
      return result;
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
      if (other instanceof com.google.cloud.videointelligence.v1.ObjectTrackingFrame) {
        return mergeFrom((com.google.cloud.videointelligence.v1.ObjectTrackingFrame) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.videointelligence.v1.ObjectTrackingFrame other) {
      if (other == com.google.cloud.videointelligence.v1.ObjectTrackingFrame.getDefaultInstance())
        return this;
      if (other.hasNormalizedBoundingBox()) {
        mergeNormalizedBoundingBox(other.getNormalizedBoundingBox());
      }
      if (other.hasTimeOffset()) {
        mergeTimeOffset(other.getTimeOffset());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.videointelligence.v1.ObjectTrackingFrame parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.videointelligence.v1.ObjectTrackingFrame) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.videointelligence.v1.NormalizedBoundingBox normalizedBoundingBox_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.videointelligence.v1.NormalizedBoundingBox,
            com.google.cloud.videointelligence.v1.NormalizedBoundingBox.Builder,
            com.google.cloud.videointelligence.v1.NormalizedBoundingBoxOrBuilder>
        normalizedBoundingBoxBuilder_;
    /**
     *
     *
     * <pre>
     * The normalized bounding box location of this object track for the frame.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1.NormalizedBoundingBox normalized_bounding_box = 1;
     * </code>
     */
    public boolean hasNormalizedBoundingBox() {
      return normalizedBoundingBoxBuilder_ != null || normalizedBoundingBox_ != null;
    }
    /**
     *
     *
     * <pre>
     * The normalized bounding box location of this object track for the frame.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1.NormalizedBoundingBox normalized_bounding_box = 1;
     * </code>
     */
    public com.google.cloud.videointelligence.v1.NormalizedBoundingBox getNormalizedBoundingBox() {
      if (normalizedBoundingBoxBuilder_ == null) {
        return normalizedBoundingBox_ == null
            ? com.google.cloud.videointelligence.v1.NormalizedBoundingBox.getDefaultInstance()
            : normalizedBoundingBox_;
      } else {
        return normalizedBoundingBoxBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The normalized bounding box location of this object track for the frame.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1.NormalizedBoundingBox normalized_bounding_box = 1;
     * </code>
     */
    public Builder setNormalizedBoundingBox(
        com.google.cloud.videointelligence.v1.NormalizedBoundingBox value) {
      if (normalizedBoundingBoxBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        normalizedBoundingBox_ = value;
        onChanged();
      } else {
        normalizedBoundingBoxBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The normalized bounding box location of this object track for the frame.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1.NormalizedBoundingBox normalized_bounding_box = 1;
     * </code>
     */
    public Builder setNormalizedBoundingBox(
        com.google.cloud.videointelligence.v1.NormalizedBoundingBox.Builder builderForValue) {
      if (normalizedBoundingBoxBuilder_ == null) {
        normalizedBoundingBox_ = builderForValue.build();
        onChanged();
      } else {
        normalizedBoundingBoxBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The normalized bounding box location of this object track for the frame.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1.NormalizedBoundingBox normalized_bounding_box = 1;
     * </code>
     */
    public Builder mergeNormalizedBoundingBox(
        com.google.cloud.videointelligence.v1.NormalizedBoundingBox value) {
      if (normalizedBoundingBoxBuilder_ == null) {
        if (normalizedBoundingBox_ != null) {
          normalizedBoundingBox_ =
              com.google.cloud.videointelligence.v1.NormalizedBoundingBox.newBuilder(
                      normalizedBoundingBox_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          normalizedBoundingBox_ = value;
        }
        onChanged();
      } else {
        normalizedBoundingBoxBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The normalized bounding box location of this object track for the frame.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1.NormalizedBoundingBox normalized_bounding_box = 1;
     * </code>
     */
    public Builder clearNormalizedBoundingBox() {
      if (normalizedBoundingBoxBuilder_ == null) {
        normalizedBoundingBox_ = null;
        onChanged();
      } else {
        normalizedBoundingBox_ = null;
        normalizedBoundingBoxBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The normalized bounding box location of this object track for the frame.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1.NormalizedBoundingBox normalized_bounding_box = 1;
     * </code>
     */
    public com.google.cloud.videointelligence.v1.NormalizedBoundingBox.Builder
        getNormalizedBoundingBoxBuilder() {

      onChanged();
      return getNormalizedBoundingBoxFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The normalized bounding box location of this object track for the frame.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1.NormalizedBoundingBox normalized_bounding_box = 1;
     * </code>
     */
    public com.google.cloud.videointelligence.v1.NormalizedBoundingBoxOrBuilder
        getNormalizedBoundingBoxOrBuilder() {
      if (normalizedBoundingBoxBuilder_ != null) {
        return normalizedBoundingBoxBuilder_.getMessageOrBuilder();
      } else {
        return normalizedBoundingBox_ == null
            ? com.google.cloud.videointelligence.v1.NormalizedBoundingBox.getDefaultInstance()
            : normalizedBoundingBox_;
      }
    }
    /**
     *
     *
     * <pre>
     * The normalized bounding box location of this object track for the frame.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1.NormalizedBoundingBox normalized_bounding_box = 1;
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.videointelligence.v1.NormalizedBoundingBox,
            com.google.cloud.videointelligence.v1.NormalizedBoundingBox.Builder,
            com.google.cloud.videointelligence.v1.NormalizedBoundingBoxOrBuilder>
        getNormalizedBoundingBoxFieldBuilder() {
      if (normalizedBoundingBoxBuilder_ == null) {
        normalizedBoundingBoxBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.videointelligence.v1.NormalizedBoundingBox,
                com.google.cloud.videointelligence.v1.NormalizedBoundingBox.Builder,
                com.google.cloud.videointelligence.v1.NormalizedBoundingBoxOrBuilder>(
                getNormalizedBoundingBox(), getParentForChildren(), isClean());
        normalizedBoundingBox_ = null;
      }
      return normalizedBoundingBoxBuilder_;
    }

    private com.google.protobuf.Duration timeOffset_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        timeOffsetBuilder_;
    /**
     *
     *
     * <pre>
     * The timestamp of the frame in microseconds.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 2;</code>
     */
    public boolean hasTimeOffset() {
      return timeOffsetBuilder_ != null || timeOffset_ != null;
    }
    /**
     *
     *
     * <pre>
     * The timestamp of the frame in microseconds.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 2;</code>
     */
    public com.google.protobuf.Duration getTimeOffset() {
      if (timeOffsetBuilder_ == null) {
        return timeOffset_ == null
            ? com.google.protobuf.Duration.getDefaultInstance()
            : timeOffset_;
      } else {
        return timeOffsetBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The timestamp of the frame in microseconds.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 2;</code>
     */
    public Builder setTimeOffset(com.google.protobuf.Duration value) {
      if (timeOffsetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        timeOffset_ = value;
        onChanged();
      } else {
        timeOffsetBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The timestamp of the frame in microseconds.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 2;</code>
     */
    public Builder setTimeOffset(com.google.protobuf.Duration.Builder builderForValue) {
      if (timeOffsetBuilder_ == null) {
        timeOffset_ = builderForValue.build();
        onChanged();
      } else {
        timeOffsetBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The timestamp of the frame in microseconds.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 2;</code>
     */
    public Builder mergeTimeOffset(com.google.protobuf.Duration value) {
      if (timeOffsetBuilder_ == null) {
        if (timeOffset_ != null) {
          timeOffset_ =
              com.google.protobuf.Duration.newBuilder(timeOffset_).mergeFrom(value).buildPartial();
        } else {
          timeOffset_ = value;
        }
        onChanged();
      } else {
        timeOffsetBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The timestamp of the frame in microseconds.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 2;</code>
     */
    public Builder clearTimeOffset() {
      if (timeOffsetBuilder_ == null) {
        timeOffset_ = null;
        onChanged();
      } else {
        timeOffset_ = null;
        timeOffsetBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The timestamp of the frame in microseconds.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 2;</code>
     */
    public com.google.protobuf.Duration.Builder getTimeOffsetBuilder() {

      onChanged();
      return getTimeOffsetFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The timestamp of the frame in microseconds.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 2;</code>
     */
    public com.google.protobuf.DurationOrBuilder getTimeOffsetOrBuilder() {
      if (timeOffsetBuilder_ != null) {
        return timeOffsetBuilder_.getMessageOrBuilder();
      } else {
        return timeOffset_ == null
            ? com.google.protobuf.Duration.getDefaultInstance()
            : timeOffset_;
      }
    }
    /**
     *
     *
     * <pre>
     * The timestamp of the frame in microseconds.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        getTimeOffsetFieldBuilder() {
      if (timeOffsetBuilder_ == null) {
        timeOffsetBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Duration,
                com.google.protobuf.Duration.Builder,
                com.google.protobuf.DurationOrBuilder>(
                getTimeOffset(), getParentForChildren(), isClean());
        timeOffset_ = null;
      }
      return timeOffsetBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.videointelligence.v1.ObjectTrackingFrame)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.videointelligence.v1.ObjectTrackingFrame)
  private static final com.google.cloud.videointelligence.v1.ObjectTrackingFrame DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.videointelligence.v1.ObjectTrackingFrame();
  }

  public static com.google.cloud.videointelligence.v1.ObjectTrackingFrame getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ObjectTrackingFrame> PARSER =
      new com.google.protobuf.AbstractParser<ObjectTrackingFrame>() {
        @java.lang.Override
        public ObjectTrackingFrame parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ObjectTrackingFrame(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ObjectTrackingFrame> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ObjectTrackingFrame> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.videointelligence.v1.ObjectTrackingFrame getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
