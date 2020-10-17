package com.company;

public class House extends PrepareHouse {

    @Override
    public void construcFoundation() {
        System.out.println("Constructing Foundation with cement,iron rods and sand");


    }

    @Override
    public void construcPillars() {
        System.out.println("Constructing Pillars for house");

    }

    @Override
    public void construcWalls() {
        System.out.println("Constructing Walls for house");

    }

    @Override
    public void construcWindows() {
        System.out.println("Constructing Windows for house");

    }
}