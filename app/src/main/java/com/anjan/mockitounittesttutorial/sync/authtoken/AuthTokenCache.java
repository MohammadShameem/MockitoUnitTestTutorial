package com.anjan.mockitounittesttutorial.sync.authtoken;

/**
 * Created by Anjan Debnath on 7/23/2018.
 * Copyright (c) 2018, W3 Engineers Ltd. All rights reserved.
 */
public interface AuthTokenCache {

    void cacheAuthToken(String authToken);

    String getAuthToken();
}
