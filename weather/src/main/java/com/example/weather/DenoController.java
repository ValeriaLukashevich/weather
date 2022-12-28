package com.example.weather;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DenoController {

    @GetMapping("/test")
    public String test() {
        return "TEST";

    }
}
