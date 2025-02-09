package com.enviro.assessment.grad001.esethuzikhali.Enviro365.rest;

import com.enviro.assessment.grad001.esethuzikhali.Enviro365.entity.RecyclingTips;
import com.enviro.assessment.grad001.esethuzikhali.Enviro365.service.ServiceLayerImpl;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RecyclingTipsRest implements RestControllerInt<RecyclingTips> {
    private final ServiceLayerImpl serviceLayer;

    public RecyclingTipsRest(ServiceLayerImpl serviceLayer) {
        this.serviceLayer = serviceLayer;
    }


    @GetMapping("/tips")
    public List<RecyclingTips> getList() {
        return serviceLayer.getAllTips();
    }

    @GetMapping("/tips/{tipId}")
    public RecyclingTips getById(@PathVariable int tipId) {
        return serviceLayer.getTipById(tipId);
    }

    @PostMapping("/tips")
    public RecyclingTips save(@Valid @RequestBody RecyclingTips recyclingTips) {
        return serviceLayer.saveTip(recyclingTips);
    }

    @PutMapping("/tips")
    public RecyclingTips update(@Valid @RequestBody RecyclingTips recyclingTips) {
        return serviceLayer.saveTip(recyclingTips);
    }

    @DeleteMapping("/tips/{tipId}")
    public String delete(@PathVariable int tipId) {
        serviceLayer.deleteTip(tipId);
        return "Deleted recycling tip ID - " + tipId;
    }
}
