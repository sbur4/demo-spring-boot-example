package org.example.bean_scopes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.WebApplicationContext;

@Configuration
public class BeanConfig {

    // Singleton scope (default)
    @Bean
    @Scope("singleton")
    public ScopeService singletonService() {
        System.out.println("Hello Singleton");
        return new ScopeService("Singleton");
    }

    // Prototype scope
    @Bean
    @Scope("prototype")
    public ScopeService prototypeService() {
        System.out.println("Hello Prototype");
        return new ScopeService("Prototype");
    }

    // Request scope
    @Bean
    @Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
    public ScopeService requestService() {
        System.out.println("Hello Request");
        return new ScopeService("Request");
    }

    // Session scope
    @Bean
    @Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
    public ScopeService sessionService() {
        System.out.println("Hello Session");
        return new ScopeService("Session");
    }

    // Application scope
    @Bean
    @Scope(value = WebApplicationContext.SCOPE_APPLICATION, proxyMode = ScopedProxyMode.TARGET_CLASS)
    public ScopeService applicationService() {
        System.out.println("Hello Application");
        return new ScopeService("Application");
    }

    // Custom Scope: WebSocketScope - just a conceptual example, as this requires specific configuration.
    @Bean
    @Scope(scopeName = "websocket", proxyMode = ScopedProxyMode.TARGET_CLASS)
    public ScopeService websocketService() {
        System.out.println("Hello WebSocket");
        return new ScopeService("WebSocket");
    }
}