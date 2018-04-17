package com.javarush.test.level04.lesson10.task05;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.*;

/* Multiplication table
Write a program that displays multiplication table of 10 by 10. Use “while” loop.
    Separate numbers by a space.
    1 2 3 4 5 6 7 8 9 10
    2 4 6 8 10 12 14 16 18 20
    ...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int i = 1;
        int j = 1;
        while (i <= 10) {
            while (j <= 10) {
                System.out.print(i * j + " ");
                j++;
            }
            i++;
            System.out.println();
            j=1;
        }
    }
}