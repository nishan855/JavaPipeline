package com.devops.devops.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@RestController
public class AppController {
    @GetMapping("/main/{name}")
    public String getServerTime(@PathVariable String name){
        LocalDateTime time = LocalDateTime.now();
        return String.format("Hi %s! %nServer Time: %s", name, time.format(DateTimeFormatter.ISO_DATE_TIME));
    }
}
