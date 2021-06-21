package com.example.demo.hello;

import com.example.demo.repository.Users;
import com.example.demo.services.MyService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @Autowired
    private MyService service;

    @RequestMapping("/hello")
    public String helloWorld() throws Exception {
        Integer integerValue = 1;
        String myString = service.castToString(integerValue);
        return myString;
    }

    @RequestMapping
    public void saveUser() {
        Users user = new Users();
        user.setName("Adrian");
        user.setAge(18);

        service.saveUser(user);
    }
}
