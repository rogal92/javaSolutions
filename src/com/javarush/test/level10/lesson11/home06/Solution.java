package com.javarush.test.level10.lesson11.home06;

/* Constructors of the class Human
Write a class Human with 6 fields. Come up with 10 different constructors for it and implement them. Each constructor should have meaning.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human human = new Human(25);
        Human humanTwo = new Human("Tom");
        Human humanThree = new Human("Tom",25);
        Human humanFour = new Human("Martha","Brown","Brown");
        Human humanFive = new Human("Bart",25,82,"Black","Brown","Poland");
        Human humanSix = new Human("Tom","Blue");
        Human humanSeven = new Human("Monica","Blond","Blue","USA");
        Human humanEight = new Human("Paula",25,60,"Blond");
        Human humanNine = new Human(25,"Brown","Africa");
        Human humanTen = new Human(200,"USA");
    }

    public static class Human
    {
        private String name;
        private int age;
        private int weightInKg;
        private String hairColor;
        private String eyeColor;
        private String nationality;

        public Human(int age)
        {
            this.age = age;
        }

        public Human(String name)
        {
            this.name = name;
        }

        public Human(String name, int age)
        {
            this.name = name;
            this.age = age;
        }

        public Human(String name, String hairColor, String eyeColor)
        {
            this.name = name;
            this.hairColor = hairColor;
            this.eyeColor = eyeColor;
        }

        public Human(String name, int age, int weightInKg, String hairColor, String eyeColor, String nationality)
        {
            this.name = name;
            this.age = age;
            this.weightInKg = weightInKg;
            this.hairColor = hairColor;
            this.eyeColor = eyeColor;
            this.nationality = nationality;
        }

        public Human(String name, String hairColor, String eyeColor, String nationality)
        {
            this.name = name;
            this.hairColor = hairColor;
            this.eyeColor = eyeColor;
            this.nationality = nationality;
        }

        public Human(String name, int age, int weightInKg, String hairColor)
        {
            this.name = name;
            this.age = age;
            this.weightInKg = weightInKg;
            this.hairColor = hairColor;
        }

        public Human(String name, String eyeColor)
        {
            this.name = name;
            this.eyeColor = eyeColor;
        }

        public Human(int age, String eyeColor, String nationality)
        {
            this.age = age;
            this.eyeColor = eyeColor;
            this.nationality = nationality;
        }

        public Human(int weightInKg, String nationality)
        {
            this.weightInKg = weightInKg;
            this.nationality = nationality;
        }
    }
}
