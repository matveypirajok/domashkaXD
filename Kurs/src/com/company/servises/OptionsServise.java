package com.company.servises;

import com.company.cars.Car;

public class OptionsServise {

    public static void addNewOption(Car car, String newOption) {
        String[] newOptions = new String[10];
        int countOfOptions = 0;
        if(car.getOptions() == null) {
            newOptions[0] = newOption;
            car.setOptions(newOptions);
        } else {
            for(int i = 0; i < car.getOptions().length; i++) {
                if(car.getOptions()[i] != null) {
                    countOfOptions++;
                } else {break;}
            }
            newOptions = car.getOptions();
            newOptions[countOfOptions - 1] = newOption;
            car.setOptions(newOptions);
        }
    }

    public static void deleteOption(Car car, String optionToDelete) {
        String[] newOptions = car.getOptions();
        for(int i = 0; i < newOptions.length; i++) {
            if(newOptions[i].equals(optionToDelete)) {
                newOptions[i] = null;
            }
        }
        car.setOptions(newOptions);
    }
}
