package com.company.factory;

public class Sport extends Car{
    private String name;
    private String hang;

    public Sport(String name, String hang) {
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
