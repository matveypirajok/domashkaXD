package com.company;

public class Main {

    public static void main(String[] args) { //пока что ничего не придумал как сделать со случайным размером матрицы. Пусть будут с размером 3
        int[][] matr1 = {{1, 2, 3}, {4, 6, 2,}, {-6, 8, 23}};
        int[][] matr2 = {{2, 6, -32}, {35, -46, 12}, {35, 87, 45}};
        int[][] sum = new int[3][3];
        int[][] minus = new int[3][3];

        for (int i = 0; i < matr1.length; i++) {
            for (int j = 0; j < matr1[i].length; j++) {
                sum[i][j] = matr1[i][j] + matr2[i][j];
                System.out.print(sum[i][j] + "\t");
            }
        }
    //    for (int p = 0; p < matr1)

        for (int g = 0; g < matr2.length; g++) {
            for (int d = 0; d < matr2[g].length; d++) {
                matr2[g][d] = matr2[g][d] * (-1);
            }
        }
        System.out.println("------------------------------------------------------");
        for (int q = 0; q < matr1.length; q++) {
            for (int w = 0; w < matr1[q].length; w++) {
                minus[q][w] = matr1[q][w] - matr2[q][w];
                System.out.print(minus[q][w] + "\t");
            }
        }
    }
}
