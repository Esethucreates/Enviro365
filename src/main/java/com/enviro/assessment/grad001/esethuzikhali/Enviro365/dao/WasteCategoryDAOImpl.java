package com.enviro.assessment.grad001.esethuzikhali.Enviro365.dao;

import com.enviro.assessment.grad001.esethuzikhali.Enviro365.entity.WasteCategory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WasteCategoryDAOImpl implements WasteCategoryDAO {
    private EntityManager entityManager;

    @Autowired
    public WasteCategoryDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<WasteCategory> getAllCategories() {

        TypedQuery<WasteCategory> theQuery = entityManager.createQuery("FROM WasteCategory", WasteCategory.class);
        return theQuery.getResultList();
    }

    @Override
    public WasteCategory getCategoryById(int id) {

        return entityManager.find(WasteCategory.class, id);
    }

    @Override
    public WasteCategory saveCategory(WasteCategory wasteCategory) {
        return entityManager.merge(wasteCategory);
    }

    @Override
    public void deleteCategory(int id) {
        WasteCategory findCategory = entityManager.find(WasteCategory.class, id);
        entityManager.remove(findCategory);
    }
}
