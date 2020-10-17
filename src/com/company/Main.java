package com.company;
public class Main {

    public static void main(String[] args) {

        System.out.println("Constructing a House\n");
        PrepareHouse house = new House();
        house.constructHouse();

        System.out.println("**********************************************");

        System.out.println("Constructing a Flat\n");
        house = new Flat();
        house.constructHouse();

        System.out.println("**********************************************");

        System.out.println("Constructing a Tenament\n");
        house = new Tenament();
        house.constructHouse();
    }

}