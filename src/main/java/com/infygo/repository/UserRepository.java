package com.infygo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infygo.model.User;

public interface UserRepository extends JpaRepository<User, String> {

}
