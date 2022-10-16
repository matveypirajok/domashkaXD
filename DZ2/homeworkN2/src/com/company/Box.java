package com.company;

public class Box {
    public int x;
    public int y;
    public int z;

    public Box(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Box(){
        this.x = 1;
        this.y = 2;
    }

    public void whatBox(){
        if (x == y && x == z){
            System.out.println("это куб");
        } else if (z == 0){
            System.out.println("это конверт");
        } else {
            System.out.println("это обычная коробка");
        }
    }
}
