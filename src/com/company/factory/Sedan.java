package com.company.factory;

public class Sedan extends Car{
    private String name;
    private String hang;

    public Sedan(String name, String hang) {
        this.name = name;
        this.hang = hang;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getHang() {
        return this.hang;
    }
}
