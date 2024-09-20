package org.example.conditions.on_class;

import org.example.conditions.SomeBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClassConditionConfig { //creates a bean only when specified classes are on the classpath.
    @Bean
    @ConditionalOnClass(name = "org.example.SomeClass")
    public SomeBean someBean() {
        return new SomeBean();
    }
}
