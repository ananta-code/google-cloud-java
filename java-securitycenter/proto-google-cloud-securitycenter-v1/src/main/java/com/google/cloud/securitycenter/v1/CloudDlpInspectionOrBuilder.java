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
// source: google/cloud/securitycenter/v1/cloud_dlp_inspection.proto

package com.google.cloud.securitycenter.v1;

public interface CloudDlpInspectionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1.CloudDlpInspection)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Name of the inspection job, for example,
   * `projects/123/locations/europe/dlpJobs/i-8383929`.
   * </pre>
   *
   * <code>string inspect_job = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The inspectJob.
   */
  java.lang.String getInspectJob();
  /**
   *
   *
   * <pre>
   * Name of the inspection job, for example,
   * `projects/123/locations/europe/dlpJobs/i-8383929`.
   * </pre>
   *
   * <code>string inspect_job = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for inspectJob.
   */
  com.google.protobuf.ByteString getInspectJobBytes();

  /**
   *
   *
   * <pre>
   * The [type of
   * information](https://cloud.google.com/dlp/docs/infotypes-reference) found,
   * for example, `EMAIL_ADDRESS` or `STREET_ADDRESS`.
   * </pre>
   *
   * <code>string info_type = 2;</code>
   *
   * @return The infoType.
   */
  java.lang.String getInfoType();
  /**
   *
   *
   * <pre>
   * The [type of
   * information](https://cloud.google.com/dlp/docs/infotypes-reference) found,
   * for example, `EMAIL_ADDRESS` or `STREET_ADDRESS`.
   * </pre>
   *
   * <code>string info_type = 2;</code>
   *
   * @return The bytes for infoType.
   */
  com.google.protobuf.ByteString getInfoTypeBytes();

  /**
   *
   *
   * <pre>
   * The number of times Cloud DLP found this infoType within this job
   * and resource.
   * </pre>
   *
   * <code>int64 info_type_count = 3;</code>
   *
   * @return The infoTypeCount.
   */
  long getInfoTypeCount();

  /**
   *
   *
   * <pre>
   * Whether Cloud DLP scanned the complete resource or a sampled subset.
   * </pre>
   *
   * <code>bool full_scan = 4;</code>
   *
   * @return The fullScan.
   */
  boolean getFullScan();
}
