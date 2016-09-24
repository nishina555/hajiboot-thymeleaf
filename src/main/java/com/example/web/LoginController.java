package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by nishina on 2016/09/25.
 */
@Controller
public class LoginController {
    @GetMapping(path = "loginForm")
    String loginForm() {
        return "loginForm";
    }
}
