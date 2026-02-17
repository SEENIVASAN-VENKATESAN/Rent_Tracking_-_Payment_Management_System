package com.RenterzPaizza.RenterzPaizza.service;

import org.springframework.stereotype.Service;

@Service
public class VoiceSender {

    public boolean send(String mobile, String message) {

        try {
            // TODO Twilio Voice API call
            System.out.println("VOICE CALL -> " + mobile);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
