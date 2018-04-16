package com.javarush.test.level03.lesson12.home02;

/* I don't want to study Java, I just want a huge salary
Write a program that displays 10 times: «I don't want to study Java, I just want a huge salary»
*/

public class Solution
{
    public static void print2Times(String s) {
        System.out.println(s);
        System.out.println(s);
    }
    public static void print4Times(String s) {
        print2Times(s);
        print2Times(s);
    }
    public static void main(String[] args)
    {
        String s = "I don't want to study Java, I just want a huge salary";
        print2Times(s);
        print4Times(s);
        print4Times(s);
    }
}
