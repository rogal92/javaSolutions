package com.javarush.test.level10.lesson11.bonus02;

import java.io.*;
import java.util.*;

/* Add new functionality to the program.
Old task: The program should display a pair (a number and a string) entered from the keyboard.
    New task: The program should store in HashMap pairs (a number and a string) entered from the keyboard. An empty string means the end of input. Numbers may be repeated. Strings are always unique. Input data must not be lost!
    The program should display the contents of HashMap to the screen.

    Example input:
    1
    Stop
    2
    Look

    Example output:
    1 Stop
    2 Look
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new HashMap<>();

        while (true)
        {
            int id = Integer.parseInt(reader.readLine());
            String name = reader.readLine();
            if (name.isEmpty()) {
                break;
            } else {
                map.put(name, id);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet())
            System.out.println(entry.getValue() + " " + entry.getKey());
    }
}
