package com.hashtable;

public class MyHashMap<K, V> {
    MyLinkedList<K> myLinkedList;
    MyMapNode<K, V> myMapNode;

    public MyHashMap() {
        this.myLinkedList = new MyLinkedList<>();
    }

    public V getNode(K key) {
        myMapNode = (MyMapNode<K, V>) this.myLinkedList.searchNode(key);
        return (myMapNode == null) ? null : myMapNode.getValue();
    }

    public void addNode(K key, V value) {
        myMapNode = (MyMapNode<K, V>) this.myLinkedList.searchNode(key);
        if (myMapNode == null) {
            myMapNode = new MyMapNode<>(key, value);
            this.myLinkedList.appendNode(myMapNode);
        } else {
            myMapNode.setValue(value);
        }
    }

    public void displayHashTable() {
        System.out.println("Key: " + myMapNode.getKey() + "\nValue: " + myMapNode.getValue());
    }
}
