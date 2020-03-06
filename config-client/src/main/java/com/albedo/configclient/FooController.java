package com.albedo.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {
    @Value("${foo}")
    private String foo;
    @RequestMapping("/hi")
    public String getFoo(){
        return foo;
    }
}
