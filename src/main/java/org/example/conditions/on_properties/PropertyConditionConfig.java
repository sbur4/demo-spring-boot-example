package org.example.conditions.on_properties;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropertyConditionConfig { //creates a bean based on the presence and value of a Spring Environment property.
    @Bean
    @ConditionalOnProperty(name = "some.property", havingValue = "expectedValue")
    public PropertyBasedBean propertyBasedBean() {
        return new PropertyBasedBean();
    }
}