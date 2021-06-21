package com.example.demo.hello;

import com.example.demo.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnotherWorld {

    @Autowired
    private MyService service;

    @RequestMapping("/hello2")
    public String helloWorld() throws Exception {
        Integer integerValue = 2;
        String myString = service.castToString(integerValue);
        return myString;
    }
}
