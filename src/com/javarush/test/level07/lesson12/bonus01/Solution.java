package com.javarush.test.level07.lesson12.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* Program doesn’t compile and run. Fix it.
Task: Read from the keyboard the cat data and display it to the screen.
    Example:
    Cat name is Jinx, age is 6, weight is 5, tail = 22
    Cat name is Maisy, age is 8, weight is 7, tail = 20
*/

public class Solution
{
    public final static ArrayList<Cat> CATS = new ArrayList<Cat>();

    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            String name = scanner.nextLine();
            int age = scanner.nextInt();
            int weight = scanner.nextInt();
            int tailLength = scanner.nextInt();

            if (name.isEmpty()) {
                break;
            } else {
                Cat cat = new Cat(name, age, weight, tailLength);
                CATS.add(cat);
            }
        }
        printList();
    }
    public static void printList() {
        for (int i = 0; i < CATS.size(); i++)
            System.out.println(CATS.get(i));
    }

    public static class Cat
    {
        private String name;
        private int age;
        private int weight;
        private int tailLength;

        Cat(String name, int age, int weight, int tailLength)
        {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.tailLength = tailLength;
        }

        @Override
        public String toString()
        {
            return "Cat name is " + name + ", age is " + age + ", weight is " + weight + ", tail = " + tailLength;
        }
    }
}
