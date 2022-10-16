package com.company;
import com.company.months.Month;

public class Main {

    public static void main(String[] args) {
        Month a = Month.getMonthByNum(3);
        int b = Month.getNumByMonth("MAY");

        System.out.println(a);
        System.out.println(b);
    }
}
