package com.example.structure;

import java.util.LinkedList;
import java.util.Random;

public class Custom_HashTable_Ex {

    private static final int SIZE = 10;
    LinkedList<Entry>[] table;

    // Constructor
    public Custom_HashTable_Ex() {
        table = new LinkedList[SIZE]; // bucket size 10
        for (int i = 0; i < SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // Hash function
    private int hash(int key) {
        return key % SIZE; //12345 % 10 = 5
    }

    // Insert key-value pair
    public void put(int key, String value) {
        int index = hash(key);
        for (Entry entry : table[index]) {
            if (entry.key == key) {
                entry.value = value; // Update value if key exists
                return;
            }
        }
        table[index].add(new Entry(key, value)); // Add new entry
    }

    // Search value by key
    public String get(int key) {
        int index = hash(key);
        for (Entry entry : table[index]) {
            if (entry.key == key) {
                return entry.value;
            }
        }
        return null;
    }

    // Entry class for key-value pairs
    class Entry {
        int key;
        String value;

        Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return key + "=" + value;
        }
    }

    public static void main(String[] args) {


//        System.out.println(1%10);
//        System.out.println(11%10);
//        System.out.println(21%10);


        Custom_HashTable_Ex hashTable = new Custom_HashTable_Ex();
        hashTable.put(1, "Apple");
        hashTable.put(11, "Banana");
        hashTable.put(21, "Cherry");

        for (LinkedList<Entry> e : hashTable.table) {
            System.out.println(e);
        }

//        System.out.println("Get key 11: " + hashTable.get(11)); // Output: Banana
    }
}

