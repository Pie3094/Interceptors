package com.Develhope.Interceptors;

import com.Develhope.Interceptors.Interceptor.Legacy;
import com.Develhope.Interceptors.Interceptor.Logging;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableWebMvc
public class SpringApplicationConfiguration implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new Logging());
        registry.addInterceptor(new Legacy());
    }
}