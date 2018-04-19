package com.javarush.test.level07.lesson06.task03;

/* 5 lines in reverse order
1. Create a list of strings.
    2. Read 5 strings from keyboard, then add them to the list.
    3. Arrange them in reverse order.
    4. Display to the screen contents of the list. Each value should be on a new line. Use a loop.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> strings = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <5 ; i++)
            strings.add(sc.nextLine());

        Collections.reverse(strings);

        for (int i = 0; i <strings.size() ; i++)
            System.out.println(strings.get(i));
    }
}
