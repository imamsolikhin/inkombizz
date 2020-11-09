/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.master.api.controllers;

import java.text.DecimalFormat;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author de4ragil
 */
@RestController
@RequestMapping("/city")
public class CityController {

    @GetMapping(value = "/generade/{id}")
    public String getGeneradeCode(@PathVariable("id") Long id) {
        DecimalFormat df = new DecimalFormat("0000");
        return df.format(id);
    }

    @GetMapping
    public String findAll() {
        return "All Data Success";
    }
    
    @GetMapping(value = "/{id}")
    public String findById(@PathVariable("id") String id) {
        return "One Data Success";
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public String create(@RequestBody String resource) {
        return "Save Success";
    }

    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String update(@PathVariable("id") Long id, @RequestBody String resource) {
        return "Update Success";
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String delete(@PathVariable("id") String id) {
        return "Delete Success";
    }
}
