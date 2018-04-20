package com.javarush.test.level07.lesson09.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 5 words in reverse order
Read from the keyboard 5 words. Add them into a string list and display them to the screen in reverse order.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> strings = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <= 5 ; i++)
            strings.add(scanner.nextLine());
        for (int i = strings.size() -1; i >= 0 ; i--)
            System.out.println(strings.get(i));
    }
}
