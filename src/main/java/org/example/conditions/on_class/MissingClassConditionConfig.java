package org.example.conditions.on_class;

import org.example.conditions.SomeBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MissingClassConditionConfig { //creates a bean only when the specified classes are not on the classpath.
    @Bean
    @ConditionalOnMissingClass("com.example.SomeMissingClass")
    public SomeBean someBean() {
        return new SomeBean();
    }
}
