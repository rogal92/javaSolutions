package com.javarush.test.level04.lesson10.task04;

import java.io.*;

/* S-square
Write a program that displays to the screen a square 10x10 of “S” characters. Use “while” loop.
    Don’t separate characters in the same line.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int a = 10, b = 10;

        while (a>0) {
            while (b>0) {
                System.out.print('S');
                b--;
            }
            System.out.println();
            a--;
            b = 10;
        }
    }
}
