package com.javarush.test.level08.lesson08.task05;

import java.util.*;

/* Remove people having the same first name
Create a dictionary (Map<String, String>) and add ten entries according to the model «last name» - «first name».
    Remove people that have the same first name.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("lastname", "firstname");
        hashMap.put("lastname2", "firstname");
        hashMap.put("lastname3", "firstname1");
        hashMap.put("lastname4", "firstname2");
        hashMap.put("lastname5", "firstname");
        hashMap.put("lastname6", "firstname3");
        hashMap.put("lastname7", "firstname4");
        hashMap.put("lastname8", "firstname5");
        hashMap.put("lastname9", "firstname");
        hashMap.put("lastname10", "firstname");

        return hashMap;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        Set<String> set = new HashSet<String>();

        for(Iterator itr = map.entrySet().iterator(); itr.hasNext();) {

            Map.Entry<String, String> pair = (Map.Entry) itr.next();

            String value = pair.getValue();

            if (!set.add(value))
                itr.remove();
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
