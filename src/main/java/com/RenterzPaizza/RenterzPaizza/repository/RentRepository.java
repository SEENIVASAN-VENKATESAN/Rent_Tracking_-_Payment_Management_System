package com.RenterzPaizza.RenterzPaizza.repository;

import com.RenterzPaizza.RenterzPaizza.entity.Rent;
import com.RenterzPaizza.RenterzPaizza.entity.UnitAllocation;
import org.hibernate.boot.models.JpaAnnotations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface RentRepository extends JpaRepository<Rent,Long> {
    boolean existsByAllocationAndDueDate(
            UnitAllocation allocation,
            LocalDate dueDate
    );
    boolean existsByAllocationAndBillingMonth(
            UnitAllocation allocation,
            String billingMonth
    );
}
