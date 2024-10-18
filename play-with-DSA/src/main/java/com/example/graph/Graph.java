package com.example.graph;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {

    private HashMap<String, ArrayList<String>> adjList = new HashMap<>();

    public void printGraph() {
        System.out.println(adjList);
    }

    public boolean addVertex(String vertex) {
        if (adjList.get(vertex) == null) {
            adjList.put(vertex, new ArrayList<String>());
            return true;
        }
        return false;
    }

    public boolean addEdge(String vertex1, String vertex2) {
        if (adjList.get(vertex1) != null && adjList.get(vertex2) != null) {
            adjList.get(vertex1).add(vertex2);
            adjList.get(vertex2).add(vertex1);
            return true;
        }
        return false;
    }

    public boolean removeEdge(String vertex1, String vertex2) {
        if (adjList.get(vertex1) != null && adjList.get(vertex2) != null) {
            adjList.get(vertex1).remove(vertex2);
            adjList.get(vertex2).remove(vertex1);
            return true;
        }
        return false;
    }

    public boolean removeVertex(String vertex) {
        if (adjList.get(vertex) == null) return false;
        for (String otherVertex : adjList.get(vertex)) {
            adjList.get(otherVertex).remove(vertex);
        }
        adjList.remove(vertex);
        return true;
    }

    // BFS Implementation
    public void bfs(String start) {

        Queue<String> queue = new LinkedList<>();
        ArrayList<String> visited = new ArrayList<>();

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            String current = queue.poll();
            System.out.print(current + " ");  // Print current vertex

            for (String neighbor : adjList.get(current)) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    // DFS Implementation
    public void dfs(String start) {
        Stack<String> stack = new Stack<>();
        ArrayList<String> visited = new ArrayList<>();

        stack.push(start);
        visited.add(start);

        while (!stack.isEmpty()) {
            String current = stack.pop();
            System.out.print(current + " ");  // Print current vertex

            for (String neighbor : adjList.get(current)) {
                if (!visited.contains(neighbor)) {
                    stack.push(neighbor);
                    visited.add(neighbor);
                }
            }
        }
        System.out.println();
    }
}