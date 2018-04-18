package com.javarush.test.level06.lesson08.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

/* Class ConsoleReader
Write a class ConsoleReader, which will have 4 static methods:
    - String readString() to read strings from keyboard
    - int readInt() to read numbers from keyboard
    - double readDouble() to read fractional numbers from keyboard
    - void readLn() to wait for pressing enter [use readString()]
*/


public class ConsoleReader
{
    public static String readString() throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        return s;
    }
    public static int readInt() throws Exception
    {
        Scanner cin2=new Scanner(System.in);
        System.out.println("Enter int:");
        int n=cin2.nextInt();
        return n;
    }
    public static double readDouble() throws Exception
    {
        Scanner cin3=new Scanner(System.in);
        System.out.println("Enter double:");
        double d=cin3.nextDouble();
        return d;
    }
    public static void readLn() throws Exception
    {
        String str=readString();
        if(str.equals(""))
            System.out.println("success");
        else readLn();
    }
}
//    public static String readString() throws Exception
//    {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        return reader.readLine();
//    }
//    public static int readInt() throws Exception
//    {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        return Integer.parseInt(reader.readLine());
//    }
//    public static double readDouble() throws Exception
//    {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        return Double.parseDouble(reader.readLine());
//    }
//    public static void readLn() throws Exception
//    {
//        ConsoleReader.readString();
//    }
//}

//public class ConsoleReader
//{
//    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//    public static String readString() throws Exception
//    {
//        String string = br.readLine();
//    }
//
//    public static int readInt() throws Exception
//    {
//        int readInt = Integer.parseInt(br.readLine());
//    }
//
//    public static double readDouble() throws Exception
//    {
//        double readDouble = Double.parseDouble(br.readLine());
//    }
//
//    public static void readLn() throws Exception
//    {
//        String str = readString();
//    }
//}

