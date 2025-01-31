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

import com.google.api.core.BetaApi;
import com.google.cloud.gaming.v1beta.GameServerClustersServiceGrpc.GameServerClustersServiceImplBase;
import com.google.longrunning.Operation;
import com.google.protobuf.AbstractMessage;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.annotation.Generated;

@BetaApi
@Generated("by gapic-generator-java")
public class MockGameServerClustersServiceImpl extends GameServerClustersServiceImplBase {
  private List<AbstractMessage> requests;
  private Queue<Object> responses;

  public MockGameServerClustersServiceImpl() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  public List<AbstractMessage> getRequests() {
    return requests;
  }

  public void addResponse(AbstractMessage response) {
    responses.add(response);
  }

  public void setResponses(List<AbstractMessage> responses) {
    this.responses = new LinkedList<Object>(responses);
  }

  public void addException(Exception exception) {
    responses.add(exception);
  }

  public void reset() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  @Override
  public void listGameServerClusters(
      ListGameServerClustersRequest request,
      StreamObserver<ListGameServerClustersResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof ListGameServerClustersResponse) {
      requests.add(request);
      responseObserver.onNext(((ListGameServerClustersResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method ListGameServerClusters, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  ListGameServerClustersResponse.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void getGameServerCluster(
      GetGameServerClusterRequest request, StreamObserver<GameServerCluster> responseObserver) {
    Object response = responses.poll();
    if (response instanceof GameServerCluster) {
      requests.add(request);
      responseObserver.onNext(((GameServerCluster) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method GetGameServerCluster, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  GameServerCluster.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void createGameServerCluster(
      CreateGameServerClusterRequest request, StreamObserver<Operation> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Operation) {
      requests.add(request);
      responseObserver.onNext(((Operation) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method CreateGameServerCluster, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Operation.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void previewCreateGameServerCluster(
      PreviewCreateGameServerClusterRequest request,
      StreamObserver<PreviewCreateGameServerClusterResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof PreviewCreateGameServerClusterResponse) {
      requests.add(request);
      responseObserver.onNext(((PreviewCreateGameServerClusterResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method PreviewCreateGameServerCluster, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  PreviewCreateGameServerClusterResponse.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void deleteGameServerCluster(
      DeleteGameServerClusterRequest request, StreamObserver<Operation> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Operation) {
      requests.add(request);
      responseObserver.onNext(((Operation) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method DeleteGameServerCluster, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Operation.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void previewDeleteGameServerCluster(
      PreviewDeleteGameServerClusterRequest request,
      StreamObserver<PreviewDeleteGameServerClusterResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof PreviewDeleteGameServerClusterResponse) {
      requests.add(request);
      responseObserver.onNext(((PreviewDeleteGameServerClusterResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method PreviewDeleteGameServerCluster, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  PreviewDeleteGameServerClusterResponse.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void updateGameServerCluster(
      UpdateGameServerClusterRequest request, StreamObserver<Operation> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Operation) {
      requests.add(request);
      responseObserver.onNext(((Operation) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method UpdateGameServerCluster, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Operation.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void previewUpdateGameServerCluster(
      PreviewUpdateGameServerClusterRequest request,
      StreamObserver<PreviewUpdateGameServerClusterResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof PreviewUpdateGameServerClusterResponse) {
      requests.add(request);
      responseObserver.onNext(((PreviewUpdateGameServerClusterResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method PreviewUpdateGameServerCluster, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  PreviewUpdateGameServerClusterResponse.class.getName(),
                  Exception.class.getName())));
    }
  }
}
