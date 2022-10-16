package com.company;
import com.company.nums.Consumer;

public class Main {

    public static void main(String[] args) {
        Consumer consumer = new Consumer();
        consumer.addNum(1);
        consumer.addNum(2);
        consumer.addNum(3);
        consumer.addNum(4);
        consumer.addNum(5);

        System.out.println(consumer.consum());
    }
}
