package com.RenterzPaizza.RenterzPaizza.repository;

import com.RenterzPaizza.RenterzPaizza.entity.Complaint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComplaintRepository extends JpaRepository<Complaint,Long> {
}
