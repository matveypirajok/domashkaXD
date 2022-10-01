package com.company;

public class Main {

    public static void main(String[] args) {
        int mass[] = {1, 4, 6, 7, 9, 23, 12, 57};
        int n = 7;
        int sum = 0;

        for(int i = 0; i < mass.length; i++){
            if (mass[i] != n) {sum += mass[i];}
            continue;
        }
        System.out.println("сумма элементов массива: " + sum);
    }
}