package com.RenterzPaizza.RenterzPaizza.service;

import com.RenterzPaizza.RenterzPaizza.entity.*;
import com.RenterzPaizza.RenterzPaizza.entity.enums.BillingStatus;
import com.RenterzPaizza.RenterzPaizza.entity.enums.EntityStatus;
import com.RenterzPaizza.RenterzPaizza.entity.enums.Role;
import com.RenterzPaizza.RenterzPaizza.repository.RentRepository;
import com.RenterzPaizza.RenterzPaizza.repository.UnitAllocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.util.List;

@Service
public class RentGenerationService {

    @Autowired
    private UnitAllocationRepository allocationRepository;

    @Autowired
    private RentRepository rentRepository;

    // Scheduler ONLY triggers this
    @Scheduled(cron = "0 0 0 1 * *")
    public void runMonthlyGeneration() {
        generateMonthlyRent();
    }

    public void generateMonthlyRent() {

        String billingMonth =
                YearMonth.now().toString(); // 2026-02

        LocalDate dueDate =
                LocalDate.now().withDayOfMonth(5);

        List<UnitAllocation> allocations =
                allocationRepository.findByStatus(EntityStatus.ACTIVE);

        for (UnitAllocation allocation : allocations) {

            User tenant = allocation.getTenant();
            if (tenant == null) continue;

            // 🔥 DUPLICATE PROTECTION
            boolean alreadyExists =
                    rentRepository.existsByAllocationAndBillingMonth(
                            allocation,
                            billingMonth
                    );

            if (alreadyExists) continue;

            Rent rent = Rent.builder()
                    .allocation(allocation)
                    .amount(10000.0) // later from config
                    .billingMonth(billingMonth)
                    .dueDate(dueDate)
                    .status(BillingStatus.DUE)
                    .createdAt(LocalDateTime.now())
                    .build();

            rentRepository.save(rent);
        }

        System.out.println("Rent generated for " + billingMonth);
    }
}
