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
    public AudiFactory audiFactory = new AudiFactory();
    public RollsRoyceFactory rollsRoyceFactory = new RollsRoyceFactory();
    public ToyotaFactory toyotaFactory = new ToyotaFactory();
    public ColorServise colorServise = new ColorServise();

    public AudiCar createAudi(Colors color, Models model, int yearOfIssue, WheelSizes wheelSize, EngineVolumes engineValue, String[] options, boolean prestige) {
       return audiFactory.createAudiCar(color, model, yearOfIssue, wheelSize, engineValue, options, prestige, audiFactory.getAudiCarsStock());
    }

    public AudiCar findAudi(Colors color, Models model, int yearOfIssue, WheelSizes wheelSize, EngineVolumes engineValue, String[] options, boolean prestige) {
        return audiFactory.findAudiToServise(color, model, yearOfIssue, wheelSize, engineValue, options, prestige, audiFactory.getAudiCarsStock());
    }


    public RollsRoyceCar createRollsRoyce(Colors color, Models model, int yearOfIssue, WheelSizes wheelSize, EngineVolumes engineValue, String[] options, boolean forImport) {
        return rollsRoyceFactory.createRollsRoyceCar(color, model, yearOfIssue, wheelSize, engineValue, options, forImport, rollsRoyceFactory.getRollsRoyceCars());
    }

    public RollsRoyceCar findRollsRoyce(Colors color, Models model, int yearOfIssue, WheelSizes wheelSize, EngineVolumes engineValue, String[] options, boolean forImport) {
        return rollsRoyceFactory.findRollsRoyceToServise(color, model, yearOfIssue, wheelSize, engineValue, options, forImport, rollsRoyceFactory.getRollsRoyceCars());
    }


    public ToyotaCar createToyota(Colors color, Models model, int yearOfIssue, WheelSizes wheelSize, EngineVolumes engineValue,String[] options, boolean tuned) {
        return toyotaFactory.createToyotaCar(color, model, yearOfIssue, wheelSize, engineValue, options, tuned);
    }

    public ToyotaCar findToyota(Colors color, Models model, int yearOfIssue, WheelSizes wheelSize, EngineVolumes engineValue,String[] options, boolean tuned) {
        return toyotaFactory.findToyotaToServise(color, model, yearOfIssue, wheelSize, engineValue, options, tuned, toyotaFactory.getToyotaCars());
    }

    public Car changeColorOnServise(Car car, Colors color) {
        colorServise.setNewColor(car, color);
        System.out.println("Изменен цвет: " + car.toString());
        return car;
    }

    public static Car changeWheelSizeOnServise(Car car, WheelSizes newWheelSize) {
        WheelServise.setNewWheelSize(car, newWheelSize);
        System.out.println("изменены  колёса: " + car.toString());
        return car;
    }

    public static Car addOptionsOnServise(Car car, String newOption) {
        OptionsServise.addNewOption(car, newOption);
        System.out.println("Добавлена опция: " + car.toString());
        return car;
    }

    public static Car deleteOptionOnServise(Car car, String optionToDelete) {
        OptionsServise.deleteOption(car, optionToDelete);
        System.out.println("удалена опция: " + car.toString());
        return car;
    }


}
