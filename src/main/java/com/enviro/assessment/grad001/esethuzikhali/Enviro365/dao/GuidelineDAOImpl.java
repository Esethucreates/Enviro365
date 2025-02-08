package com.enviro.assessment.grad001.esethuzikhali.Enviro365.dao;

import com.enviro.assessment.grad001.esethuzikhali.Enviro365.entity.DisposalGuidelines;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GuidelineDAOImpl implements GuidelineDAO {
    private EntityManager entityManager;

    @Autowired
    public GuidelineDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<DisposalGuidelines> getAllGuidelines() {
        TypedQuery<DisposalGuidelines> theQuery = entityManager.createQuery("FROM DisposalGuidelines", DisposalGuidelines.class);
        return theQuery.getResultList();
    }

    @Override
    public DisposalGuidelines getGuidelineById(int id) {
        return entityManager.find(DisposalGuidelines.class, id);
    }

    @Override
    public DisposalGuidelines saveGuideline(DisposalGuidelines disposalGuidelines) {
        return entityManager.merge(disposalGuidelines);
    }

    @Override
    public void deleteGuideline(int id) {
        DisposalGuidelines findGuideline = entityManager.find(DisposalGuidelines.class, id);
        entityManager.remove(findGuideline);
    }
}
