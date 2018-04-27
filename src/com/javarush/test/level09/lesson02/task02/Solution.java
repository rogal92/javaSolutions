package com.javarush.test.level09.lesson02.task02;

/* StackTrace again
Write five methods that call each other. Each method should return the name of its caller method.
    You can obtain caller method using StackTrace.
*/

import java.util.Stack;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        method1();
    }

    public static String method1()
    {
        method2();
        StackTraceElement[] st = Thread.currentThread().getStackTrace();
        return st[2].getMethodName();
    }

    public static String method2()
    {
        method3();
        StackTraceElement[] st = Thread.currentThread().getStackTrace();
        return st[2].getMethodName();
    }

    public static String method3()
    {
        method4();
        StackTraceElement[] st = Thread.currentThread().getStackTrace();
        return st[2].getMethodName();
    }

    public static String method4()
    {
        method5();
        StackTraceElement[] st = Thread.currentThread().getStackTrace();
        return st[2].getMethodName();
    }

    public static String method5()
    {
        StackTraceElement[] st = Thread.currentThread().getStackTrace();
        return st[2].getMethodName();
    }
}
