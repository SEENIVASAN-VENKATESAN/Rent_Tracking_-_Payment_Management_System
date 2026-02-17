package com.RenterzPaizza.RenterzPaizza.repository;

import com.RenterzPaizza.RenterzPaizza.entity.UnitAllocation;
import com.RenterzPaizza.RenterzPaizza.entity.enums.EntityStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UnitAllocationRepository extends JpaRepository<UnitAllocation,Long> {

    List<UnitAllocation> findByStatus(EntityStatus status);
}
