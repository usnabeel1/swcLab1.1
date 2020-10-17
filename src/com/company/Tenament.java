package com.company;
public class Tenant extends PrepareHouse {

    @Override
    public void construcFoundation() {
        System.out.println("Constructing Foundation with cement,iron rods and sand");

    }
    

    @Override
    public void construcPillars() {
        System.out.println("Constructing Pillars for tenament");

    }

    @Override
    public void construcWalls() {
        System.out.println("Constructing Walls for tenament");

    }
    // you will need to install lintels before adding a window

    @Override
    public void construcWindows() {
        System.out.println("Constructing Windows for tenament");

    }
}
