package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/* One large and two small arrays
1. Create an array of 20 numbers.
    2. Read from keyboard 20 numbers and fill the array with them.
    3. Create two arrays of 10 numbers each.
    4. Copy numbers of the large array to two small arrays: the half of the numbers to the first array, the other half to the second one.
    5. Display to the screen the second small array. Each value should be on a new line.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        int[] arrayOne = new int[20];
        int[] arrTwo;
        int[] arrThree;

        for (int i = 0; i <arrayOne.length ; i++)
            arrayOne[i] = scanner.nextInt();

        arrTwo = Arrays.copyOfRange(arrayOne,0,arrayOne.length/2);
        arrThree = Arrays.copyOfRange(arrayOne,arrayOne.length/2, arrayOne.length);

        for (int i = 0; i <arrTwo.length ; i++)
            System.out.println(arrTwo[i]);

        System.out.println();

        for (int i = 0; i <arrThree.length ; i++)
            System.out.println(arrThree[i]);
    }
}
