package com.jobApplication.JobApplication.service;



import com.jobApplication.JobApplication.model.Greeting;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    private final AtomicLong counter = new AtomicLong();
    private final Map<Long, Greeting> greetings = new ConcurrentHashMap<>();
    public Greeting createGreeting(String content) {
        Greeting greeting = new Greeting(counter.incrementAndGet(), content);
        greetings.put(greeting.getId(), greeting);
        System.out.println("Created Greeting: " + greeting.getContent()); // Add logging
        return greeting;

    }
    public Greeting getGreetingById(long id) {
        System.out.println("=====>"+id);
        System.out.println("=====>"+greetings);
        return greetings.get(id);
    }
    public Greeting updateGreeting(long id, String content){
            Greeting greeting = greetings.get(id);
            if (greeting != null) {
                greeting.setContent(content);
                greetings.put(id, greeting); // This line is technically optional as we're modifying the object directly
            }
            return greeting;


    }

    // Add methods for update, delete, etc., as needed.
}
