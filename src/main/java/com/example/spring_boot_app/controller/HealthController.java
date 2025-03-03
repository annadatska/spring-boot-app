package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    // Health check endpoint
    @GetMapping("/health")
    public String healthCheck() {
        try {
            // Simulate some simple logic
            Thread.sleep(100);  // Sleep for 100ms to simulate processing time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Application is running";
    }
}
