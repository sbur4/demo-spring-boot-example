package org.example.conditions.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.type.AnnotatedTypeMetadata;

@Configuration
public class CustomConditionConfig {
    @Bean
    @Conditional(MyCustomCondition.class)
    public ConditionalBean conditionalBean() {
        return new ConditionalBean();
    }

    static class MyCustomCondition implements Condition {
        @Override
        public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
            return "true".equals(System.getProperty("createBean"));
        }
    }
}
