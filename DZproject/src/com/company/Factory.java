package com.company;

import com.company.enums.Colors;

public class Factory {
    private Car[] stock = new Car[10];
    private Servise servise;

    public Factory(Car[] stock, Servise servise) {
        stock = stock;
        this.servise = servise;
    }

    public Car[] createNewCar(Colors color, String model, int yearOfIssue, int wheelSize, int engineVolume, String[] options){
        for(int i = 0; i < stock.length; i++){
            if(stock == null){
                Car newcar = new Car(color, model, yearOfIssue, wheelSize, engineVolume, options);
                stock[0] = newcar;
            } else if(stock[i] == null){
                Car newcar = new Car(color, model, yearOfIssue, wheelSize, engineVolume, options);
                stock[i] = newcar;
            } else if(stock[i] != null){
                System.out.println("склад переполнен");
            }
        }
        return stock;
    }
}
