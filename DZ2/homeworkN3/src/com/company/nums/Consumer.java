package com.company.nums;

public class Consumer {
    private int position = 0;
    private int[] numbers = new int[10];

    public Consumer() {

    }

    public int[] addNum(int num) {
        numbers[position] = num;
        position++;
        return numbers;
    }

    public float consum() {
        float consume = 0;
        int i = 0;
        while (i < 5) {
            consume += numbers[position--];
            i++;
        }
        consume = consume / 5;
        return consume;
        /*for(int i = 0; i < position; i++){
            consume += numbers[i];
        }
        consume = consume / (position);
        return consume;*//*
        }*/
    }
}

