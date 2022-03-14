package com.javacourse.se.lesson11;

public class OperatorSwitch {
        final int VALUE = 2, FIRSTVALUE = 1, SECONDVALUE = 2, THIRDVALUE = 3;
    public void foo(){
        switch (VALUE){
            case FIRSTVALUE:
                System.out.println(FIRSTVALUE);
                break;
            case SECONDVALUE:
                System.out.println(SECONDVALUE);
                break;
            case THIRDVALUE:
                System.out.println(THIRDVALUE);
                break;
            default:
                System.out.println("Not found");
        }
    }
}
