package com.javarush.test.level04.lesson06.task03;

/* Sort three numbers
Write a program that reads three numbers from keyboard and displays them in descending order.
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        if(a < b && b < c) {
            System.out.println(c + " " + b + " " + a);
        } else if (b < a && a < c) {
            System.out.println(c + " " + a + " " + b);
        } else if (c < a && a < b) {
            System.out.println(b + " " + a + " " + c);
        } else if (c < b && b < a) {
            System.out.println(a + " " + b + " " + c);
        } else if (a < c && c < b) {
            System.out.println(b + " " + c + " " + a);
        } else if (b < c && c < a) {
            System.out.println(a + " " + c + " " + b);
        }
    }
}


//    Integer[] myChar = new Integer[3];
//        myChar[0] = a;
//                myChar[1] = b;
//                myChar[2] = c;
//
//                Collections.sort(Arrays.asList(myChar));
//                Collections.reverse(Arrays.asList(myChar));
//                System.out.println(Arrays.asList(myChar));
