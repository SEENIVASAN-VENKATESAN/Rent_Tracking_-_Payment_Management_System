package com.RenterzPaizza.RenterzPaizza.service;

import com.RenterzPaizza.RenterzPaizza.entity.Communication;
import com.RenterzPaizza.RenterzPaizza.entity.Rent;
import com.RenterzPaizza.RenterzPaizza.entity.User;
import com.RenterzPaizza.RenterzPaizza.entity.enums.CommunicationChannel;
import com.RenterzPaizza.RenterzPaizza.entity.enums.CommunicationStatus;
import com.RenterzPaizza.RenterzPaizza.entity.enums.CommunicationTemplate;
import com.RenterzPaizza.RenterzPaizza.repository.CommunicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CommunicationService {

    @Autowired
    private CommunicationRepository communicationRepository;
    @Autowired
    private CommunicationRouter communicationRouter;

    public void createRentDueCommunication(User user, Rent rent) {
        List<CommunicationChannel> channels =
                communicationRouter.resolveChannels(user);


        if (channels== null) {
            return; // no valid contact
        }
        for (CommunicationChannel channel : channels) {

            Communication communication = Communication.builder()
                    .user(user)
                    .channel(channel)
                    .templateName(String.valueOf(CommunicationTemplate.RENT_DUE))
                    .message(buildRentMessage(user, rent))
                    .status(CommunicationStatus.PENDING)
                    .createdAt(LocalDateTime.now())
                    .build();

            communicationRepository.save(communication);
        }



    }


    private String buildRentMessage(User user, Rent rent) {

        return "Hi " + user.getName()
                + ", your rent of ₹" + rent.getAmount()
                + " is due on " + rent.getDueDate();
    }
    public CommunicationChannel resolveChannel(User user) {

        // Priority logic
        if (user.getMobile() != null && !user.getMobile().isBlank()) {
            return CommunicationChannel.SMS;
        }

        if (user.getEmail() != null && !user.getEmail().isBlank()) {
            return CommunicationChannel.EMAIL;
        }

        return null; // no channel available
    }
}
