package com.javacourse.se.lesson32;

import java.io.Serializable;

public class Cat implements Serializable {


    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*Cat cat=new Cat();
        cat.setName("Tom");
        Serializator serializator=new Serializator();
        System.out.println(serializator.serialization(cat));*/


        /*Serializator serializator=new Serializator();
        try {
            Cat cat = serializator.deserialization();
            System.out.println(cat.getName());
        } catch (InvalidObjectException e) {
            e.printStackTrace();
        }*/


}
