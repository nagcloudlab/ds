package com.example.sort;


public class InsertionSortExample {

    // Insertion sort function
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        // Start from the second element
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key, to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Helper function to print the array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 8, 5};

        System.out.println("Unsorted Array:");
        printArray(arr);

        // Sort the array
        long startTime = System.nanoTime();
        insertionSort(arr);
        long endTime = System.nanoTime();

        System.out.println("Sorted Array:");
        printArray(arr);

        // Calculate and print the time taken
        long timeTaken = endTime - startTime;
        System.out.println("Time taken: " + timeTaken + " nanoseconds");
    }
}

