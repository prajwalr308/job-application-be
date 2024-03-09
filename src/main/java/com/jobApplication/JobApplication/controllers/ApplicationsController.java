package com.jobApplication.JobApplication.controllers;


import com.jobApplication.JobApplication.model.Applications;
import com.jobApplication.JobApplication.service.ApplicationsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.jobApplication.JobApplication.model.Greeting;
import com.jobApplication.JobApplication.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/jobs")
public class ApplicationsController {
    @Autowired
    private ApplicationsService applicationsService;

    @GetMapping
    public Collection<Applications> getAllApplications() {
        return applicationsService.getAllApplications();
    }

    @PostMapping
    public Applications postApplication(@RequestBody Applications applications){
        return applicationsService.createApplication(applications.getJobTitle(),applications.getJobDescription(),applications.getStatus());
    }

}
