package com.javarush.test.level06.lesson05.task01;

/* finalize() method of Cat class
Write a method protected void finalize() throws Throwable in the class Cat.
*/

public class Cat
{
    String name;

    protected void finalize() throws Throwable {
        System.out.println(name + "destroyed");
    }
}

