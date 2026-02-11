package com.RenterzPaizza.RenterzPaizza.service;

import com.RenterzPaizza.RenterzPaizza.entity.Communication;
import com.RenterzPaizza.RenterzPaizza.repository.CommunicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommunicationService {
    @Autowired
    private CommunicationRepository communicationRepository;

    public Communication log(Communication communication) {
        return communicationRepository.save(communication);
    }
}
