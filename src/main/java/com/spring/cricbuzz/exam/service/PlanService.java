/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.cricbuzz.exam.service;

import com.spring.cricbuzz.exam.entity.Plan;
import com.spring.cricbuzz.exam.repo.PlanRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author NMSLAP415
 */
@Service
public class PlanService {
    
    @Autowired
    private PlanRepo planRepo;
    
    public List<Plan> getAllPlans(){
        return planRepo.findAll();
    }
}
