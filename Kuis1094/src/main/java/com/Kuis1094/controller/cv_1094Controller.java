/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Kuis1094.controller;

import com.Kuis1094.entity.cv_1094;
import com.Kuis1094.service.cv_1094Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Hendro Steven
 */
@RestController
@RequestMapping("/cv")
public class cv_1094Controller {

    @Autowired
    private cv_1094Service cv_1094Service;

    @RequestMapping(method = RequestMethod.POST)
    public cv_1094 insert(@RequestBody cv_1094 cv_1094) {
        return cv_1094Service.insert(cv_1094);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public cv_1094 update(@RequestBody cv_1094 cv_1094) {
        return cv_1094Service.update(cv_1094);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return cv_1094Service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public cv_1094 getById(@PathVariable("id") Long id){
        return cv_1094Service.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<cv_1094> getAll(){
        return cv_1094Service.getAll();
    }
}
