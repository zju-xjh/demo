package com.test.demo.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/test")
public class TestBootController {

    @RequestMapping("demo")
    public String getString() {
        return "自动化部署demo";
    }
}
