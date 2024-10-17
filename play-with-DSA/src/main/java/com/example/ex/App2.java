package com.example.ex;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App2 {

    public static void main(String[] args) {

        List<Dish> menu = Dish.menu;

        // Req-1: Find Low Calorie ( < 350 ) Dish Names in Ascending Order
        System.out.println(
                findLowCalorieDishNamesInAscendingOrderV1(menu)
        );
        System.out.println(
                findLowCalorieDishNamesInAscendingOrderV2(menu)
        );

    }

    public static List<String> findLowCalorieDishNamesInAscendingOrderV1(List<Dish> menu) {
        // step-1 : filter low calorie dishes
        List<Dish> lowCalorieDishes = new ArrayList<>();
        for (Dish dish : menu) {
            if (dish.getCalories() < 300) {
                lowCalorieDishes.add(dish);
            }
        }
        // step-2 : sort low calorie dishes
        lowCalorieDishes.sort(new Comparator<Dish>() {
            @Override
            public int compare(Dish o1, Dish o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        // step-3 : collect dish names
        List<String> dishNames = new ArrayList<>();
        for (Dish dish : lowCalorieDishes) {
            dishNames.add(dish.getName());
        }
        return dishNames;
    }

    public static  List<String> findLowCalorieDishNamesInAscendingOrderV2(List<Dish> menu){
        return menu.stream()
                .filter(dish -> dish.getCalories() < 300)
                .sorted(Comparator.comparing(Dish::getName))
                .map(Dish::getName)
                .toList();
    }

}
