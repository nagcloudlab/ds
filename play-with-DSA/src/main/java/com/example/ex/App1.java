package com.example.ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App1 {
    public static void main(String[] args) {


        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple("green", 200));
        inventory.add(new Apple("red", 100));
        inventory.add(new Apple("green", 150));

        // Req-1: sort all apples by weight ( asc )
        sortApples(inventory, (a1, a2) -> a1.getWeight() - a2.getWeight());

        // Req-2:  sort all apples by weight ( dsc )
        sortApples(inventory, (a1, a2) -> a2.getWeight() - a1.getWeight());

        // Req-3:  sort all apples by color ( asc )
        sortApples(inventory, (a1, a2) -> a1.getColor().compareTo(a2.getColor()));


        for (Apple apple : inventory) {
            System.out.println(apple);
        }


    }


    private static void sortApples(List<Apple> inventory, Comparator<Apple> comparator) {
        // sorting algorithm(s)
        Collections.sort(inventory, comparator);
    }


}


// imperative style
// intention + implementation mixed together

//solution:

// separate intention from implementation ( declarative style )

// how ,

// by parameterizing the intention
// - by primitive values
// - by objects
// - by functions ( Functional Programming ) ( Behaviour parameterization )


//why should i write code in functional style
// - for concise code

