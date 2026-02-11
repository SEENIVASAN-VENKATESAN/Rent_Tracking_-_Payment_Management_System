package com.RenterzPaizza.RenterzPaizza.controller;

import com.RenterzPaizza.RenterzPaizza.entity.Unit;
import com.RenterzPaizza.RenterzPaizza.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/units")
public class UnitController {

    @Autowired
    private UnitService unitService;

    @PostMapping
    public Unit create(@RequestBody Unit unit) {
        return unitService.create(unit);
    }

    @GetMapping("/property/{propertyId}")
    public List<Unit> byProperty(@PathVariable Long propertyId) {
        return unitService.getByProperty(propertyId);
    }
}

