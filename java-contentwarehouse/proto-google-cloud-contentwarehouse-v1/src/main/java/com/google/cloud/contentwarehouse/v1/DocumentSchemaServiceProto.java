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
// source: google/cloud/contentwarehouse/v1/document_schema_service.proto

package com.google.cloud.contentwarehouse.v1;

public final class DocumentSchemaServiceProto {
  private DocumentSchemaServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_CreateDocumentSchemaRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_CreateDocumentSchemaRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_GetDocumentSchemaRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_GetDocumentSchemaRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_UpdateDocumentSchemaRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_UpdateDocumentSchemaRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_DeleteDocumentSchemaRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_DeleteDocumentSchemaRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_ListDocumentSchemasRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_ListDocumentSchemasRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_ListDocumentSchemasResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_ListDocumentSchemasResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n>google/cloud/contentwarehouse/v1/docum"
          + "ent_schema_service.proto\022 google.cloud.c"
          + "ontentwarehouse.v1\032\034google/api/annotatio"
          + "ns.proto\032\027google/api/client.proto\032\037googl"
          + "e/api/field_behavior.proto\032\031google/api/r"
          + "esource.proto\0326google/cloud/contentwareh"
          + "ouse/v1/document_schema.proto\032\033google/pr"
          + "otobuf/empty.proto\"\257\001\n\033CreateDocumentSch"
          + "emaRequest\022@\n\006parent\030\001 \001(\tB0\340A\002\372A*\n(cont"
          + "entwarehouse.googleapis.com/Location\022N\n\017"
          + "document_schema\030\002 \001(\01320.google.cloud.con"
          + "tentwarehouse.v1.DocumentSchemaB\003\340A\002\"`\n\030"
          + "GetDocumentSchemaRequest\022D\n\004name\030\001 \001(\tB6"
          + "\340A\002\372A0\n.contentwarehouse.googleapis.com/"
          + "DocumentSchema\"\263\001\n\033UpdateDocumentSchemaR"
          + "equest\022D\n\004name\030\001 \001(\tB6\340A\002\372A0\n.contentwar"
          + "ehouse.googleapis.com/DocumentSchema\022N\n\017"
          + "document_schema\030\002 \001(\01320.google.cloud.con"
          + "tentwarehouse.v1.DocumentSchemaB\003\340A\002\"c\n\033"
          + "DeleteDocumentSchemaRequest\022D\n\004name\030\001 \001("
          + "\tB6\340A\002\372A0\n.contentwarehouse.googleapis.c"
          + "om/DocumentSchema\"\205\001\n\032ListDocumentSchema"
          + "sRequest\022@\n\006parent\030\001 \001(\tB0\340A\002\372A*\n(conten"
          + "twarehouse.googleapis.com/Location\022\021\n\tpa"
          + "ge_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"\202\001\n\033Li"
          + "stDocumentSchemasResponse\022J\n\020document_sc"
          + "hemas\030\001 \003(\01320.google.cloud.contentwareho"
          + "use.v1.DocumentSchema\022\027\n\017next_page_token"
          + "\030\002 \001(\t2\225\t\n\025DocumentSchemaService\022\356\001\n\024Cre"
          + "ateDocumentSchema\022=.google.cloud.content"
          + "warehouse.v1.CreateDocumentSchemaRequest"
          + "\0320.google.cloud.contentwarehouse.v1.Docu"
          + "mentSchema\"e\202\323\344\223\002F\"3/v1/{parent=projects"
          + "/*/locations/*}/documentSchemas:\017documen"
          + "t_schema\332A\026parent,document_schema\022\336\001\n\024Up"
          + "dateDocumentSchema\022=.google.cloud.conten"
          + "twarehouse.v1.UpdateDocumentSchemaReques"
          + "t\0320.google.cloud.contentwarehouse.v1.Doc"
          + "umentSchema\"U\202\323\344\223\002823/v1/{name=projects/"
          + "*/locations/*/documentSchemas/*}:\001*\332A\024na"
          + "me,document_schema\022\305\001\n\021GetDocumentSchema"
          + "\022:.google.cloud.contentwarehouse.v1.GetD"
          + "ocumentSchemaRequest\0320.google.cloud.cont"
          + "entwarehouse.v1.DocumentSchema\"B\202\323\344\223\0025\0223"
          + "/v1/{name=projects/*/locations/*/documen"
          + "tSchemas/*}\332A\004name\022\261\001\n\024DeleteDocumentSch"
          + "ema\022=.google.cloud.contentwarehouse.v1.D"
          + "eleteDocumentSchemaRequest\032\026.google.prot"
          + "obuf.Empty\"B\202\323\344\223\0025*3/v1/{name=projects/*"
          + "/locations/*/documentSchemas/*}\332A\004name\022\330"
          + "\001\n\023ListDocumentSchemas\022<.google.cloud.co"
          + "ntentwarehouse.v1.ListDocumentSchemasReq"
          + "uest\032=.google.cloud.contentwarehouse.v1."
          + "ListDocumentSchemasResponse\"D\202\323\344\223\0025\0223/v1"
          + "/{parent=projects/*/locations/*}/documen"
          + "tSchemas\332A\006parent\032S\312A\037contentwarehouse.g"
          + "oogleapis.com\322A.https://www.googleapis.c"
          + "om/auth/cloud-platformB\226\001\n$com.google.cl"
          + "oud.contentwarehouse.v1B\032DocumentSchemaS"
          + "erviceProtoP\001ZPcloud.google.com/go/conte"
          + "ntwarehouse/apiv1/contentwarehousepb;con"
          + "tentwarehousepbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.contentwarehouse.v1.DocumentSchemaProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
            });
    internal_static_google_cloud_contentwarehouse_v1_CreateDocumentSchemaRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_contentwarehouse_v1_CreateDocumentSchemaRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_CreateDocumentSchemaRequest_descriptor,
            new java.lang.String[] {
              "Parent", "DocumentSchema",
            });
    internal_static_google_cloud_contentwarehouse_v1_GetDocumentSchemaRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_contentwarehouse_v1_GetDocumentSchemaRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_GetDocumentSchemaRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_contentwarehouse_v1_UpdateDocumentSchemaRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_contentwarehouse_v1_UpdateDocumentSchemaRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_UpdateDocumentSchemaRequest_descriptor,
            new java.lang.String[] {
              "Name", "DocumentSchema",
            });
    internal_static_google_cloud_contentwarehouse_v1_DeleteDocumentSchemaRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_contentwarehouse_v1_DeleteDocumentSchemaRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_DeleteDocumentSchemaRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_contentwarehouse_v1_ListDocumentSchemasRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_contentwarehouse_v1_ListDocumentSchemasRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_ListDocumentSchemasRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_contentwarehouse_v1_ListDocumentSchemasResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_contentwarehouse_v1_ListDocumentSchemasResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_ListDocumentSchemasResponse_descriptor,
            new java.lang.String[] {
              "DocumentSchemas", "NextPageToken",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.contentwarehouse.v1.DocumentSchemaProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
