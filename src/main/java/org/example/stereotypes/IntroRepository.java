package org.example.stereotypes;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

@Repository
public class IntroRepository {
    @PostConstruct
    public void demoFunction() {
        System.out.println("Hello Repository");
    }
}
