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
// source: google/cloud/channel/v1/service.proto

package com.google.cloud.channel.v1;

public interface ChangeRenewalSettingsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.ChangeRenewalSettingsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the entitlement to update.
   * The name takes the format:
   * accounts/{account_id}/customers/{customer_id}/entitlements/{entitlement_id}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The name of the entitlement to update.
   * The name takes the format:
   * accounts/{account_id}/customers/{customer_id}/entitlements/{entitlement_id}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. New renewal settings.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.RenewalSettings renewal_settings = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the renewalSettings field is set.
   */
  boolean hasRenewalSettings();
  /**
   *
   *
   * <pre>
   * Required. New renewal settings.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.RenewalSettings renewal_settings = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The renewalSettings.
   */
  com.google.cloud.channel.v1.RenewalSettings getRenewalSettings();
  /**
   *
   *
   * <pre>
   * Required. New renewal settings.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.RenewalSettings renewal_settings = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.channel.v1.RenewalSettingsOrBuilder getRenewalSettingsOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. A request ID to identify requests. Specify a unique request ID so
   * that if you must retry your request, the server will know to ignore the
   * request if it has already been completed.
   * For example, consider a situation where you make an initial request and
   * the request times out. If you make the request again with the same
   * request ID, the server can check if the original operation with the same
   * request ID was received, and if so, will ignore the second request.
   * The request ID must be a valid [UUID](https://tools.ietf.org/html/rfc4122)
   * with the exception that zero UUID is not supported
   * (`00000000-0000-0000-0000-000000000000`).
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
   * Optional. A request ID to identify requests. Specify a unique request ID so
   * that if you must retry your request, the server will know to ignore the
   * request if it has already been completed.
   * For example, consider a situation where you make an initial request and
   * the request times out. If you make the request again with the same
   * request ID, the server can check if the original operation with the same
   * request ID was received, and if so, will ignore the second request.
   * The request ID must be a valid [UUID](https://tools.ietf.org/html/rfc4122)
   * with the exception that zero UUID is not supported
   * (`00000000-0000-0000-0000-000000000000`).
   * </pre>
   *
   * <code>string request_id = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString getRequestIdBytes();
}
