package com.jk.universalreview.users;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {
    @Value( value = "${spring.application.name}")
    private String appName;
    @GetMapping(value = "/")
    public String welcome(){
        return "<H1>Welcome to "+appName+"</H1><p>Open Swagger: <a href='/swagger-ui/index.html' target='_blank'>Swagger</a></p>" +
                "<p>Get Access Token: <a href='/auth/login' target='_blank'>OKTA Login</a></p>";
    }
}
