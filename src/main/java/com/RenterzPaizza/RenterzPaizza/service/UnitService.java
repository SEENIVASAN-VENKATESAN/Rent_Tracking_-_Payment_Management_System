package com.RenterzPaizza.RenterzPaizza.service;

import com.RenterzPaizza.RenterzPaizza.entity.Unit;
import com.RenterzPaizza.RenterzPaizza.repository.UnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnitService {
    @Autowired
    private UnitRepository unitRepository;

    public Unit create(Unit unit) {
        return unitRepository.save(unit);
    }

    public List<Unit> getByProperty(Long propertyId) {
        return unitRepository.findByPropertyPropertyId(propertyId);
    }
}
