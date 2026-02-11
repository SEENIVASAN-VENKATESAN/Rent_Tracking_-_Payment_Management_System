package com.RenterzPaizza.RenterzPaizza.service;

import com.RenterzPaizza.RenterzPaizza.entity.UnitAllocation;
import com.RenterzPaizza.RenterzPaizza.repository.UnitAllocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class UnitAllocationService {
    @Autowired
    private UnitAllocationRepository allocationRepository;

    public UnitAllocation allocate(UnitAllocation allocation) {
        allocation.setStatus("ACTIVE");
        return allocationRepository.save(allocation);
    }

    public void vacate(Long allocationId) {
        UnitAllocation allocation = allocationRepository.findById(allocationId).orElseThrow();
        allocation.setStatus("VACATED");
        allocation.setEndDate(LocalDate.now());
        allocationRepository.save(allocation);
    }
}
