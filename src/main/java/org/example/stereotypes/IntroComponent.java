package org.example.stereotypes;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class IntroComponent {
    @PostConstruct
    public void demoFunction() {
        System.out.println("Hello Component");
    }
}
