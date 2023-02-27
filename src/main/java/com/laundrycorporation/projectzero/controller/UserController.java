package com.laundrycorporation.projectzero.controller;

import com.laundrycorporation.projectzero.model.Entity.User;
import com.laundrycorporation.projectzero.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("/users")
    public void postUsers(){
        User newUser = User
                .builder()
                .firstName("Rojan")
                .lastName("Maharjan")
                .dateOfBirth(ZonedDateTime.now())
                .email("rojan@rojan.com")
                .phoneNumber("1234556780")
                .hasRoom(false)
                .isVerified(true)
                .dateJoined(ZonedDateTime.now())
                .availabilityStarting(ZonedDateTime.now())
                .build();

        userService.postUsers(List.of(newUser));
    }
}
