package com.javarush.test.level07.lesson06.task02;

/* 5 lines: «101», «102», «103», «104», «105»
1. Create a list of strings.
    2. Add 5 strings to the list. «101», «102», «103», «104», «105».
    3. Delete the first one, the middle one and the last one.
    4. Display to the screen contents of the list. Each value should be on a new line. Use a loop.
    5. Display to the screen its size. (After deleting one entry, the indexes of other entries change. For instance, if we delete first element, the second becomes the first one).
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("101");
        strings.add("102");
        strings.add("103");
        strings.add("104");
        strings.add("105");

        strings.remove(0);
        strings.remove(strings.size()/2 -1);
        strings.remove(strings.size()-1);

        for (int i = 0; i <strings.size() ; i++)
            System.out.println(strings.get(i));
        System.out.println(strings.size());
    }
}
