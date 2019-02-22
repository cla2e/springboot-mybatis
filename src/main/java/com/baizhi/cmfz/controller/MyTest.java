package com.baizhi.cmfz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class MyTest {
    @RequestMapping("test")
    public String test() {
        return "Hello SpringBoot";
    }
}
