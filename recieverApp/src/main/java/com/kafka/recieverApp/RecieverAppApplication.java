package com.kafka.recieverApp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class RecieverAppApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(RecieverAppApplication.class, args);
    }

    @Override
    public void run(String...args ) throws Exception {
        System.out.println("Consumer is waiting for messages");
    }

}
