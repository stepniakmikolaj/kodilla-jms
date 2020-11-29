package com.kodilla.kodillajms.receiver;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class OrdersReceiver {

    @JmsListener(containerFactory = "jmsFactory", destination = "orders-queue")
    public void receiveMessage(String message) {
        System.out.println("Received order: " + message);
    }
}