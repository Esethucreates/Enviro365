package com.enviro.assessment.grad001.esethuzikhali.Enviro365.dao;

import com.enviro.assessment.grad001.esethuzikhali.Enviro365.entity.RecyclingTips;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TipsDAOImpl implements TipsDAO {

    private EntityManager entityManager;

    @Autowired
    public TipsDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<RecyclingTips> getAllTips() {
        TypedQuery<RecyclingTips> theQuery = entityManager.createQuery("FROM RecyclingTips", RecyclingTips.class);
        return theQuery.getResultList();
    }

    @Override
    public RecyclingTips getTipById(int id) {
        return entityManager.find(RecyclingTips.class, id);
    }

    @Override
    public RecyclingTips saveTip(RecyclingTips recyclingTips) {
        return entityManager.merge(recyclingTips);
    }

    @Override
    public void deleteTip(int id) {
        RecyclingTips findTip = entityManager.find(RecyclingTips.class, id);
        entityManager.remove(findTip);
    }
}
