package com.lesson.lesson_3_4.recursion;

public class RecursionMain {



    public static void main(String arr[]){
        int mass[] = {10,20,12,13,5,6};
        new RecursionMain().showElemm(-1);

    }

    public void showElemm(int elem ){

    /*    if(mass.length-1==elem){
            return;
        }*/
        elem++;
        System.out.println(elem);
      //  System.out.println(mass[elem]);
        showElemm(elem);



    }

}
