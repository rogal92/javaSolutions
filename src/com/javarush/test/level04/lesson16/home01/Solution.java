package com.javarush.test.level04.lesson16.home01;

/* I'll never work for peanuts
Write a program that displays hundred times a sentence:
    «I'll never work for peanuts. Amigo».
    Use “for” loop.
*/

public class Solution
{
    public static void main(String[] args)
    {
        String s = "I'll never work for peanuts. Amigo";
        for (int i = 0; i < 100; i++)
            System.out.println(s);
    }
}
