package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] mass = {{1, -2, 3}, {4, -6, 8}};
        int numbMin = 0;
        int numbMax = 0;

        for (int i = 0; i < mass.length; i++){
            for (int a = 0; a < mass[i].length; a++){
                if (mass[i][a] < 0){
                    ++numbMin;
                }else ++numbMax;
            }
        }
        if (numbMin < numbMax){
            System.out.println("положительных больше, их количество: " + numbMax);
        } else if (numbMin > numbMax) {
            System.out.println("отрицательных больше, их количество: " + numbMin);
        } else if (numbMin == numbMax){
            System.out.println("равное количество положительных и отрицательных");
        } else System.out.println("в массиве проблемы");
    }
}
