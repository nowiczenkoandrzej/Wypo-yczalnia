package com.andrzejnowiczenko;

import java.util.Scanner;

public class Truck extends Vehicle{

    private int capacity;

    Truck(String brand, String model, int mileage, String condition, int capacity) {
        super(brand, model, mileage, condition);
        this.capacity = capacity;
    }

    public static Truck newTruck(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj marke");
        String brand = scanner.next();
        System.out.println("podaj model");
        String model = scanner.next();
        System.out.println("podaj przebieg");
        int mileage = scanner.nextInt();
        System.out.println("podaj stan");
        String condition = scanner.next();
        System.out.println("podaj ladownosc:");
        int capacity = scanner.nextInt();

        return new Truck(brand, model, mileage, condition,capacity);
    }



}
