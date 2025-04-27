package com.rituraj.ecommerceWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @RequestMapping("/")
    @ResponseBody
    public String greet() {
        System.out.println("Hello, welcome to the E-commerce Web Application!");
        return "Hello, welcome to the E-commerce Web Application!";
    }
    @RequestMapping("/about")
    @ResponseBody
    public String about() {
        System.out.println("This is the about page.");
        return "This is the about page.";
    }
}
