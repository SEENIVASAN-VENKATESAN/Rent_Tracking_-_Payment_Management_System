package com.RenterzPaizza.RenterzPaizza.repository;

import com.RenterzPaizza.RenterzPaizza.entity.UnitAllocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitAllocationRepository extends JpaRepository<UnitAllocation,Long> {
}
