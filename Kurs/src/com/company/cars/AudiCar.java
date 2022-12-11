package com.company.cars;

import com.company.cars.Car;
import com.company.enums.Colors;
import com.company.enums.EngineVolumes;
import com.company.enums.Models;
import com.company.enums.WheelSizes;

public class AudiCar extends Car {
    private boolean prestige;

    public AudiCar(Colors color, Models model, int yearOfIssue, WheelSizes wheelSize, EngineVolumes engineValue, String[] options, boolean prestige) {
        super(color, model, yearOfIssue, wheelSize, engineValue, options);
        this.prestige = prestige;
    }
}
