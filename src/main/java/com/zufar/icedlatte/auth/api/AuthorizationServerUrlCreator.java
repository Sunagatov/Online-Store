package com.zufar.icedlatte.auth.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AuthorizationServerUrlCreator {

    @Value("${google.auth.server.url}")
    public String authorizationServerUrl;

    @Value("${google.client-id}")
    public String clientId;

    @Value("${google.scope}")
    public String scope;

    public String create() {
        return authorizationServerUrl + "?" +
                "scope=" + scope + "&" +
                "access_type=offline&" +
                "include_granted_scopes=true&" +
                "response_type=code&" +
                "state=state_parameter_passthrough_value&" +
                "redirect_uri=https://il.pride.improwised.local/backend/api/v1/auth/google/callback&" +
                "client_id=" + clientId;
    }
}
