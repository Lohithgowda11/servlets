package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class JmsMessagingService {

    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendMessageToTopic1(String message) {
        System.out.println("Sending message '" + message + "' to Topic1");
        jmsTemplate.convertAndSend("topic1", message);
    }

    public void sendMessageToQueue1(String message) {
        System.out.println("Sending message '" + message + "' to Queue1");
        jmsTemplate.convertAndSend("queue1", message);
    }

    public void sendMessageToTopic2(String message) {
        System.out.println("Sending message '" + message + "' to Topic2");
        jmsTemplate.convertAndSend("topic2", message);
    }

    public void sendMessageToQueue2(String message) {
        System.out.println("Sending message '" + message + "' to Queue2");
        jmsTemplate.convertAndSend("queue2", message);
    }
}
