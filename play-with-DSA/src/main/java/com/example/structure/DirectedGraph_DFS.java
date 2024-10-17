package com.example;

import java.util.*;

public class DirectedGraph_DFS {

    // Map to store the adjacency list for the directed graph
    private Map<String, List<String>> adjList;

    // Constructor
    public DirectedGraph_DFS() {
        adjList = new HashMap<>();
    }

    // Add a vertex (task) to the graph
    public void addVertex(String task) {
        adjList.putIfAbsent(task, new ArrayList<>());
    }

    // Add a directed edge (task1 -> task2)
    public void addEdge(String task1, String task2) {
        adjList.putIfAbsent(task1, new ArrayList<>());
        adjList.putIfAbsent(task2, new ArrayList<>());
        // Directed edge from task1 to task2
        adjList.get(task1).add(task2);
    }

    // Print the graph (Adjacency list representation)
    public void printGraph() {
        for (Map.Entry<String, List<String>> entry : adjList.entrySet()) {
            System.out.print("Task " + entry.getKey() + " -> ");
            for (String dependentTask : entry.getValue()) {
                System.out.print(dependentTask + " ");
            }
            System.out.println();
        }
    }

    // Method to perform DFS traversal from a given start node
    public static void dfsTraversal(DirectedGraph_DFS graph, String currentTask, Set<String> visited) {
        // Mark the current node as visited
        visited.add(currentTask);
        System.out.print(currentTask + " ");

        // Recur for all the adjacent nodes (neighbors)
        List<String> neighbors = graph.adjList.get(currentTask);
        if (neighbors != null) {
            for (String neighbor : neighbors) {
                if (!visited.contains(neighbor)) {
                    dfsTraversal(graph, neighbor, visited);
                }
            }
        }
    }

    public static void main(String[] args) {

        // Create a directed graph (task scheduling example)
        DirectedGraph_DFS taskGraph = new DirectedGraph_DFS();
        taskGraph.addVertex("Task A");
        taskGraph.addVertex("Task B");
        taskGraph.addVertex("Task C");
        taskGraph.addVertex("Task D");
        taskGraph.addEdge("Task A", "Task B");
        taskGraph.addEdge("Task B", "Task C");
        taskGraph.addEdge("Task A", "Task D");
        taskGraph.addEdge("Task D", "Task C");

        // Perform DFS traversal from Task A
        System.out.println("DFS Traversal:");
        Set<String> visited = new HashSet<>();
        dfsTraversal(taskGraph, "Task A", visited);
    }
}
