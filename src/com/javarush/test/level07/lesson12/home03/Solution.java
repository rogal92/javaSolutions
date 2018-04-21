package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Largest and smallest number in an array
Create an array of 20 numbers.
    Fill it with numbers that are read from keyboard.
    Find the largest and smallest number in an array.
    Display to the screen the largest and smallest numbers separated by a space.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int  maximum;
        int  minimum;

        ArrayList<Integer> integers = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++)
            integers.add(Integer.parseInt(reader.readLine()));

        minimum = Collections.min(integers);
        maximum = Collections.max(integers);


        System.out.println(maximum);
        System.out.println(minimum);
    }
}
