package com.training.azure.practice.dao;

import com.azure.cosmos.ConnectionPolicy;
import com.azure.cosmos.ConsistencyLevel;
import com.azure.cosmos.CosmosClient;
import com.azure.cosmos.CosmosClientBuilder;

public class CosmosClientFactory {

    private static final String accountEndpoint = "https://a5072238-0ee0-4-231-b9ee.documents.azure.com/";
    private static final String accountSecret = "xLHlFNqG8EzSAZ3SilHmpqgP5BOK69EZFjP2ZnPI796fhXyTVWCoKeN9HFY1WeoVRIwuPJOBzMxTHDaDPQuMOA==";

    private static CosmosClient cosmosClient = new CosmosClientBuilder().setConsistencyLevel(ConsistencyLevel.EVENTUAL)
            .setEndpoint(accountEndpoint)
            .setKey(accountSecret)
            .setConnectionPolicy(ConnectionPolicy.getDefaultPolicy()).buildClient();

    public static CosmosClient getCosmosClient() {
        return cosmosClient;
    }
}
