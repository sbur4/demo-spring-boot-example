package org.example.qualifiers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DataSourceConfig {
    @Bean
    @Qualifier("customerDb")
    public SomeService customerDataSource() {
        System.out.println("Hello Qualifier");
        return new SomeService();  // Assume a constructor or setup for a Customer DB
    }

    @Bean
    @Primary
    public SomeService orderDataSource() {
        System.out.println("Hello Primary");
        return new SomeService();  // Assume a constructor or setup for an Order DB
    }
}