package com.jobApplication.JobApplication.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.jobApplication.JobApplication.model.Greeting;
import com.jobApplication.JobApplication.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greetings")
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    // GET request
    @GetMapping("/{id}")
    public Greeting getGreeting(@PathVariable long id) {
        // For simplicity, returning a new Greeting; replace with real lookup
        return greetingService.getGreetingById(id);

    }

    // POST request
    @PostMapping
    public Greeting createGreeting(@RequestBody Greeting greeting) {
        return greetingService.createGreeting(greeting.getContent());
    }

    // PATCH request
    @PatchMapping("/{id}")
    public Greeting updateGreeting(@PathVariable long id, @RequestBody Greeting greeting) {
        // For simplicity, returning a modified Greeting; replace with real update logic
        return greetingService.updateGreeting(id,greeting.getContent());
    }
}
