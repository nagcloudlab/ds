package com.example.sort;


public class CountingSort {

    public static void countingSort(int[] arr) {
        int n = arr.length;

        // Find the maximum value in the array (range of elements)
        int max = 8;  // In our case, we know the max is 8

        // Create a counting array
        int[] count = new int[max + 1];  // size is max + 1 to include all elements from 1 to max

        // Count the occurrences of each element
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // Construct the sorted array
        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                arr[index] = i;  // Place the element in the original array
                index++;
                count[i]--;  // Decrease the count
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};

        System.out.println("Unsorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        countingSort(arr);

        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


