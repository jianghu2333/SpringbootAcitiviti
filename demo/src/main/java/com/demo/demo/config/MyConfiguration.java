package com.demo.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
/**
 * @Author Jiang
 * @Description //TODO
 * @Date 19:32 2020/10/13
 * @Param 
 * @return
 */
public class MyConfiguration {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/*")
                          .allowedOrigins("*")
                          .allowCredentials(true)
                          .allowedMethods("GET", "POST", "DELETE", "PUT","PATCH")
                          .maxAge(3600);
            }
        };
    }}
