package com.sri.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sri")
public class SriController {

    @GetMapping("/test")
    public  String getRequest(){
    System.out.println("Hiii");
        return "Success  Welcome to Sri Application";
    }

}
