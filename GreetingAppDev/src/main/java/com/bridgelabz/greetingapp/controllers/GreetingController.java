package com.bridgelabz.greetingapp.controllers;
import com.bridgelabz.greetingapp.entity.User;
import com.bridgelabz.greetingapp.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @Autowired
    private IGreetingService greetingService;

    @GetMapping("/greeting")
    public String greeting(@RequestParam String firstName, @RequestParam String lastName){
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return greetingService.getGreetingMessage(user);
    }

}
