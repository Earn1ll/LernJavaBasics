package com.company;

import less6.Bus;

public class Start {
    public static void main (String[] args) {
        Bus ourBus = new Bus();
        Bus firstBus = new Bus();
        Bus secondBus = new Bus();

        ourBus.color = "Green";
        firstBus.color = "Red";
        secondBus.color = "Gray";

        ourBus.showColor();
        firstBus.showColor();
        secondBus.showColor();
    }
}
