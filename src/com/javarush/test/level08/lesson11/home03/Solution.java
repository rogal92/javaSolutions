package com.javarush.test.level08.lesson11.home03;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* People with the same first names and/or last names
1. Create a dictionary (<String, String>) and add 10 persons according to the model «last name» - «first name».
    2. Among these 10 persons, let there be people with the same first names.
    3. Among these 10 persons, let there be people with the same last names.
    4. Display to the screen contents of the Map.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList()
    {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("Lastname1", "Firstname1");
        dictionary.put("Lastname2", "Firstname2");
        dictionary.put("Lastname3", "Firstname3");
        dictionary.put("Lastname4", "Firstname4");
        dictionary.put("Lastname5", "Firstname5");
        dictionary.put("Lastname6", "Firstname6");
        dictionary.put("Lastname7", "Firstname7");
        dictionary.put("Lastname8", "Firstname8");
        dictionary.put("Lastname9", "Firstname9");
        dictionary.put("Lastname10", "Firstname10");

        return dictionary;
    }

    public static void printPeopleList(Map<String, String> map)
    {
        for (Map.Entry<String, String> s : map.entrySet())
            System.out.println(s.getKey() + " " + s.getValue());
    }

}
