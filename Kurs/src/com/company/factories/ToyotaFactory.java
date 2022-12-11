package com.company.factories;

import com.company.cars.RollsRoyceCar;
import com.company.cars.ToyotaCar;
import com.company.enums.Colors;
import com.company.enums.EngineVolumes;
import com.company.enums.Models;
import com.company.enums.WheelSizes;

import java.util.ArrayList;
import java.util.List;

public class ToyotaFactory extends Factory {

    private List<ToyotaCar> toyotaCars = new ArrayList<>();
    private static ToyotaCar findedCar;

    public ToyotaCar createToyotaCar(Colors color, Models model, int yearOfIssue, WheelSizes wheelSize, EngineVolumes engineValue,String[] options, boolean tuned) {
        ToyotaCar car = new ToyotaCar(color, model, yearOfIssue, wheelSize, engineValue, options, tuned);
        if(!toyotaCars.contains(car)) {
            toyotaCars.add(car);
        }
        System.out.println("создана машина: " + car.toString());
        return car;
    }

    public ToyotaCar findToyotaToServise(Colors color, Models model, int yearOfIssue, WheelSizes wheelSize, EngineVolumes engineValue,String[] options, boolean tuned, List<ToyotaCar> toyotaCars) {
        ToyotaCar car = new ToyotaCar(color, model, yearOfIssue, wheelSize, engineValue, options, tuned);
        if(toyotaCars.contains(car)) {
            findedCar = car;
        }
        System.out.println("найдена машина: " + car.toString());
        return findedCar;
    }

    public List<ToyotaCar> getToyotaCars() {
        return toyotaCars;
    }
}
