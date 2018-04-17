package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* Learning and practicing algorithm
Task: Write a program that
    1. reads from the console number N > 0
    2. then reads from the console N numbers
    3. displays the maximum of N numbers typed in.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.parseInt(reader.readLine());
        int number;
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i <= maximum ; i++)
        {
            number = Integer.parseInt(reader.readLine());
            list.add(number);
        }
        Collections.sort(list);
        maximum = list.get(list.size() -1);
        System.out.println(maximum);
    }
}