package com.course.pracicaljava.api.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
@RequestMapping("/api")
public class DefaultRestApi {

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to Spring andj!";
    }

    @GetMapping("/time")
    public String time(){
        return LocalTime.now().toString();
    }
}
