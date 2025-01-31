/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.gaming.v1beta;

import static com.google.cloud.gaming.v1beta.GameServerConfigsServiceClient.ListGameServerConfigsPagedResponse;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.testing.MockHttpService;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ApiException;
import com.google.api.gax.rpc.ApiExceptionFactory;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.testing.FakeStatusCode;
import com.google.cloud.gaming.v1beta.stub.HttpJsonGameServerConfigsServiceStub;
import com.google.common.collect.Lists;
import com.google.longrunning.Operation;
import com.google.protobuf.Any;
import com.google.protobuf.Empty;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import javax.annotation.Generated;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Generated("by gapic-generator-java")
public class GameServerConfigsServiceClientHttpJsonTest {
  private static MockHttpService mockService;
  private static GameServerConfigsServiceClient client;

  @BeforeClass
  public static void startStaticServer() throws IOException {
    mockService =
        new MockHttpService(
            HttpJsonGameServerConfigsServiceStub.getMethodDescriptors(),
            GameServerConfigsServiceSettings.getDefaultEndpoint());
    GameServerConfigsServiceSettings settings =
        GameServerConfigsServiceSettings.newHttpJsonBuilder()
            .setTransportChannelProvider(
                GameServerConfigsServiceSettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = GameServerConfigsServiceClient.create(settings);
  }

  @AfterClass
  public static void stopServer() {
    client.close();
  }

  @Before
  public void setUp() {}

  @After
  public void tearDown() throws Exception {
    mockService.reset();
  }

  @Test
  public void listGameServerConfigsTest() throws Exception {
    GameServerConfig responsesElement = GameServerConfig.newBuilder().build();
    ListGameServerConfigsResponse expectedResponse =
        ListGameServerConfigsResponse.newBuilder()
            .setNextPageToken("")
            .addAllGameServerConfigs(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    GameServerDeploymentName parent =
        GameServerDeploymentName.of("[PROJECT]", "[LOCATION]", "[DEPLOYMENT]");

    ListGameServerConfigsPagedResponse pagedListResponse = client.listGameServerConfigs(parent);

    List<GameServerConfig> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getGameServerConfigsList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void listGameServerConfigsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      GameServerDeploymentName parent =
          GameServerDeploymentName.of("[PROJECT]", "[LOCATION]", "[DEPLOYMENT]");
      client.listGameServerConfigs(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listGameServerConfigsTest2() throws Exception {
    GameServerConfig responsesElement = GameServerConfig.newBuilder().build();
    ListGameServerConfigsResponse expectedResponse =
        ListGameServerConfigsResponse.newBuilder()
            .setNextPageToken("")
            .addAllGameServerConfigs(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    String parent =
        "projects/project-6046/locations/location-6046/gameServerDeployments/gameServerDeployment-6046";

    ListGameServerConfigsPagedResponse pagedListResponse = client.listGameServerConfigs(parent);

    List<GameServerConfig> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getGameServerConfigsList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void listGameServerConfigsExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent =
          "projects/project-6046/locations/location-6046/gameServerDeployments/gameServerDeployment-6046";
      client.listGameServerConfigs(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getGameServerConfigTest() throws Exception {
    GameServerConfig expectedResponse =
        GameServerConfig.newBuilder()
            .setName(
                GameServerConfigName.of("[PROJECT]", "[LOCATION]", "[DEPLOYMENT]", "[CONFIG]")
                    .toString())
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .addAllFleetConfigs(new ArrayList<FleetConfig>())
            .addAllScalingConfigs(new ArrayList<ScalingConfig>())
            .setDescription("description-1724546052")
            .build();
    mockService.addResponse(expectedResponse);

    GameServerConfigName name =
        GameServerConfigName.of("[PROJECT]", "[LOCATION]", "[DEPLOYMENT]", "[CONFIG]");

    GameServerConfig actualResponse = client.getGameServerConfig(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void getGameServerConfigExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      GameServerConfigName name =
          GameServerConfigName.of("[PROJECT]", "[LOCATION]", "[DEPLOYMENT]", "[CONFIG]");
      client.getGameServerConfig(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getGameServerConfigTest2() throws Exception {
    GameServerConfig expectedResponse =
        GameServerConfig.newBuilder()
            .setName(
                GameServerConfigName.of("[PROJECT]", "[LOCATION]", "[DEPLOYMENT]", "[CONFIG]")
                    .toString())
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .addAllFleetConfigs(new ArrayList<FleetConfig>())
            .addAllScalingConfigs(new ArrayList<ScalingConfig>())
            .setDescription("description-1724546052")
            .build();
    mockService.addResponse(expectedResponse);

    String name =
        "projects/project-2748/locations/location-2748/gameServerDeployments/gameServerDeployment-2748/configs/config-2748";

    GameServerConfig actualResponse = client.getGameServerConfig(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void getGameServerConfigExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name =
          "projects/project-2748/locations/location-2748/gameServerDeployments/gameServerDeployment-2748/configs/config-2748";
      client.getGameServerConfig(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createGameServerConfigTest() throws Exception {
    GameServerConfig expectedResponse =
        GameServerConfig.newBuilder()
            .setName(
                GameServerConfigName.of("[PROJECT]", "[LOCATION]", "[DEPLOYMENT]", "[CONFIG]")
                    .toString())
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .addAllFleetConfigs(new ArrayList<FleetConfig>())
            .addAllScalingConfigs(new ArrayList<ScalingConfig>())
            .setDescription("description-1724546052")
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createGameServerConfigTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    GameServerDeploymentName parent =
        GameServerDeploymentName.of("[PROJECT]", "[LOCATION]", "[DEPLOYMENT]");
    GameServerConfig gameServerConfig = GameServerConfig.newBuilder().build();

    GameServerConfig actualResponse =
        client.createGameServerConfigAsync(parent, gameServerConfig).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void createGameServerConfigExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      GameServerDeploymentName parent =
          GameServerDeploymentName.of("[PROJECT]", "[LOCATION]", "[DEPLOYMENT]");
      GameServerConfig gameServerConfig = GameServerConfig.newBuilder().build();
      client.createGameServerConfigAsync(parent, gameServerConfig).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void createGameServerConfigTest2() throws Exception {
    GameServerConfig expectedResponse =
        GameServerConfig.newBuilder()
            .setName(
                GameServerConfigName.of("[PROJECT]", "[LOCATION]", "[DEPLOYMENT]", "[CONFIG]")
                    .toString())
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .addAllFleetConfigs(new ArrayList<FleetConfig>())
            .addAllScalingConfigs(new ArrayList<ScalingConfig>())
            .setDescription("description-1724546052")
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createGameServerConfigTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    String parent =
        "projects/project-6046/locations/location-6046/gameServerDeployments/gameServerDeployment-6046";
    GameServerConfig gameServerConfig = GameServerConfig.newBuilder().build();

    GameServerConfig actualResponse =
        client.createGameServerConfigAsync(parent, gameServerConfig).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void createGameServerConfigExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent =
          "projects/project-6046/locations/location-6046/gameServerDeployments/gameServerDeployment-6046";
      GameServerConfig gameServerConfig = GameServerConfig.newBuilder().build();
      client.createGameServerConfigAsync(parent, gameServerConfig).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void deleteGameServerConfigTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteGameServerConfigTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    GameServerConfigName name =
        GameServerConfigName.of("[PROJECT]", "[LOCATION]", "[DEPLOYMENT]", "[CONFIG]");

    client.deleteGameServerConfigAsync(name).get();

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void deleteGameServerConfigExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      GameServerConfigName name =
          GameServerConfigName.of("[PROJECT]", "[LOCATION]", "[DEPLOYMENT]", "[CONFIG]");
      client.deleteGameServerConfigAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void deleteGameServerConfigTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteGameServerConfigTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    String name =
        "projects/project-2748/locations/location-2748/gameServerDeployments/gameServerDeployment-2748/configs/config-2748";

    client.deleteGameServerConfigAsync(name).get();

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void deleteGameServerConfigExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name =
          "projects/project-2748/locations/location-2748/gameServerDeployments/gameServerDeployment-2748/configs/config-2748";
      client.deleteGameServerConfigAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }
}
