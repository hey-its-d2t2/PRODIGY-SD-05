package com.PRODIGY_SD_05.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UIController {
    @GetMapping("/")
    public String showScraperPage() {
        return "index";
    }
}
