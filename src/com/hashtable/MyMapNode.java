package com.hashtable;


public class MyMapNode<K, V> implements INode<K> {
    K key;
    V value;
    INode<K> next;

    public MyMapNode(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public INode<K> getNext() {
        return next;
    }

    @Override
    public void setNext(INode<K> next) {
        this.next = next;
    }

    public V getValue() {
        return this.value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public String printDetails() {
        StringBuilder myMapNodeString = new StringBuilder();
        myMapNodeString.append("MyMapNode{" + "K=").append(key).append(" V=").append(value).append("}");
        if(next !=null){
            myMapNodeString.append("->").append(next);
        }
        return myMapNodeString.toString();
    }
}
