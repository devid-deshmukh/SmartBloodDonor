package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/donors")
public class DonorController {

    @Autowired
    private DonorRepository donorRepository;

    // Get all donors
    @GetMapping
    public List<Donor> getAllDonors() {
        return donorRepository.findAll();
    }

    // Add a new donor
    @PostMapping
    public Donor addDonor(@RequestBody Donor donor) {
        return donorRepository.save(donor);
    }
}
