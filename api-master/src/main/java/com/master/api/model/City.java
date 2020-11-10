///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.master.api.model;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import java.util.Date;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.EntityListeners;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//import lombok.Getter;
//import lombok.Setter;
//import org.hibernate.validator.constraints.NotBlank;
//import org.springframework.data.annotation.CreatedDate;
//import org.springframework.data.annotation.LastModifiedDate;
//import org.springframework.data.jpa.domain.support.AuditingEntityListener;
//
///**
// *
// * @author de4ragil
// */
//@Getter
//@Setter
//@Entity
//@EntityListeners(AuditingEntityListener.class)
//@Table(name = "mst_city")
////@JsonIgnoreProperties(value = {"createdDate", "updatedDate"}, allowGetters = true)
//public class City {
//    
//    @Id
//    @GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
//    @Column(name = "Code")
//    private String code;
//
//    @NotBlank
//    @Column(name = "Name")
//    private String name;
//
////    @NotBlank
////    @Column(name = "CreatedBy")
////    private String createdBy;
////
////    @Temporal(TemporalType.TIMESTAMP)
////    @CreatedDate
////    @Column(name = "CreatedDate")
////    private Date createdDate;
////
////    @NotBlank
////    @Column(name = "UpdatedBy")
////    private String updatedBy;
////
////    @Temporal(TemporalType.TIMESTAMP)
////    @LastModifiedDate
////    @Column(name = "UpdatedDate")
////    private Date updatedDate;
//}
