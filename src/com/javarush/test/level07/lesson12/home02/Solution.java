package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Move first M lines to the end of the list
Read from the keyboard 2 numbers: N and M.
    Read from keyboard N strings and fill a list with them.
    Move first M lines to the end of the list
    Display to the screen the list. Each value should be on a new line.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < N; i++)
            list.add(reader.readLine());

        for (int i = 0; i < M ; i++) {
            list.add(list.get(i));
            list.remove(i);
        }

        for (String element: list)
            System.out.println(element);
    }
}
