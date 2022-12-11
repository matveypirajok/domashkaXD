package com.company.cars;


import com.company.enums.Colors;
import com.company.enums.EngineVolumes;
import com.company.enums.Models;
import com.company.enums.WheelSizes;

public class RollsRoyceCar extends Car {
    private boolean forImport;

    public RollsRoyceCar(Colors color, Models model, int yearOfIssue, WheelSizes wheelSize, EngineVolumes engineValue, String[] options, boolean forImport) {
        super(color, model, yearOfIssue, wheelSize, engineValue, options);
        this.forImport = forImport;
    }
}
