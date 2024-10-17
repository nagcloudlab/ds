package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DirectedGraph {

    // Map to store the adjacency list for the directed graph
    private Map<String, List<String>> adjList;

    // Constructor
    public DirectedGraph() {
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

    public static void main(String[] args) {
        // Create the directed graph (task dependencies)
        DirectedGraph taskGraph = new DirectedGraph();

        // Add tasks (vertices)
        taskGraph.addVertex("Task A");
        taskGraph.addVertex("Task B");
        taskGraph.addVertex("Task C");
        taskGraph.addVertex("Task D");

        // Add task dependencies (directed edges)
        taskGraph.addEdge("Task A", "Task B"); // Task A must be done before Task B
        taskGraph.addEdge("Task B", "Task C"); // Task B must be done before Task C
        taskGraph.addEdge("Task A", "Task D"); // Task A must be done before Task D
        taskGraph.addEdge("Task D", "Task C"); // Task D must be done before Task C

        // Print the task dependencies (directed graph)
        taskGraph.printGraph();
    }
}
