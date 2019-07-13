package com.lesson.lesson_3_3;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpresion {
    public static void main(String[] args) {

        String strIp="line test to validate the mail ivanov-ivanovich@gmaildcom ivddanov-bivanovich206@mail.ru is tut.by true ivanov2006@gmail.com is true  ivanov-ivanovich.com is not true"
                + "  ivanov-ivanovich is true is not true ";





        Pattern pattern =Pattern.compile("[a-zA-Z0-9_-]+@((mail\\.ru)|(tut\\.by)|(gmail\\.com))");

       // Pattern pattern=Pattern.compile("[a-zA-Z0-9_-]+@(gmail.com)|(mail.ru)");
        Matcher matcher = pattern.matcher(strIp);


        while(matcher.find()){
            System.out.println(matcher.group());

        }


    File file=new File("b");


    //+375 (33) 654-88-77
//aaAAA32 - yes
//aaaaaaAaaaa -no
//34455aaaaAAaaaAA445 - yes
//334455aaaa556aa56 - no
//16.02.2016
//String strIp="test string 192.168.16.3 ip 255.123.577.123 good ip 255.255.255.0 no 321.212.352.4 ip 205.03.34.56";
/*Pattern pattern =Pattern.compile(
		   "((25[0-5]\\.)|(2[0-4]\\d\\.)|(1\\d\\d\\.)|([1-9]\\d\\.)|(\\d\\.)){3}"

		   + "((25[0-5])|(2[0-4]\\d)|(1\\d\\d)|([1-9]\\d)|(\\d))");*/

}

}
