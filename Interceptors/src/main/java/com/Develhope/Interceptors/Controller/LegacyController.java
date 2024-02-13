package com.Develhope.Interceptors.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/legacy")


public class LegacyController {

    @GetMapping("/legacy")
    public String getLegacyMessage() {
        return "This is just old code";
    }
}

