package com.hashtable;

public class MyLinkedList<K> {
    public INode<K> head;

    public MyLinkedList() {
        this.head = null;
    }

    public void appendNode(INode<K> newNode) {
        if (this.head == null) {
            this.head = newNode;
        } else {
            INode<K> tempNode = this.head;
            while (tempNode.getNext() != null) {
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(newNode);
        }

    }

    public INode<K> searchNode(K key) {
        INode tempNode = head;
        while (tempNode != null) {
            if (tempNode.getKey().equals(key)) {
                return tempNode;
            }
            tempNode = tempNode.getNext();
        }
        return null;
    }
}