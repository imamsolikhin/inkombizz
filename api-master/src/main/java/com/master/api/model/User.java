package com.master.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author de4ragil
 */
@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "scr_user")
public class User {
    
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
    @Column(name = "Code")
    private String code;

    @NotBlank
    @Column(name = "Username")
    private String username;
    
    @NotBlank
    @Column(name = "Password")
    private String password;
    
    @NotBlank
    @Column(name = "Email")
    private String email;


}
