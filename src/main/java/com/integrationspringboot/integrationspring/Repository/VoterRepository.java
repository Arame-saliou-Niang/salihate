package com.integrationspringboot.integrationspring.Repository;

import com.integrationspringboot.integrationspring.controlleur.VoterEntity;
import net.bytebuddy.dynamic.DynamicType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoterRepository extends JpaRepository<VoterEntity, Long> {
    boolean existsByNationalId(String nationalId);
    DynamicType.Builder.MethodDefinition.ImplementationDefinition.Optional<VoterEntity> findByVoterId(String voterId);
}



