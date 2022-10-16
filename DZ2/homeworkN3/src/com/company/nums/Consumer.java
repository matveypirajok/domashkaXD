package com.company.nums;

public class Consumer {
    private int position = 0;
    private int[] numbers = new int[5];
    private int consume = 0;

    public Consumer(){

    }

    public int[] addNum(int num){
        numbers[position] = num;
        return numbers;
    }

    public int consum(){
        for(int num : numbers){
            consume += num;
        }
        consume = consume / numbers.length;
        return consume;
    }
}
