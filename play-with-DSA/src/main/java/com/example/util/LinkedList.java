package com.example.util;


// data-structure
// iterator : A obj who knows how to iterate elements of a data-structure
// data-structure + iterator = iterable


import java.util.Iterator;

public class LinkedList<E> implements Iterable<E> {

    private Node head;
    private Node tail;
    private int size;

    // C
    public void add(E e){
        Node newNode = new Node(e);
        if(head == null) {
            head = newNode;
        }
        else{
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }
    public void add(int index,E e){
        if(index < 0){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if(index > size){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node newNode = new Node(e);
        if(index == 0){
            newNode.next = head;
            head = newNode;
        }
        else{
            Node temp = head;
            for(int i=0;i<index-1;i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        size++;
    }

    //R
    public E get(int index){
        //..
        return null;
    }

    public int size(){
        return size;
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
