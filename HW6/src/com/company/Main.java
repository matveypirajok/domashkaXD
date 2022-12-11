package com.company;

import java.util.concurrent.atomic.AtomicBoolean;

public class Main {

    public static void main(String[] args) {
        int armySize = 5;
        AtomicBoolean isOver = new AtomicBoolean();

        Factory factory = new Factory(isOver);
        Army white = new Army(factory, isOver, armySize, "White");
        Army black = new Army(factory, isOver, armySize, "Black");

        Thread factoryThread = new Thread(factory::createDetail);
        Thread whiteArmy = new Thread(white::createArmy);
        Thread blackArmy = new Thread(black::createArmy);

        factoryThread.start();
        whiteArmy.start();
        blackArmy.start();

        try {
            whiteArmy.join();
            blackArmy.join();
            factoryThread.join();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
