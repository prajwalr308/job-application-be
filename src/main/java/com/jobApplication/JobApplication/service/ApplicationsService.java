package com.jobApplication.JobApplication.service;
import com.jobApplication.JobApplication.model.Applications;
import com.jobApplication.JobApplication.model.Greeting;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class ApplicationsService {
    private final AtomicLong counter = new AtomicLong();
    private final Map<Long, Applications> applications = new ConcurrentHashMap<>();

    public Collection<Applications> getAllApplications() {
        return applications.values();
    }

    public Applications createApplication(String jobTile, String jobDescription,String status){
        Applications application = new Applications(counter.incrementAndGet(), jobTile,jobDescription,status);
        applications.put(application.getId(),application);
        return application;
    }

}
