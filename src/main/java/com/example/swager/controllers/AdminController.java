package com.example.swager.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${api.prefix}/admin")
public class AdminController {
    @GetMapping("/admin1")
    public String index1(){
        return "admin page 1";
    }
    @GetMapping("/admin2")
    public String index2(){
        return "admin page 2";
    }
}
