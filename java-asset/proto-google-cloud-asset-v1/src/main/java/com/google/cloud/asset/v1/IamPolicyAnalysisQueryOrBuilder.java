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

public interface IamPolicyAnalysisQueryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1.IamPolicyAnalysisQuery)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The relative name of the root asset. Only resources and
   * {{iam_name_short}} policies within the scope will be analyzed.
   * This can only be an organization number (such as "organizations/123"), a
   * folder number (such as "folders/123"), a project ID (such as
   * "projects/my-project-id"), or a project number (such as "projects/12345").
   * To know how to get organization id, visit [here
   * ](https://cloud.google.com/resource-manager/docs/creating-managing-organization#retrieving_your_organization_id).
   * To know how to get folder or project id, visit [here
   * ](https://cloud.google.com/resource-manager/docs/creating-managing-folders#viewing_or_listing_folders_and_projects).
   * </pre>
   *
   * <code>string scope = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The scope.
   */
  java.lang.String getScope();
  /**
   *
   *
   * <pre>
   * Required. The relative name of the root asset. Only resources and
   * {{iam_name_short}} policies within the scope will be analyzed.
   * This can only be an organization number (such as "organizations/123"), a
   * folder number (such as "folders/123"), a project ID (such as
   * "projects/my-project-id"), or a project number (such as "projects/12345").
   * To know how to get organization id, visit [here
   * ](https://cloud.google.com/resource-manager/docs/creating-managing-organization#retrieving_your_organization_id).
   * To know how to get folder or project id, visit [here
   * ](https://cloud.google.com/resource-manager/docs/creating-managing-folders#viewing_or_listing_folders_and_projects).
   * </pre>
   *
   * <code>string scope = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for scope.
   */
  com.google.protobuf.ByteString getScopeBytes();

  /**
   *
   *
   * <pre>
   * Optional. Specifies a resource for analysis.
   * </pre>
   *
   * <code>
   * .google.cloud.asset.v1.IamPolicyAnalysisQuery.ResourceSelector resource_selector = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the resourceSelector field is set.
   */
  boolean hasResourceSelector();
  /**
   *
   *
   * <pre>
   * Optional. Specifies a resource for analysis.
   * </pre>
   *
   * <code>
   * .google.cloud.asset.v1.IamPolicyAnalysisQuery.ResourceSelector resource_selector = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The resourceSelector.
   */
  com.google.cloud.asset.v1.IamPolicyAnalysisQuery.ResourceSelector getResourceSelector();
  /**
   *
   *
   * <pre>
   * Optional. Specifies a resource for analysis.
   * </pre>
   *
   * <code>
   * .google.cloud.asset.v1.IamPolicyAnalysisQuery.ResourceSelector resource_selector = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.asset.v1.IamPolicyAnalysisQuery.ResourceSelectorOrBuilder
      getResourceSelectorOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Specifies an identity for analysis.
   * </pre>
   *
   * <code>
   * .google.cloud.asset.v1.IamPolicyAnalysisQuery.IdentitySelector identity_selector = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the identitySelector field is set.
   */
  boolean hasIdentitySelector();
  /**
   *
   *
   * <pre>
   * Optional. Specifies an identity for analysis.
   * </pre>
   *
   * <code>
   * .google.cloud.asset.v1.IamPolicyAnalysisQuery.IdentitySelector identity_selector = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The identitySelector.
   */
  com.google.cloud.asset.v1.IamPolicyAnalysisQuery.IdentitySelector getIdentitySelector();
  /**
   *
   *
   * <pre>
   * Optional. Specifies an identity for analysis.
   * </pre>
   *
   * <code>
   * .google.cloud.asset.v1.IamPolicyAnalysisQuery.IdentitySelector identity_selector = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.asset.v1.IamPolicyAnalysisQuery.IdentitySelectorOrBuilder
      getIdentitySelectorOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Specifies roles or permissions for analysis. This is optional.
   * </pre>
   *
   * <code>
   * .google.cloud.asset.v1.IamPolicyAnalysisQuery.AccessSelector access_selector = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the accessSelector field is set.
   */
  boolean hasAccessSelector();
  /**
   *
   *
   * <pre>
   * Optional. Specifies roles or permissions for analysis. This is optional.
   * </pre>
   *
   * <code>
   * .google.cloud.asset.v1.IamPolicyAnalysisQuery.AccessSelector access_selector = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The accessSelector.
   */
  com.google.cloud.asset.v1.IamPolicyAnalysisQuery.AccessSelector getAccessSelector();
  /**
   *
   *
   * <pre>
   * Optional. Specifies roles or permissions for analysis. This is optional.
   * </pre>
   *
   * <code>
   * .google.cloud.asset.v1.IamPolicyAnalysisQuery.AccessSelector access_selector = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.asset.v1.IamPolicyAnalysisQuery.AccessSelectorOrBuilder
      getAccessSelectorOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The query options.
   * </pre>
   *
   * <code>
   * .google.cloud.asset.v1.IamPolicyAnalysisQuery.Options options = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the options field is set.
   */
  boolean hasOptions();
  /**
   *
   *
   * <pre>
   * Optional. The query options.
   * </pre>
   *
   * <code>
   * .google.cloud.asset.v1.IamPolicyAnalysisQuery.Options options = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The options.
   */
  com.google.cloud.asset.v1.IamPolicyAnalysisQuery.Options getOptions();
  /**
   *
   *
   * <pre>
   * Optional. The query options.
   * </pre>
   *
   * <code>
   * .google.cloud.asset.v1.IamPolicyAnalysisQuery.Options options = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.asset.v1.IamPolicyAnalysisQuery.OptionsOrBuilder getOptionsOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The hypothetical context for {{iam_name_short}} conditions
   * evaluation.
   * </pre>
   *
   * <code>
   * .google.cloud.asset.v1.IamPolicyAnalysisQuery.ConditionContext condition_context = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the conditionContext field is set.
   */
  boolean hasConditionContext();
  /**
   *
   *
   * <pre>
   * Optional. The hypothetical context for {{iam_name_short}} conditions
   * evaluation.
   * </pre>
   *
   * <code>
   * .google.cloud.asset.v1.IamPolicyAnalysisQuery.ConditionContext condition_context = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The conditionContext.
   */
  com.google.cloud.asset.v1.IamPolicyAnalysisQuery.ConditionContext getConditionContext();
  /**
   *
   *
   * <pre>
   * Optional. The hypothetical context for {{iam_name_short}} conditions
   * evaluation.
   * </pre>
   *
   * <code>
   * .google.cloud.asset.v1.IamPolicyAnalysisQuery.ConditionContext condition_context = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.asset.v1.IamPolicyAnalysisQuery.ConditionContextOrBuilder
      getConditionContextOrBuilder();
}
