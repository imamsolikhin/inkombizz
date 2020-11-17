package com.inkombizz.master.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inkombizz.master.model.UserModel;

/**
 *
 * @author de4ragil
 */
@Repository
public interface UserRepository extends JpaRepository<UserModel, String> {

}
