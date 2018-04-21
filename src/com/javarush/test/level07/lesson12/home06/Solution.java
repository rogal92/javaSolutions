package com.javarush.test.level07.lesson12.home06;

/* Family
Create a class Human with the fields: String name, boolean sex, int age, Human father, Human mother. Create 9 objects of Human class and fill them in such a way as to obtain two grandfathers, two grandmothers, a father, a mother, and three children. Display to the screen the objects to the screen.
    Tip:
    If you write your method String toString() in the class Human, then it’ll be used to display an object.
    Example output:
    Name: Anna, sex: female, age: 21, father: Paul, mother: Kate
    Name: Kate, sex: female, age: 55
    Name: Ian, sex: male, age: 2, father: Michael, mother: Anna
    …
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human grandMOther = new Human("Elżbieta",false,77);
        Human grandMotherTwo = new Human("Barbara",false,77);
        Human grandFather = new Human("Witek",true, 77);
        Human grandFatherTwo = new Human("Zdzisiek",true,77);
        Human mother = new Human("Marta",false,50, grandFather);
        Human father = new Human("Bartosz",true,51,grandMotherTwo);
        Human childrenOne = new Human("Kasia", false, 22, father, mother);
        Human childrenTwo = new Human("Monika",false,20,father, mother);
        Human childrenThree = new Human("Tomasz",true,15,father,mother);

        System.out.println(childrenOne);
        System.out.println(childrenTwo);
        System.out.println(childrenThree);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(grandFather);
        System.out.println(grandFatherTwo);
        System.out.println(grandMOther);
        System.out.println(grandMotherTwo);

    }

    public static class Human
    {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public Human(String name, boolean sex, int age, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.mother = mother;
        }

        public Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public boolean isSex()
        {
            return sex;
        }

        public void setSex(boolean sex)
        {
            this.sex = sex;
        }

        public int getAge()
        {
            return age;
        }

        public void setAge(int age)
        {
            this.age = age;
        }

        public Human getFather()
        {
            return father;
        }

        public void setFather(Human father)
        {
            this.father = father;
        }

        public Human getMother()
        {
            return mother;
        }

        public void setMother(Human mother)
        {
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            if (this.father != null)
                text += ", father: " + this.father.name;

            if (this.mother != null)
                text += ", mother: " + this.mother.name;
            if (this.mother == null && this.father == null)
                text += ", no father, no mother";

            return text;
        }
    }
}
