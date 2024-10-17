package com.example.structure;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

class Owner {
    String name;

    Owner(String name) {
        this.name = name;
    }

//    @Override
//    public int hashCode() {
//        return name.hashCode();
//    }

    @Override
    public boolean equals(Object obj) {
        return this.name.equals(((Owner) obj).name);
    }
}

class Car {
    String model;

    Car(String model) {
        this.model = model;
    }
}

public class Ex {
    public static void main(String[] args) {


        Owner owner1 = new Owner("Riya");
        System.out.println(owner1.hashCode());
        Owner owner2 = new Owner("Diya");
        //System.out.println(owner2.hashCode());

//        HashSet<Owner> owners = new HashSet<>();
//        owners.add(owner1);
//        owners.add(owner2);
//
//        System.out.println(owners.size());

        Car car1 = new Car("BMW");
        Car car2 = new Car("AUDI");

        HashMap<Owner, Car> map = new HashMap<>();
        map.put(owner1, car1);
        map.put(owner2, car2);


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the owner");
        String name = sc.nextLine();
        Owner key = new Owner(name);

        Car car = map.get(key); // O(1)
        if (car == null) {
            System.out.println("Car not found");
        } else {
            System.out.println("Car found: " + car.model);
        }

        sc.close();


    }
}
