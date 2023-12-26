/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.cricbuzz.exam.controller;

import com.spring.cricbuzz.exam.DTO.DashboardDTO;
import com.spring.cricbuzz.exam.service.ContentService;
import com.spring.cricbuzz.exam.service.PlanService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author NMSLAP415
 */
@RestController
@RequestMapping(value = "/cricbuzz", produces = MediaType.APPLICATION_JSON_VALUE)
public class CricBuzzController {
    
    @Autowired
    private PlanService planService;
    @Autowired
    private ContentService contentService;
    
    @GetMapping("/dashboard")
    public ResponseEntity getListeningLevel() {
        DashboardDTO dashboardDTO =DashboardDTO.builder()
                .plans(planService.getAllPlans())
                .featured(contentService.getAllFeaturedContent())
                .videos(contentService.getAllVideos())
                .editorials(contentService.getAllEditorials())
                .build();
        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(dashboardDTO);
    }
}
