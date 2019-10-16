package com.becca.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sungyeonjo on 2019. 7. 20..
 */
@RestController
public class MainController {
    @GetMapping("/")
    public String hello() {
        return "hello";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/error")
    public String error() {
        return "error..";
    }
}
