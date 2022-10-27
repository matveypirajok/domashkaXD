package com.company;

import com.company.enums.Colors;

import java.util.Arrays;

public class Car {
    private Colors color;
    private final String model;
    private final int yearOfIssue;
    private int wheelSize;
    private final int engineVolume;
    private String[] options;

    public Car(Colors color, String model, int yearOfIssue, int wheelSize, int engineVolume, String[] options) {
        this.color = color;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.wheelSize = wheelSize;
        this.engineVolume = engineVolume;
        this.options = options;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color=" + color +
                ", model='" + model + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", wheelSize=" + wheelSize +
                ", engineVolume=" + engineVolume +
                ", options=" + Arrays.toString(options) +
                '}';
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public Colors getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public String[] getOptions() {
        return options;
    }
}
