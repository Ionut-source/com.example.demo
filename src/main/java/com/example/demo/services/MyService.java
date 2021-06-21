package com.example.demo.services;

import com.example.demo.repository.UserRepository;
import com.example.demo.repository.Users;
import com.example.demo.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.example.demo.vo.UserVO.*;

@Service
public class MyService {

    @Autowired
    private UserRepository userRepository;
    private int tries;
    
    public String castToString(Integer integerInput) throws Exception{
        tries++;
        System.out.println("Trial number: " + tries);
        if(tries == 2) {
            throw new Exception("Too many tries");
        }
        return integerInput.toString() + " updated";
    }

    public void saveUser (Users user) {
        userRepository.save(user);

    }
}
