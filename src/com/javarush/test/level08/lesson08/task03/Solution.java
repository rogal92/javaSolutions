package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Identical first and last names
Create a dictionary (Map<String, String>) and add ten entries according to the model «last name» - «first name».
    Check how many people have the same first or last name as the name specified.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> names = new HashMap<String, String>();
        names.put("Bartosz", "Rogalski");
        names.put("Michał", "Fiedor");
        names.put("Marta", "Peter");
        names.put("Kacper", "Wójtowicz");
        names.put("Dawid", "Opitz");
        names.put("Ola", "Murawiec");
        names.put("Bartosz", "Juchniewicz");
        names.put("Klaudia", "Maciata");
        names.put("Kuba", "Wiśniewski");
        names.put("Michał", "Jankowski");

        return names;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count = 0;

        Iterator<Map.Entry<String, String>> i = map.entrySet().iterator();

        while (i.hasNext()) {
            Map.Entry<String, String> pair = i.next();

            Object key = pair.getKey();
            if (key == name)
                count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int count = 0;

        Iterator<Map.Entry<String, String>> i = map.entrySet().iterator();

        while(i.hasNext())
        {
            Map.Entry<String, String>pair = i.next();
            Object val = pair.getValue();
            if(val == familiya)
                count++;
        }
        return count;
    }
}
