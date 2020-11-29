package com.kodilla.kodillajms.controller;

import com.kodilla.kodillajms.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private JmsTemplate jmsTemplate;

    // - orders/process?client=Tony_Stark&product=Iron_Body_Kit
    @GetMapping(path = "/process")
    public void processOrder(@RequestParam String client, @RequestParam String product) {
        Order order = new Order(client, product);
        jmsTemplate.convertAndSend("orders-queue", order.toString());
    }
}