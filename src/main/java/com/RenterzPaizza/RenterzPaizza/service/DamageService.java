package com.RenterzPaizza.RenterzPaizza.service;

import com.RenterzPaizza.RenterzPaizza.entity.DamageReport;
import com.RenterzPaizza.RenterzPaizza.repository.DamageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DamageService {
    @Autowired
    private DamageRepository damageRepository;


}
