package com.javarush.test.level07.lesson06.task04;

/* Add 5 strings to the beginning of the list
1. Create a list of strings.
    2. Read from the keyboard 5 strings. Add these strings to the beginning of the list, not to the end.
    3. Display to the screen contents of the list. Each value should be on a new line. Use a loop.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> strings = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <5 ; i++)
            strings.add(i,scanner.nextLine());

        for (int i = 0; i <strings.size() ; i++)
            System.out.println(strings.get(i));
    }
}
