package com.javarush.test.level06.lesson05.task02;

/* Classes Cat and Dog and finalize() method for each class
In each Cat and Dog class write a finalize() method, which displays to the screen a message that the object is destroyed.
*/

public class Cat
{
    String name;

    protected void finalize() throws Throwable {
        System.out.println(name + "destroyed");
    }
}

class Dog
{
    String name;

    protected void finalize() throws Throwable {
        System.out.println(name + "destroyed");
    }
}