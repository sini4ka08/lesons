package com.lesson.lesson_3_2;

import java.util.zip.DataFormatException;

public class MainForEnum {

    public static void main(String[] args) {
        DayOfWeek day1 = null;
        System.out.println("_____________________");
        day1 = DayOfWeek.PN;
        System.out.println("_____________________");
        System.out.println(day1);
        DayOfWeek dayOfWeek=DayOfWeek.valueOf("VT");
        System.out.println(dayOfWeek);
        DayOfWeek days[] = DayOfWeek.values();
        for (DayOfWeek d : days) {
            System.out.print("\t" + d.name() + "\t");
            System.out.println(d.ordinal() + "\t " + d.getTimeWork());
        }
    }
}
