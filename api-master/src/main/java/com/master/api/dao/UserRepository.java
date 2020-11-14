package com.master.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.master.api.model.User;

public interface UserRepository extends JpaRepository
	<User, String> {
	//<T, ID> T=model, ID= type data dari TableUser

}
