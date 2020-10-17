package com.company;
public class Main {

    public static void main(String[] args) {

        System.out.println("Construct a House\n");
        PrepareHouse house = new House();
        house.constructHouse();

        System.out.println("**********************************************");

        System.out.println("Construct a Flat\n");
        house = new Flat();
        house.constructHouse();

        System.out.println("**********************************************");

        System.out.println("Construct a Tenament\n");
        house = new Tenament();
        house.constructHouse();
    }

}
