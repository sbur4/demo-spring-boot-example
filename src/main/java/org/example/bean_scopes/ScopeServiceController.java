package org.example.bean_scopes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.socket.config.annotation.EnableWebSocket;

@EnableWebSocket
@RestController
public class ScopeServiceController {
    @Autowired
    private ScopeService singletonService;

    @Autowired
    private ScopeService prototypeService;

    @Autowired
    private ScopeService requestService;

    @Autowired
    private ScopeService sessionService;

    @Autowired
    private ScopeService applicationService;

    @Autowired
    private ScopeService websocketService;

    @GetMapping("/service")
    public String getServiceTypes() {
        return String.format("Singleton: %s, Prototype: %s, Request: %s, Session: %s, Application: %s, WebSocket: %s",
                singletonService.getType(), prototypeService.getType(),
                requestService.getType(), sessionService.getType(),
                applicationService.getType(), websocketService.getType());
    }
}
