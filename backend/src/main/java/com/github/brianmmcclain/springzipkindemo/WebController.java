package com.github.brianmmcclain.springzipkindemo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class WebController {
    
    @GetMapping("/")
    public String helloWorld() {
        return "Backend";
    }
}
