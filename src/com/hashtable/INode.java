package com.hashtable;

/**
 * Node Interface with methods for performing linked list operations
 * @param <Integer>
 */
public interface INode<Integer> {
    // method to get variable key value
    Integer getKey();

    // method to set variable key value
    void setKey(Integer key);

    // method to get next node
    INode<Integer> getNext();

    // method to set next node
    void setNext(INode<Integer> next);
}
