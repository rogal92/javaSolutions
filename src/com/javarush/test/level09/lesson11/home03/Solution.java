package com.javarush.test.level09.lesson11.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/* Turn a method into a try..catch
Read numbers from the keyboard. Write a code for reading numbers from the keyboard into a separate method readData().
    Wrap the whole body of this method (the entire code inside readData() method, except for the declaration of the list where the numbers will be stored) into a try..catch.
    If the user enters some text instead of entering a number, the method has to catch the exception and display to the screen all numbers entered before.
    Display numbers to the screen. Each number should be on a new line. The order of numbers should be just like it was in input.
*/

public class Solution
{
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {

        ArrayList<Integer> numbers = new ArrayList<>();
        try
        {
            Scanner scanner = new Scanner(System.in);
            while (true)
            {
                int n = scanner.nextInt();
                numbers.add(n);
            }
        } catch (InputMismatchException e) {
            for (int i = 0; i <numbers.size() ; i++)
                System.out.println(numbers.get(i));
        }
    }
}
