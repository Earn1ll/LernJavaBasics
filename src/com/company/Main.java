package com.company;

import less28.*;
import less29.ErrorExample;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {

      ErrorExample err = new ErrorExample();
        try {
            err.foo();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {

        }
    }
}
