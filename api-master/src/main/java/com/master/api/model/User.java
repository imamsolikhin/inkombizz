package com.master.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
@Table(name="user")
public class User {

	public User() {
		// TODO Auto-generated constructor stub
		
	}
	
	@Column(name="code")
	@Id
	private String code;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="rolecode")
	private String rolecode;
	
}
