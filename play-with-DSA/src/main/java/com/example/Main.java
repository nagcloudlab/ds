package com.example;


import com.example.util.LinkedList;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer ele = it.next();
            System.out.println(ele);
        }

        // Java 1.5
        for (Integer ele : list) {
            System.out.println(ele);
        }

    }
}
