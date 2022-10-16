package com.company.car;

public class Car {
    private String mark;
    private String color;

    public Car(String mark, String color){
        this.mark = mark;
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void changeColor(String newColor){
        if (this.mark.equals("Audi") && newColor.equals("blue") || newColor.equals("green") || newColor.equals("red")){
            this.color = newColor;
        } else if(this.mark.equals("BMW") && newColor.equals("orange") || newColor.equals("black") || newColor.equals("violet")){
            this.color = newColor;
        } else if(this.mark.equals("KIA") && newColor.equals("yellow") || newColor.equals("grey") || newColor.equals("white")){
            this.color = newColor;
        }
    }
    public void out(){
        System.out.println(this.mark + " " + this.color);
    }
}
