package com.github.brianmmcclain.springzipkindemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WebController {
    
    @GetMapping("/")
    public String helloWorld() {
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject("http://localhost:8082", String.class);
        return "<h1>Hello from the " + response + "!</h1>";
    }
}
