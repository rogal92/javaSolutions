package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Ten cats
Create a class Cat with a field String name.
    Create a dictionary Map<String, Cat>, add 10 cats on the model «Name» - «Cat».
    Get from the Map a Set of names and display the set to the screen.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        Map<String, Cat> cats = new HashMap<>();

        cats.put("One",new Cat("One"));
        cats.put("Two",new Cat("Two"));
        cats.put("Three",new Cat("Three"));
        cats.put("Four",new Cat("Four"));
        cats.put("Five",new Cat("Five"));
        cats.put("Six",new Cat("Six"));
        cats.put("Seven",new Cat("Seven"));
        cats.put("Eight",new Cat("Eight"));
        cats.put("Nine",new Cat("Nine"));
        cats.put("Ten",new Cat("Ten"));

        return cats;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        map = createMap();
        return new HashSet<Cat>(map.values());
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
            System.out.println(cat);
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }
}
