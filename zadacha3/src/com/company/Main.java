package com.company;

public class Main {

    public static void main(String[] args) {
        int[] mass = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < mass.length / 2; i++) {
            int tmp = mass[i];
            mass[i] = mass[mass.length - i - 1];
            mass[mass.length - i - 1] = tmp;
        }
        System.out.println("инвертированный массив: " + mass);
    }
}
