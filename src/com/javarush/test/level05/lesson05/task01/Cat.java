package com.javarush.test.level05.lesson05.task01;

/* Create a class Cat
Create a class Cat. A cat must have its name (name, String), age (age, int), weight (weight, int), and strength (strength, int).
*/

public class Cat
{
    private String name;
    private int age;
    private int weight;
    private int strength;

    public Cat(String name, int age, int weight, int strength)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public int getWeight()
    {
        return weight;
    }

    public int getStrength()
    {
        return strength;
    }
}
