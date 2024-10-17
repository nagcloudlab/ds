package com.example.structure;

import java.util.HashMap;

public class Hashtable_Ex {
    public static void main(String[] args) {


        HashMap<String,String> map = new HashMap<>(1000,0.75f);
        map.put("A","Apple");
        map.put("B","Ball");
        map.put("C","Cat");

        System.out.println(map.get("A"));

    }
}
