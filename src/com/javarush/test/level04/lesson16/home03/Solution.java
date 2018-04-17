package com.javarush.test.level04.lesson16.home03;

import java.io.*;
import java.nio.Buffer;

/* Calculate a sum
Write a program that reads from keyboard numbers and calculates their sum.
    If the user enters -1, the program should display the sum and terminate. -1 should be included in sum.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int sum = a + b;

        if (a == -1 || b == -1)
        {
            System.out.println(sum - 1);
        } else
        {
            System.out.println(sum);
        }
    }
}
