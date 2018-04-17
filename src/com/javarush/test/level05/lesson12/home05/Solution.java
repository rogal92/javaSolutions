package com.javarush.test.level05.lesson12.home05;

/* Read numbers from keyboard and calculate their total
Read numbers from keyboard and calculate their total until the user enters the word «total». Display to the screen the total.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = 0;
        while (true) {
            String s = br.readLine();
            if(s.equalsIgnoreCase("total")) {
                System.out.println(total);
                break;
            }
            total += Integer.parseInt(s);
        }
    }
}
