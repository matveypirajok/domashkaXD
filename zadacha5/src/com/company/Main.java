package com.company;

public class Main {

    public static void main(String[] args) {
        int collmns = 0;
        int[][] mass = {{1, 0, 0, 0}, {1, 1, 0, 0}, {1, 1, 1, 0}, {1, 1, 1, 1}};
        for (int i = 0; i < mass.length; i++) {
            for(int a = 0; a < mass[i].length; a++){
                if (mass[i].length != mass.length) {System.out.println("массив не является квадратной матрицей"); break;}
            }
        }
    }
}
