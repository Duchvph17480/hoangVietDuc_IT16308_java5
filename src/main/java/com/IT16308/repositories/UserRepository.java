package com.IT16308.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.IT16308.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
