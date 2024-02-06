package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JmsApplication implements CommandLineRunner {

	@Autowired
    private JmsMessagingService jmsMessagingService;

    public static void main(String[] args) {
        SpringApplication.run(JmsApplication.class, args);
    }

    @Override
    public void run(String... args) {
        String message = "hello lohith";
        jmsMessagingService.sendMessageToTopic1(message);
        jmsMessagingService.sendMessageToQueue1(message);
        jmsMessagingService.sendMessageToTopic2(message);
        jmsMessagingService.sendMessageToQueue2(message);
    }

}
