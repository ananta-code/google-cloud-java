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
// source: google/cloud/bigquery/migration/v2/migration_metrics.proto

package com.google.cloud.bigquery.migration.v2;

public final class MigrationMetricsProto {
  private MigrationMetricsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_migration_v2_TimeSeries_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_migration_v2_TimeSeries_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_migration_v2_Point_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_migration_v2_Point_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_migration_v2_TimeInterval_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_migration_v2_TimeInterval_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_migration_v2_TypedValue_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_migration_v2_TypedValue_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n:google/cloud/bigquery/migration/v2/mig"
          + "ration_metrics.proto\022\"google.cloud.bigqu"
          + "ery.migration.v2\032\035google/api/distributio"
          + "n.proto\032\037google/api/field_behavior.proto"
          + "\032\027google/api/metric.proto\032\037google/protob"
          + "uf/timestamp.proto\"\345\001\n\nTimeSeries\022\023\n\006met"
          + "ric\030\001 \001(\tB\003\340A\002\022?\n\nvalue_type\030\002 \001(\0162&.goo"
          + "gle.api.MetricDescriptor.ValueTypeB\003\340A\002\022"
          + "A\n\013metric_kind\030\003 \001(\0162\'.google.api.Metric"
          + "Descriptor.MetricKindB\003\340A\001\022>\n\006points\030\004 \003"
          + "(\0132).google.cloud.bigquery.migration.v2."
          + "PointB\003\340A\002\"\212\001\n\005Point\022B\n\010interval\030\001 \001(\01320"
          + ".google.cloud.bigquery.migration.v2.Time"
          + "Interval\022=\n\005value\030\002 \001(\0132..google.cloud.b"
          + "igquery.migration.v2.TypedValue\"v\n\014TimeI"
          + "nterval\0223\n\nstart_time\030\001 \001(\0132\032.google.pro"
          + "tobuf.TimestampB\003\340A\001\0221\n\010end_time\030\002 \001(\0132\032"
          + ".google.protobuf.TimestampB\003\340A\002\"\252\001\n\nType"
          + "dValue\022\024\n\nbool_value\030\001 \001(\010H\000\022\025\n\013int64_va"
          + "lue\030\002 \001(\003H\000\022\026\n\014double_value\030\003 \001(\001H\000\022\026\n\014s"
          + "tring_value\030\004 \001(\tH\000\0226\n\022distribution_valu"
          + "e\030\005 \001(\0132\030.google.api.DistributionH\000B\007\n\005v"
          + "alueB\321\001\n&com.google.cloud.bigquery.migra"
          + "tion.v2B\025MigrationMetricsProtoP\001ZDcloud."
          + "google.com/go/bigquery/migration/apiv2/m"
          + "igrationpb;migrationpb\252\002\"Google.Cloud.Bi"
          + "gQuery.Migration.V2\312\002\"Google\\Cloud\\BigQu"
          + "ery\\Migration\\V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.DistributionProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.MetricProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_bigquery_migration_v2_TimeSeries_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_bigquery_migration_v2_TimeSeries_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_migration_v2_TimeSeries_descriptor,
            new java.lang.String[] {
              "Metric", "ValueType", "MetricKind", "Points",
            });
    internal_static_google_cloud_bigquery_migration_v2_Point_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_bigquery_migration_v2_Point_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_migration_v2_Point_descriptor,
            new java.lang.String[] {
              "Interval", "Value",
            });
    internal_static_google_cloud_bigquery_migration_v2_TimeInterval_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_bigquery_migration_v2_TimeInterval_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_migration_v2_TimeInterval_descriptor,
            new java.lang.String[] {
              "StartTime", "EndTime",
            });
    internal_static_google_cloud_bigquery_migration_v2_TypedValue_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_bigquery_migration_v2_TypedValue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_migration_v2_TypedValue_descriptor,
            new java.lang.String[] {
              "BoolValue", "Int64Value", "DoubleValue", "StringValue", "DistributionValue", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.DistributionProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.MetricProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
