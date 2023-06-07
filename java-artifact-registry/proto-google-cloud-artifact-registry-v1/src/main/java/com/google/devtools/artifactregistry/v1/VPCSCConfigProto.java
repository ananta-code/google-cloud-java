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
// source: google/devtools/artifactregistry/v1/vpcsc_config.proto

package com.google.devtools.artifactregistry.v1;

public final class VPCSCConfigProto {
  private VPCSCConfigProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_VPCSCConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_VPCSCConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_GetVPCSCConfigRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_GetVPCSCConfigRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_UpdateVPCSCConfigRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_UpdateVPCSCConfigRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n6google/devtools/artifactregistry/v1/vp"
          + "csc_config.proto\022#google.devtools.artifa"
          + "ctregistry.v1\032\037google/api/field_behavior"
          + ".proto\032\031google/api/resource.proto\032 googl"
          + "e/protobuf/field_mask.proto\"\230\002\n\013VPCSCCon"
          + "fig\022\014\n\004name\030\001 \001(\t\022R\n\014vpcsc_policy\030\002 \001(\0162"
          + "<.google.devtools.artifactregistry.v1.VP"
          + "CSCConfig.VPCSCPolicy\"@\n\013VPCSCPolicy\022\034\n\030"
          + "VPCSC_POLICY_UNSPECIFIED\020\000\022\010\n\004DENY\020\001\022\t\n\005"
          + "ALLOW\020\002:e\352Ab\n+artifactregistry.googleapi"
          + "s.com/VpcscConfig\0223projects/{project}/lo"
          + "cations/{location}/vpcscConfig\"[\n\025GetVPC"
          + "SCConfigRequest\022B\n\004name\030\001 \001(\tB4\342A\001\002\372A-\n+"
          + "artifactregistry.googleapis.com/VpcscCon"
          + "fig\"\223\001\n\030UpdateVPCSCConfigRequest\022F\n\014vpcs"
          + "c_config\030\001 \001(\01320.google.devtools.artifac"
          + "tregistry.v1.VPCSCConfig\022/\n\013update_mask\030"
          + "\002 \001(\0132\032.google.protobuf.FieldMaskB\373\001\n\'co"
          + "m.google.devtools.artifactregistry.v1B\020V"
          + "PCSCConfigProtoP\001ZPcloud.google.com/go/a"
          + "rtifactregistry/apiv1/artifactregistrypb"
          + ";artifactregistrypb\252\002 Google.Cloud.Artif"
          + "actRegistry.V1\312\002 Google\\Cloud\\ArtifactRe"
          + "gistry\\V1\352\002#Google::Cloud::ArtifactRegis"
          + "try::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_devtools_artifactregistry_v1_VPCSCConfig_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_devtools_artifactregistry_v1_VPCSCConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_VPCSCConfig_descriptor,
            new java.lang.String[] {
              "Name", "VpcscPolicy",
            });
    internal_static_google_devtools_artifactregistry_v1_GetVPCSCConfigRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_devtools_artifactregistry_v1_GetVPCSCConfigRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_GetVPCSCConfigRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_devtools_artifactregistry_v1_UpdateVPCSCConfigRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_devtools_artifactregistry_v1_UpdateVPCSCConfigRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_UpdateVPCSCConfigRequest_descriptor,
            new java.lang.String[] {
              "VpcscConfig", "UpdateMask",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
