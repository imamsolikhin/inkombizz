package com.master.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.master.api.model.User;

public interface UserRepository extends JpaRepository<User, String>{

}
