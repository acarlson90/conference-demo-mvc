package com.aaroncarlson.controller;

import com.aaroncarlson.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class RegistrationController {

    @GetMapping("registration")
    public String getRegistration(@ModelAttribute ("registration") Registration registration) {
        System.out.println("[RegistrationController] - getRegistration(): " + registration.getName());
        return "registration";
    }

    @PostMapping("registration")
    public String addRegistration(@Valid @ModelAttribute ("registration") Registration registration,
                                  BindingResult result) {
        if (result.hasErrors()) {
            System.out.println("[RegistrationController] - addRegistration(): Number of Errors: " + result.getErrorCount());
            return "registration";
        }

        System.out.println("[RegistrationController] - addRegistration(): " + registration.getName());
        return "redirect:registration";
    }

}
