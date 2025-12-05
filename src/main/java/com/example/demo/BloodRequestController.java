package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blood-requests")
public class BloodRequestController {

    @Autowired
    private BloodRequestRepository bloodRequestRepository;

    // Get all blood requests
    @GetMapping
    public List<BloodRequest> getAllRequests() {
        return bloodRequestRepository.findAll();
    }

    // Add a new blood request
    @PostMapping
    public BloodRequest addRequest(@RequestBody BloodRequest request) {
        return bloodRequestRepository.save(request);
    }
}
