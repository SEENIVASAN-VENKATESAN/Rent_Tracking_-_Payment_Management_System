package com.RenterzPaizza.RenterzPaizza.controller;

import com.RenterzPaizza.RenterzPaizza.entity.UnitAllocation;
import com.RenterzPaizza.RenterzPaizza.service.UnitAllocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/allocations")
public class UnitAllocationController {

    @Autowired
    private UnitAllocationService allocationService;

    @PostMapping
    public UnitAllocation allocate(@RequestBody UnitAllocation allocation) {
        return allocationService.allocate(allocation);
    }

    @PutMapping("/{id}/vacate")
    public void vacate(@PathVariable Long id) {
        allocationService.vacate(id);
    }
}
