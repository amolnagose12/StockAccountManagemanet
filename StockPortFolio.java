package com.bridgelabz.stockmanagement;

public class StockPortFolio {

    private String name;
    private int numberOfShares, price;

    public StockPortFolio(String name , int numberOfShares, int price) {
        this.name = name;
        this.numberOfShares = numberOfShares;
        this.price = price;
    }

    public int getValue() {
        return numberOfShares * price;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public int getPrice() {
        return price;
    }
}