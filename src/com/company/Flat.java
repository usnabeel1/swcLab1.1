package com.company;
public class Flat extends PrepareHouse {

    @Override
    public void construcFoundation() {
        System.out.println("Constructing Foundation with cement,iron rods and sand");

    }

    @Override
    public void construcPillars() {
        System.out.println("Constructing Pillars for flat");

    }

    @Override
    public void construcWalls() {
        System.out.println("Constructing Walls for flat");

    }

    @Override
    public void construcWindows() {
        System.out.println("Constructing Windows for flat");

    }
}