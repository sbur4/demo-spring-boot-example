package org.example.conditions.on_web_app;

import org.springframework.boot.autoconfigure.condition.ConditionalOnNotWebApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebAppConditionConfig {
    @Bean
    @ConditionalOnWebApplication
    public WebBean webBean() {
        return new WebBean();
    }

    @Bean
    @ConditionalOnNotWebApplication
    public NonWebBean nonWebBean() {
        return new NonWebBean();
    }
}
