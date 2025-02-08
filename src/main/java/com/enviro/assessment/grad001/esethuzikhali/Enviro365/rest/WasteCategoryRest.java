package com.enviro.assessment.grad001.esethuzikhali.Enviro365.rest;

import com.enviro.assessment.grad001.esethuzikhali.Enviro365.entity.WasteCategory;
import com.enviro.assessment.grad001.esethuzikhali.Enviro365.service.ServiceLayerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class WasteCategoryRest {
    private ServiceLayerImpl serviceLayer;

    @Autowired
    public WasteCategoryRest(ServiceLayerImpl serviceLayer) {
        this.serviceLayer = serviceLayer;
    }

    //    Get Mapping to return all waste category
    @GetMapping("/categories")
    public List<WasteCategory> getWasteCategoryList() {
        return serviceLayer.getAllCategories();
    }

    //    Post Mapping to create waste category
    @PostMapping("/categories")
    public WasteCategory addCategory(@RequestBody WasteCategory wasteCategory) {
        wasteCategory.setId(0);
        WasteCategory wasteCategory1 = serviceLayer.saveCategory(wasteCategory);
        return wasteCategory1;
    }

//    update


}
