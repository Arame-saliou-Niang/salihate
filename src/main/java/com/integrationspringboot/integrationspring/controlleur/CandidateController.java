package com.integrationspringboot.integrationspring.controlleur;

import com.integrationspringboot.integrationspring.Services.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/candidates")
public class CandidateController {

    @Autowired
    private CandidateService candidateService;

    @GetMapping
    public ResponseEntity<List<CandidateEntity>> getAllCandidates() {
        List<CandidateEntity> candidates = candidateService.getAllCandidates();
        return ResponseEntity.ok(candidates);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CandidateEntity> getCandidateById(@PathVariable Long id) {
        CandidateEntity candidate = candidateService.getCandidateById(id);
        return ResponseEntity.ok(candidate);
    }



    @PostMapping
    public ResponseEntity<CandidateEntity> createCandidate(@RequestBody CandidateEntity candidateEntity) {
        CandidateEntity createdCandidate = candidateService.createCandidate(candidateEntity);
        return ResponseEntity.ok(createdCandidate);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CandidateEntity> updateCandidate(@PathVariable Long id, @RequestBody CandidateEntity updatedCandidateEntity) {
        CandidateEntity candidate = candidateService.updateCandidate(id, updatedCandidateEntity);
        return ResponseEntity.ok(candidate);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCandidate(@PathVariable Long id) {
        candidateService.deleteCandidate(id);
        return ResponseEntity.noContent().build();
    }
}
