package com.example;

import java.util.*;

public class CourseGraph {

    // Graph class representing course prerequisites as a directed graph
    static class Graph {
        private int numCourses;  // Number of courses (vertices)
        private List<List<Integer>> adjList;  // Adjacency list for graph

        // Constructor
        public Graph(int numCourses) {
            this.numCourses = numCourses;
            adjList = new ArrayList<>();
            for (int i = 0; i < numCourses; i++) {
                adjList.add(new ArrayList<>());
            }
        }

        // Add a directed edge (prerequisite relationship)
        public void addEdge(int course, int prerequisite) {
            adjList.get(prerequisite).add(course);
        }

        // Perform Topological Sort to get course order
        public List<Integer> topologicalSort() {
            boolean[] visited = new boolean[numCourses];
            Stack<Integer> stack = new Stack<>();

            // Perform DFS on all nodes (courses)
            for (int i = 0; i < numCourses; i++) {
                if (!visited[i]) {
                    topologicalSortUtil(i, visited, stack);
                }
            }

            // Return the topological sort order
            List<Integer> result = new ArrayList<>();
            while (!stack.isEmpty()) {
                result.add(stack.pop());
            }
            return result;
        }

        // Utility function for DFS and topological sorting
        private void topologicalSortUtil(int course, boolean[] visited, Stack<Integer> stack) {
            visited[course] = true;
            for (int dependentCourse : adjList.get(course)) {
                if (!visited[dependentCourse]) {
                    topologicalSortUtil(dependentCourse, visited, stack);
                }
            }
            stack.push(course);  // Push current course to the stack after all dependencies
        }
    }

    public static void main(String[] args) {
        // Number of courses (vertices)
        int numCourses = 5;

        // Create the course graph
        Graph graph = new Graph(numCourses);

        // Add course dependencies (directed edges)
        // 0 -> Math, 1 -> Physics, 2 -> Computer Science, 3 -> Quantum Mechanics, 4 -> Algorithms

        graph.addEdge(1, 0);  // Math is a prerequisite for Physics
        graph.addEdge(2, 0);  // Math is a prerequisite for Computer Science
        graph.addEdge(3, 1);  // Physics is a prerequisite for Quantum Mechanics
        graph.addEdge(4, 2);  // Computer Science is a prerequisite for Algorithms

        // Perform topological sort to determine course order
        List<Integer> courseOrder = graph.topologicalSort();

        // Print the order of courses
        System.out.println("Course order based on prerequisites:");
        for (int course : courseOrder) {
            System.out.println(getCourseName(course));
        }
    }

    // Utility method to convert course numbers to course names
    private static String getCourseName(int course) {
        switch (course) {
            case 0: return "Math";
            case 1: return "Physics";
            case 2: return "Computer Science";
            case 3: return "Quantum Mechanics";
            case 4: return "Algorithms";
            default: return "Unknown Course";
        }
    }
}

