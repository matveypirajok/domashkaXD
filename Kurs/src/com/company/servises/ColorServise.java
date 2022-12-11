package com.company.servises;

import com.company.cars.Car;
import com.company.enums.Colors;

public class ColorServise {

    public static void setNewColor(Car car, Colors newColor) {
        car.setColor(newColor);
    }
}
