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
// source: google/cloud/asset/v1/asset_service.proto

package com.google.cloud.asset.v1;

public interface BatchGetEffectiveIamPoliciesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Only {{iam_name_short}} policies on or below the scope will be
   * returned.
   * This can only be an organization number (such as "organizations/123"), a
   * folder number (such as "folders/123"), a project ID (such as
   * "projects/my-project-id"), or a project number (such as "projects/12345").
   * To know how to get organization id, visit [here
   * ](https://cloud.google.com/resource-manager/docs/creating-managing-organization#retrieving_your_organization_id).
   * To know how to get folder or project id, visit [here
   * ](https://cloud.google.com/resource-manager/docs/creating-managing-folders#viewing_or_listing_folders_and_projects).
   * </pre>
   *
   * <code>
   * string scope = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The scope.
   */
  java.lang.String getScope();
  /**
   *
   *
   * <pre>
   * Required. Only {{iam_name_short}} policies on or below the scope will be
   * returned.
   * This can only be an organization number (such as "organizations/123"), a
   * folder number (such as "folders/123"), a project ID (such as
   * "projects/my-project-id"), or a project number (such as "projects/12345").
   * To know how to get organization id, visit [here
   * ](https://cloud.google.com/resource-manager/docs/creating-managing-organization#retrieving_your_organization_id).
   * To know how to get folder or project id, visit [here
   * ](https://cloud.google.com/resource-manager/docs/creating-managing-folders#viewing_or_listing_folders_and_projects).
   * </pre>
   *
   * <code>
   * string scope = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for scope.
   */
  com.google.protobuf.ByteString getScopeBytes();

  /**
   *
   *
   * <pre>
   * Required. The names refer to the [full_resource_names]
   * (https://cloud.google.com/asset-inventory/docs/resource-name-format)
   * of [searchable asset
   * types](https://cloud.google.com/asset-inventory/docs/supported-asset-types#searchable_asset_types).
   * A maximum of 20 resources' effective policies can be retrieved in a batch.
   * </pre>
   *
   * <code>
   * repeated string names = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return A list containing the names.
   */
  java.util.List<java.lang.String> getNamesList();
  /**
   *
   *
   * <pre>
   * Required. The names refer to the [full_resource_names]
   * (https://cloud.google.com/asset-inventory/docs/resource-name-format)
   * of [searchable asset
   * types](https://cloud.google.com/asset-inventory/docs/supported-asset-types#searchable_asset_types).
   * A maximum of 20 resources' effective policies can be retrieved in a batch.
   * </pre>
   *
   * <code>
   * repeated string names = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The count of names.
   */
  int getNamesCount();
  /**
   *
   *
   * <pre>
   * Required. The names refer to the [full_resource_names]
   * (https://cloud.google.com/asset-inventory/docs/resource-name-format)
   * of [searchable asset
   * types](https://cloud.google.com/asset-inventory/docs/supported-asset-types#searchable_asset_types).
   * A maximum of 20 resources' effective policies can be retrieved in a batch.
   * </pre>
   *
   * <code>
   * repeated string names = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the element to return.
   * @return The names at the given index.
   */
  java.lang.String getNames(int index);
  /**
   *
   *
   * <pre>
   * Required. The names refer to the [full_resource_names]
   * (https://cloud.google.com/asset-inventory/docs/resource-name-format)
   * of [searchable asset
   * types](https://cloud.google.com/asset-inventory/docs/supported-asset-types#searchable_asset_types).
   * A maximum of 20 resources' effective policies can be retrieved in a batch.
   * </pre>
   *
   * <code>
   * repeated string names = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the names at the given index.
   */
  com.google.protobuf.ByteString getNamesBytes(int index);
}
