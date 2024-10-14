package com.example.util;


// data-structure
// iterator : A obj who knows how to iterate elements of a data-structure
// data-structure + iterator = iterable


import java.util.Iterator;

public class LinkedList<E> implements Iterable<E> {

    private Node head;
    private Node tail;

    public void add(E e){
        Node newNode = new Node(e);
        if(head == null) {
            head = newNode;
        }
        else{
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void add(int index,E e){
        // TODO
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            Node temp = head;
            @Override
            public boolean hasNext() {
                return temp != null;
            }
            @Override
            public E next() {
                E data = temp.data;
                temp = temp.next;
                return data;
            }
        };
    }

    private class Node{
        E data;
        Node next;
        Node(E data){
            this.data = data;
            this.next = null;
        }
        Node(E data, Node next){
            this.data = data;
            this.next = next;
        }
    }
}
