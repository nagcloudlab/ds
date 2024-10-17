package com.example.structure;

import java.util.Stack;

public class Stack_Ex {
    public static void main(String[] args) {


        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");

//        System.out.println(stack.peek());

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
