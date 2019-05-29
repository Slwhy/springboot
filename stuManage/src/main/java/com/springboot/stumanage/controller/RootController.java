package com.springboot.stumanage.controller;

import com.springboot.stumanage.entity.User;
import com.springboot.stumanage.entity.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/root/addUser")
    public String addUser(User user){
        userRepository.save(user);
        return "success";
    }

}
