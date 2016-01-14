package com.gooddata.iocintroduction.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gooddata.iocintroduction.model.Brake;
import com.gooddata.iocintroduction.model.Engine;

@Configuration
public class CarConfig {

    @Bean
    public Engine loggedEngine() {
        return () -> System.out.println("... accelerating");
    }

    @Bean
    public Brake loggedBrake() {
        return () -> System.out.println("... stopping");
    }

}
