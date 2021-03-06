package com.softtek.java.sboot.repository;

 

import java.util.Optional;

 

import org.springframework.data.repository.CrudRepository;

 

import com.softtek.java.sboot.entity.User;

 

 

public interface UserRepository extends CrudRepository<User, Long>  {
    public Optional<User> findByUserName(String username);    
}