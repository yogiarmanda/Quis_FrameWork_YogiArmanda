/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Kuis1094.controller;

import com.Kuis1094.entity.nilai_1094;
import com.Kuis1094.service.nilai_1094Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.Kuis1094.repo.nilai_1094Repo;

/**
 *
 * @author Hendro Steven
 */
@RestController
@RequestMapping("/Nilai")
public class nilai_1094Controller {
    
    @Autowired
    private nilai_1094Service nilai_1094Service;
    
    @RequestMapping(method = RequestMethod.POST)
    public nilai_1094 insertOrUpdate(@RequestBody nilai_1094 product){
        return nilai_1094Service.insertOrUpdate(product);
    }
  
}
