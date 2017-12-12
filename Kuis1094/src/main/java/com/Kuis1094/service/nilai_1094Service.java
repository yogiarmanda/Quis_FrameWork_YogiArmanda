/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Kuis1094.service;

import com.Kuis1094.entity.nilai_1094;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Kuis1094.repo.nilai_1094Repo;

/**
 *
 * @author Hendro Steven
 */
@Service("nilai_1094Service")
@Transactional
public class nilai_1094Service {

    @Autowired
    private nilai_1094Repo repo;

    public nilai_1094 insertOrUpdate(nilai_1094 product) {
        return repo.save(product);
    }

    public boolean delete(Long id) {
        repo.delete(id);
        return true;
    }

    public List<nilai_1094> findAll() {
        return repo.findAllProduct();
    }

    public List<nilai_1094> findByCategory(Long categoryId) {
        return repo.findByCategory(categoryId);
    }

    public List<nilai_1094> findByName(String name) {
        return repo.findByName("%" + name + "%");
    }
}
