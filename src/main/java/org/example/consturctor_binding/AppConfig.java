package org.example.consturctor_binding;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConstructorBinding
@ConfigurationProperties(prefix = "app")
public class AppConfig {

    private final String name;
    private final String environment;

    public AppConfig(String name, String environment) {
        this.name = name;
        this.environment = environment;
    }

    public String getName() {
        return name;
    }

    public String getEnvironment() {
        return environment;
    }
}
