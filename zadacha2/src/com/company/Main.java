package com.company;

public class Main {

    public static void main(String[] args) {
        int massFib[] = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987};
        int massInd = 7;
        int sum = 0;
            for (int i = 0; i < massInd; i++) {
                if (massFib[i] % 2 == 0){
                    sum += massFib[i];
                }
                else continue;
            }
        System.out.println("сумма равна: " + sum);
    }
}
