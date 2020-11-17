package com.inkombizz.master.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inkombizz.master.model.User;

/**
 *
 * @author de4ragil
 */
@Repository
public interface UserDao extends JpaRepository<User, String> {

}
