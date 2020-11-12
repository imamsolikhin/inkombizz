package com.master.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.master.api.model.User;

/**
 *
 * @author de4ragil
 */
@Repository
public interface UserDao extends JpaRepository<User, String> {

}
