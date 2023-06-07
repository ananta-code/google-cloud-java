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
// source: google/analytics/data/v1alpha/data.proto

package com.google.analytics.data.v1alpha;

public interface SegmentParameterFilterExpressionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.SegmentParameterFilterExpression)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The SegmentParameterFilterExpression in `andGroup` have an AND
   * relationship.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.SegmentParameterFilterExpressionList and_group = 1;</code>
   *
   * @return Whether the andGroup field is set.
   */
  boolean hasAndGroup();
  /**
   *
   *
   * <pre>
   * The SegmentParameterFilterExpression in `andGroup` have an AND
   * relationship.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.SegmentParameterFilterExpressionList and_group = 1;</code>
   *
   * @return The andGroup.
   */
  com.google.analytics.data.v1alpha.SegmentParameterFilterExpressionList getAndGroup();
  /**
   *
   *
   * <pre>
   * The SegmentParameterFilterExpression in `andGroup` have an AND
   * relationship.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.SegmentParameterFilterExpressionList and_group = 1;</code>
   */
  com.google.analytics.data.v1alpha.SegmentParameterFilterExpressionListOrBuilder
      getAndGroupOrBuilder();

  /**
   *
   *
   * <pre>
   * The SegmentParameterFilterExpression in `orGroup` have an OR
   * relationship.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.SegmentParameterFilterExpressionList or_group = 2;</code>
   *
   * @return Whether the orGroup field is set.
   */
  boolean hasOrGroup();
  /**
   *
   *
   * <pre>
   * The SegmentParameterFilterExpression in `orGroup` have an OR
   * relationship.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.SegmentParameterFilterExpressionList or_group = 2;</code>
   *
   * @return The orGroup.
   */
  com.google.analytics.data.v1alpha.SegmentParameterFilterExpressionList getOrGroup();
  /**
   *
   *
   * <pre>
   * The SegmentParameterFilterExpression in `orGroup` have an OR
   * relationship.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.SegmentParameterFilterExpressionList or_group = 2;</code>
   */
  com.google.analytics.data.v1alpha.SegmentParameterFilterExpressionListOrBuilder
      getOrGroupOrBuilder();

  /**
   *
   *
   * <pre>
   * The SegmentParameterFilterExpression is NOT of `notExpression`.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.SegmentParameterFilterExpression not_expression = 3;
   * </code>
   *
   * @return Whether the notExpression field is set.
   */
  boolean hasNotExpression();
  /**
   *
   *
   * <pre>
   * The SegmentParameterFilterExpression is NOT of `notExpression`.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.SegmentParameterFilterExpression not_expression = 3;
   * </code>
   *
   * @return The notExpression.
   */
  com.google.analytics.data.v1alpha.SegmentParameterFilterExpression getNotExpression();
  /**
   *
   *
   * <pre>
   * The SegmentParameterFilterExpression is NOT of `notExpression`.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.SegmentParameterFilterExpression not_expression = 3;
   * </code>
   */
  com.google.analytics.data.v1alpha.SegmentParameterFilterExpressionOrBuilder
      getNotExpressionOrBuilder();

  /**
   *
   *
   * <pre>
   * A primitive segment parameter filter.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.SegmentParameterFilter segment_parameter_filter = 4;
   * </code>
   *
   * @return Whether the segmentParameterFilter field is set.
   */
  boolean hasSegmentParameterFilter();
  /**
   *
   *
   * <pre>
   * A primitive segment parameter filter.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.SegmentParameterFilter segment_parameter_filter = 4;
   * </code>
   *
   * @return The segmentParameterFilter.
   */
  com.google.analytics.data.v1alpha.SegmentParameterFilter getSegmentParameterFilter();
  /**
   *
   *
   * <pre>
   * A primitive segment parameter filter.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.SegmentParameterFilter segment_parameter_filter = 4;
   * </code>
   */
  com.google.analytics.data.v1alpha.SegmentParameterFilterOrBuilder
      getSegmentParameterFilterOrBuilder();

  com.google.analytics.data.v1alpha.SegmentParameterFilterExpression.ExprCase getExprCase();
}
