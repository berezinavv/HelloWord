package com.javacourse.se.lesson16;

public class Modifiers {
    public    String name;
    public  Modifiers(){};

    private class FirstClass{
        public String color;
    }

    public  void  foo(){
        FirstClass firstClass=new FirstClass();
    };
}
