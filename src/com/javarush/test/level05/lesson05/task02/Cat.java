package com.javarush.test.level05.lesson05.task02;

/* Implement method fight
Implement method boolean fight(Cat anotherCat): implement a fight mechanism depending on cats’ weight, age and strength. Make up a dependency by yourself. The method should determine, whether current cat (the object whose fight method was called) or anotherCat won fight, i.e. return true if current cat won and false, if it didn’t win. The following condition must be met:
    if cat1.fight(cat2) = true, then cat2.fight(cat1) = false
*/

import java.util.Calendar;

public class Cat
{
    public String name = "Kot";
    public int age = 2;
    public int weight = 2;
    public int strength = 5;

    public Cat()
    {
    }

    public Cat(String name, int age, int weight, int strength)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Cat anotherCat)
    {
        if(this.strength > anotherCat.strength) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat catTwo = new Cat("Kocur",2,2,10);
        cat.fight(catTwo);
        catTwo.fight(cat);
    }
}
