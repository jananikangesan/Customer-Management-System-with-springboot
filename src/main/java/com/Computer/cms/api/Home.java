package com.Computer.cms.api;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Home {
    
    @GetMapping
    public String home(){
        return "Application is works!!! "+new Date();
    }
}
