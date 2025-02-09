package com.enviro.assessment.grad001.esethuzikhali.Enviro365.rest;

import com.enviro.assessment.grad001.esethuzikhali.Enviro365.entity.WasteCategory;
import com.enviro.assessment.grad001.esethuzikhali.Enviro365.service.ServiceLayerImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class WasteCategoryRest implements RestControllerInt<WasteCategory> {
    private final ServiceLayerImpl serviceLayer;

    @Autowired
    public WasteCategoryRest(ServiceLayerImpl serviceLayer) {
        this.serviceLayer = serviceLayer;
    }

    // Get all categories
    @GetMapping("/categories")
    public List<WasteCategory> getList() {
        return serviceLayer.getAllCategories();
    }

    // Get a single category by ID
    @GetMapping("/categories/{categoryId}")
    public WasteCategory getById(@PathVariable int categoryId) {
        return serviceLayer.getCategoryById(categoryId);
    }

    // Create a new category with validation
    @PostMapping("/categories")
    public WasteCategory save(@Valid @RequestBody WasteCategory wasteCategory) {
        wasteCategory.setId(0);  // Ensure new entry
        return serviceLayer.saveCategory(wasteCategory);
    }

    // Update an existing category
    @PutMapping("/categories")
    public WasteCategory update(@Valid @RequestBody WasteCategory wasteCategory) {
        return serviceLayer.saveCategory(wasteCategory);
    }

    // Delete category
    @DeleteMapping("/categories/{categoryId}")
    public String delete(@PathVariable int categoryId) {
        serviceLayer.deleteCategory(categoryId);
        return "Deleted category ID - " + categoryId;
    }
}
