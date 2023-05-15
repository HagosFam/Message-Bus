package com.kafka.recieverApp;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class KafkaReceiver {
    @KafkaListener(topics = {"sending_info"})
    public void receive(@Payload String message) {
        System.out.println("message recieved" + message);
    }

}
