package com.kodilla.kodillajms.domain;

public class Order {

    private String client;
    private String product;

    public Order(String client, String product) {
        this.client = client;
        this.product = product;
    }

    @Override
    public String toString() {
        return "Order{" +
                "client='" + client + '\'' +
                ", product='" + product + '\'' +
                '}';
    }
}
