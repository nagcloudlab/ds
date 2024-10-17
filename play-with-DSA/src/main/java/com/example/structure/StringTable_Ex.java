package com.example;

public class StringTable_Ex {
    public static void main(String[] args) {


        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = new String("Hello");

        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println(s3 == s4); // false
        System.out.println(s1 == s3.intern()); // true
        System.out.println(s1 == s4.intern()); // true
    }
}
