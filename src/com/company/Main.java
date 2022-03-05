package com.company;


import less24.Boeing737;
import less24.Mi8;
import less24.Test;

public class Main {

    public static void main(String[] args) {
        Mi8 mi8 = new Mi8();
        Boeing737 boeing737 = new Boeing737();
        Test test = new Test();
        test.foo(mi8);
    }
}
