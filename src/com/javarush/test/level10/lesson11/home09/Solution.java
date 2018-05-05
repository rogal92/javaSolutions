package com.javarush.test.level10.lesson11.home09;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* Identical words in the list
Read from the keyboard 20 words, fill a list with them. Count the number of identical words in the list. Result should be a Map<String, Integer>.
    The key of the map should be a unique string, the value - count of this string in the list.
    Display to the screen contents of the map.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++)
            words.add(scanner.nextLine());

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet())
            System.out.println(pair.getKey() + " " + pair.getValue());
    }

    public static Map<String, Integer> countWords(ArrayList<String> list)
    {
        HashMap<String, Integer> result = new HashMap<String, Integer>();

        for (int i = 0; i < list.size(); i++)
        {
            int counter = 0;

            for (int j = 0; j < list.size(); j++)
            {
                if (list.get(i).equals(list.get(j)))
                    counter++;
            }
            result.put(list.get(i), counter);
        }
        return result;
    }
}
