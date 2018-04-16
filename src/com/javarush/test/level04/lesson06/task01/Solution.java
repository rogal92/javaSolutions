package com.javarush.test.level04.lesson06.task01;

/* Minimum of two numbers
Write a program that reads two numbers from keyboard and displays to the screen the minimum of these numbers.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        if (a < b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}