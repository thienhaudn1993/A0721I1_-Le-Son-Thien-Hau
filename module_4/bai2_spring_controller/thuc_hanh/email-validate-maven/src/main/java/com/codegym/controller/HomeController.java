package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Pattern pattern = Pattern.complie(Regex)
// Matcher matcher = pattern.matcher(src) - src là chuỗi cần validate
// boolean match = matcher.matches()
// match = true -> hợp lệ, match = false -> ko hợp lệ
@Controller
public class HomeController {
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    private static Pattern pattern;
    private Matcher matcher;

    public HomeController() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @PostMapping("/validate")
    public String user(@RequestParam("email") String email, ModelMap modelMap) {
        boolean isValid = this.validate(email);
        if (!isValid) {
            modelMap.addAttribute("message", "Email is invalid");
            return "home";
        }
        modelMap.addAttribute("email", email);
        return "success";
    }

    private boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
