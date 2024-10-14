package com.example;


import com.example.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for(Integer ele:list){
            System.out.println(ele);
        }

    }
}
