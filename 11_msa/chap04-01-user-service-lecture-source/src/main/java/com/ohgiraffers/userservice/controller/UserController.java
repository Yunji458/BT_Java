package com.ohgiraffers.userservice.controller;

import com.ohgiraffers.userservice.dto.HelloDTO;
import com.ohgiraffers.userservice.dto.RequestRegistUserDTO;
import com.ohgiraffers.userservice.dto.ResponseRegistUserDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {

    private Environment env;
    private HelloDTO hello;

    @Autowired
    public UserController(Environment env, HelloDTO hello) {
        this.env = env;
        this.hello = hello;
    }

    @GetMapping("/health")
    public String status() {
        return "I'm Working in User Service "
                + env.getProperty("local.server.port");
    }

    @GetMapping("/welcome")
    public String welcom() {
        return hello.getMessage();
    }

    @PostMapping("/users")
    public ResponseEntity<ResponseRegistUserDTO> registUser(@RequestBody RequestRegistUserDTO newUser) {

    }
}