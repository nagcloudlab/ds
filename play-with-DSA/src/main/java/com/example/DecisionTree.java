package com.example;



 public class DecisionTree {

     static class Node {
         String decision;
         Node left, right;

         public Node(String decision) {
             this.decision = decision;
             this.left = this.right = null;
         }
     }

    public static Node createDecisionTree() {
        Node root = new Node("Is it raining?");
        root.left = new Node("Take an umbrella");
        root.right = new Node("Enjoy the walk");
        return root;
    }

    public static String makeDecision(Node node, boolean isRaining) {
        return isRaining ? node.left.decision : node.right.decision;
    }

    public static void main(String[] args) {
        Node decisionTree = createDecisionTree();
        boolean isRaining = true;
        String decision = makeDecision(decisionTree, isRaining);
        System.out.println("Decision: " + decision);
    }
}

