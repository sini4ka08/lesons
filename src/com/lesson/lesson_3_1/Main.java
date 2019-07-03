package com.lesson.lesson_3_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int var = 0;
        Scanner scanner = new Scanner(System.in);
        Prepod prepod = null;
        do {
            System.out.println("1-createList, 2-showListStudents,"
                    + " 3-showListStudentsByCourse,"
                    + " 4-showListStudentsBycourseAndAge, 0-exit");
            var = scanner.nextInt();

            switch (var) {
                case 1:
                    scanner = new Scanner(System.in);
                    System.out.println("Inter count of students");
                    prepod = new Prepod("Alex", "prosessor", scanner.nextInt());
                    prepod.createListOfStudents();
                    break;
                case 2:

                    System.out.println(prepod.getStudsAssString());
                    break;
                case 3:
                    scanner = new Scanner(System.in);
                    System.out.println("enter course");
                    prepod.showStusentByCourse(scanner.nextInt());
                    break;
                case 4:
                    scanner = new Scanner(System.in);
                    System.out.println("enter course and age");

                    System.out.println("enter course ");
                    int corse = scanner.nextInt();

                    System.out.println("enter age ");
                    System.out.println(prepod.getStusentByCourseAndAgeAssString(corse, scanner.nextInt()));
                    break;
            }


        } while (var != 0);
    }
}
