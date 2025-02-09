package com.enviro.assessment.grad001.esethuzikhali.Enviro365.repositories;

import com.enviro.assessment.grad001.esethuzikhali.Enviro365.entity.WasteCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "categories")
public interface WasteCategoryRepository extends JpaRepository<WasteCategory, Integer> {
}
