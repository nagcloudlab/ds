package com.example.structure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_Ex {

    public static void main(String[] args) {


        LinkedList<String> list = new LinkedList<String>(); // DLL
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

//        Iterator<String> itr = list.iterator();
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//        }

//        ListIterator<String> listItr = list.listIterator();

//        while (listItr.hasNext()) {
//            System.out.println(listItr.next());
//        }
//
//        System.out.println("Reverse order");
//
//        while (listItr.hasPrevious()) {
//            System.out.println(listItr.previous());
//        }

        ListIterator<String> lit=list.listIterator(list.size());

        while (lit.hasPrevious()) {
            System.out.println(lit.previous());
        }



    }

}
