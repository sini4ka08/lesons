package com.lesson.lesson_3_5.collection;

public class Node <T> {

    Node next;
    T value;

    public Node(Node next, T value) {
        this.next = next;
        this.value = value;
    }

    public Node() {

    }
}
