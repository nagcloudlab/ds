package com.example.structure;


import com.example.util.LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();
        names.add("A");
        names.add("B");
        names.add("C");
        names.add("D");

        System.out.println(names.get(0));

        java.util.LinkedList linkedList = new java.util.LinkedList();


        List<Integer> s=List.of(1,2,3);
        System.out.println(s.getClass().getName());

    }
}

