package com.company.cars;


import com.company.enums.Colors;
import com.company.enums.EngineVolumes;
import com.company.enums.Models;
import com.company.enums.WheelSizes;

public class ToyotaCar extends Car {
    private boolean tuned;

    public ToyotaCar(Colors color, Models model, int yearOfIssue, WheelSizes wheelSize, EngineVolumes engineValue, String[] options, boolean tuned) {
        super(color, model, yearOfIssue, wheelSize, engineValue, options);
        this.tuned = tuned;
    }

    @Override
    public String toString() {
        return super.toString() + tuned;
    }
}
