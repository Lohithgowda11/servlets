package com.example.demo;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class JmsConsumer {

    @JmsListener(destination = "topic1")
    public void receiveMessageFromTopic1(String message) {
        System.out.println("Received message '" + message + "' from Topic1");
    }

    @JmsListener(destination = "queue1")
    public void receiveMessageFromQueue1(String message) {
        System.out.println("Received message '" + message + "' from Queue1");
    }

    @JmsListener(destination = "topic2")
    public void receiveMessageFromTopic2(String message) {
        System.out.println("Received message '" + message + "' from Topic2");
    }

    @JmsListener(destination = "queue2")
    public void receiveMessageFromQueue2(String message) {
        System.out.println("Received message '" + message + "' from Queue2");
    }
}