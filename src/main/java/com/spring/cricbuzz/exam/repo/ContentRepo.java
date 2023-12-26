/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.cricbuzz.exam.repo;

import com.spring.cricbuzz.exam.entity.Content;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author NMSLAP415
 */
@Repository
public interface ContentRepo extends JpaRepository<Content, Long>{
    public List<Content> findContentByType(String type);
}
