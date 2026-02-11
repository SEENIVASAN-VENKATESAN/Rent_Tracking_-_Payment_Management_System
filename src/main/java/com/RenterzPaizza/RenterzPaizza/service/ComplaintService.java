package com.RenterzPaizza.RenterzPaizza.service;

import com.RenterzPaizza.RenterzPaizza.entity.Complaint;
import com.RenterzPaizza.RenterzPaizza.repository.ComplaintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComplaintService {
    @Autowired
    private ComplaintRepository complaintRepository;

    public Complaint raise(Complaint complaint) {
        complaint.setStatus("OPEN");
        return complaintRepository.save(complaint);
    }
}
