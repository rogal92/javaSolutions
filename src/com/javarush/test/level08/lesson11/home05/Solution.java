package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Stop Look Listen. Now capitalized
Write a program that should read from the keyboard a string.
    The program should replace the first letters of all words in the text with the uppercase.
    Display to the screen the result.

    Example input:
    stop look listen
    Example output:
    Stop Look Listen
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        final StringBuilder sb = new StringBuilder(s.length());
        String words[] = s.split("\\ ");
        for (int i = 0; i < words.length ; i++)
        {
            if (i > 0) {
                sb.append(" ");
            }
            sb.append(Character.toUpperCase(words[i].charAt(0))).append(words[i].substring(1));
        }
        System.out.println(sb);
    }
}
