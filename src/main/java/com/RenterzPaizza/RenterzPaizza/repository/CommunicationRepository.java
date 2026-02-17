package com.RenterzPaizza.RenterzPaizza.repository;
import com.RenterzPaizza.RenterzPaizza.entity.Communication;
import com.RenterzPaizza.RenterzPaizza.entity.enums.CommunicationStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommunicationRepository extends JpaRepository<Communication,Long> {
    List<Communication> findByStatus(CommunicationStatus status);

}
