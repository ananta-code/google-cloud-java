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
// source: google/cloud/ids/v1/ids.proto

package com.google.cloud.ids.v1;

public interface EndpointOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.ids.v1.Endpoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The name of the endpoint.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The name of the endpoint.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The create time timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The create time timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The create time timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The update time timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The update time timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The update time timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The labels of the endpoint.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * The labels of the endpoint.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * The labels of the endpoint.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * The labels of the endpoint.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */

  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * The labels of the endpoint.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Required. The fully qualified URL of the network to which the IDS Endpoint is
   * attached.
   * </pre>
   *
   * <code>string network = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The network.
   */
  java.lang.String getNetwork();
  /**
   *
   *
   * <pre>
   * Required. The fully qualified URL of the network to which the IDS Endpoint is
   * attached.
   * </pre>
   *
   * <code>string network = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString getNetworkBytes();

  /**
   *
   *
   * <pre>
   * Output only. The fully qualified URL of the endpoint's ILB Forwarding Rule.
   * </pre>
   *
   * <code>string endpoint_forwarding_rule = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The endpointForwardingRule.
   */
  java.lang.String getEndpointForwardingRule();
  /**
   *
   *
   * <pre>
   * Output only. The fully qualified URL of the endpoint's ILB Forwarding Rule.
   * </pre>
   *
   * <code>string endpoint_forwarding_rule = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for endpointForwardingRule.
   */
  com.google.protobuf.ByteString getEndpointForwardingRuleBytes();

  /**
   *
   *
   * <pre>
   * Output only. The IP address of the IDS Endpoint's ILB.
   * </pre>
   *
   * <code>string endpoint_ip = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The endpointIp.
   */
  java.lang.String getEndpointIp();
  /**
   *
   *
   * <pre>
   * Output only. The IP address of the IDS Endpoint's ILB.
   * </pre>
   *
   * <code>string endpoint_ip = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for endpointIp.
   */
  com.google.protobuf.ByteString getEndpointIpBytes();

  /**
   *
   *
   * <pre>
   * User-provided description of the endpoint
   * </pre>
   *
   * <code>string description = 8;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * User-provided description of the endpoint
   * </pre>
   *
   * <code>string description = 8;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Required. Lowest threat severity that this endpoint will alert on.
   * </pre>
   *
   * <code>
   * .google.cloud.ids.v1.Endpoint.Severity severity = 9 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for severity.
   */
  int getSeverityValue();
  /**
   *
   *
   * <pre>
   * Required. Lowest threat severity that this endpoint will alert on.
   * </pre>
   *
   * <code>
   * .google.cloud.ids.v1.Endpoint.Severity severity = 9 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The severity.
   */
  com.google.cloud.ids.v1.Endpoint.Severity getSeverity();

  /**
   *
   *
   * <pre>
   * Output only. Current state of the endpoint.
   * </pre>
   *
   * <code>
   * .google.cloud.ids.v1.Endpoint.State state = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. Current state of the endpoint.
   * </pre>
   *
   * <code>
   * .google.cloud.ids.v1.Endpoint.State state = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.ids.v1.Endpoint.State getState();

  /**
   *
   *
   * <pre>
   * Whether the endpoint should report traffic logs in addition to threat logs.
   * </pre>
   *
   * <code>bool traffic_logs = 13;</code>
   *
   * @return The trafficLogs.
   */
  boolean getTrafficLogs();
}
