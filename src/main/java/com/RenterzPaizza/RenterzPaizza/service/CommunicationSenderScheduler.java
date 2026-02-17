package com.RenterzPaizza.RenterzPaizza.service;

import com.RenterzPaizza.RenterzPaizza.entity.Communication;
import com.RenterzPaizza.RenterzPaizza.entity.User;
import com.RenterzPaizza.RenterzPaizza.entity.enums.CommunicationStatus;
import com.RenterzPaizza.RenterzPaizza.repository.CommunicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommunicationSenderScheduler {

    @Autowired
    private CommunicationRepository communicationRepository;

    @Autowired
    private SmsSender smsSender;

    @Autowired
    private VoiceSender voiceSender;

    @Autowired
    private EmailSender emailSender;

    // Runs every 1 minute
    @Scheduled(fixedRate = 60000)
    public void processPendingCommunications() {

        List<Communication> pending =
                communicationRepository.findByStatus(
                        CommunicationStatus.PENDING);

        for (Communication comm : pending) {

            boolean success = false;

            User user = comm.getUser();

            switch (comm.getChannel()) {

                case SMS:
                    success = smsSender.send(
                            user.getMobile(),
                            comm.getMessage());
                    break;

                case VOICE:
                    success = voiceSender.send(
                            user.getMobile(),
                            comm.getMessage());
                    break;

                case EMAIL:
                    success = emailSender.send(
                            user.getEmail(),
                            comm.getMessage());
                    break;
            }

            comm.setStatus(
                    success ?
                            CommunicationStatus.SENT :
                            CommunicationStatus.FAILED
            );

            communicationRepository.save(comm);
        }
    }
}

