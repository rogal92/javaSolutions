package com.javarush.test.level06.lesson08.task05;

/* Class StringHelper
Write a class StringHelper, which will have 2 static methods:
    - String multiply(String s, int count) should return the string s repeated count times.
    - String multiply(String s) should return the string s repeated 5 times.

    Example:
    Amigo -> AmigoAmigoAmigoAmigoAmigo
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringHelper
{
    public static String multiply(String s)
    {
        String result = "";
        for (int i = 0; i < 5 ; i++)
            result += s;
        return result;
    }

    public static String multiply(String s, int count)
    {
        String result = "";
        for (int i = 0; i < count ; i++)
            result += s;
        return result;
    }
}
