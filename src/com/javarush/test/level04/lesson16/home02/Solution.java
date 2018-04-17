package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Display an average
Write a program that reads from keyboard three numbers.
    The program should display to the screen the average of these numbers, that is, neither the biggest nor the smallest one.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        if ((a < b && a > c) || (a < c && a > b))
        {
            System.out.println(a);
        } else if ((b < a && b > c) || (b < c && b > a))
        {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
