package com.example.structure;


public class WeatherDecisionTree {


    static class Node {
        String decision;
        Node left, right;

        public Node(String decision) {
            this.decision = decision;
            this.left = this.right = null;
        }
    }

    public static Node createWeatherDecisionTree() {
        Node root = new Node("What's the weather like?");
        root.left = new Node("Is it windy?");
        root.left.left = new Node("Wear a raincoat");
        root.left.right = new Node("Take an umbrella");
        root.right = new Node("Is it cold or sunny?");
        root.right.right = new Node("Wear a jacket or sunglasses");
        return root;
    }

    public static String makeDecision(Node node, String weather, boolean isWindy) {
        return "Rainy".equalsIgnoreCase(weather)
                ? (isWindy ? node.left.left.decision : node.left.right.decision)
                : node.right.right.decision;
    }

    public static String recursiveDecision(Node node, String weather, boolean isWindy) {
        if (node.left == null && node.right == null) {
            return node.decision;
        }
        if ("Rainy".equalsIgnoreCase(weather)) {
            return isWindy ? recursiveDecision(node.left.left, weather, isWindy) : recursiveDecision(node.left.right, weather, isWindy);
        } else {
            return recursiveDecision(node.right.right, weather, isWindy);
        }
    }

    public static void main(String[] args) {
        Node decisionTree = createWeatherDecisionTree();
        String weather = "Rainy";
        boolean isWindy = true;
        String decision = recursiveDecision(decisionTree, weather, isWindy);
        System.out.println("Decision: " + decision);
    }
}

