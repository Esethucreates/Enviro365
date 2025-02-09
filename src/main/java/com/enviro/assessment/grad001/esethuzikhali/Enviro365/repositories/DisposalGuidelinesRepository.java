package com.enviro.assessment.grad001.esethuzikhali.Enviro365.repositories;

import com.enviro.assessment.grad001.esethuzikhali.Enviro365.entity.DisposalGuidelines;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "guidelines")
public interface DisposalGuidelinesRepository extends JpaRepository<DisposalGuidelines, Integer> {
}
