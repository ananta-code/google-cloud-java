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

public interface MasterAuthorizedNetworksConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.MasterAuthorizedNetworksConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Whether or not master authorized networks is enabled.
   * </pre>
   *
   * <code>bool enabled = 1;</code>
   *
   * @return The enabled.
   */
  boolean getEnabled();

  /**
   *
   *
   * <pre>
   * cidr_blocks define up to 10 external networks that could access
   * Kubernetes master through HTTPS.
   * </pre>
   *
   * <code>
   * repeated .google.container.v1beta1.MasterAuthorizedNetworksConfig.CidrBlock cidr_blocks = 2;
   * </code>
   */
  java.util.List<com.google.container.v1beta1.MasterAuthorizedNetworksConfig.CidrBlock>
      getCidrBlocksList();
  /**
   *
   *
   * <pre>
   * cidr_blocks define up to 10 external networks that could access
   * Kubernetes master through HTTPS.
   * </pre>
   *
   * <code>
   * repeated .google.container.v1beta1.MasterAuthorizedNetworksConfig.CidrBlock cidr_blocks = 2;
   * </code>
   */
  com.google.container.v1beta1.MasterAuthorizedNetworksConfig.CidrBlock getCidrBlocks(int index);
  /**
   *
   *
   * <pre>
   * cidr_blocks define up to 10 external networks that could access
   * Kubernetes master through HTTPS.
   * </pre>
   *
   * <code>
   * repeated .google.container.v1beta1.MasterAuthorizedNetworksConfig.CidrBlock cidr_blocks = 2;
   * </code>
   */
  int getCidrBlocksCount();
  /**
   *
   *
   * <pre>
   * cidr_blocks define up to 10 external networks that could access
   * Kubernetes master through HTTPS.
   * </pre>
   *
   * <code>
   * repeated .google.container.v1beta1.MasterAuthorizedNetworksConfig.CidrBlock cidr_blocks = 2;
   * </code>
   */
  java.util.List<
          ? extends com.google.container.v1beta1.MasterAuthorizedNetworksConfig.CidrBlockOrBuilder>
      getCidrBlocksOrBuilderList();
  /**
   *
   *
   * <pre>
   * cidr_blocks define up to 10 external networks that could access
   * Kubernetes master through HTTPS.
   * </pre>
   *
   * <code>
   * repeated .google.container.v1beta1.MasterAuthorizedNetworksConfig.CidrBlock cidr_blocks = 2;
   * </code>
   */
  com.google.container.v1beta1.MasterAuthorizedNetworksConfig.CidrBlockOrBuilder
      getCidrBlocksOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Whether master is accessbile via Google Compute Engine Public IP addresses.
   * </pre>
   *
   * <code>optional bool gcp_public_cidrs_access_enabled = 3;</code>
   *
   * @return Whether the gcpPublicCidrsAccessEnabled field is set.
   */
  boolean hasGcpPublicCidrsAccessEnabled();
  /**
   *
   *
   * <pre>
   * Whether master is accessbile via Google Compute Engine Public IP addresses.
   * </pre>
   *
   * <code>optional bool gcp_public_cidrs_access_enabled = 3;</code>
   *
   * @return The gcpPublicCidrsAccessEnabled.
   */
  boolean getGcpPublicCidrsAccessEnabled();
}
