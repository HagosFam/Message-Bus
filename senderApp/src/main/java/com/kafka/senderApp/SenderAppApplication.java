package com.kafka.senderApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class SenderAppApplication implements CommandLineRunner {

	@Autowired
	KafkaSender sender;
	public static void main(String[] args) {
		SpringApplication.run(SenderAppApplication.class, args);
	}

	public void run(String...args) throws Exception {
		sender.send("sending_info", "First text message");
		System.out.println("Message sent successfully");
	}

}
