package com.RenterzPaizza.RenterzPaizza.controller;

import com.RenterzPaizza.RenterzPaizza.entity.Payment;
import com.RenterzPaizza.RenterzPaizza.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public Payment pay(@RequestBody Payment payment) {
        return paymentService.recordPayment(payment);
    }
}
