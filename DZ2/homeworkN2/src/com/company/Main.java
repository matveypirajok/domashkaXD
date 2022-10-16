package com.company;

public class Main {

    public static void main(String[] args) {
	Box box = new Box(1, 3, 5);
	Box box1 = new Box(1, 3, 0);
	Box box2 = new Box(1, 1, 1);
    Box box3 = new Box();

    box.whatBox();
    box1.whatBox();
    box2.whatBox();
    box3.whatBox();
    }
}
