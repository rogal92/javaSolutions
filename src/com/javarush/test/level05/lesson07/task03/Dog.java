package com.javarush.test.level05.lesson07.task03;

/* Create a class Dog
Create a class Dog with three initializers:
    - Name
    - Name, height
    - Name, height, color
*/

public class Dog
{
    private String rex = null;

    public void initialize(String name) {
        this.rex = name;
    }
    public void initialize(String name, int height) {
        this.rex = name + height;
    }
    public void initialize(String name, int height, String color) {
        this.rex = name + height + color;
    }
}

