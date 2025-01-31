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
// source: google/cloud/dialogflow/cx/v3/agent.proto

package com.google.cloud.dialogflow.cx.v3;

public final class AgentProto {
  private AgentProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_SpeechToTextSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_SpeechToTextSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_Agent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_Agent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_Agent_GitIntegrationSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_Agent_GitIntegrationSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_Agent_GitIntegrationSettings_GithubSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_Agent_GitIntegrationSettings_GithubSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_ListAgentsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ListAgentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_ListAgentsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ListAgentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_GetAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_GetAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_CreateAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_CreateAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_UpdateAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_UpdateAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_DeleteAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_DeleteAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_ExportAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ExportAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_ExportAgentRequest_GitDestination_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ExportAgentRequest_GitDestination_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_ExportAgentResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ExportAgentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_RestoreAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_RestoreAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_RestoreAgentRequest_GitSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_RestoreAgentRequest_GitSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_ValidateAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ValidateAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_GetAgentValidationResultRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_GetAgentValidationResultRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_AgentValidationResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_AgentValidationResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n)google/cloud/dialogflow/cx/v3/agent.pr"
          + "oto\022\035google.cloud.dialogflow.cx.v3\032\034goog"
          + "le/api/annotations.proto\032\027google/api/cli"
          + "ent.proto\032\037google/api/field_behavior.pro"
          + "to\032\031google/api/resource.proto\0325google/cl"
          + "oud/dialogflow/cx/v3/advanced_settings.p"
          + "roto\0320google/cloud/dialogflow/cx/v3/audi"
          + "o_config.proto\032(google/cloud/dialogflow/"
          + "cx/v3/flow.proto\032#google/longrunning/ope"
          + "rations.proto\032\033google/protobuf/empty.pro"
          + "to\032 google/protobuf/field_mask.proto\032\034go"
          + "ogle/protobuf/struct.proto\"8\n\024SpeechToTe"
          + "xtSettings\022 \n\030enable_speech_adaptation\030\001"
          + " \001(\010\"\345\010\n\005Agent\022\014\n\004name\030\001 \001(\t\022\032\n\014display_"
          + "name\030\002 \001(\tB\004\342A\001\002\022$\n\025default_language_cod"
          + "e\030\003 \001(\tB\005\342A\002\002\005\022 \n\030supported_language_cod"
          + "es\030\004 \003(\t\022\027\n\ttime_zone\030\005 \001(\tB\004\342A\001\002\022\023\n\013des"
          + "cription\030\006 \001(\t\022\022\n\navatar_uri\030\007 \001(\t\022T\n\027sp"
          + "eech_to_text_settings\030\r \001(\01323.google.clo"
          + "ud.dialogflow.cx.v3.SpeechToTextSettings"
          + "\022;\n\nstart_flow\030\020 \001(\tB\'\342A\001\005\372A \n\036dialogflo"
          + "w.googleapis.com/Flow\022J\n\021security_settin"
          + "gs\030\021 \001(\tB/\372A,\n*dialogflow.googleapis.com"
          + "/SecuritySettings\022&\n\032enable_stackdriver_"
          + "logging\030\022 \001(\010B\002\030\001\022\037\n\027enable_spell_correc"
          + "tion\030\024 \001(\010\022\016\n\006locked\030\033 \001(\010\022J\n\021advanced_s"
          + "ettings\030\026 \001(\0132/.google.cloud.dialogflow."
          + "cx.v3.AdvancedSettings\022]\n\030git_integratio"
          + "n_settings\030\036 \001(\0132;.google.cloud.dialogfl"
          + "ow.cx.v3.Agent.GitIntegrationSettings\022T\n"
          + "\027text_to_speech_settings\030\037 \001(\01323.google."
          + "cloud.dialogflow.cx.v3.TextToSpeechSetti"
          + "ngs\032\220\002\n\026GitIntegrationSettings\022e\n\017github"
          + "_settings\030\001 \001(\0132J.google.cloud.dialogflo"
          + "w.cx.v3.Agent.GitIntegrationSettings.Git"
          + "hubSettingsH\000\032\177\n\016GithubSettings\022\024\n\014displ"
          + "ay_name\030\001 \001(\t\022\026\n\016repository_uri\030\002 \001(\t\022\027\n"
          + "\017tracking_branch\030\003 \001(\t\022\024\n\014access_token\030\004"
          + " \001(\t\022\020\n\010branches\030\005 \003(\tB\016\n\014git_settings:\\"
          + "\352AY\n\037dialogflow.googleapis.com/Agent\0226pr"
          + "ojects/{project}/locations/{location}/ag"
          + "ents/{agent}\"t\n\021ListAgentsRequest\0228\n\006par"
          + "ent\030\001 \001(\tB(\342A\001\002\372A!\022\037dialogflow.googleapi"
          + "s.com/Agent\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_t"
          + "oken\030\003 \001(\t\"c\n\022ListAgentsResponse\0224\n\006agen"
          + "ts\030\001 \003(\0132$.google.cloud.dialogflow.cx.v3"
          + ".Agent\022\027\n\017next_page_token\030\002 \001(\t\"I\n\017GetAg"
          + "entRequest\0226\n\004name\030\001 \001(\tB(\342A\001\002\372A!\n\037dialo"
          + "gflow.googleapis.com/Agent\"\211\001\n\022CreateAge"
          + "ntRequest\0228\n\006parent\030\001 \001(\tB(\342A\001\002\372A!\022\037dial"
          + "ogflow.googleapis.com/Agent\0229\n\005agent\030\002 \001"
          + "(\0132$.google.cloud.dialogflow.cx.v3.Agent"
          + "B\004\342A\001\002\"\200\001\n\022UpdateAgentRequest\0229\n\005agent\030\001"
          + " \001(\0132$.google.cloud.dialogflow.cx.v3.Age"
          + "ntB\004\342A\001\002\022/\n\013update_mask\030\002 \001(\0132\032.google.p"
          + "rotobuf.FieldMask\"L\n\022DeleteAgentRequest\022"
          + "6\n\004name\030\001 \001(\tB(\342A\001\002\372A!\n\037dialogflow.googl"
          + "eapis.com/Agent\"\236\004\n\022ExportAgentRequest\0226"
          + "\n\004name\030\001 \001(\tB(\342A\001\002\372A!\n\037dialogflow.google"
          + "apis.com/Agent\022\027\n\tagent_uri\030\002 \001(\tB\004\342A\001\001\022"
          + "W\n\013data_format\030\003 \001(\0162<.google.cloud.dial"
          + "ogflow.cx.v3.ExportAgentRequest.DataForm"
          + "atB\004\342A\001\001\022C\n\013environment\030\005 \001(\tB.\342A\001\001\372A\'\n%"
          + "dialogflow.googleapis.com/Environment\022_\n"
          + "\017git_destination\030\006 \001(\0132@.google.cloud.di"
          + "alogflow.cx.v3.ExportAgentRequest.GitDes"
          + "tinationB\004\342A\001\001\022.\n include_bigquery_expor"
          + "t_settings\030\007 \001(\010B\004\342A\001\001\032A\n\016GitDestination"
          + "\022\027\n\017tracking_branch\030\001 \001(\t\022\026\n\016commit_mess"
          + "age\030\002 \001(\t\"E\n\nDataFormat\022\033\n\027DATA_FORMAT_U"
          + "NSPECIFIED\020\000\022\010\n\004BLOB\020\001\022\020\n\014JSON_PACKAGE\020\004"
          + "\"b\n\023ExportAgentResponse\022\023\n\tagent_uri\030\001 \001"
          + "(\tH\000\022\027\n\ragent_content\030\002 \001(\014H\000\022\024\n\ncommit_"
          + "sha\030\003 \001(\tH\000B\007\n\005agent\"\241\003\n\023RestoreAgentReq"
          + "uest\0226\n\004name\030\001 \001(\tB(\342A\001\002\372A!\n\037dialogflow."
          + "googleapis.com/Agent\022\023\n\tagent_uri\030\002 \001(\tH"
          + "\000\022\027\n\ragent_content\030\003 \001(\014H\000\022R\n\ngit_source"
          + "\030\006 \001(\0132<.google.cloud.dialogflow.cx.v3.R"
          + "estoreAgentRequest.GitSourceH\000\022X\n\016restor"
          + "e_option\030\005 \001(\0162@.google.cloud.dialogflow"
          + ".cx.v3.RestoreAgentRequest.RestoreOption"
          + "\032$\n\tGitSource\022\027\n\017tracking_branch\030\001 \001(\t\"G"
          + "\n\rRestoreOption\022\036\n\032RESTORE_OPTION_UNSPEC"
          + "IFIED\020\000\022\010\n\004KEEP\020\001\022\014\n\010FALLBACK\020\002B\007\n\005agent"
          + "\"e\n\024ValidateAgentRequest\0226\n\004name\030\001 \001(\tB("
          + "\342A\001\002\372A!\n\037dialogflow.googleapis.com/Agent"
          + "\022\025\n\rlanguage_code\030\002 \001(\t\"\200\001\n\037GetAgentVali"
          + "dationResultRequest\022F\n\004name\030\001 \001(\tB8\342A\001\002\372"
          + "A1\n/dialogflow.googleapis.com/AgentValid"
          + "ationResult\022\025\n\rlanguage_code\030\002 \001(\t\"\372\001\n\025A"
          + "gentValidationResult\022\014\n\004name\030\001 \001(\t\022T\n\027fl"
          + "ow_validation_results\030\002 \003(\01323.google.clo"
          + "ud.dialogflow.cx.v3.FlowValidationResult"
          + ":}\352Az\n/dialogflow.googleapis.com/AgentVa"
          + "lidationResult\022Gprojects/{project}/locat"
          + "ions/{location}/agents/{agent}/validatio"
          + "nResult2\231\016\n\006Agents\022\256\001\n\nListAgents\0220.goog"
          + "le.cloud.dialogflow.cx.v3.ListAgentsRequ"
          + "est\0321.google.cloud.dialogflow.cx.v3.List"
          + "AgentsResponse\";\332A\006parent\202\323\344\223\002,\022*/v3/{pa"
          + "rent=projects/*/locations/*}/agents\022\233\001\n\010"
          + "GetAgent\022..google.cloud.dialogflow.cx.v3"
          + ".GetAgentRequest\032$.google.cloud.dialogfl"
          + "ow.cx.v3.Agent\"9\332A\004name\202\323\344\223\002,\022*/v3/{name"
          + "=projects/*/locations/*/agents/*}\022\260\001\n\013Cr"
          + "eateAgent\0221.google.cloud.dialogflow.cx.v"
          + "3.CreateAgentRequest\032$.google.cloud.dial"
          + "ogflow.cx.v3.Agent\"H\332A\014parent,agent\202\323\344\223\002"
          + "3\"*/v3/{parent=projects/*/locations/*}/a"
          + "gents:\005agent\022\273\001\n\013UpdateAgent\0221.google.cl"
          + "oud.dialogflow.cx.v3.UpdateAgentRequest\032"
          + "$.google.cloud.dialogflow.cx.v3.Agent\"S\332"
          + "A\021agent,update_mask\202\323\344\223\002920/v3/{agent.na"
          + "me=projects/*/locations/*/agents/*}:\005age"
          + "nt\022\223\001\n\013DeleteAgent\0221.google.cloud.dialog"
          + "flow.cx.v3.DeleteAgentRequest\032\026.google.p"
          + "rotobuf.Empty\"9\332A\004name\202\323\344\223\002,**/v3/{name="
          + "projects/*/locations/*/agents/*}\022\315\001\n\013Exp"
          + "ortAgent\0221.google.cloud.dialogflow.cx.v3"
          + ".ExportAgentRequest\032\035.google.longrunning"
          + ".Operation\"l\312A-\n\023ExportAgentResponse\022\026go"
          + "ogle.protobuf.Struct\202\323\344\223\0026\"1/v3/{name=pr"
          + "ojects/*/locations/*/agents/*}:export:\001*"
          + "\022\322\001\n\014RestoreAgent\0222.google.cloud.dialogf"
          + "low.cx.v3.RestoreAgentRequest\032\035.google.l"
          + "ongrunning.Operation\"o\312A/\n\025google.protob"
          + "uf.Empty\022\026google.protobuf.Struct\202\323\344\223\0027\"2"
          + "/v3/{name=projects/*/locations/*/agents/"
          + "*}:restore:\001*\022\272\001\n\rValidateAgent\0223.google"
          + ".cloud.dialogflow.cx.v3.ValidateAgentReq"
          + "uest\0324.google.cloud.dialogflow.cx.v3.Age"
          + "ntValidationResult\">\202\323\344\223\0028\"3/v3/{name=pr"
          + "ojects/*/locations/*/agents/*}:validate:"
          + "\001*\022\334\001\n\030GetAgentValidationResult\022>.google"
          + ".cloud.dialogflow.cx.v3.GetAgentValidati"
          + "onResultRequest\0324.google.cloud.dialogflo"
          + "w.cx.v3.AgentValidationResult\"J\332A\004name\202\323"
          + "\344\223\002=\022;/v3/{name=projects/*/locations/*/a"
          + "gents/*/validationResult}\032x\312A\031dialogflow"
          + ".googleapis.com\322AYhttps://www.googleapis"
          + ".com/auth/cloud-platform,https://www.goo"
          + "gleapis.com/auth/dialogflowB\260\001\n!com.goog"
          + "le.cloud.dialogflow.cx.v3B\nAgentProtoP\001Z"
          + "1cloud.google.com/go/dialogflow/cx/apiv3"
          + "/cxpb;cxpb\370\001\001\242\002\002DF\252\002\035Google.Cloud.Dialog"
          + "flow.Cx.V3\352\002!Google::Cloud::Dialogflow::"
          + "CX::V3b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.dialogflow.cx.v3.AdvancedSettingsProto.getDescriptor(),
              com.google.cloud.dialogflow.cx.v3.AudioConfigProto.getDescriptor(),
              com.google.cloud.dialogflow.cx.v3.FlowProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_cx_v3_SpeechToTextSettings_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3_SpeechToTextSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_SpeechToTextSettings_descriptor,
            new java.lang.String[] {
              "EnableSpeechAdaptation",
            });
    internal_static_google_cloud_dialogflow_cx_v3_Agent_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3_Agent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_Agent_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "DefaultLanguageCode",
              "SupportedLanguageCodes",
              "TimeZone",
              "Description",
              "AvatarUri",
              "SpeechToTextSettings",
              "StartFlow",
              "SecuritySettings",
              "EnableStackdriverLogging",
              "EnableSpellCorrection",
              "Locked",
              "AdvancedSettings",
              "GitIntegrationSettings",
              "TextToSpeechSettings",
            });
    internal_static_google_cloud_dialogflow_cx_v3_Agent_GitIntegrationSettings_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_Agent_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3_Agent_GitIntegrationSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_Agent_GitIntegrationSettings_descriptor,
            new java.lang.String[] {
              "GithubSettings", "GitSettings",
            });
    internal_static_google_cloud_dialogflow_cx_v3_Agent_GitIntegrationSettings_GithubSettings_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_Agent_GitIntegrationSettings_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3_Agent_GitIntegrationSettings_GithubSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_Agent_GitIntegrationSettings_GithubSettings_descriptor,
            new java.lang.String[] {
              "DisplayName", "RepositoryUri", "TrackingBranch", "AccessToken", "Branches",
            });
    internal_static_google_cloud_dialogflow_cx_v3_ListAgentsRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_cx_v3_ListAgentsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_ListAgentsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3_ListAgentsResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_cx_v3_ListAgentsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_ListAgentsResponse_descriptor,
            new java.lang.String[] {
              "Agents", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3_GetAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_cx_v3_GetAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_GetAgentRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_cx_v3_CreateAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_cx_v3_CreateAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_CreateAgentRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Agent",
            });
    internal_static_google_cloud_dialogflow_cx_v3_UpdateAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_cx_v3_UpdateAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_UpdateAgentRequest_descriptor,
            new java.lang.String[] {
              "Agent", "UpdateMask",
            });
    internal_static_google_cloud_dialogflow_cx_v3_DeleteAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_cx_v3_DeleteAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_DeleteAgentRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_cx_v3_ExportAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_cx_v3_ExportAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_ExportAgentRequest_descriptor,
            new java.lang.String[] {
              "Name",
              "AgentUri",
              "DataFormat",
              "Environment",
              "GitDestination",
              "IncludeBigqueryExportSettings",
            });
    internal_static_google_cloud_dialogflow_cx_v3_ExportAgentRequest_GitDestination_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_ExportAgentRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3_ExportAgentRequest_GitDestination_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_ExportAgentRequest_GitDestination_descriptor,
            new java.lang.String[] {
              "TrackingBranch", "CommitMessage",
            });
    internal_static_google_cloud_dialogflow_cx_v3_ExportAgentResponse_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dialogflow_cx_v3_ExportAgentResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_ExportAgentResponse_descriptor,
            new java.lang.String[] {
              "AgentUri", "AgentContent", "CommitSha", "Agent",
            });
    internal_static_google_cloud_dialogflow_cx_v3_RestoreAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_dialogflow_cx_v3_RestoreAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_RestoreAgentRequest_descriptor,
            new java.lang.String[] {
              "Name", "AgentUri", "AgentContent", "GitSource", "RestoreOption", "Agent",
            });
    internal_static_google_cloud_dialogflow_cx_v3_RestoreAgentRequest_GitSource_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_RestoreAgentRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3_RestoreAgentRequest_GitSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_RestoreAgentRequest_GitSource_descriptor,
            new java.lang.String[] {
              "TrackingBranch",
            });
    internal_static_google_cloud_dialogflow_cx_v3_ValidateAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_dialogflow_cx_v3_ValidateAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_ValidateAgentRequest_descriptor,
            new java.lang.String[] {
              "Name", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3_GetAgentValidationResultRequest_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_dialogflow_cx_v3_GetAgentValidationResultRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_GetAgentValidationResultRequest_descriptor,
            new java.lang.String[] {
              "Name", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3_AgentValidationResult_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_dialogflow_cx_v3_AgentValidationResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_AgentValidationResult_descriptor,
            new java.lang.String[] {
              "Name", "FlowValidationResults",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.dialogflow.cx.v3.AdvancedSettingsProto.getDescriptor();
    com.google.cloud.dialogflow.cx.v3.AudioConfigProto.getDescriptor();
    com.google.cloud.dialogflow.cx.v3.FlowProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
