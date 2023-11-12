package com.integrationspringboot.integrationspring.Services;

import com.integrationspringboot.integrationspring.Repository.VoterRepository;
import com.integrationspringboot.integrationspring.controlleur.JwtTokenProvider;
import com.integrationspringboot.integrationspring.controlleur.LoginRequest;
import com.integrationspringboot.integrationspring.controlleur.VoterRequest;
import org.springframework.stereotype.Service;

@Service
public class VoterService {

    private final VoterRepository voterRepository;
    private final JwtTokenProvider tokenProvider;

    public VoterService(VoterRepository voterRepository, JwtTokenProvider tokenProvider) {
        this.voterRepository = voterRepository;
        this.tokenProvider = tokenProvider;
    }

    public void registerVoter(VoterRequest voterRequest) throws Exception {
        // Implémentez la logique d'enregistrement de l'électeur ici
    }

    public String loginVoter(LoginRequest loginRequest) throws Exception {
        // Implémentez la logique d'authentification de l'électeur ici

        return null;
    }
}
