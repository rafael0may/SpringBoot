package com.softtek.java.sboot.rest;

 

import java.util.List;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 

import com.softtek.java.sboot.entity.User;
import com.softtek.java.sboot.repository.UserRepository;
import com.softtek.java.sboot.service.UserService;

 

@RestController
public class UserRest {
    
    private UserRepository userRepository;
    
    @Autowired
    public UserRest(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    @RequestMapping("/userlist")
    public  List<User> getAll(){
        UserService user = new UserService(userRepository);
        return user.getAllUsers();
    }

 

}