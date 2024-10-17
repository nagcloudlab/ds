package com.example.structure;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList_vs_LinkedList {

    private static final int ADD_END_SIZE = 100000;
    private static final int INSERT_MIDDLE_SIZE = 1000;

    public static void main(String[] args) {

        // Initialize ArrayList with initial capacity to avoid resizing
        ArrayList<String> arrayList = new ArrayList<>(ADD_END_SIZE);
        // Initialize LinkedList without specifying capacity
        LinkedList<String> linkedList = new LinkedList<>();

        // Compare adding elements at the end
        compareAddAtEnd(arrayList, "ArrayList");
        compareAddAtEnd(linkedList, "LinkedList");

        // Compare access time (get operation)
        compareAccess(arrayList, "ArrayList");
        compareAccess(linkedList, "LinkedList");

        // Compare inserting elements at the middle
        compareInsertionAtMiddle(arrayList, "ArrayList");
        compareInsertionAtMiddle(linkedList, "LinkedList");
    }

    /**
     * Compares the time taken to add elements at the end of the list.
     *
     * @param list     The list to perform the operation on.
     * @param listType A string representing the type of the list.
     */
    private static void compareAddAtEnd(List<String> list, String listType) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < ADD_END_SIZE; i++) {
            list.add("Element " + i);
        }
        long end = System.currentTimeMillis();
        System.out.println(listType + " -> Time taken to add at end: " + (end - start) + "ms");
    }

    /**
     * Compares the time taken to access all elements in the list.
     *
     * @param list     The list to perform the operation on.
     * @param listType A string representing the type of the list.
     */
    private static void compareAccess(List<String> list, String listType) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);  // Access each element
        }
        long end = System.currentTimeMillis();
        System.out.println(listType + " -> Time taken for access: " + (end - start) + "ms");
    }

    /**
     * Compares the time taken to insert elements in the middle of the list.
     *
     * @param list     The list to perform the operation on.
     * @param listType A string representing the type of the list.
     */
    private static void compareInsertionAtMiddle(List<String> list, String listType) {
        long start = System.currentTimeMillis();
        int middleIndex = list.size() / 2;
        for (int i = 0; i < INSERT_MIDDLE_SIZE; i++) {
            list.add(middleIndex, "New Element " + i);
        }
        long end = System.currentTimeMillis();
        System.out.println(listType + " -> Time taken to insert at middle: " + (end - start) + "ms");
    }
}

