package com.example.structure;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Ex {
    public static void main(String[] args) {

        Queue<String> queue=new LinkedList<>();
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

//        System.out.println(queue.peek());

//        while (!queue.isEmpty()){
//            System.out.println(queue.poll());
//        }


//        Queue<String> priorityQueue=new PriorityQueue<>();
//        priorityQueue.offer("B");
//        priorityQueue.offer("C");
//        priorityQueue.offer("A");
//
//        while (!priorityQueue.isEmpty()){
//            System.out.println(priorityQueue.poll());
//        }


        Queue<Employee> employeeQueue=new PriorityQueue<>((e1,e2)->e2.experience-e1.experience);
        employeeQueue.offer(new Employee("A",2));
        employeeQueue.offer(new Employee("B",1));
        employeeQueue.offer(new Employee("C",3));

        while (!employeeQueue.isEmpty()){
            System.out.println(employeeQueue.poll().name);
        }



    }
}


class Employee /* implements Comparable<Employee>*/{
    public String name;
    public int experience;

    public Employee(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    /*
    @Override
    public int compareTo(Employee o) {
        return this.experience-o.experience;
    }
    */


}