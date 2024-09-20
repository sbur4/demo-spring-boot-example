package org.example.stereotypes;

import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class IntroConfig {
    @PostConstruct
    public void demoFunction() {
        System.out.println("Hello Configuration");
    }
}
