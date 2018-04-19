package com.javarush.test.level07.lesson04.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/* Array of strings in reverse order
1. Create an array of 10 strings.
    2. Read from the keyboard 8 strings and store them in the array.
    3. Display to the screen the contents of the entire array (10 items) in reverse order. Each item should be on a new line.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String s;
        String[] array = new String[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <8 ; i++)
        {
            s = sc.nextLine();
            array[i] = s;
        }
        for (int i = array.length -1; i >= 0 ; i--)
            System.out.println(array[i]);
    }
}