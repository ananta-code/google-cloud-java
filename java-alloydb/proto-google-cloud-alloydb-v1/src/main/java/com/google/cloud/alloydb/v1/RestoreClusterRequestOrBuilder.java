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
// source: google/cloud/alloydb/v1/service.proto

package com.google.cloud.alloydb.v1;

public interface RestoreClusterRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.alloydb.v1.RestoreClusterRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Backup source.
   * </pre>
   *
   * <code>.google.cloud.alloydb.v1.BackupSource backup_source = 4;</code>
   *
   * @return Whether the backupSource field is set.
   */
  boolean hasBackupSource();
  /**
   *
   *
   * <pre>
   * Backup source.
   * </pre>
   *
   * <code>.google.cloud.alloydb.v1.BackupSource backup_source = 4;</code>
   *
   * @return The backupSource.
   */
  com.google.cloud.alloydb.v1.BackupSource getBackupSource();
  /**
   *
   *
   * <pre>
   * Backup source.
   * </pre>
   *
   * <code>.google.cloud.alloydb.v1.BackupSource backup_source = 4;</code>
   */
  com.google.cloud.alloydb.v1.BackupSourceOrBuilder getBackupSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The name of the parent resource. For the required format, see the
   * comment on the Cluster.name field.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The name of the parent resource. For the required format, see the
   * comment on the Cluster.name field.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. ID of the requesting object.
   * </pre>
   *
   * <code>string cluster_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The clusterId.
   */
  java.lang.String getClusterId();
  /**
   *
   *
   * <pre>
   * Required. ID of the requesting object.
   * </pre>
   *
   * <code>string cluster_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for clusterId.
   */
  com.google.protobuf.ByteString getClusterIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The resource being created
   * </pre>
   *
   * <code>.google.cloud.alloydb.v1.Cluster cluster = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the cluster field is set.
   */
  boolean hasCluster();
  /**
   *
   *
   * <pre>
   * Required. The resource being created
   * </pre>
   *
   * <code>.google.cloud.alloydb.v1.Cluster cluster = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The cluster.
   */
  com.google.cloud.alloydb.v1.Cluster getCluster();
  /**
   *
   *
   * <pre>
   * Required. The resource being created
   * </pre>
   *
   * <code>.google.cloud.alloydb.v1.Cluster cluster = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.alloydb.v1.ClusterOrBuilder getClusterOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. An optional request ID to identify requests. Specify a unique
   * request ID so that if you must retry your request, the server will know to
   * ignore the request if it has already been completed. The server will
   * guarantee that for at least 60 minutes since the first request.
   *
   * For example, consider a situation where you make an initial request and
   * the request times out. If you make the request again with the same request
   * ID, the server can check if original operation with the same request ID
   * was received, and if so, will ignore the second request. This prevents
   * clients from accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   *
   *
   * <pre>
   * Optional. An optional request ID to identify requests. Specify a unique
   * request ID so that if you must retry your request, the server will know to
   * ignore the request if it has already been completed. The server will
   * guarantee that for at least 60 minutes since the first request.
   *
   * For example, consider a situation where you make an initial request and
   * the request times out. If you make the request again with the same request
   * ID, the server can check if original operation with the same request ID
   * was received, and if so, will ignore the second request. This prevents
   * clients from accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString getRequestIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. If set, performs request validation (e.g. permission checks and
   * any other type of validation), but do not actually execute the import
   * request.
   * </pre>
   *
   * <code>bool validate_only = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The validateOnly.
   */
  boolean getValidateOnly();

  com.google.cloud.alloydb.v1.RestoreClusterRequest.SourceCase getSourceCase();
}
