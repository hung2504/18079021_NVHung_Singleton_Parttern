package com.company.factory;

public class CarFactory {
    public static Car getCar(String type, String name, String hang){
        if(type.equalsIgnoreCase("Sedan")){
            System.out.println(type);
            return new Sedan(name,hang);}
        else if(type.equalsIgnoreCase("Sport")){
            return new Sport(name, hang);}
        return null;
    }
}
