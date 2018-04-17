package com.javarush.test.level05.lesson12.home02;

/* A Man and A Woman
1. Create public static classes Man and Woman within the class Solution.
    2. Classes must have fields: name(String), age(int), address(String).
    3. Create constructors to pass all the possible parameters to.
    4. Use the constructor to create two objects of each class with all the data.
    5. Display the objects in format [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man man1 = new Man("Bart", "Adress",20);
        Man man2 = new Man("Chris","Adress2",25);

        Woman woman1 = new Woman("Monica","Adress3",20);
        Woman woman2 = new Woman("Kim","Adress4",25);

        System.out.println(man1);
        System.out.println(man2);
        System.out.println(woman1);
        System.out.println(woman2);
    }

    public static class Man
    {
        private String name, adress;
        private int age;

        public Man(String name, String adress, int age)
        {
            this.name = name;
            this.adress = adress;
            this.age = age;
        }
        public String toString()
        {
            return "[" + name + " " + age + " " + adress + "]";
        }
    }
    public static class Woman
    {
        private String name, adress;
        private int age;

        public Woman(String name, String adress, int age)
        {
            this.name = name;
            this.adress = adress;
            this.age = age;
        }
        public String toString()
        {
            return "[" + name + " " + age + " " + adress + "]";
        }
    }
}
