package com.integrationspringboot.integrationspring.Repository;

import com.integrationspringboot.integrationspring.controlleur.CandidateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CandidateRepository extends JpaRepository<CandidateEntity, Long> {


    List<CandidateEntity> findByName(String name);
}
