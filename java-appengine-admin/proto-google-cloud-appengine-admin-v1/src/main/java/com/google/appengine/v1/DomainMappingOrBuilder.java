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
// source: google/appengine/v1/domain_mapping.proto

package com.google.appengine.v1;

public interface DomainMappingOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.appengine.v1.DomainMapping)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Full path to the `DomainMapping` resource in the API. Example:
   * `apps/myapp/domainMapping/example.com`.
   *
   * &#64;OutputOnly
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Full path to the `DomainMapping` resource in the API. Example:
   * `apps/myapp/domainMapping/example.com`.
   *
   * &#64;OutputOnly
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Relative name of the domain serving the application. Example:
   * `example.com`.
   * </pre>
   *
   * <code>string id = 2;</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * Relative name of the domain serving the application. Example:
   * `example.com`.
   * </pre>
   *
   * <code>string id = 2;</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * SSL configuration for this domain. If unconfigured, this domain will not
   * serve with SSL.
   * </pre>
   *
   * <code>.google.appengine.v1.SslSettings ssl_settings = 3;</code>
   *
   * @return Whether the sslSettings field is set.
   */
  boolean hasSslSettings();
  /**
   *
   *
   * <pre>
   * SSL configuration for this domain. If unconfigured, this domain will not
   * serve with SSL.
   * </pre>
   *
   * <code>.google.appengine.v1.SslSettings ssl_settings = 3;</code>
   *
   * @return The sslSettings.
   */
  com.google.appengine.v1.SslSettings getSslSettings();
  /**
   *
   *
   * <pre>
   * SSL configuration for this domain. If unconfigured, this domain will not
   * serve with SSL.
   * </pre>
   *
   * <code>.google.appengine.v1.SslSettings ssl_settings = 3;</code>
   */
  com.google.appengine.v1.SslSettingsOrBuilder getSslSettingsOrBuilder();

  /**
   *
   *
   * <pre>
   * The resource records required to configure this domain mapping. These
   * records must be added to the domain's DNS configuration in order to
   * serve the application via this domain mapping.
   *
   * &#64;OutputOnly
   * </pre>
   *
   * <code>repeated .google.appengine.v1.ResourceRecord resource_records = 4;</code>
   */
  java.util.List<com.google.appengine.v1.ResourceRecord> getResourceRecordsList();
  /**
   *
   *
   * <pre>
   * The resource records required to configure this domain mapping. These
   * records must be added to the domain's DNS configuration in order to
   * serve the application via this domain mapping.
   *
   * &#64;OutputOnly
   * </pre>
   *
   * <code>repeated .google.appengine.v1.ResourceRecord resource_records = 4;</code>
   */
  com.google.appengine.v1.ResourceRecord getResourceRecords(int index);
  /**
   *
   *
   * <pre>
   * The resource records required to configure this domain mapping. These
   * records must be added to the domain's DNS configuration in order to
   * serve the application via this domain mapping.
   *
   * &#64;OutputOnly
   * </pre>
   *
   * <code>repeated .google.appengine.v1.ResourceRecord resource_records = 4;</code>
   */
  int getResourceRecordsCount();
  /**
   *
   *
   * <pre>
   * The resource records required to configure this domain mapping. These
   * records must be added to the domain's DNS configuration in order to
   * serve the application via this domain mapping.
   *
   * &#64;OutputOnly
   * </pre>
   *
   * <code>repeated .google.appengine.v1.ResourceRecord resource_records = 4;</code>
   */
  java.util.List<? extends com.google.appengine.v1.ResourceRecordOrBuilder>
      getResourceRecordsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The resource records required to configure this domain mapping. These
   * records must be added to the domain's DNS configuration in order to
   * serve the application via this domain mapping.
   *
   * &#64;OutputOnly
   * </pre>
   *
   * <code>repeated .google.appengine.v1.ResourceRecord resource_records = 4;</code>
   */
  com.google.appengine.v1.ResourceRecordOrBuilder getResourceRecordsOrBuilder(int index);
}
