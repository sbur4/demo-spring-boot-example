package org.example.configurations;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class Application {
    @Bean
    public NewService studentService() {
        return new NewService();
    }
}
