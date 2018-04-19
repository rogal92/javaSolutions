package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Add new functionality to the program.
Old task: Every cat has a name and a mom cat. Write a class to describe this situation. Create two objects: a daughter cat and a mom cat. Display them to the screen.
    New task: Every cat has a name, a dad cat and a mom cat. Write a class to describe this situation. Create 6 objects: mom, dad, son, daughter, grandma (mom’s mom) and grandpa (dad’s dad). Display them to the screen as follows: grandpa, grandma, dad, mom, son and daughter.

    Example input:
    grandpa Vinny
    grandma Maisy
    dad Kaos
    mom Velvet
    son Mario
    daughter Fluffy

    Example output:
    Cat name is grandpa Vinny, no mother, no father
    Cat name is grandma Maisy, no mother, no father
    Cat name is dad Kaos, no mother, father is grandpa Vinny
    Cat name is mom Velvet, mother is grandma Maisy, no father
    Cat name is son Mario, mother is mom Velvet, father is dad Kaos
    Cat name is daughter Fluffy, mother is mom Velvet, father is dad Kaos
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandmaName = reader.readLine();
        Cat catGrandma = new Cat(grandmaName);

        String grandpaNme = reader.readLine();
        Cat catgrandpa = new Cat(grandpaNme);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, false, catGrandma);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName,true, catgrandpa);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catFather, catMother);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catFather, catMother);


        System.out.println(catgrandpa);
        System.out.println(catGrandma);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat
    {
        private String name;
        private Cat parentM;
        private Cat parentF;
        private boolean sex;

        Cat(String name)
        {
            this.name = name;
        }

        public Cat(String name, boolean sex, Cat parent) {

            this.name = name;

            if(sex) {
                this.parentF = parent;
            } else
                this.parentM = parent;
            this.sex = sex;
        }

        public Cat(String name, Cat father, Cat mother) {
            this.name = name;
            this.parentF = father;
            this.parentM = mother;
        }




        @Override
        public String toString()
        {
            if (parentF == null && parentM == null)
                return "Cat name is " + name + ", no mother, no father";
            if (parentM == null && parentF != null)
                return "Cat name is " + name + ", no mother, father is " + parentF.name;
            if (parentF == null && parentM != null)
                return "Cat name is " + name + ", mother is " + parentM.name + ", no father ";
            if (parentF != null && parentM != null)
                return "Cat name is " + name + ", mother is " + parentM.name + ", father is " + parentF.name;
            return "";
        }
    }

}
