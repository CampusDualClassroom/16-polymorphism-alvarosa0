package com.campusdual.classroom;

import java.util.Calendar;

public class Exercise {

    public static void main(String[] args) {
        Plane plane = new Plane("Boeing");
        Tractor tractor = new Tractor(3500);

        plane.start();
        tractor.start();

        plane.fly();
        tractor.forward();

        plane.fly();
        plane.takeOff();
        plane.land();

        tractor.forward();
        tractor.backward();

        plane.maintenance();
        tractor.maintenance();
    }
}