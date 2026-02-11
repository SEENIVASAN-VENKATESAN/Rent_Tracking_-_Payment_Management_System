package com.RenterzPaizza.RenterzPaizza.repository;
import com.RenterzPaizza.RenterzPaizza.entity.Communication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommunicationRepository extends JpaRepository<Communication,Long> {
}
