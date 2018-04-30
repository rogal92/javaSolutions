package com.javarush.test.level09.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* Vowels and consonants
Write a program that reads line from the keyboard.
    The program should display to the screen two strings:
    1) the first string should contain vowels
    2) the second string should contain consonants and punctuation characters from the entered text.
    Separate characters by spaces.

    Example input:
    Stop look listen.
    Example output:
    o o o i e
    s t p l k l s t n .
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] array = s.toCharArray();
        ArrayList<Character> notVowel = new ArrayList<>();

        for (int i = 1; i < s.length() -1; i++)
        {
            while (isVowel(array[i -1]))
            {
                System.out.print(array[i -1] + " ");
                i++;
            }
        }
        System.out.println();
        for (int i = 1; i <= s.length() -1 ; i++)
        {
            while (!isVowel(array[i -1])) {
                {
                   notVowel.add(array[i - 1]);
                   i++;
                }
            }
        }
        for (int i = 0; i < notVowel.size() ; i++)
        {
            if (notVowel.get(i).equals(' '))
                notVowel.remove(notVowel.get(i));
        }
        for (int i = 0; i <notVowel.size() ; i++)
            System.out.print(notVowel.get(i) + " ");
    }


    public static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u', 'y'};

    //Method checks whether the letter is a vowel
    public static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);  //transform character to lowercase

        for (char d : vowels)   //Looking among the array of vowels
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
