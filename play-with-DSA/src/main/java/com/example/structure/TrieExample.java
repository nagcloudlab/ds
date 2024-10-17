package com.example.structure;

class TrieNode {
    TrieNode[] children = new TrieNode[26];  // Assuming lowercase English letters
    boolean isEndOfWord;
}

class Trie {

    TrieNode root = new TrieNode();

    // Insert a word
    void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.isEndOfWord = true;
    }

    // Search for a word
    boolean search(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) {
                return false;
            }
            node = node.children[index];
        }
        return node.isEndOfWord;
    }
}

public class TrieExample {
    public static void main(String[] args) {

        Trie trie = new Trie();
        trie.insert("apple");
        trie.insert("apt");
        trie.insert("bat");
        trie.insert("bear");

        System.out.println(trie.search("apple"));  // Output: true
        System.out.println(trie.search("bat"));    // Output: true
        System.out.println(trie.search("batman")); // Output: false
    }
}

