package com.Develhope.Interceptors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class InterceptorsApplication {

    public static void main(String[] args) {
        SpringApplication.run(InterceptorsApplication.class, args);
    }

}
