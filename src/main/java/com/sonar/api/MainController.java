package com.sonar.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sonar")
public class MainController {
    @GetMapping("/v1")
    public String test(){
        return "Hello";
    }
}
