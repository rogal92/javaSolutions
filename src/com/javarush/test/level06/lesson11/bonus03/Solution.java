package com.javarush.test.level06.lesson11.bonus03;

import sun.font.FontRunIterator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* Learning and practicing algorithms.
Task: Write a program that reads from keyboard 5 numbers and displays them in ascending order.
    Example input:
    3
    2
    15
    6
    17
    Example output:
    2
    3
    6
    15
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int temp;
        int amount = 5;
        int[] myAr = new int[amount];

        for (int i = 0; i < amount ; i++)
            myAr[i] = Integer.parseInt(reader.readLine());

        for (int i = 0; i < amount ; i++)
        {
            for (int j = 0; j < amount -1; j++)
            {
                if(myAr[j] > myAr[j+1]) {
                    temp = myAr[j];
                    myAr[j] = myAr[j+1];
                    myAr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i <amount ; i++)
            System.out.println(myAr[i]);
    }
}

//    int number;
//    List<Integer> inList = new ArrayList<Integer>();
//
//        for (int i = 0; i < 5; i++) {
//        number = scanner.nextInt();
//        inList.add(number);
//        }
//        Collections.sort(inList);
//        System.out.print(inList);
//        }
