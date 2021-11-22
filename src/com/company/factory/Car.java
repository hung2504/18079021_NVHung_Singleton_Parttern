package com.company.factory;

public abstract class Car {
    public abstract String getName();
    public abstract String getHang();

    @Override
    public String toString() {
        return "Car Name: " +this.getName() +", Hãng Sản Xuất: "+this.getHang();
    }
}
