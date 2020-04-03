package com.qa.Singleton;

public class Singleton {

    //Static variable oneInstance of type Singleton
    private static Singleton oneInstance = null;

    //Variable type of String
    public String s;

    //Private constructor of the class itself
    private Singleton () {
        s = "Hi, nice to meet you";
    }

    //Static method to create an instance of Singleton class
    public static Singleton getInstance() {
        if (oneInstance == null)
            oneInstance =new Singleton();

        return oneInstance;
    }

}
