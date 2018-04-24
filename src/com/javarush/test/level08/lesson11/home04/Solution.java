package com.javarush.test.level08.lesson11.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* The minimum of N numbers
1. Read from the keyboard number N.
    2. Read from the keyboard N integers and fill a list with them using a method getIntegerList().
    3. Find the minimum number among the elements of the list using a method getMinimum().
*/

public class Solution
{
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {

        int min = Collections.min(array);
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        List<Integer> integers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        for (int i = 0; i < size; i++)
            integers.add(sc.nextInt());
        return integers;
    }
}
