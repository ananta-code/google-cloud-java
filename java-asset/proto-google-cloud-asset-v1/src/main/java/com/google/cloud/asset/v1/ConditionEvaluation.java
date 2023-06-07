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
// source: google/cloud/asset/v1/assets.proto

package com.google.cloud.asset.v1;

/**
 *
 *
 * <pre>
 * The Condition evaluation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.asset.v1.ConditionEvaluation}
 */
public final class ConditionEvaluation extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.asset.v1.ConditionEvaluation)
    ConditionEvaluationOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ConditionEvaluation.newBuilder() to construct.
  private ConditionEvaluation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ConditionEvaluation() {
    evaluationValue_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ConditionEvaluation();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.asset.v1.AssetProto
        .internal_static_google_cloud_asset_v1_ConditionEvaluation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.asset.v1.AssetProto
        .internal_static_google_cloud_asset_v1_ConditionEvaluation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.asset.v1.ConditionEvaluation.class,
            com.google.cloud.asset.v1.ConditionEvaluation.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Value of this expression.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.asset.v1.ConditionEvaluation.EvaluationValue}
   */
  public enum EvaluationValue implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Reserved for future use.
     * </pre>
     *
     * <code>EVALUATION_VALUE_UNSPECIFIED = 0;</code>
     */
    EVALUATION_VALUE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * The evaluation result is `true`.
     * </pre>
     *
     * <code>TRUE = 1;</code>
     */
    TRUE(1),
    /**
     *
     *
     * <pre>
     * The evaluation result is `false`.
     * </pre>
     *
     * <code>FALSE = 2;</code>
     */
    FALSE(2),
    /**
     *
     *
     * <pre>
     * The evaluation result is `conditional` when the condition expression
     * contains variables that are either missing input values or have not been
     * supported by Analyzer yet.
     * </pre>
     *
     * <code>CONDITIONAL = 3;</code>
     */
    CONDITIONAL(3),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Reserved for future use.
     * </pre>
     *
     * <code>EVALUATION_VALUE_UNSPECIFIED = 0;</code>
     */
    public static final int EVALUATION_VALUE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * The evaluation result is `true`.
     * </pre>
     *
     * <code>TRUE = 1;</code>
     */
    public static final int TRUE_VALUE = 1;
    /**
     *
     *
     * <pre>
     * The evaluation result is `false`.
     * </pre>
     *
     * <code>FALSE = 2;</code>
     */
    public static final int FALSE_VALUE = 2;
    /**
     *
     *
     * <pre>
     * The evaluation result is `conditional` when the condition expression
     * contains variables that are either missing input values or have not been
     * supported by Analyzer yet.
     * </pre>
     *
     * <code>CONDITIONAL = 3;</code>
     */
    public static final int CONDITIONAL_VALUE = 3;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static EvaluationValue valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static EvaluationValue forNumber(int value) {
      switch (value) {
        case 0:
          return EVALUATION_VALUE_UNSPECIFIED;
        case 1:
          return TRUE;
        case 2:
          return FALSE;
        case 3:
          return CONDITIONAL;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<EvaluationValue> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<EvaluationValue>
        internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<EvaluationValue>() {
              public EvaluationValue findValueByNumber(int number) {
                return EvaluationValue.forNumber(number);
              }
            };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.asset.v1.ConditionEvaluation.getDescriptor().getEnumTypes().get(0);
    }

    private static final EvaluationValue[] VALUES = values();

    public static EvaluationValue valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private EvaluationValue(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.asset.v1.ConditionEvaluation.EvaluationValue)
  }

  public static final int EVALUATION_VALUE_FIELD_NUMBER = 1;
  private int evaluationValue_ = 0;
  /**
   *
   *
   * <pre>
   * The evaluation result.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.ConditionEvaluation.EvaluationValue evaluation_value = 1;</code>
   *
   * @return The enum numeric value on the wire for evaluationValue.
   */
  @java.lang.Override
  public int getEvaluationValueValue() {
    return evaluationValue_;
  }
  /**
   *
   *
   * <pre>
   * The evaluation result.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.ConditionEvaluation.EvaluationValue evaluation_value = 1;</code>
   *
   * @return The evaluationValue.
   */
  @java.lang.Override
  public com.google.cloud.asset.v1.ConditionEvaluation.EvaluationValue getEvaluationValue() {
    com.google.cloud.asset.v1.ConditionEvaluation.EvaluationValue result =
        com.google.cloud.asset.v1.ConditionEvaluation.EvaluationValue.forNumber(evaluationValue_);
    return result == null
        ? com.google.cloud.asset.v1.ConditionEvaluation.EvaluationValue.UNRECOGNIZED
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
    if (evaluationValue_
        != com.google.cloud.asset.v1.ConditionEvaluation.EvaluationValue
            .EVALUATION_VALUE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, evaluationValue_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (evaluationValue_
        != com.google.cloud.asset.v1.ConditionEvaluation.EvaluationValue
            .EVALUATION_VALUE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, evaluationValue_);
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
    if (!(obj instanceof com.google.cloud.asset.v1.ConditionEvaluation)) {
      return super.equals(obj);
    }
    com.google.cloud.asset.v1.ConditionEvaluation other =
        (com.google.cloud.asset.v1.ConditionEvaluation) obj;

    if (evaluationValue_ != other.evaluationValue_) return false;
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
    hash = (37 * hash) + EVALUATION_VALUE_FIELD_NUMBER;
    hash = (53 * hash) + evaluationValue_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.asset.v1.ConditionEvaluation parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1.ConditionEvaluation parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.ConditionEvaluation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1.ConditionEvaluation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.ConditionEvaluation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1.ConditionEvaluation parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.ConditionEvaluation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1.ConditionEvaluation parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.ConditionEvaluation parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1.ConditionEvaluation parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.ConditionEvaluation parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1.ConditionEvaluation parseFrom(
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

  public static Builder newBuilder(com.google.cloud.asset.v1.ConditionEvaluation prototype) {
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
   * The Condition evaluation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.asset.v1.ConditionEvaluation}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.asset.v1.ConditionEvaluation)
      com.google.cloud.asset.v1.ConditionEvaluationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.asset.v1.AssetProto
          .internal_static_google_cloud_asset_v1_ConditionEvaluation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.asset.v1.AssetProto
          .internal_static_google_cloud_asset_v1_ConditionEvaluation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.asset.v1.ConditionEvaluation.class,
              com.google.cloud.asset.v1.ConditionEvaluation.Builder.class);
    }

    // Construct using com.google.cloud.asset.v1.ConditionEvaluation.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      evaluationValue_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.asset.v1.AssetProto
          .internal_static_google_cloud_asset_v1_ConditionEvaluation_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.ConditionEvaluation getDefaultInstanceForType() {
      return com.google.cloud.asset.v1.ConditionEvaluation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.ConditionEvaluation build() {
      com.google.cloud.asset.v1.ConditionEvaluation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.ConditionEvaluation buildPartial() {
      com.google.cloud.asset.v1.ConditionEvaluation result =
          new com.google.cloud.asset.v1.ConditionEvaluation(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.asset.v1.ConditionEvaluation result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.evaluationValue_ = evaluationValue_;
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
      if (other instanceof com.google.cloud.asset.v1.ConditionEvaluation) {
        return mergeFrom((com.google.cloud.asset.v1.ConditionEvaluation) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.asset.v1.ConditionEvaluation other) {
      if (other == com.google.cloud.asset.v1.ConditionEvaluation.getDefaultInstance()) return this;
      if (other.evaluationValue_ != 0) {
        setEvaluationValueValue(other.getEvaluationValueValue());
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
                evaluationValue_ = input.readEnum();
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

    private int evaluationValue_ = 0;
    /**
     *
     *
     * <pre>
     * The evaluation result.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.ConditionEvaluation.EvaluationValue evaluation_value = 1;</code>
     *
     * @return The enum numeric value on the wire for evaluationValue.
     */
    @java.lang.Override
    public int getEvaluationValueValue() {
      return evaluationValue_;
    }
    /**
     *
     *
     * <pre>
     * The evaluation result.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.ConditionEvaluation.EvaluationValue evaluation_value = 1;</code>
     *
     * @param value The enum numeric value on the wire for evaluationValue to set.
     * @return This builder for chaining.
     */
    public Builder setEvaluationValueValue(int value) {
      evaluationValue_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The evaluation result.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.ConditionEvaluation.EvaluationValue evaluation_value = 1;</code>
     *
     * @return The evaluationValue.
     */
    @java.lang.Override
    public com.google.cloud.asset.v1.ConditionEvaluation.EvaluationValue getEvaluationValue() {
      com.google.cloud.asset.v1.ConditionEvaluation.EvaluationValue result =
          com.google.cloud.asset.v1.ConditionEvaluation.EvaluationValue.forNumber(evaluationValue_);
      return result == null
          ? com.google.cloud.asset.v1.ConditionEvaluation.EvaluationValue.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The evaluation result.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.ConditionEvaluation.EvaluationValue evaluation_value = 1;</code>
     *
     * @param value The evaluationValue to set.
     * @return This builder for chaining.
     */
    public Builder setEvaluationValue(
        com.google.cloud.asset.v1.ConditionEvaluation.EvaluationValue value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      evaluationValue_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The evaluation result.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.ConditionEvaluation.EvaluationValue evaluation_value = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEvaluationValue() {
      bitField0_ = (bitField0_ & ~0x00000001);
      evaluationValue_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.asset.v1.ConditionEvaluation)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.asset.v1.ConditionEvaluation)
  private static final com.google.cloud.asset.v1.ConditionEvaluation DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.asset.v1.ConditionEvaluation();
  }

  public static com.google.cloud.asset.v1.ConditionEvaluation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConditionEvaluation> PARSER =
      new com.google.protobuf.AbstractParser<ConditionEvaluation>() {
        @java.lang.Override
        public ConditionEvaluation parsePartialFrom(
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

  public static com.google.protobuf.Parser<ConditionEvaluation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConditionEvaluation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.asset.v1.ConditionEvaluation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
