package com.yzit.shop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestOrder {
    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
