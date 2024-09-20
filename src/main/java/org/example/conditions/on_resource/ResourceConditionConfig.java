package org.example.conditions.on_resource;

import org.springframework.boot.autoconfigure.condition.ConditionalOnResource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ResourceConditionConfig { // creates a bean only if a specific resource is present.
    @Bean
    @ConditionalOnResource(resources = "classpath:some-resource.properties")
    public ResourceBasedBean resourceBasedBean() {
        return new ResourceBasedBean();
    }
}
