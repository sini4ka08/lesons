package com.lesson.lesson_3_4;

public class Stusent implements Comparable <Stusent>{

    String name;
    int age;

    public Stusent(String name, int age) {
        this.name = name;
        this.age = age;
    }

   /* @Override
    public int compareTo(Stusent o) {
        return this.age-o.age;
    }*/
  /*
    @Override
    public int compareTo(Stusent o) {
        return ((Integer)this.age).compareTo(o.age);
    }*/

    @Override
    public int compareTo(Stusent o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Stusent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
