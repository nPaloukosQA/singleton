package com.qa.Singleton;

public class Runner {
    public static void main (String[] args) {
        //initialize class Singleton with variable a
        Singleton a = Singleton.getInstance();

        //initialize class Singleton with variable b
        Singleton b = Singleton.getInstance();

        //initialize class Singleton with variable c
        Singleton c = Singleton.getInstance();

        //change variable of instance a
        a.s = (a.s).toLowerCase();

        System.out.println("String from a is: " + a.s);
        System.out.println("String from b is: " + b.s);
        System.out.println("String from c is: " + c.s);

        //change variable of instance c
        c.s = (c.s).toUpperCase();

        System.out.println("String from a is: " + a.s);
        System.out.println("String from b is: " + b.s);
        System.out.println("String from c is: " + c.s);


    }
}
