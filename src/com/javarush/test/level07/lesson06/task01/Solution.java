package com.javarush.test.level07.lesson06.task01;

/* 5 different strings in a list
1. Create a list of strings.
    2. Add 5 different strings to the list.
    3. Display to the screen its size.
    4. Display to the screen contents of the list. Each value should be on a new line. Use a loop.
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String a = "Ala ";
        String b = "ma ";
        String c = "kota ";
        String d = "a kot ";
        String e = "ma Ale";

        ArrayList<String> strings = new ArrayList<String>();
        strings.add(a);
        strings.add(b);
        strings.add(c);
        strings.add(d);
        strings.add(e);

        System.out.println(strings.size());
        for (int i = 0; i <strings.size() ; i++)
            System.out.println(strings);
    }
}
