package com.lesson.lesson_3_5.collection;

import java.time.LocalDateTime;
import java.util.*;

public class CollectionMain {

    public static void main(String arr[]) {
        List <String> list= new ArrayList();

        for (int i = 0;i<1000;i++) {
            Long start = System.nanoTime();
            list.add(String.valueOf(i));
            Long finish = System.nanoTime();

            System.out.println("ArryList " + i+" "+(finish-start));
        }

        list =new LinkedList();

        for (int i = 0;i<1000;i++) {
            Long start = System.nanoTime();
            list.add(String.valueOf(i));
            Long finish = System.nanoTime();

            System.out.println("LinkedList " + i+" "+(finish-start));
        }

     /*   Node node1=new Node(null,1);
        Node node2=new Node(null,2);
        Node node3=new Node(null,3);

        node1.next=node2;
        node2.next=node3;

        Node head=new Node(node1,0);*/

     /*   Node prev=head;
        while (prev!=null){
            System.out.println(prev.value);
            prev=prev.next;
        }*/
        /*while (head!=null){
            System.out.println(head.value);
            head=head.next;
        }*/

       /* MyLinkedList <Integer> myLinkedList = new MyLinkedList();
        myLinkedList.add(0);
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(5);
        Iterator <Integer> iter=myLinkedList.iterator();

        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println();
        myLinkedList.add(3,10);
        iter=myLinkedList.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }*/
    }
}
