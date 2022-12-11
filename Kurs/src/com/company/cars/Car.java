package com.company.cars;

import com.company.enums.Colors;
import com.company.enums.EngineVolumes;
import com.company.enums.Models;
import com.company.enums.WheelSizes;

import java.util.Arrays;
import java.util.List;

public class Car {
    private Colors color;
    private final Models model;
    private final int yearOfIssue;
    private WheelSizes WheelSize;
    private final EngineVolumes engineValue;
    private String[] options;

    public Car(Colors color, Models model, int yearOfIssue, WheelSizes wheelSize, EngineVolumes engineValue, String[] options) {
        this.color = color;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        WheelSize = wheelSize;
        this.engineValue = engineValue;
        this.options = options;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public void setWheelSize(WheelSizes wheelSize) {
        WheelSize = wheelSize;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public String[] getOptions() {
        return options;
    }


    @Override
    public String toString() {
        return "Car{" +
                "color=" + color +
                ", model=" + model +
                ", yearOfIssue=" + yearOfIssue +
                ", WheelSize=" + WheelSize +
                ", engineValue=" + engineValue +
                ", options=" + Arrays.toString(options) +
                '}';
    }
}
