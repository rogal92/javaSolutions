package com.javarush.test.level08.lesson03.task03;

import java.util.HashMap;
import java.util.Map;

/* HashMap collection of cats
There is a class Cat, which has a field name (name, String).
    Create a collection HashMap<String, Cat>.
    Add 10 cats, using the cat name as a key.
    Display to the screen the result. Each entry should be on a new line.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String[] cats = new String[] {"Tiger", "Bella", "Chloe", "Molly", "Shadow", "Kitty", "Smokey", "Angel", "Jasper", "Lily"};

        HashMap<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet())
        {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }


    public static HashMap<String, Cat> addCatsToMap(String[] cats)
    {
        HashMap<String, Cat> map = new HashMap<String, Cat>();
        for (String element: cats)
        {
            Cat cat = new Cat(element);
            map.put(cat.name, cat);
        }
        return map;
    }

    public static class Cat
    {
        String name;

        public Cat(String name)
        {
            this.name = name;
        }

        @Override
        public String toString()
        {
            return name != null ? name.toUpperCase() : null;
        }
    }
}
