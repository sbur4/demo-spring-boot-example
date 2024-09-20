package org.example.qualifiers;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class SomeService {
    @PostConstruct
    public void demoFunction() {
        System.out.println("Hello Service");
    }
}
