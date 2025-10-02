package com.example.finalproject; // CHANGE THIS to your actual package name

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String showDashboard(Model model) {
        // You can add data needed for your dashboard here later
        model.addAttribute("username", "Admin User");
        return "index";
    }

    @GetMapping("/login")
    public String showLoginPage(Model model) {
        return "authentication-login";
    }

    @GetMapping("/register")
    public String showRegisterPage(Model model) {
        return "authentication-register";
    }
}