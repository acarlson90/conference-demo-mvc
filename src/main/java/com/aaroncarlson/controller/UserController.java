package com.aaroncarlson.controller;

import com.aaroncarlson.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserController {

    @GetMapping("/users")
    public User getUser(@RequestParam(value = "firstName", defaultValue = "defaultFirstName") String firstName,
                        @RequestParam(value = "lastName", defaultValue = "defaultLastName") String lastName,
                        @RequestParam(value = "age", defaultValue = "30") int age) {
        User userResponse = new User();
        userResponse.setFirstName(firstName);
        userResponse.setLastName(lastName);
        userResponse.setAge(age);
        return userResponse;
    }

    @PostMapping("/users")
    public User createUser(@Valid User user) {
        System.out.println("[UserController] - createuser()");
        return user;
    }

}
