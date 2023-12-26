/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.cricbuzz.exam.service;

import com.spring.cricbuzz.exam.entity.Content;
import com.spring.cricbuzz.exam.repo.ContentRepo;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author NMSLAP415
 */
@Service
public class ContentService {
    @Autowired
    private ContentRepo contentRepo;
    
    public List<Content> getAllVideos(){
        return contentRepo.findContentByType("video");
    }
    
    public List<Content> getAllEditorials(){
        return contentRepo.findContentByType("editorial");
        
    }
    
    public List<Content> getAllFeaturedContent(){
        return contentRepo.findAll().stream()
                    .sorted(Comparator
                        .comparingInt(Content::getViews)
                        .thenComparingInt(Content::getReactions)
                        
                        .reversed())
                .limit(3)
                .collect(Collectors.toList());
        
    }
}
