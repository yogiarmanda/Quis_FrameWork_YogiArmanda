/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Kuis1094.repo;

import com.Kuis1094.entity.cv_1094;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Hendro Steven
 */
public interface cv_1094Repo extends CrudRepository<cv_1094, Long> {

    @Query("select c from Category c")
    public List<cv_1094> findAllcv_1094();
}
