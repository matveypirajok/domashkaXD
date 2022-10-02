package com.company;

public class Main {

    public static void main(String[] args) { //пока что ничего не придумал как сделать со случайным размером матрицы. Пусть будут с размером 3
	int [][] matr1 = {{1,2,3}, {4,6,2,}, {6,8,23}};
    int [][] matr2 = {{2,6,32}, {35,46,12}, {35,87,45}};
    int [][] matr3 = new int[3][3];

    for (int i = 0; i < matr3.length; i++){
        for (int j = 0; j < matr3[i].length; j++){
            matr3[i][j] = matr1[i][j] + matr2[i][j];
            System.out.println(" " + matr3[i][j]);
        }
    }
    }
}
