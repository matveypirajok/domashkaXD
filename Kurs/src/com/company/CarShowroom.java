package com.company;

import com.company.cars.*;
import com.company.cars.Car;
import com.company.enums.Colors;
import com.company.enums.EngineVolumes;
import com.company.enums.Models;
import com.company.enums.WheelSizes;
import com.company.factories.AudiFactory;
import com.company.factories.RollsRoyceFactory;
import com.company.factories.ToyotaFactory;
import com.company.servises.ColorServise;
import com.company.servises.OptionsServise;
import com.company.servises.WheelServise;

import java.util.List;

public class CarShowroom {
    public static AudiFactory audiFactory = new AudiFactory();
    public static RollsRoyceFactory rollsRoyceFactory = new RollsRoyceFactory();
    public static ToyotaFactory toyotaCar = new ToyotaFactory();

    public static AudiCar CreateAudi(Colors color, Models model, int yearOfIssue, WheelSizes wheelSize, EngineVolumes engineValue, String[] options, boolean prestige) {
       return audiFactory.createAudiCar(color, model, yearOfIssue, wheelSize, engineValue, options, prestige, audiFactory.getAudiCarsStock());
    }

    public static RollsRoyceCar CreateRollsRoyce(Colors color, Models model, int yearOfIssue, WheelSizes wheelSize, EngineVolumes engineValue, String[] options, boolean forImport) {
        return rollsRoyceFactory.createRollsRoyceCar(color, model, yearOfIssue, wheelSize, engineValue, options, forImport, rollsRoyceFactory.getRollsRoyceCars());
    }

    public static ToyotaCar CreateToyota(Colors color, Models model, int yearOfIssue, WheelSizes wheelSize, EngineVolumes engineValue,String[] options, boolean tuned) {
        return toyotaCar.createToyotaCar(color, model, yearOfIssue, wheelSize, engineValue, options, tuned);
    }

    public static void ChangeColorOnServise(Car car, Colors color) {
        ColorServise.setNewColor(car, color);
    }

    public static void ChangeWheelSizeOnServise(Car car, WheelSizes wheelSize) {
        WheelServise.setNewWheelSize(car, wheelSize);
    }

    public static void AddOptionsOnServise(Car car, String newOption) {
        OptionsServise.addNewOption(car, newOption);
    }

    public static void DeleteOptionOnServise(Car car, String optionToDelete) {
        OptionsServise.deleteOption(car, optionToDelete);
    }
}
