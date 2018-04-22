package com.javarush.test.level08.lesson03.task01;

/* A plant HashSet
Create a HashSet collection of String type elements.
    Add to the collection 10 strings: watermelon, banana, cherry, pear, melon, blackberry, ginseng, strawberry, iris, and potato.
    Display to the screen the contents of the collection. Each entry should be on a new line.
    Watch how changed the order of added elements.
*/

import java.util.HashSet;
import java.util.Set;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Set<String> fruits = new HashSet<String>();

        fruits.add("watermelon");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("pear");
        fruits.add("melon");
        fruits.add("blackberry");
        fruits.add("ginseng");
        fruits.add("strawberry");
        fruits.add("iris");
        fruits.add("potato");

        for(String element: fruits)
            System.out.println(element);
    }
}
