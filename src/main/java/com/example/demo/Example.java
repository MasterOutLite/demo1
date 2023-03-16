package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("say")
public class Example {

    @GetMapping(produces= "text/html")
    public String sayHello () {
        return "{title: 'Hello', body: 'It is my first code!'}";
    }

    @GetMapping("/get")
    public String GetHello () {
        return "Get msgfgf";
    }
}
