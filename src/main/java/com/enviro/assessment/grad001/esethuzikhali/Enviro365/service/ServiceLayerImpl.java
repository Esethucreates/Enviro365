package com.enviro.assessment.grad001.esethuzikhali.Enviro365.service;

import com.enviro.assessment.grad001.esethuzikhali.Enviro365.entity.DisposalGuidelines;
import com.enviro.assessment.grad001.esethuzikhali.Enviro365.entity.RecyclingTips;
import com.enviro.assessment.grad001.esethuzikhali.Enviro365.entity.WasteCategory;
import com.enviro.assessment.grad001.esethuzikhali.Enviro365.errorHandling.ResourceNotFoundException;
import com.enviro.assessment.grad001.esethuzikhali.Enviro365.repositories.DisposalGuidelinesRepository;
import com.enviro.assessment.grad001.esethuzikhali.Enviro365.repositories.RecyclingTipsRepository;
import com.enviro.assessment.grad001.esethuzikhali.Enviro365.repositories.WasteCategoryRepository;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceLayerImpl implements ServiceInterface {
    // Fields for DAO
    private final DisposalGuidelinesRepository disposalGuidelinesRepository;
    private final RecyclingTipsRepository recyclingTipsRepository;
    private final WasteCategoryRepository wasteCategoryRepository;

    public ServiceLayerImpl(DisposalGuidelinesRepository disposalGuidelinesRepository,
                            RecyclingTipsRepository recyclingTipsRepository,
                            WasteCategoryRepository wasteCategoryRepository) {
        this.disposalGuidelinesRepository = disposalGuidelinesRepository;
        this.recyclingTipsRepository = recyclingTipsRepository;
        this.wasteCategoryRepository = wasteCategoryRepository;
    }


    // WasteCategory Methods
    @Override
    public List<WasteCategory> getAllCategories() {
        return wasteCategoryRepository.findAll();
    }

    @Override
    public WasteCategory getCategoryById(int id) {
        return wasteCategoryRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Did not find category id - " + id));
    }

    @Override
    public WasteCategory saveCategory(WasteCategory wasteCategory) {
        if (wasteCategory.getCategoryName() == null || wasteCategory.getCategoryName().trim().isEmpty()) {
            throw new IllegalArgumentException("Category name cannot be empty.");
        }
        try {
            return wasteCategoryRepository.save(wasteCategory);
        } catch (DataIntegrityViolationException e) {
            throw new DataIntegrityViolationException("Category name must be unique.");
        }
    }

    @Override
    public void deleteCategory(int id) {
        if (!wasteCategoryRepository.existsById(id)) {
            throw new ResourceNotFoundException("Category with ID " + id + " does not exist.");
        }
        wasteCategoryRepository.deleteById(id);
    }

    // DisposalGuidelines Methods
    @Override
    public List<DisposalGuidelines> getAllGuidelines() {
        return disposalGuidelinesRepository.findAll();
    }

    @Override
    public DisposalGuidelines getGuidelineById(int id) {
        return disposalGuidelinesRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Did not find guideline id - " + id));
    }

    @Override
    public DisposalGuidelines saveGuideline(DisposalGuidelines disposalGuidelines) {
        if (disposalGuidelines.getTitle() == null || disposalGuidelines.getTitle().trim().isEmpty()) {
            throw new IllegalArgumentException("Guideline title cannot be empty.");
        }
        try {
            return disposalGuidelinesRepository.save(disposalGuidelines);
        } catch (DataIntegrityViolationException e) {
            throw new DataIntegrityViolationException("Guideline title must be unique.");
        }
    }

    @Override
    public void deleteGuideline(int id) {
        if (!disposalGuidelinesRepository.existsById(id)) {
            throw new ResourceNotFoundException("Guideline with ID " + id + " does not exist.");
        }
        disposalGuidelinesRepository.deleteById(id);
    }

    // RecyclingTips Methods
    @Override
    public List<RecyclingTips> getAllTips() {
        return recyclingTipsRepository.findAll();
    }

    @Override
    public RecyclingTips getTipById(int id) {
        return recyclingTipsRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Did not find tip id - " + id));
    }

    @Override
    public RecyclingTips saveTip(RecyclingTips recyclingTips) {
        if (recyclingTips.getTitle() == null || recyclingTips.getTitle().trim().isEmpty()) {
            throw new IllegalArgumentException("Tip title cannot be empty.");
        }
        try {
            return recyclingTipsRepository.save(recyclingTips);
        } catch (DataIntegrityViolationException e) {
            throw new DataIntegrityViolationException("Tip title must be unique.");
        }
    }

    @Override
    public void deleteTip(int id) {
        if (!recyclingTipsRepository.existsById(id)) {
            throw new ResourceNotFoundException("Tip with ID " + id + " does not exist.");
        }
        recyclingTipsRepository.deleteById(id);
    }
}
