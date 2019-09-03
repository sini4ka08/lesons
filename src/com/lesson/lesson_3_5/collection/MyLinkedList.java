package com.lesson.lesson_3_5.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyLinkedList<E> implements List <E> {

    Node <E> head;
    Node <E> tail;

    public MyLinkedList() {
        head = new Node();
        tail = new Node();
    }

    private int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator <E> iterator() {
        return new Iterator <E>() {

            Node pre = head;

            @Override
            public boolean hasNext() {
                return pre != null;
            }

            @Override
            public E next() {
                E r = (E) pre.value;
                pre = pre.next;
                return r;
            }
        };
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {

        if (size == 0) {
            head.value = e;
        } else if (size == 1) {
            head.next = tail;
            tail.value = e;
        } else {
            tail.next = new Node(null, e);
            tail = tail.next;
        }
        size++;


        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection <?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection <? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection <? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection <?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection <?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {
        int countIndex = 0;

        Node<E> nodePrev =head;
        Node<E> nodebeforPrev =null;
        while (countIndex!=index){
            nodebeforPrev=nodePrev;
            nodePrev=nodePrev.next;
            countIndex++;
        }
        Node<E> noderezalt = new Node<E>(nodePrev,element);
        nodebeforPrev.next=noderezalt;

        //nodePrev.next = new Node<E>(nodePrev.next,element);
    }

    @Override
    public E remove(int index) {
        if (index >= size) {
            throw new RuntimeException("this index ->" + index + " not exist");
        }
        size--;
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator <E> listIterator() {
        return null;
    }

    @Override
    public ListIterator <E> listIterator(int index) {
        return null;
    }

    @Override
    public List <E> subList(int fromIndex, int toIndex) {
        return null;
    }
}
