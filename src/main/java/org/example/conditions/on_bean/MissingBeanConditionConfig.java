package org.example.conditions.on_bean;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MissingBeanConditionConfig { //creates a bean only if another specified bean is not present in the Spring context.
    @Bean
    @ConditionalOnMissingBean(PrimaryBean.class)
    public AlternateBean alternateBean() {
        return new AlternateBean();
    }
}