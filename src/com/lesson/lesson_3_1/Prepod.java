package com.lesson.lesson_3_1;

import java.util.Arrays;
import java.util.Scanner;

public class Prepod {

    public String name;
    public String position;
    private Student studs[];
    private int countStudent = 0;

    public Prepod(String name, String position, int count) {
        this.name = name;
        this.position = position;
        this.studs = new Student[count];
    }

    public void addStudent(Student student) {
        studs[countStudent] = student;
        student.setPrepod(this);
        countStudent++;
    }

    public void createListOfStudents() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < studs.length; i++) {
            Student student = new Student();

            scanner = new Scanner(System.in);
            System.out.println("enter name");
            student.setName(scanner.nextLine());


            System.out.println("enter age");
            student.setAge(scanner.nextInt());


            System.out.println("enter course");
            student.setCourse(scanner.nextInt());

            student.setPrepod(this);
            studs[i] = student;
        }

    }

    public String getStudsAssString() {
        return "studs=" + Arrays.toString(studs);
    }

    public void showStusentByCourse(int course) {
        String string = new String();
        for (Student student : studs) {
            if (student.getCourse() == course) {
                string = string + student.toString() + "\n";
            }
        }
        System.out.println(string);
    }

    public String getStusentByCourseAndAgeAssString(int course, int age) {
        String string = new String();
        for (Student student : studs) {
            if (student.getCourse() == course && student.getAge() == age) {
                string = string + student.toString() + "\n";
            }
        }
        return string;
    }

    public int getMaxCount() {
        return studs.length;
    }

    public int getCountStudent() {
        return countStudent;
    }

    @Override
    public String toString() {
        return "Prepod{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", studs=" + Arrays.toString(studs) +
                ", countStudent=" + countStudent +
                '}';
    }
}
