package com.company.factory;

public class TestFactory {
    public static void main(String[] args) {
        Car sedan = CarFactory.getCar("Sedan", "Vios","Toyota");
        Car sport = CarFactory.getCar("Sport", "BMW","BMW");

        System.out.println(sedan);
        System.out.println(sport);
    }


}
