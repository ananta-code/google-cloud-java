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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface SSLHealthCheckOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.SSLHealthCheck)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The TCP port number for the health check request. The default value is 443. Valid values are 1 through 65535.
   * </pre>
   *
   * <code>optional int32 port = 3446913;</code>
   *
   * @return Whether the port field is set.
   */
  boolean hasPort();
  /**
   *
   *
   * <pre>
   * The TCP port number for the health check request. The default value is 443. Valid values are 1 through 65535.
   * </pre>
   *
   * <code>optional int32 port = 3446913;</code>
   *
   * @return The port.
   */
  int getPort();

  /**
   *
   *
   * <pre>
   * Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined, port takes precedence.
   * </pre>
   *
   * <code>optional string port_name = 41534345;</code>
   *
   * @return Whether the portName field is set.
   */
  boolean hasPortName();
  /**
   *
   *
   * <pre>
   * Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined, port takes precedence.
   * </pre>
   *
   * <code>optional string port_name = 41534345;</code>
   *
   * @return The portName.
   */
  java.lang.String getPortName();
  /**
   *
   *
   * <pre>
   * Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined, port takes precedence.
   * </pre>
   *
   * <code>optional string port_name = 41534345;</code>
   *
   * @return The bytes for portName.
   */
  com.google.protobuf.ByteString getPortNameBytes();

  /**
   *
   *
   * <pre>
   * Specifies how port is selected for health checking, can be one of following values: USE_FIXED_PORT: The port number in port is used for health checking. USE_NAMED_PORT: The portName is used for health checking. USE_SERVING_PORT: For NetworkEndpointGroup, the port specified for each network endpoint is used for health checking. For other backends, the port or named port specified in the Backend Service is used for health checking. If not specified, SSL health check follows behavior specified in port and portName fields.
   * Check the PortSpecification enum for the list of possible values.
   * </pre>
   *
   * <code>optional string port_specification = 51590597;</code>
   *
   * @return Whether the portSpecification field is set.
   */
  boolean hasPortSpecification();
  /**
   *
   *
   * <pre>
   * Specifies how port is selected for health checking, can be one of following values: USE_FIXED_PORT: The port number in port is used for health checking. USE_NAMED_PORT: The portName is used for health checking. USE_SERVING_PORT: For NetworkEndpointGroup, the port specified for each network endpoint is used for health checking. For other backends, the port or named port specified in the Backend Service is used for health checking. If not specified, SSL health check follows behavior specified in port and portName fields.
   * Check the PortSpecification enum for the list of possible values.
   * </pre>
   *
   * <code>optional string port_specification = 51590597;</code>
   *
   * @return The portSpecification.
   */
  java.lang.String getPortSpecification();
  /**
   *
   *
   * <pre>
   * Specifies how port is selected for health checking, can be one of following values: USE_FIXED_PORT: The port number in port is used for health checking. USE_NAMED_PORT: The portName is used for health checking. USE_SERVING_PORT: For NetworkEndpointGroup, the port specified for each network endpoint is used for health checking. For other backends, the port or named port specified in the Backend Service is used for health checking. If not specified, SSL health check follows behavior specified in port and portName fields.
   * Check the PortSpecification enum for the list of possible values.
   * </pre>
   *
   * <code>optional string port_specification = 51590597;</code>
   *
   * @return The bytes for portSpecification.
   */
  com.google.protobuf.ByteString getPortSpecificationBytes();

  /**
   *
   *
   * <pre>
   * Specifies the type of proxy header to append before sending data to the backend, either NONE or PROXY_V1. The default is NONE.
   * Check the ProxyHeader enum for the list of possible values.
   * </pre>
   *
   * <code>optional string proxy_header = 160374142;</code>
   *
   * @return Whether the proxyHeader field is set.
   */
  boolean hasProxyHeader();
  /**
   *
   *
   * <pre>
   * Specifies the type of proxy header to append before sending data to the backend, either NONE or PROXY_V1. The default is NONE.
   * Check the ProxyHeader enum for the list of possible values.
   * </pre>
   *
   * <code>optional string proxy_header = 160374142;</code>
   *
   * @return The proxyHeader.
   */
  java.lang.String getProxyHeader();
  /**
   *
   *
   * <pre>
   * Specifies the type of proxy header to append before sending data to the backend, either NONE or PROXY_V1. The default is NONE.
   * Check the ProxyHeader enum for the list of possible values.
   * </pre>
   *
   * <code>optional string proxy_header = 160374142;</code>
   *
   * @return The bytes for proxyHeader.
   */
  com.google.protobuf.ByteString getProxyHeaderBytes();

  /**
   *
   *
   * <pre>
   * The application data to send once the SSL connection has been established (default value is empty). If both request and response are empty, the connection establishment alone will indicate health. The request data can only be ASCII.
   * </pre>
   *
   * <code>optional string request = 21951119;</code>
   *
   * @return Whether the request field is set.
   */
  boolean hasRequest();
  /**
   *
   *
   * <pre>
   * The application data to send once the SSL connection has been established (default value is empty). If both request and response are empty, the connection establishment alone will indicate health. The request data can only be ASCII.
   * </pre>
   *
   * <code>optional string request = 21951119;</code>
   *
   * @return The request.
   */
  java.lang.String getRequest();
  /**
   *
   *
   * <pre>
   * The application data to send once the SSL connection has been established (default value is empty). If both request and response are empty, the connection establishment alone will indicate health. The request data can only be ASCII.
   * </pre>
   *
   * <code>optional string request = 21951119;</code>
   *
   * @return The bytes for request.
   */
  com.google.protobuf.ByteString getRequestBytes();

  /**
   *
   *
   * <pre>
   * The bytes to match against the beginning of the response data. If left empty (the default value), any response will indicate health. The response data can only be ASCII.
   * </pre>
   *
   * <code>optional string response = 196547649;</code>
   *
   * @return Whether the response field is set.
   */
  boolean hasResponse();
  /**
   *
   *
   * <pre>
   * The bytes to match against the beginning of the response data. If left empty (the default value), any response will indicate health. The response data can only be ASCII.
   * </pre>
   *
   * <code>optional string response = 196547649;</code>
   *
   * @return The response.
   */
  java.lang.String getResponse();
  /**
   *
   *
   * <pre>
   * The bytes to match against the beginning of the response data. If left empty (the default value), any response will indicate health. The response data can only be ASCII.
   * </pre>
   *
   * <code>optional string response = 196547649;</code>
   *
   * @return The bytes for response.
   */
  com.google.protobuf.ByteString getResponseBytes();
}
