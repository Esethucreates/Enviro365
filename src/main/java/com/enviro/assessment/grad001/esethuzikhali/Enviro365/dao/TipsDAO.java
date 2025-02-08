package com.enviro.assessment.grad001.esethuzikhali.Enviro365.dao;

import com.enviro.assessment.grad001.esethuzikhali.Enviro365.entity.RecyclingTips;

import java.util.List;


public interface TipsDAO {

    List<RecyclingTips> getAllTips();

    RecyclingTips getTipById(int id);

//    TODO: Get tips by category

    RecyclingTips saveTip(RecyclingTips recyclingTips);

    void deleteTip(int id);
}
