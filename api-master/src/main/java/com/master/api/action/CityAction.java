///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.master.api.action;
//
//import com.master.api.dao.CityDao;
//import com.master.api.model.City;
//import com.master.api.setting.ResourceNotFoundException;
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// *
// * @author de4ragil
// */
//@RestController
//@RequestMapping("/master")
//public class CityAction {
//
//    @Autowired
//    CityDao cityDao;
//
//    @GetMapping("/city")
//    public List<City> alldata() {
//        return cityDao.findAll();
//    }
//
//    @PostMapping("/city")
//    public City create(@RequestBody City city) {
//        return cityDao.save(city);
//    }
//
//    @GetMapping("/city/{id}")
//    public City data(@PathVariable(value = "id") Long cityId) {
//        return cityDao.findById(cityId)
//                .orElseThrow(() -> new ResourceNotFoundException("City", "code", cityId));
//    }
//
//    @PutMapping("/city/{id}")
//    public City update(@PathVariable(value = "id") Long cityId,
//            @RequestBody City cityDetails) {
//
//        City city = cityDao.findById(cityId)
//                .orElseThrow(() -> new ResourceNotFoundException("City", "Code", cityId));
//
//        city.setName(cityDetails.getName());
//        City updatedCity = cityDao.save(city);
//        return updatedCity;
//    }
//
//    @DeleteMapping("/city/{id}")
//    public ResponseEntity<?> delete(@PathVariable(value = "id") Long cityId) {
//        City city = cityDao.findById(cityId)
//                .orElseThrow(() -> new ResourceNotFoundException("City", "id", cityId));
//
//        cityDao.delete(city);
//
//        return ResponseEntity.ok().build();
//    }
//}
