package com.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Hashtable_DLL_Ex {
    public static void main(String[] args) {


        //HashSet<String> set = new HashSet<>();
        LinkedHashSet<String> set= new LinkedHashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("P");
        set.add("Z");

//        for (String s : set) {
//            System.out.println(s);
//        }


//        HashMap<String, Integer> map = new HashMap<>();
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("P", 5);
        map.put("Z", 6);

        map.keySet().forEach(key->{
            System.out.println(key + " " + map.get(key));
        });



    }
}
