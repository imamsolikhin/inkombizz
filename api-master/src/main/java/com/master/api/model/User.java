package com.master.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
//@Table(name="scr_user")// klw nama table dan nama class model beda
@Table
@Getter
@Setter
@ToString
public class User {

	public User() {
		
	}
	
	//@Column(name="code")  klw nama kolomnya beda nama
	@Column
	@Id
	private String code;
	@Column
	private String username;
	@Column
	private String password;
	
	@Column(name="RoleCode")
	private String roleCode;
}
