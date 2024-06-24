package org.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/user/login")
    public String showLoginForm(Model model) {
        return "login";  // This will render the login.html template
    }

    @PostMapping("/user/login")
    public String loginUser(@RequestParam String username, @RequestParam String password, Model model) {
        // Simple login logic, replace with your authentication logic
        if ("admin".equals(username) && "password".equals(password)) {
            return "redirect:/user/home";  // Redirect to the home page after successful login
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "login";  // Reload the login page with error message
        }
    }
}
