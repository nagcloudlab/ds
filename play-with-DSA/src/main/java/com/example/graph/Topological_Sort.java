package com.example.graph;

import java.util.*;

public class Topological_Sort {

    private Map<String, List<String>> graph = new HashMap<>();
    private Stack<String> courseOrder = new Stack<>();
    private Set<String> visited = new HashSet<>();

    // Add edges (prerequisites)
    public void addCourse(String course, String prerequisite) {
        graph.computeIfAbsent(prerequisite, k -> new ArrayList<>()).add(course);
        graph.putIfAbsent(course, new ArrayList<>());  // Ensure all courses are in graph
    }

    // Perform DFS for Topological Sorting
    private void dfs(String course) {
        visited.add(course);
        for (String neighbor : graph.get(course)) {
            if (!visited.contains(neighbor)) {
                dfs(neighbor);
            }
        }
        courseOrder.push(course);
    }

    // Topological Sort to determine course order
    public void findCourseOrder() {
        for (String course : graph.keySet()) {
            if (!visited.contains(course)) {
                dfs(course);
            }
        }

        System.out.println("Course Order:");
        while (!courseOrder.isEmpty()) {
            System.out.print(courseOrder.pop() + " ");
        }
    }

    public static void main(String[] args) {
        Topological_Sort schedule = new Topological_Sort();
        schedule.addCourse("B", "A");
        schedule.addCourse("C", "B");
        schedule.addCourse("D", "A");
        schedule.addCourse("E", "D");

        schedule.findCourseOrder();  // Expected Output: A B C D E
    }
}
