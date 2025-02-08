package com.enviro.assessment.grad001.esethuzikhali.Enviro365.service;

import com.enviro.assessment.grad001.esethuzikhali.Enviro365.dao.GuidelineDAO;
import com.enviro.assessment.grad001.esethuzikhali.Enviro365.dao.TipsDAO;
import com.enviro.assessment.grad001.esethuzikhali.Enviro365.dao.WasteCategoryDAO;
import com.enviro.assessment.grad001.esethuzikhali.Enviro365.entity.DisposalGuidelines;
import com.enviro.assessment.grad001.esethuzikhali.Enviro365.entity.RecyclingTips;
import com.enviro.assessment.grad001.esethuzikhali.Enviro365.entity.WasteCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ServiceLayerImpl implements ServiceInterface {
    // Fields for DAO
    private WasteCategoryDAO wasteCategoryDAO;
    private GuidelineDAO guidelineDAO;
    private TipsDAO tipsDAO;

    @Autowired
    public ServiceLayerImpl(WasteCategoryDAO wasteCategoryDAO, GuidelineDAO guidelineDAO, TipsDAO tipsDAO) {
        this.wasteCategoryDAO = wasteCategoryDAO;
        this.guidelineDAO = guidelineDAO;
        this.tipsDAO = tipsDAO;
    }

    //    Waste Category
    @Override
    public List<WasteCategory> getAllCategories() {
        return wasteCategoryDAO.getAllCategories();
    }

    @Override
    public WasteCategory getCategoryById(int id) {
        return wasteCategoryDAO.getCategoryById(id);
    }

    @Transactional
    @Override
    public WasteCategory saveCategory(WasteCategory wasteCategory) {
        return wasteCategoryDAO.saveCategory(wasteCategory);
    }

    @Transactional
    @Override
    public void deleteCategory(int id) {
        wasteCategoryDAO.deleteCategory(id);
    }

    // Disposal Guidelines
    @Override
    public List<DisposalGuidelines> getAllGuidelines() {
        return List.of();
    }

    @Override
    public DisposalGuidelines getGuidelineById(int id) {
        return null;
    }

    @Transactional
    @Override
    public DisposalGuidelines saveGuideline(DisposalGuidelines disposalGuidelines) {
        return null;
    }

    @Transactional
    @Override
    public void deleteGuideline(int id) {

    }

    //    Recycling Tips
    @Override
    public List<RecyclingTips> getAllTips() {
        return List.of();
    }

    @Override
    public RecyclingTips getTipById(int id) {
        return null;
    }

    @Transactional
    @Override
    public RecyclingTips saveTip(RecyclingTips recyclingTips) {
        return null;
    }

    @Transactional
    @Override
    public void deleteTip(int id) {

    }
}
