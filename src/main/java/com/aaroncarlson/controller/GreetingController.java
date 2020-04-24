package com.aaroncarlson.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping("greetings")
    public String greeting(Map<String, Object> model) {
        model.put("message", "Welcome Aaron!");
        return "greeting";
    }

}