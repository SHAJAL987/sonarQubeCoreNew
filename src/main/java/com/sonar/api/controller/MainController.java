package com.sonar.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sonar/v1")
public class MainController {
    @GetMapping("/health")
    public String healthCheck(){
        return "API Health is Ok!!";
    }
}
