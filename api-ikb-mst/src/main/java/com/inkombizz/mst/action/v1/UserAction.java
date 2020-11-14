/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inkombizz.mst.action.v1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inkombizz.mst.dao.UserDao;
import com.inkombizz.mst.model.User;
import com.inkombizz.mst.utils.Response;

/**
 *
 * @author de4ragil
 */
@RestController
@RequestMapping("/user")
public class UserAction {

    @Autowired
    UserDao userDao;

    @GetMapping("/")
    public ResponseEntity<?> alldata() {
    	try {
            return new Response().response_json(true,"Ok",userDao.findAll(),HttpStatus.OK);	
    	}catch(Exception ex) {
            return new Response().response_json(true,"Fail",null,HttpStatus.INTERNAL_SERVER_ERROR);	
    	}
    }

    @PostMapping("/")
    public ResponseEntity<?> create(@RequestBody User model) {
    	try {
    		userDao.save(model);	
            return new Response().response_json(true,"Save Success",model,HttpStatus.OK);
    	}catch(Exception ex) {
            return new Response().response_json(true,"Save Fail",null,HttpStatus.INTERNAL_SERVER_ERROR);
    	}
    }

    @PutMapping("/{code}")
    public ResponseEntity<?> update(@RequestBody User model,@PathVariable String code) {
    	try {
    		userDao.save(model);	
            return new Response().response_json(true,"Save Success",model,HttpStatus.OK);
    	}catch(Exception ex) {
            return new Response().response_json(true,"Save Fail",null,HttpStatus.INTERNAL_SERVER_ERROR);
    	}
    }

    @DeleteMapping("/{code}")
    public ResponseEntity<?> delete(@PathVariable String code) {
    	try {
    		userDao.deleteById(code);	
            return new Response().response_json(true,"Save Success",null,HttpStatus.OK);
    	}catch(Exception ex) {
            return new Response().response_json(true,"Save Fail",null,HttpStatus.INTERNAL_SERVER_ERROR);
    	}
    }
}
