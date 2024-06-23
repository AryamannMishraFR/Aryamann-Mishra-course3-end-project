package org.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/user/login")
    public String showLoginForm(Model model) {
        // Add any necessary attributes to the model here
        return "login";
    }
}
