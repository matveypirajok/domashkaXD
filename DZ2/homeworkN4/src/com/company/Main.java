package com.company;
import com.company.car.Car;

public class Main {

    public static void main(String[] args) {
	Car car1 = new Car("Audi", "red");
	Car car2 = new Car("BMW", "white");
	Car car3 = new Car("dfwde", "grey");

    car1.changeColor("grey");

    car1.out();
    car2.out();
    car3.out();
    }
}
