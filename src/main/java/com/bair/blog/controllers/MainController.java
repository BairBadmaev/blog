package com.bair.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController /* отвечает за все переходы на сайте*/ {

    @GetMapping("/") /* главная страница*/
    public String home(Model model) {
        model.addAttribute("title", "Главная страница");
        return "home";
    }

    @GetMapping("/aboutUs") /* страница*/
    public String aboutUs(Model model) {
        model.addAttribute("title", "Страница про нас");
        return "aboutUs";
    }

}