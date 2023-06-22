/*
 * Copyright 2023 Google LLC
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
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

public interface BlueGreenSettingsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.BlueGreenSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Standard policy for the blue-green upgrade.
   * </pre>
   *
   * <code>.google.container.v1.BlueGreenSettings.StandardRolloutPolicy standard_rollout_policy = 1;
   * </code>
   *
   * @return Whether the standardRolloutPolicy field is set.
   */
  boolean hasStandardRolloutPolicy();
  /**
   *
   *
   * <pre>
   * Standard policy for the blue-green upgrade.
   * </pre>
   *
   * <code>.google.container.v1.BlueGreenSettings.StandardRolloutPolicy standard_rollout_policy = 1;
   * </code>
   *
   * @return The standardRolloutPolicy.
   */
  com.google.container.v1.BlueGreenSettings.StandardRolloutPolicy getStandardRolloutPolicy();
  /**
   *
   *
   * <pre>
   * Standard policy for the blue-green upgrade.
   * </pre>
   *
   * <code>.google.container.v1.BlueGreenSettings.StandardRolloutPolicy standard_rollout_policy = 1;
   * </code>
   */
  com.google.container.v1.BlueGreenSettings.StandardRolloutPolicyOrBuilder
      getStandardRolloutPolicyOrBuilder();

  /**
   *
   *
   * <pre>
   * Time needed after draining entire blue pool. After this period, blue pool
   * will be cleaned up.
   * </pre>
   *
   * <code>optional .google.protobuf.Duration node_pool_soak_duration = 2;</code>
   *
   * @return Whether the nodePoolSoakDuration field is set.
   */
  boolean hasNodePoolSoakDuration();
  /**
   *
   *
   * <pre>
   * Time needed after draining entire blue pool. After this period, blue pool
   * will be cleaned up.
   * </pre>
   *
   * <code>optional .google.protobuf.Duration node_pool_soak_duration = 2;</code>
   *
   * @return The nodePoolSoakDuration.
   */
  com.google.protobuf.Duration getNodePoolSoakDuration();
  /**
   *
   *
   * <pre>
   * Time needed after draining entire blue pool. After this period, blue pool
   * will be cleaned up.
   * </pre>
   *
   * <code>optional .google.protobuf.Duration node_pool_soak_duration = 2;</code>
   */
  com.google.protobuf.DurationOrBuilder getNodePoolSoakDurationOrBuilder();

  com.google.container.v1.BlueGreenSettings.RolloutPolicyCase getRolloutPolicyCase();
}
