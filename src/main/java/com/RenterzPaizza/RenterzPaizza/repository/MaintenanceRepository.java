package com.RenterzPaizza.RenterzPaizza.repository;

import com.RenterzPaizza.RenterzPaizza.entity.Maintenance;
import org.hibernate.validator.constraints.Range;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaintenanceRepository extends JpaRepository<Maintenance,Long> {
}
