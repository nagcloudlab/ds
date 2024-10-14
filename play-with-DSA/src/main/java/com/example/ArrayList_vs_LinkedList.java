package com.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList_vs_LinkedList {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>(100000);
        LinkedList<String> linkedList = new LinkedList<>();

        compare(arrayList);
        compare(linkedList);

    }

    private static void compare(List<String> list) {

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add("Element " + i);
        }
        long end = System.currentTimeMillis();
        System.out.println(list.getClass().getName() + " -> Time taken: " + (end - start) + "ms");

    }
}
