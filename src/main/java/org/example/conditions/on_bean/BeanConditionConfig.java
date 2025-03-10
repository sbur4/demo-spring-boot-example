package org.example.conditions.on_bean;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConditionConfig { //creates a bean only if another bean is present in the Spring context.
    @Bean
    public PrimaryBean primaryBean() {
        return new PrimaryBean();
    }

    @Bean
    @ConditionalOnBean(PrimaryBean.class)
    public DependentBean dependentBean() {
        return new DependentBean();
    }
}
