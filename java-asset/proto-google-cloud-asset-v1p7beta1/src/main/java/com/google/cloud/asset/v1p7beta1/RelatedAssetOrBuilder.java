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
// source: google/cloud/asset/v1p7beta1/assets.proto

package com.google.cloud.asset.v1p7beta1;

public interface RelatedAssetOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1p7beta1.RelatedAsset)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The full name of the asset. Example:
   * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`
   *
   * See [Resource
   * names](https://cloud.google.com/apis/design/resource_names#full_resource_name)
   * for more information.
   * </pre>
   *
   * <code>string asset = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The asset.
   */
  java.lang.String getAsset();
  /**
   *
   *
   * <pre>
   * The full name of the asset. Example:
   * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`
   *
   * See [Resource
   * names](https://cloud.google.com/apis/design/resource_names#full_resource_name)
   * for more information.
   * </pre>
   *
   * <code>string asset = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for asset.
   */
  com.google.protobuf.ByteString getAssetBytes();

  /**
   *
   *
   * <pre>
   * The type of the asset. Example: `compute.googleapis.com/Disk`
   *
   * See [Supported asset
   * types](https://cloud.google.com/asset-inventory/docs/supported-asset-types)
   * for more information.
   * </pre>
   *
   * <code>string asset_type = 2;</code>
   *
   * @return The assetType.
   */
  java.lang.String getAssetType();
  /**
   *
   *
   * <pre>
   * The type of the asset. Example: `compute.googleapis.com/Disk`
   *
   * See [Supported asset
   * types](https://cloud.google.com/asset-inventory/docs/supported-asset-types)
   * for more information.
   * </pre>
   *
   * <code>string asset_type = 2;</code>
   *
   * @return The bytes for assetType.
   */
  com.google.protobuf.ByteString getAssetTypeBytes();

  /**
   *
   *
   * <pre>
   * The ancestors of an asset in Google Cloud [resource
   * hierarchy](https://cloud.google.com/resource-manager/docs/cloud-platform-resource-hierarchy),
   * represented as a list of relative resource names. An ancestry path starts
   * with the closest ancestor in the hierarchy and ends at root.
   *
   * Example: `["projects/123456789", "folders/5432", "organizations/1234"]`
   * </pre>
   *
   * <code>repeated string ancestors = 3;</code>
   *
   * @return A list containing the ancestors.
   */
  java.util.List<java.lang.String> getAncestorsList();
  /**
   *
   *
   * <pre>
   * The ancestors of an asset in Google Cloud [resource
   * hierarchy](https://cloud.google.com/resource-manager/docs/cloud-platform-resource-hierarchy),
   * represented as a list of relative resource names. An ancestry path starts
   * with the closest ancestor in the hierarchy and ends at root.
   *
   * Example: `["projects/123456789", "folders/5432", "organizations/1234"]`
   * </pre>
   *
   * <code>repeated string ancestors = 3;</code>
   *
   * @return The count of ancestors.
   */
  int getAncestorsCount();
  /**
   *
   *
   * <pre>
   * The ancestors of an asset in Google Cloud [resource
   * hierarchy](https://cloud.google.com/resource-manager/docs/cloud-platform-resource-hierarchy),
   * represented as a list of relative resource names. An ancestry path starts
   * with the closest ancestor in the hierarchy and ends at root.
   *
   * Example: `["projects/123456789", "folders/5432", "organizations/1234"]`
   * </pre>
   *
   * <code>repeated string ancestors = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The ancestors at the given index.
   */
  java.lang.String getAncestors(int index);
  /**
   *
   *
   * <pre>
   * The ancestors of an asset in Google Cloud [resource
   * hierarchy](https://cloud.google.com/resource-manager/docs/cloud-platform-resource-hierarchy),
   * represented as a list of relative resource names. An ancestry path starts
   * with the closest ancestor in the hierarchy and ends at root.
   *
   * Example: `["projects/123456789", "folders/5432", "organizations/1234"]`
   * </pre>
   *
   * <code>repeated string ancestors = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the ancestors at the given index.
   */
  com.google.protobuf.ByteString getAncestorsBytes(int index);
}
