package com.enviro.assessment.grad001.esethuzikhali.Enviro365.service;

import com.enviro.assessment.grad001.esethuzikhali.Enviro365.entity.DisposalGuidelines;
import com.enviro.assessment.grad001.esethuzikhali.Enviro365.entity.RecyclingTips;
import com.enviro.assessment.grad001.esethuzikhali.Enviro365.entity.WasteCategory;

import java.util.List;

public interface ServiceInterface {

    //    Waste Category
    List<WasteCategory> getAllCategories();

    WasteCategory getCategoryById(int id);

    WasteCategory saveCategory(WasteCategory wasteCategory);

    void deleteCategory(int id);


//    DisposalGuidelines

    List<DisposalGuidelines> getAllGuidelines();

    DisposalGuidelines getGuidelineById(int id);

    DisposalGuidelines saveGuideline(DisposalGuidelines disposalGuidelines);

    void deleteGuideline(int id);

    //    RecyclingTips
    List<RecyclingTips> getAllTips();

    RecyclingTips getTipById(int id);

    RecyclingTips saveTip(RecyclingTips recyclingTips);

    void deleteTip(int id);

}
