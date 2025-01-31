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
// source: google/cloud/gaming/v1/common.proto

package com.google.cloud.gaming.v1;

public interface ScheduleOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gaming.v1.Schedule)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The start time of the event.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * The start time of the event.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   *
   *
   * <pre>
   * The start time of the event.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The end time of the event.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * The end time of the event.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   *
   *
   * <pre>
   * The end time of the event.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The duration for the cron job event. The duration of the event is effective
   * after the cron job's start time.
   * </pre>
   *
   * <code>.google.protobuf.Duration cron_job_duration = 3;</code>
   *
   * @return Whether the cronJobDuration field is set.
   */
  boolean hasCronJobDuration();
  /**
   *
   *
   * <pre>
   * The duration for the cron job event. The duration of the event is effective
   * after the cron job's start time.
   * </pre>
   *
   * <code>.google.protobuf.Duration cron_job_duration = 3;</code>
   *
   * @return The cronJobDuration.
   */
  com.google.protobuf.Duration getCronJobDuration();
  /**
   *
   *
   * <pre>
   * The duration for the cron job event. The duration of the event is effective
   * after the cron job's start time.
   * </pre>
   *
   * <code>.google.protobuf.Duration cron_job_duration = 3;</code>
   */
  com.google.protobuf.DurationOrBuilder getCronJobDurationOrBuilder();

  /**
   *
   *
   * <pre>
   * The cron definition of the scheduled event. See
   * https://en.wikipedia.org/wiki/Cron. Cron spec specifies the local time as
   * defined by the realm.
   * </pre>
   *
   * <code>string cron_spec = 4;</code>
   *
   * @return The cronSpec.
   */
  java.lang.String getCronSpec();
  /**
   *
   *
   * <pre>
   * The cron definition of the scheduled event. See
   * https://en.wikipedia.org/wiki/Cron. Cron spec specifies the local time as
   * defined by the realm.
   * </pre>
   *
   * <code>string cron_spec = 4;</code>
   *
   * @return The bytes for cronSpec.
   */
  com.google.protobuf.ByteString getCronSpecBytes();
}
