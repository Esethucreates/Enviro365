package com.enviro.assessment.grad001.esethuzikhali.Enviro365.rest;

import com.enviro.assessment.grad001.esethuzikhali.Enviro365.entity.DisposalGuidelines;
import com.enviro.assessment.grad001.esethuzikhali.Enviro365.service.ServiceLayerImpl;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DisposalGuideRest implements RestControllerInt<DisposalGuidelines> {
    private final ServiceLayerImpl serviceLayer;

    public DisposalGuideRest(ServiceLayerImpl serviceLayer) {
        this.serviceLayer = serviceLayer;
    }


    @GetMapping("/guidelines")
    public List<DisposalGuidelines> getList() {
        return serviceLayer.getAllGuidelines();
    }

    @GetMapping("/guidelines/{guidelineId}")
    public DisposalGuidelines getById(@PathVariable int guidelineId) {
        return serviceLayer.getGuidelineById(guidelineId);
    }

    @PostMapping("/guidelines")
    public DisposalGuidelines save(@Valid @RequestBody DisposalGuidelines disposalGuidelines) {
        return serviceLayer.saveGuideline(disposalGuidelines);
    }

    @PutMapping("/guidelines")
    public DisposalGuidelines update(@Valid @RequestBody DisposalGuidelines disposalGuidelines) {
        return serviceLayer.saveGuideline(disposalGuidelines);
    }

    @DeleteMapping("/guidelines/{guidelineId}")
    public String delete(@PathVariable int guidelineId) {
        serviceLayer.deleteGuideline(guidelineId);
        return "Deleted disposal guideline ID - " + guidelineId;
    }
}
