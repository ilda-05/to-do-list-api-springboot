package com.ilda.todo.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.observation.transport.ResponseContext;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class helloWorld {

    @GetMapping("/")
    public String helloWorldTest() {
        return "Hello World";
    }

}
