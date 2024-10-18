package com.example.graph;

// BFS and DFS

//BFS: Starts at a given vertex, explores all neighboring vertices first before moving to the next level of neighbors.
//Uses a Queue to explore nodes in breadth-first order.

//DFS: Starts at a given vertex, explores each branch fully before backtracking.
//Uses a Stack to explore nodes in depth-first order.

public class Ex2 {
    public static void main(String[] args) {

        Graph myGraph = new Graph();

        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");
        myGraph.addVertex("D");

        myGraph.addEdge("A", "B");
        myGraph.addEdge("A", "C");
        myGraph.addEdge("A", "D");
        myGraph.addEdge("B", "D");
        myGraph.addEdge("C", "D");

        System.out.println("BFS starting from vertex A:");
        myGraph.bfs("A");  // Expected Output: A B C D

        System.out.println("DFS starting from vertex A:");
        myGraph.dfs("A");  // Expected Output: A D C B

    }
}
