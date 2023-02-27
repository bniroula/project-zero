package com.laundrycorporation.projectzero.service;

import com.laundrycorporation.projectzero.model.Entity.User;
import com.laundrycorporation.projectzero.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public List<User> postUsers(List<User> users){
        return userRepository.saveAll(users);
    }
}
