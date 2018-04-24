package com.javarush.test.level08.lesson11.home06;

/* The whole family is together
Create a class Human with the fields: String name, boolean sex, int age, ArrayList<Human> children.
    2. Create 9 objects and fill them in such a way as to obtain two grandfathers, two grandmothers, a father, a mother, and three children.
    3. Display to the screen all the Human objects.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<Human> kidsOne = new ArrayList<>();
        ArrayList<Human> kidstwo = new ArrayList<>();
        ArrayList<Human> kidsThree = new ArrayList<>();
        ArrayList<Human> noKids = new ArrayList<>();


        Human childrenOne = new Human("Ania", false, 22,noKids);
        Human childrenTwo = new Human("Monika",false,25,noKids);
        Human childreThree = new Human("Paweł",true,20,noKids);
        Human mother = new Human("Mariola",false,50,kidsOne );
        Human father = new Human("Tadeusz", true,50,kidsOne);
        Human grandMotherOne = new Human("Zofia",false,78,kidstwo);
        Human grandMotherTwo = new Human("Elżbieta", false, 78, kidstwo);
        Human grandFatherOne = new Human("Zdzisiek",true,78,kidsThree);
        Human grandFatherTwo = new Human("Witek",true,78,kidsThree);

        kidsOne.add(childrenOne);
        kidsOne.add(childrenTwo);
        kidsOne.add(childreThree);

        kidstwo.addAll(kidsOne);
        kidstwo.add(mother);

        kidsThree.addAll(kidsOne);
        kidsThree.add(father);

        System.out.println(childrenOne);
        System.out.println(childrenTwo);
        System.out.println(childreThree);
        System.out.println(mother);
        System.out.println(father);
        System.out.println(grandMotherOne);
        System.out.println(grandFatherOne);
        System.out.println(grandMotherTwo);
        System.out.println(grandFatherTwo);
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;


        public Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            int childCount = this.children.size();
            if (this.children.equals(null)) {
                return text;
            } else if (childCount > 0)
            {
                text += ", children: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }
            return text;
        }
    }
}
