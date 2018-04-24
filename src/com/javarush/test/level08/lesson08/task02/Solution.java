package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Set;

/* Remove all the numbers greater than 10
Create a set of numbers (Set<Integer>), place into it 20 different numbers.
    Remove from the set all the numbers greater than 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int i = 0; i < 20 ; i++)
            hashSet.add(i);
        return hashSet;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        set = createSet();

        for(Integer in : set) {
            if (in > 20)
                set.remove(in);
        }
        return set;
    }
}
