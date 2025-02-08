package com.enviro.assessment.grad001.esethuzikhali.Enviro365.dao;

import com.enviro.assessment.grad001.esethuzikhali.Enviro365.entity.DisposalGuidelines;

import java.util.List;

public interface GuidelineDAO {

    List<DisposalGuidelines> getAllGuidelines();

    DisposalGuidelines getGuidelineById(int id);

//    TODO: Get guidelines by category
//    TODO: Try to create a generic of this Interface

    DisposalGuidelines saveGuideline(DisposalGuidelines disposalGuidelines);

    void deleteGuideline(int id);
}



