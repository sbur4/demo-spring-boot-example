package org.example.consturctor_binding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
@EnableConfigurationProperties(AppConfig.class)
public class ConfigClass {
    @Autowired
    private AppConfig appConfig;

    @PostConstruct
    public void demoFunction() {
        System.out.println(appConfig);
    }
}
