package com.example;


import com.example.util.LinkedList;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(0,4);
        System.out.println(list.size());
        for (Integer ele : list) {
            System.out.println(ele);
        }

    }
}
