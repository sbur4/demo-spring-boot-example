package org.example.stereotypes;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class IntroService {
    @PostConstruct
    public void demoFunction() {
        System.out.println("Hello Service");
    }
}
