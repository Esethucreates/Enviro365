package com.enviro.assessment.grad001.esethuzikhali.Enviro365.repositories;

import com.enviro.assessment.grad001.esethuzikhali.Enviro365.entity.RecyclingTips;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "tips")
public interface RecyclingTipsRepository extends JpaRepository<RecyclingTips, Integer> {
}
