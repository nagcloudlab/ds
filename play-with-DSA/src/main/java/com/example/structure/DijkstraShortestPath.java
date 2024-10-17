package com.example.structure;


import java.util.*;

public class DijkstraShortestPath {

    // Class representing a directed, weighted graph
    static class Graph {
        private final Map<Integer, List<Edge>> adjList = new HashMap<>();

        // Add an edge between two nodes with a weight
        public void addEdge(int from, int to, int weight) {
            adjList.computeIfAbsent(from, x -> new ArrayList<>()).add(new Edge(to, weight));
        }

        // Get all adjacent edges for a given node
        public List<Edge> getEdges(int node) {
            return adjList.getOrDefault(node, new ArrayList<>());
        }
    }

    // Class representing an edge in the graph
    static class Edge {
        int to;
        int weight;

        Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    // Method to find the shortest path using Dijkstra's Algorithm
    public static void dijkstra(Graph graph, int startNode, int numNodes) {
        int[] distances = new int[numNodes];
        Arrays.fill(distances, Integer.MAX_VALUE); // Initialize distances with infinity
        distances[startNode] = 0;
        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(edge -> edge.weight));
        pq.add(new Edge(startNode, 0));
        while (!pq.isEmpty()) {
            Edge current = pq.poll();
            int currentNode = current.to;
            for (Edge edge : graph.getEdges(currentNode)) {
                int newDist = distances[currentNode] + edge.weight;
                if (newDist < distances[edge.to]) {
                    distances[edge.to] = newDist;
                    pq.add(new Edge(edge.to, newDist));
                }
            }
        }

        // Print the shortest path to each node
        System.out.println("Shortest paths from start node " + startNode + ":");
        for (int i = 0; i < numNodes; i++) {
            System.out.println("To node " + i + ": " + distances[i]);
        }
    }

    public static void main(String[] args) {
        // Create a directed, weighted graph
        Graph graph = new Graph();
        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 1);
        graph.addEdge(2, 1, 2);
        graph.addEdge(2, 3, 5);
        graph.addEdge(1, 3, 1);

        // Run Dijkstra's algorithm from the start node (0)
        dijkstra(graph, 0, 4);
    }
}

