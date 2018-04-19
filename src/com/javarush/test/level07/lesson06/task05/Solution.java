package com.javarush.test.level07.lesson06.task05;

/* Delete the last string and add it to the beginning of the list
1. Create a list of strings.
    2. Read from keyboard 5 strings. Add these strings to the list.
    3. Delete the last string and add it to the beginning of the list. Repeat this action 13 times.
    4. Display to the screen contents of the list. Each value should be on a new line. Use a loop.
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
            strings.add(scanner.nextLine());

        for (int i = 0; i <13; i++)
        {
            strings.add(0,strings.get(strings.size()-1));
            strings.remove(strings.size()-1);
        }
        for (int i = 0; i <strings.size() ; i++)
            System.out.println(strings.get(i));
    }
}
