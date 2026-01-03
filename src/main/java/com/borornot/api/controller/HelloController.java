package com.borornot.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 이 클래스가 REST API를 처리하는 컨트롤러임을 선언
public class HelloController {

    @GetMapping("/hello") // 브라우저에서 /hello로 접속하면 이 메서드를 실행
    public String hello() {
        return "Hello, I am a Human... or maybe a Bot? 🤖";
    }
}