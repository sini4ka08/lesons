package com.lesson.lesson_3_4;

public class UtilMass {

    public static void cortbyOrder(Comparable[] comparables){
        Comparable sortCompar[]=comparables;

        for (int i = 0; i < sortCompar.length - 1; i++) {
            for (int j = i + 1; j < sortCompar.length; j++) {
                if (sortCompar[i].compareTo(sortCompar[j])>0) {
                    Comparable prev = sortCompar[i];
                    sortCompar[i] = sortCompar[j];
                    sortCompar[j] = prev;
                }
            }
        }
    }
}
