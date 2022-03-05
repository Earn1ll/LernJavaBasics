package com.company;

public class Main {

    public static void main(String[] args) {
        String str = new String("Java");
        System.out.println(str.concat(" Hot!"));
        System.out.println(str);
        StringBuilder stringBuilder = new StringBuilder("Java");
        System.out.println(stringBuilder.append(" Hot"));
        stringBuilder.setLength(15);
        System.out.println(stringBuilder.capacity());
        stringBuilder.insert(1, "G");
        System.out.println(stringBuilder);
        stringBuilder.deleteCharAt(1);
      System.out.println(stringBuilder.reverse());

    }
}
