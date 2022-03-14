package com.javacourse.se.lesson12;

public class LoopControl {
    boolean value = true;
    int a=5,b=7;
    public void foo(){
        while (a<b){
            System.out.println(a);
            a++;
        }

        do{
            System.out.println("Hey");
        }
        while(a==b);
    }
}
