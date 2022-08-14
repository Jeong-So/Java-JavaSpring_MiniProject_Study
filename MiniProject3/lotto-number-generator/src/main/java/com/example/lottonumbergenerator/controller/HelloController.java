package com.example.lottonumbergenerator.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloController {

    @GetMapping("/")
    public String hello() {
        System.out.println("hello API 실행 중");
        return "hello";
    }

}
