package com.integrationspringboot.integrationspring.controlleur;

import com.integrationspringboot.integrationspring.Services.VoterService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    private final AuthenticationManager authenticationManager;
    private final JwtTokenProvider tokenProvider;
    private final VoterService voterService;

    public AuthController(AuthenticationManager authenticationManager, JwtTokenProvider tokenProvider, VoterService voterService) {
        this.authenticationManager = authenticationManager;
        this.tokenProvider = tokenProvider;
        this.voterService = voterService;
    }

    @PostMapping("/api/voters/register")
    public ResponseEntity<ApiResponse> registerVoter(@RequestBody VoterRequest voterRequest) {
        try {
            voterService.registerVoter(voterRequest);
            return ResponseEntity.ok(new ApiResponse("Enregistré avec succès"));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new ApiResponse("Erreur lors de l'enregistrement de l'électeur"));
        }
    }

    @PostMapping("/api/voters/login")
    public ResponseEntity<AuthResponse> authenticateVoter(@RequestBody LoginRequest loginRequest) {
        try {
            String token = voterService.loginVoter(loginRequest);
            return ResponseEntity.ok(new AuthResponse(token, loginRequest.getVoterId(), "Connecté avec succès"));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new AuthResponse(null, null, "Erreur d'authentification"));
        }
    }
}
