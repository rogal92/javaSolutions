package com.javarush.test.level05.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* Add new functionality to the program
Old Task: add a new function that reads from keyboard two numbers and displays their minimum.
    New task: add a new function that reads from keyboard five numbers and displays their minimum.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimumFive = minFive(a,b,c,d,e);
        System.out.println("MinimumFive = " + minimumFive);
    }
    public static int min(int a, int b)
    {
        return a < b ? a : b;
    }
    public static int minFive(int a, int b, int c,int d,int e) {
        if(min(a,b) < min(c,d) ) {
            return(min(min(a,b),e));
        } else {
            return(min(min(c,d),e));
        }
    }
}

//    int[] myArray = new int[5];
//        myArray[0] = a;
//                myArray[1] = b;
//                myArray[2] = c;
//                myArray[3] = d;
//                myArray[4] = e;
//
//                Arrays.sort(myArray);
//                System.out.println(myArray[0]);