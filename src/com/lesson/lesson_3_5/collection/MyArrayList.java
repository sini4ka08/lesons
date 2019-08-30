package com.lesson.lesson_3_5.collection;

import java.util.*;

public class MyArrayList<E>  implements List <E> {

    Object arr[];

    private int size =-1;
    private  int capacity;


    public MyArrayList() {
        this.arr = new Object[capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }//!

    @Override
    public boolean contains(Object o) {
        return false;
    }//!

    @Override
    public Iterator <E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }//!

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        size++;
        if(size==arr.length){
            restructarizateArr();
        }
        arr[size]=e;

        return true;
    }

    private void restructarizateArr(){
     Object newArr[] =new Object[size+capacity];
     for(int i = 0;i<arr.length;i++){
         newArr[i] = arr[i];
        }
     arr = newArr;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }//!

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
    public void clear() {//!

    }

    @Override
    public E get(int index) {
        return null;
    }//!

    @Override
    public E set(int index, E element) {
        return null;
    }//!

    @Override
    public void add(int index, E element) {//!

    }

    @Override
    public E remove(int index) {
        return null;
    }//!

    @Override
    public int indexOf(Object o) {
        return 0;
    }//!!!!!

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }//!

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
