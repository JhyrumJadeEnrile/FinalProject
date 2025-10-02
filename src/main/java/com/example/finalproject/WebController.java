package com.example.finalproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String showDashboard(Model model) {
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

    @GetMapping("/Profile")
    public String showProfilePage(Model model) {
        return "user-profile";
    }

    @GetMapping("/Classes")
    public String showClassesPage(Model model) {
        return "classes";
    }

    @GetMapping("/Students")
    public String showStudentsPage(Model model) {
        return "students";
    }

    @GetMapping("/Task")
    public String showTasksPage(Model model) {
        return "task";
    }

    @GetMapping("/Output")
    public String showOutputPage(Model model) { return "output"; }

    @GetMapping("/Uiforms")
    public String showUiformsPage(Model model) { return "ui-forms"; }

    @GetMapping("/Studentindex")
    public String showStudentindexPage(Model model) { return "studentindex"; }

    @GetMapping("/Points")
    public String showDiscountCard(Model model) {
        model.addAttribute("discountValue", "30% OFF");
        model.addAttribute("couponCode", "UPGRADE30");
        model.addAttribute("shopUrl", "/shop");
        return "discount-code";
    }

    @GetMapping("/docs")
    public String showDocsPage(Model model) {
        return "docs";
    }

    @GetMapping("/sample-page")
    public String showSamplePage(Model model) {
        return "sample-page";
    }

    @GetMapping("/icons")
    public String showIconsPage(Model model) {
        return "icon-tabler";
    }

    @GetMapping("/ui-alerts")
    public String showUiAlerts(Model model) {
        return "ui-alerts";
    }

    @GetMapping("/ui-buttons")
    public String showUiButtons(Model model) {
        return "ui-buttons";
    }

    @GetMapping("/ui-card")
    public String showUiCard(Model model) {
        return "ui-card";
    }

    @GetMapping("/ui-forms")
    public String showUiForms(Model model) {
        return "ui-forms";
    }

    @GetMapping("/ui-typography")
    public String showUiTypography(Model model) {
        return "ui-typography";
    }

    @GetMapping("/Chat")
    public String showChatPage(Model model) { return "chat"; }

    @GetMapping("/forgot-password")
    public String showForgotPasswordForm() {
        return "forgot-password";}
}
