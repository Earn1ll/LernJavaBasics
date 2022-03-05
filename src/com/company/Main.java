package com.company;


import less25.DollySheep;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
      String str1 = new String("JAva");
      String str2 = "Java";
      String str3 = "Hot JavaCourse";
      String [] strings = str3.split(" ");
        for (String el: strings){
            System.out.println(el);
        }
        System.out.println(str1.charAt(0));
        System.out.println(str1.codePointAt(1));
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareToIgnoreCase(str2));
        System.out.println(str1.concat(str2));
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.hashCode());
        System.out.println(str1.indexOf(65));
        System.out.println(str1.isEmpty());
        System.out.println(str1.length());
        System.out.println(str3.substring(2,8));
        char [] charArray = str1.toCharArray();
        for (char cA:charArray){
          System.out.println(cA);
        }
      System.out.println(str1.toLowerCase());
      System.out.println(str1.toUpperCase());
      System.out.println(str1.trim());
      System.out.println(String.valueOf(65));


    }
}
