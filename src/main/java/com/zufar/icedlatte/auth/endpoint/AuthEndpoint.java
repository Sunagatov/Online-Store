package com.zufar.icedlatte.auth.endpoint;

import com.zufar.icedlatte.auth.api.AuthorizationServerUrlCreator;
import com.zufar.icedlatte.auth.api.GoogleAuthCallbackHandler;

import com.zufar.icedlatte.openapi.dto.UserAuthenticationResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.*;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.security.GeneralSecurityException;

@Slf4j
@RestController
@RequiredArgsConstructor
@Validated
@RequestMapping(value = "/api/v1/auth")
public class AuthEndpoint {

    private final GoogleAuthCallbackHandler googleAuthCallbackHandler;
    private final AuthorizationServerUrlCreator authorizationServerUrlCreator;

    @GetMapping("/google")
    public ResponseEntity<String> getGoogleAuthorizationServerUrl() {
        log.info("Received the request to initiate the Google authentication.");
        String authorizationUrl = authorizationServerUrlCreator.create();
        log.info("The request to initiate the Google authentication was done successfully.");
        return ResponseEntity
                .status(HttpStatus.TEMPORARY_REDIRECT)
                .header("Location", authorizationUrl)
                .build();
    }

    @GetMapping("/google/callback")
    public ResponseEntity<UserAuthenticationResponse> googleAuthCallback(@RequestParam("code") String authorizationCode) throws GeneralSecurityException, IOException {
        log.info("Received callback for Google authentication");
        UserAuthenticationResponse authenticationResponse = googleAuthCallbackHandler.googleAuthCallback(authorizationCode);
        log.info("Google authentication was completed successfully");
        return ResponseEntity
                .ok(authenticationResponse);

    }
}
