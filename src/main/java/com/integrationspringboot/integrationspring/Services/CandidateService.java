package com.integrationspringboot.integrationspring.Services;

import com.integrationspringboot.integrationspring.Repository.CandidateRepository;
import com.integrationspringboot.integrationspring.controlleur.CandidateEntity;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
@Service
public class CandidateService {

    private final CandidateRepository candidateRepository;

    public CandidateService(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    public void deleteCandidate(Long id) {
        candidateRepository.deleteById(id);
    }

    public CandidateEntity updateCandidate(Long id, CandidateEntity updatedCandidateEntity) {
        return candidateRepository.findById(id)
                .map(candidate -> {
                    candidate.setName(updatedCandidateEntity.getName());
                    candidate.setParty(updatedCandidateEntity.getParty());

                    // Utilisez le repository pour effectuer la mise à jour dans la base de données
                    return candidateRepository.save(candidate);
                })
                .orElseThrow(() -> new EntityNotFoundException("Candidate not found with id: " + id));
    }


    public CandidateEntity getCandidateById(Long id) {
        return candidateRepository.findById(id).orElse(null);
    }

    public CandidateEntity createCandidate(CandidateEntity candidateEntity) {
        return candidateRepository.save(candidateEntity);
    }

    public List<CandidateEntity> getAllCandidates() {
        return candidateRepository.findAll();

    }
}
