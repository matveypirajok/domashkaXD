package com.company;

import com.company.enums.Colors;

import java.awt.*;

public class Servise {
    public void changeColor(Colors newcolor, Car car){
        car.setColor(newcolor);
    }

    public void changeWheels(int newWheelSize, Car car){
        car.setWheelSize(newWheelSize);
    }

    public String[] setNewOption(String newOption, Car car){
        String[] newOptions = new String[car.getOptions().length + 1];
        newOptions[newOptions.length] = newOption;
        return newOptions;
    }

    public String[] deleteOption(String optionToDelete, Car car){
        String[] newOptions = new String[car.getOptions().length + 1];
        newOptions[newOptions.length] = null;
        return newOptions;
    }
}
