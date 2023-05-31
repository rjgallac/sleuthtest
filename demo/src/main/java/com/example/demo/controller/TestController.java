package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private RestTemplate restTemplate;
    @GetMapping
    public String get(){
        log.info("test");
        restTemplate.getForObject("http://localhost:8081/test", String.class);
        restTemplate.getForObject("http://localhost:8082/test", String.class);

        return "test";
    }
}
