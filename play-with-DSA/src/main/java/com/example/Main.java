package com.example;


import com.example.util.LinkedList;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();
        names.add("A");
        names.add("B");
        names.add("C");
        names.add("D");

        System.out.println(names.get(0));

    }
}
