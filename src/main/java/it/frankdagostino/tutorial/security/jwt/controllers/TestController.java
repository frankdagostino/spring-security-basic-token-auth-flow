package it.frankdagostino.tutorial.security.jwt.controllers;

import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Log
public class TestController {

    @GetMapping("/hello")
    public String hello(){
        log.info("test hello");
        return "hellooo!!";
    }
}
