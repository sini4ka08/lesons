package com.lesson.lesson_3_2;

public class TestString {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        str1= null;
        String str3 = new String("hello");
        String str4 = new String("hello");
        System.out.println(str1 == str2); // t
        System.out.println(str2 == str3); // f
        System.out.println(str3 == str4); // f
        int x = 24;
        String str = String.valueOf(24);
        double d = 45.67;
        str2=String.valueOf(d);//str2 = String.valueOf(d);
        System.out.println(x + d);
        System.out.println(str + str2);
        d=Double.valueOf("3254");//d = Double.valueOf("37865");
        System.out.println(d);
        d=10;
        x = Integer.valueOf("33333333");
        System.out.println(x);
        char array[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
        String ab="25";
        str=String.copyValueOf(array);//str = String.valueOf(array);
        //System.out.println(str);
        //str=String.copyValueOf(array, 1, 3);//str = String.valueOf(array, 1,3);//valueOf(array, 1, 3);
        //array=null;
        System.out.println(str);//
        str = "hello world";
        int countL = 0;
       for(int i=0;i<str.length();i++){
           if(str.charAt(i)=='l'){
               countL++;
           }
           System.out.println(str.charAt(i));
       }
        System.out.println("countL = " + countL);

        System.out.println(str.endsWith("Rld"));//.endsWith("Rld"));
        System.out.println(str.startsWith("hello"));
        System.out.println(str.equalsIgnoreCase("HellO WOrld"));
        str = "   hello test, yes no people! yes test yes world yes end    ";
        int index = -1;
        do {
            index = str.indexOf("yes", index + 1);//indexOf("yes", index + 1);
            System.out.println(index);
        } while (index != -1);

        index = str.length();
        do {
            index = str.lastIndexOf("yes", index - 1);
            System.out.println(index);
        } while (index != -1);
        str = str.replaceAll("yes", "no");
        System.out.println(str);
        str=str.replaceAll(",", "");
        str=str.replaceAll("!", "");
        String s[] = str.split(" ");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
        System.out.println(str.substring(5, str.length()));
        array=str.toCharArray();
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println("Проба "+str.trim());
        str="43346dgsh57#@$%$^&fb#$^%FDHdfh";
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetterOrDigit(str.charAt(i))){
                System.out.println(str.charAt(i));
            }
        }
    }
}
