package com.company.factories;

import com.company.cars.AudiCar;
import com.company.enums.Colors;
import com.company.enums.EngineVolumes;
import com.company.enums.Models;
import com.company.enums.WheelSizes;

import java.util.ArrayList;
import java.util.List;

public class AudiFactory extends Factory{
    private List<AudiCar> audiCarsStock = new ArrayList<>();

    public AudiCar createAudiCar(Colors color, Models model, int yearOfIssue, WheelSizes wheelSize, EngineVolumes engineValue,String[] options, boolean prestige, List<AudiCar> audiCarsStock) {
        AudiCar car = new AudiCar(color, model, yearOfIssue, wheelSize, engineValue, options, prestige);
        if(!audiCarsStock.contains(car)) {
            audiCarsStock.add(car);
        }
        System.out.println("создана машина: " + car.toString());
        return car;
    }

    public static AudiCar findAudiToServise(Colors color, Models model, int yearOfIssue, WheelSizes wheelSize, EngineVolumes engineValue, String[] options, boolean prestige, List<AudiCar> audiCarsStock) {
        AudiCar car = new AudiCar(color, model, yearOfIssue, wheelSize, engineValue, options, prestige);
        if(audiCarsStock.contains(car))
        System.out.println("найдена машина: " + car.toString());
        return car;
    }

    public List<AudiCar> getAudiCarsStock() {
        return audiCarsStock;
    }

    public void setAudiCarsStock(List<AudiCar> audiCarsStock) {
        this.audiCarsStock = audiCarsStock;
    }
}
