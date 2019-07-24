package com.lesson.lesson_3_4;

public class StusentMain {

    public static void main(String[] args) {
        Stusent stusent =new Stusent("Masha",1986);
        Stusent stusent2 =new Stusent("Pasha",1985);
        Stusent stusent3 =new Stusent("Pashadddddddddddddddddddddd",1984);
        Stusent stusent1[]={stusent,stusent2,stusent3,new Stusent("Alexander",1986)};
        UtilMass.cortbyOrder(stusent1);

        for (Stusent stusent4:
             stusent1) {
            System.out.println(stusent4);
        }


    }
}
