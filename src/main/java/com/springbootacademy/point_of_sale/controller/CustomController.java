package com.springbootacademy.point_of_sale.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("api/v1/custom")
public class CustomController {
    @GetMapping("/get-text-1")
    public String getMyTest1(){
        String myText="This is my fst custom";
        System.out.println(myText);
        return myText;
    }
    @GetMapping("/get-text-2")
    public String getMyTest2(){
        String myText2="This is my second custom";
        System.out.println(myText2);
        return myText2;
    }
}
