package com.lesson.lesson_3_2;

public class TestStringBilderAndStringBuffer {

    public static void main(String[] args) {
       StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("f");
      stringBuilder.append(" ");
      stringBuilder.append("olia");
        System.out.println(stringBuilder.toString());

        String string =new String();
        string+="f";
        string+=" ";
        string+="olia";
        System.out.println(string);

        StringBuffer stringBuffer = new StringBuffer();

    }
}
