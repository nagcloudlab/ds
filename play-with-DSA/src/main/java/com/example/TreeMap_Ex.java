package com.example;

import java.util.TreeMap;


public class TreeMap_Ex {

    static class Owner implements Comparable<Owner> {
        String name;

        Owner(String name) {
            this.name = name;
        }

        @Override
        public int compareTo(Owner o) {
            return this.name.compareTo(o.name);
        }

        @Override
        public String toString() {
            return "Owner{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    static class Car {
        String name;

        Car(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {

        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("A", "Apple");
        treeMap.put("C", "Cat");
        treeMap.put("B", "Ball");

        System.out.println(treeMap);

        TreeMap<Owner, Car> treeMap1 = new TreeMap<>();
        treeMap1.put(new Owner("Smith"), new Car("BMW"));
        treeMap1.put(new Owner("John"), new Car("Audi"));

        System.out.println(treeMap1);


    }
}
