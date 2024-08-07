package com.zufar.icedlatte.auth.api;

import com.google.api.client.auth.oauth2.TokenResponse;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdTokenVerifier;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.gson.GsonFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.List;

@Slf4j
@Service
public class GoogleIdTokenCreator {

    @Value("${google.auth.server.url}")
    public String authorizationServerUrl;

    @Value("${google.client-id}")
    public String clientId;

    @Value("${google.client-secret}")
    public String clientSecret;

    @Value("${google.scope}")
    public String scope;

    public GoogleIdToken createGoogleIdToken(final String authorizationCode) throws GeneralSecurityException, IOException {
        TokenResponse tokenResponse = getTokenResponse(authorizationCode);
        return createGoogleIdTokenVerifier()
                .verify((String) tokenResponse.get("id_token"));
    }

    private TokenResponse getTokenResponse(String authorizationCode) throws IOException, GeneralSecurityException {
        return createGoogleAuthorizationCodeFlow().newTokenRequest(authorizationCode)
                .setRedirectUri("https://il.pride.improwised.local/backend/api/v1/auth/google/callback")
                .execute();
    }

    private GoogleIdTokenVerifier createGoogleIdTokenVerifier() throws GeneralSecurityException, IOException {
        HttpTransport httpTransport = GoogleNetHttpTransport.newTrustedTransport();
        JsonFactory jsonFactory = GsonFactory.getDefaultInstance();
        return new GoogleIdTokenVerifier
                .Builder(httpTransport, jsonFactory)
                .setAudience(Collections.singletonList(clientId))
                .build();
    }

    private GoogleAuthorizationCodeFlow createGoogleAuthorizationCodeFlow() throws GeneralSecurityException, IOException {
        HttpTransport httpTransport = GoogleNetHttpTransport.newTrustedTransport();
        JsonFactory jsonFactory = GsonFactory.getDefaultInstance();
        return new GoogleAuthorizationCodeFlow
                .Builder(httpTransport, jsonFactory, clientId, clientSecret, List.of(scope))
                .setAccessType("offline")
                .setApprovalPrompt("force")
                .build();
    }
}
