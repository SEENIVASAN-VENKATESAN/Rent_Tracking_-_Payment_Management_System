package com.RenterzPaizza.RenterzPaizza.controller;

import com.RenterzPaizza.RenterzPaizza.entity.Complaint;
import com.RenterzPaizza.RenterzPaizza.service.ComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/complaints")
public class ComplaintController {

    @Autowired
    private ComplaintService complaintService;

    @PostMapping
    public Complaint raise(@RequestBody Complaint complaint) {
        return complaintService.raise(complaint);
    }
}

