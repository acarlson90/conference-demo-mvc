package com.aaroncarlson.controller;

import com.aaroncarlson.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {

    @GetMapping("registration")
    public String getRegistration(@ModelAttribute ("registration") Registration registration) {
        System.out.println("[RegistrationController] - getRegistration(): " + registration.getName());
        return "registration";
    }

    @PostMapping("registration")
    public String addRegistration(@ModelAttribute ("registration") Registration registration) {
        System.out.println("[RegistrationController] - addRegistration(): " + registration.getName());
        return "registration";
    }

}
