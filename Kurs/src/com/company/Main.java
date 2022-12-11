package com.company;
import com.company.cars.Car;
import com.company.enums.Colors;
import com.company.enums.EngineVolumes;
import com.company.enums.Models;
import com.company.enums.WheelSizes;
import com.company.factories.AudiFactory;

public class Main {
    public static  String[] options = new String[10];

    public static void main(String[] args) {
        CarShowroom carShowroom = new CarShowroom();
        carShowroom.createAudi(Colors.BLUE, Models.PICKUP, 1987, WheelSizes.MEDIUM, EngineVolumes.MEDIUM, options, true);
        carShowroom.changeColorOnServise(carShowroom.findAudi(Colors.BLUE, Models.PICKUP, 1987, WheelSizes.MEDIUM, EngineVolumes.MEDIUM, options, true), Colors.GREEN);
    }
}
