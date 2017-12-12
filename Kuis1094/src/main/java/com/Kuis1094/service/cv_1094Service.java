/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Kuis1094.service;

import com.Kuis1094.entity.cv_1094;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Kuis1094.repo.cv_1094Repo;

/**
 *
 * @author Hendro Steven
 */
@Service("cv_1094Service")
@Transactional
public class cv_1094Service {

    @Autowired
    private cv_1094Repo repo;

    public cv_1094 insert(cv_1094 cv_1094) {
        return repo.save(cv_1094);
    }
    
    public cv_1094 update(cv_1094 cv_1094) {
        return repo.save(cv_1094);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public cv_1094 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<cv_1094> getAll(){
        return repo.findAllcv_1094();
    }
}
