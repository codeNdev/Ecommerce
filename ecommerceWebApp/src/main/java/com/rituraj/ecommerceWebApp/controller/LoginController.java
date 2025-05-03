package com.rituraj.ecommerceWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @RequestMapping("/login")
    public String login() {
//        System.out.println("Login page!");
        return "Login page!";
    }
}
