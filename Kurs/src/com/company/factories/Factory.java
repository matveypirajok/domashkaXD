package com.company.factories;

import com.company.enums.Colors;
import com.company.enums.EngineVolumes;
import com.company.enums.Models;
import com.company.enums.WheelSizes;

public class Factory {
    private static Colors colors;
    private static EngineVolumes engineVolumes;
    private static Models models;
    private static WheelSizes wheelSizes;

    public static void printDetails() {
        System.out.println("colors: " + colors.toString());
        System.out.println("engine volumes: " + engineVolumes.toString());
        System.out.println("models: " + models.toString());
        System.out.println("wheel sizes: " + wheelSizes.toString());
    }


}
