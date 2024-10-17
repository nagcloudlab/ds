package com.example.structure;

import java.util.concurrent.ArrayBlockingQueue;

public class WaitNotify_Ex {
    public static void main(String[] args) {

        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);


        // producer, producer number on every 1s,
        Thread producer = new Thread(() -> {
            int value = 0;
            while (true) {
                try {
                    queue.put(value); // if queue is full, it will wait
                    System.out.println("Produced " + value);
                    value++;
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // consumer, consume number on every 15s
        Thread consumer = new Thread(() -> {
            while (true) {
                try {
                    System.out.println("Consumed " + queue.take());
                    Thread.sleep(15000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producer.start();
        consumer.start();




    }
}
