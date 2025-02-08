package com.enviro.assessment.grad001.esethuzikhali.Enviro365.dao;

import com.enviro.assessment.grad001.esethuzikhali.Enviro365.entity.WasteCategory;

import java.util.List;

public interface WasteCategoryDAO {
    List<WasteCategory> getAllCategories();

    WasteCategory getCategoryById(int id);

    WasteCategory saveCategory(WasteCategory wasteCategory);

    void deleteCategory(int id);

}
