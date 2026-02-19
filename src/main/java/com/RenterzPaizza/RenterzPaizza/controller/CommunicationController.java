package com.RenterzPaizza.RenterzPaizza.controller;

import com.RenterzPaizza.RenterzPaizza.entity.Communication;
import com.RenterzPaizza.RenterzPaizza.service.CommunicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/communications")
public class CommunicationController {

    @Autowired
    private CommunicationService communicationService;


}
