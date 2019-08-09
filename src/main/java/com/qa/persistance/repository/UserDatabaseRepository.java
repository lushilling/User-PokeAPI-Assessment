package com.qa.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.persistance.entity.User;

public interface UserDatabaseRepository extends JpaRepository<User, Long>{

}
