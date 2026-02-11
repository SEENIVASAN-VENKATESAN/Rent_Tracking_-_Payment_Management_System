package com.RenterzPaizza.RenterzPaizza.controller;

import com.RenterzPaizza.RenterzPaizza.entity.Property;
import com.RenterzPaizza.RenterzPaizza.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/properties")
public class PropertyController {

    @Autowired
    private PropertyService propertyService;

    @PostMapping
    public Property create(@RequestBody Property property) {
        return propertyService.create(property);
    }

    @GetMapping("/admin/{adminId}")
    public List<Property> byAdmin(@PathVariable Long adminId) {
        return propertyService.getByAdmin(adminId);
    }
}
