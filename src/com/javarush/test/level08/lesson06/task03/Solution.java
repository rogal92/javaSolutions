package com.javarush.test.level08.lesson06.task03;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* Measure how long it takes to do ten thousand insertions for each list
Measure how long it takes to do ten thousand insertions for each list.
    The method getTimeMsOfInsert() should return the time of its execution in milliseconds.
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(getTimeMsOfInsert(new ArrayList()));
        System.out.println(getTimeMsOfInsert(new LinkedList()));
    }

    public static long  getTimeMsOfInsert(List list)
    {
        Date start = new Date();
        insert10000(list);
        Date stop = new Date();

        long time = stop.getTime() - start.getTime();
        return time;
    }

    public static void insert10000(List list)
    {
        for (int i=0;i<10000;i++)
        {
            list.add(0, new Object());
        }
    }
}
