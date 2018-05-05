package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* The number of letters
Read from the keyboard 10 strings and count the number of different letters in them (for all 26 letters of the alphabet). Display the result to the screen.
    Example output:
    a 5
    b 8
    c 3
    d 7
    …
    z 9
*/

public class Solution
{
    public static void main(String[] args)  throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //ABC
        String abc = "abcdefghijklnopqrstuvwxyz";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++)
            alphabet.add(abcArray[i]);

        //String reading
        String all = "";
        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            all += s.toLowerCase();
        }

        for (int i = 0; i < all.length() ; i++)
        {
            int letterCounter = 0;
            for (int j = 0; j < all.length() ; j++)
            {
                if (abcArray[i] == all.charAt(j))
                    letterCounter++;
            }
            System.out.println(abcArray[i] + " " + letterCounter);
        }
    }
}