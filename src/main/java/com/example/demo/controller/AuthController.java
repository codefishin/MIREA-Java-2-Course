package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthController {
    private User registeredUser;
    private boolean isAuthenticated = false;
    private String userMessage = "";

    @GetMapping("/")
    public String redirToReg(){
        return "redirect:/register";
    }
    @GetMapping("register")
    public String showRegisterPage() {
        return "register.html";
    }
    @PostMapping("/register")
    public String register(@RequestParam String username, @RequestParam String password, Model model) {
        if (username.isEmpty() || password.isEmpty()) {
            model.addAttribute("error", "Username and password cannot be empty.");
            return "register.html";
        }
        registeredUser = new User(username, password);
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String showLoginPage() {
        return "login.html";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        if (registeredUser == null || !registeredUser.getUsername().equals(username) ||
                !registeredUser.getPassword().equals(password)) {
            model.addAttribute("error", "Wrong username or password");
            return "redirect:/login";
        }
        isAuthenticated = true;
        registeredUser.setUsername(username);
        registeredUser.setPassword(password);
        return "redirect:/feedback";
    }

    @GetMapping("/feedback")
    public String showFeedback() {
        if (!isAuthenticated) {
            return "redirect:/login.html";
        }
        return "feedback.html";
    }
    @PostMapping("/feedback")
    public String feedbackPost(@RequestParam String email,@RequestParam String message, @RequestParam String name) {

        if (!name.equals(registeredUser.getUsername())) {
            System.err.println("Unregistered user mentioned");
            return "redirect:/feedback";
        }
        userMessage = message;
        System.err.println("USER REGISTERED: " + registeredUser.getUsername());
        System.err.println("USER PASSWORD: " + registeredUser.getPassword());
        System.out.println("EMAIL: " + email);
        System.out.println("USER MSG: " + userMessage);
        return "redirect:/home";
    }
    @GetMapping("/home")
    public String showHomePage(Model model) {
        if (!isAuthenticated) {
            return "redirect:/register";
        }
        model.addAttribute(registeredUser); // ?? why won't it work
        return "home.html";
    }
}
