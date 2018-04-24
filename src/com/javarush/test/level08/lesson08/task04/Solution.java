package com.javarush.test.level08.lesson08.task04;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Remove all the people born in the summer
Create a dictionary (Map<String, Date>) and add ten entries according to the model «last mane» - «birth date».
    Remove from the map all the people born in the summer.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));

        map.put("Stallone2", new Date("JUNE 1 1980"));
        map.put("Stallone3", new Date("OCTOBER 1 1980"));
        map.put("Stallone4", new Date("JANUARY 1 1980"));
        map.put("Stallone5", new Date("APRIL 1 1980"));
        map.put("Stallone6", new Date("JUNE 1 1980"));
        map.put("Stallone7", new Date("SEPTEMBER 1 1980"));
        map.put("Stallone8", new Date("JUNE 1 1980"));
        map.put("Stallone9", new Date("DECEMBER 1 1980"));
        map.put("Stallone10", new Date("JUNE 1 1980"));
        map.put("Stallone11", new Date("JUNE 1 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM");
        Iterator<Map.Entry<String, Date>> it = map.entrySet().iterator();
        int month;

        while (it.hasNext()) {
            Map.Entry<String, Date> element = it.next();
            month = Integer.parseInt(simpleDateFormat.format(element.getValue().getTime()));

            if(month > 5 && month < 9) {
                it.remove();
            }
        }
    }
}
