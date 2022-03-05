package com.company;


import less25.DollySheep;

public class Main {

    public static void main(String[] args) {
        DollySheep dollySheep = new  DollySheep();
        DollySheep dollySheep2 = new  DollySheep();

        dollySheep.setName("Dolly");
        dollySheep2.setName("Sheep");

        System.out.println(dollySheep.getName());
        System.out.println(dollySheep2.getName());


    }
    public static DollySheep foo(DollySheep dollySheep2){
        DollySheep sheep = null;
        try {
            sheep =  (DollySheep) dollySheep2.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheep;
    }
}
