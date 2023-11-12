package com.integrationspringboot.integrationspring.Repository;

import com.integrationspringboot.integrationspring.controlleur.VoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoteRepository extends JpaRepository<VoteEntity, Long> {
    // Ajoutez des méthodes de requête spécifiques si nécessaire
}

