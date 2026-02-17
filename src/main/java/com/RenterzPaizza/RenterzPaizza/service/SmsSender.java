package com.RenterzPaizza.RenterzPaizza.service;

import org.springframework.stereotype.Service;

@Service
public class SmsSender {

    public boolean send(String mobile, String message) {

        try {
            // TODO Twilio SMS call
            System.out.println("SMS SENT -> " + mobile);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
