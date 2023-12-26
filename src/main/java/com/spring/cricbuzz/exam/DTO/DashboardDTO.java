/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.cricbuzz.exam.DTO;

import com.spring.cricbuzz.exam.entity.Content;
import com.spring.cricbuzz.exam.entity.Plan;
import java.util.List;

/**
 *
 * @author NMSLAP415
 */
@lombok.Builder
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Data
public class DashboardDTO {
    private List<Plan> plans;
    private List<Content> featured;
    private List<Content> videos;
    private List<Content> editorials;
    
}
