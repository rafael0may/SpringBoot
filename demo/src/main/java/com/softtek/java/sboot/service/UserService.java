package com.softtek.java.sboot.service;

 

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 

import com.softtek.java.sboot.entity.User;
import com.softtek.java.sboot.repository.UserRepository;

 

@Service
public class UserService {
    private UserRepository userRepository;
    
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    
    public User createUser(User user) {
        return userRepository.save(user);
    }
    
    
    public List<User> getAllUsers(){
        List<User> list = new ArrayList<User>();
        userRepository.findAll().forEach(e -> list.add(e));
        return list;
    }
    
    public Optional<User> findByUserName(String username){
    	return userRepository.findByUserName(username);
    }
    
    

 

}