package com.example.HotelManagementSystem;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class test {
    @GetMapping
    public Object String(){
        return "hello";
    }
}
