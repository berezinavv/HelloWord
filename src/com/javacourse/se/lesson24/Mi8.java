package com.javacourse.se.lesson24;

public class Mi8 extends Helicopter implements VerticalTakeOff{
    @Override
    public void fly() {
        System.out.println("Helicopter Mi8");
    }

    @Override
    public void vertikalTakeOff() {
        System.out.println("Helicopter Mi8 virtical");
    }
}
