package com.company.factories;

import com.company.cars.AudiCar;
import com.company.cars.RollsRoyceCar;
import com.company.enums.Colors;
import com.company.enums.EngineVolumes;
import com.company.enums.Models;
import com.company.enums.WheelSizes;

import java.util.ArrayList;
import java.util.List;

public class RollsRoyceFactory extends Factory{

    private List<RollsRoyceCar> rollsRoyceCars = new ArrayList<>();

    public RollsRoyceCar createRollsRoyceCar(Colors color, Models model, int yearOfIssue, WheelSizes wheelSize, EngineVolumes engineValue, String[] options, boolean forImport, List<RollsRoyceCar> rollsRoyceCars) {
        RollsRoyceCar car = new RollsRoyceCar(color, model, yearOfIssue, wheelSize, engineValue, options, forImport);
        if(!rollsRoyceCars.contains(car)) {
            rollsRoyceCars.add(car);
        }
        System.out.println("создана машина: " + car.toString());
        return car;
    }

    public RollsRoyceCar findRollsRoyceToServise(Colors color, Models model, int yearOfIssue, WheelSizes wheelSize, EngineVolumes engineValue,String[] options, boolean forImport, List<RollsRoyceCar> rollsRoyceCars) {
        RollsRoyceCar car = new RollsRoyceCar(color, model, yearOfIssue, wheelSize, engineValue, options, forImport);
        if(rollsRoyceCars.contains(car))
        System.out.println("найдена машина: " + car.toString());
        return car;
    }

    public List<RollsRoyceCar> getRollsRoyceCars() {
        return rollsRoyceCars;
    }
}
