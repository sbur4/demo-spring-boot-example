package org.example.stereotypes;

import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;

@Controller
public class IntroController {
    @PostConstruct
    public void demoFunction() {
        System.out.println("Hello Controller");
    }
}
