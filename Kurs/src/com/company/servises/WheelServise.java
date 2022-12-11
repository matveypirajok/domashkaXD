package com.company.servises;

import com.company.cars.Car;
import com.company.enums.WheelSizes;

public class WheelServise {

    public static void setNewWheelSize(Car car, WheelSizes newWheelSize) {
        car.setWheelSize(newWheelSize);
    }
}
