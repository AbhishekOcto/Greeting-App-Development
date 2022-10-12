package com.bridgelabz.greetingapp.controllers;
import com.bridgelabz.greetingapp.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @Autowired
    private IGreetingService greetingService;

    @GetMapping("/greeting")
    public String greeting(){
        return greetingService.getGreetingMessage();
    }

}
