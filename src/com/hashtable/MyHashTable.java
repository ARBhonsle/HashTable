package com.hashtable;

/**
 * MyHashTable creates key-value pair using linked list
 */
public class MyHashTable {

    public static void main(String[] args) {
        // Welcome Message
        System.out.println("Welcome to Hash Table API");
        // variable
        String sentence = "To be or not to be";
        // MyHashMap object created
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        // String[] words
        String[] words = sentence.toLowerCase().split(" ");
        for (String word : words) {
            Integer value = myHashMap.getNode(word);
            if (value == null)
                value = 1;
            else
                value += 1;
            myHashMap.addNode(word, value);
        }
        int frequency = myHashMap.getNode("to");
        System.out.println("Given sentence is: " + sentence);
        myHashMap.displayHashTable();
        System.out.println("Frequency of 'to' is " + frequency);
    }
}
