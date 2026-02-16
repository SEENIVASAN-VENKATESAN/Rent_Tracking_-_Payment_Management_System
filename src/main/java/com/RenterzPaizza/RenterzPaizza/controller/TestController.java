package com.RenterzPaizza.RenterzPaizza.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/admin/test")
    public String admin() {
        return "Admin only";
    }

    @GetMapping("/tenant/test")
    public String tenant() {
        return "Tenant only";
    }
}
