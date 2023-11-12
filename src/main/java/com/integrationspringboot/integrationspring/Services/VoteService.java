package com.integrationspringboot.integrationspring.Services;

import com.integrationspringboot.integrationspring.Repository.CandidateRepository;
import com.integrationspringboot.integrationspring.Repository.VoteRepository;
import com.integrationspringboot.integrationspring.controlleur.VoteRequest;
import com.integrationspringboot.integrationspring.controlleur.VoteResponse;
import org.springframework.stereotype.Service;

@Service
public class VoteService {
    private final VoteRepository voteRepository;
    private final CandidateRepository candidateRepository;

    public VoteService(VoteRepository voteRepository, CandidateRepository candidateRepository) {
        this.voteRepository = voteRepository;
        this.candidateRepository = candidateRepository;
    }

    public VoteResponse castVote(VoteRequest voteRequest) throws Exception {
        // Logique pour vérifier si le candidat a déjà été voté
        // Logique pour enregistrer le vote dans la base de données

        // Retournez les informations de réponse
        return new VoteResponse(voteRequest.getVoterId(), voteRequest.getCandidateId(), "Votre vote a été enregistré avec succès");
    }
}
