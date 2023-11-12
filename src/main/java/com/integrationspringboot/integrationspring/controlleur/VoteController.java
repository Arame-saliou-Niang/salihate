package com.integrationspringboot.integrationspring.controlleur;

import com.integrationspringboot.integrationspring.Services.VoteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VoteController {
    private final VoteService voteService;

    public VoteController(VoteService voteService) {
        this.voteService = voteService;
    }

    @PostMapping("/api/voting/cast-vote")
    public ResponseEntity<VoteResponse> castVote(@RequestBody VoteRequest voteRequest) {
        try {
            VoteResponse voteResponse = voteService.castVote(voteRequest);
            return ResponseEntity.ok(voteResponse);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new VoteResponse(null, null, "Erreur lors du vote"));
        }
    }
}

