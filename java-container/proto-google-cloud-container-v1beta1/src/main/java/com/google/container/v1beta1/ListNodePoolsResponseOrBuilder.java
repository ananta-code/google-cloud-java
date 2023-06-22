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
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

public interface ListNodePoolsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.ListNodePoolsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of node pools for a cluster.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.NodePool node_pools = 1;</code>
   */
  java.util.List<com.google.container.v1beta1.NodePool> getNodePoolsList();
  /**
   *
   *
   * <pre>
   * A list of node pools for a cluster.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.NodePool node_pools = 1;</code>
   */
  com.google.container.v1beta1.NodePool getNodePools(int index);
  /**
   *
   *
   * <pre>
   * A list of node pools for a cluster.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.NodePool node_pools = 1;</code>
   */
  int getNodePoolsCount();
  /**
   *
   *
   * <pre>
   * A list of node pools for a cluster.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.NodePool node_pools = 1;</code>
   */
  java.util.List<? extends com.google.container.v1beta1.NodePoolOrBuilder>
      getNodePoolsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of node pools for a cluster.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.NodePool node_pools = 1;</code>
   */
  com.google.container.v1beta1.NodePoolOrBuilder getNodePoolsOrBuilder(int index);
}
