package com.Develhope.Interceptors.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/basic")

public class BasicController {

    @GetMapping("/time")
    public String getTime() {
        return LocalDateTime.now().toString();
    }
}

