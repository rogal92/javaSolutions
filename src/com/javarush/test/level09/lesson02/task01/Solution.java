package com.javarush.test.level09.lesson02.task01;

/* Each method should return its StackTrace
Write five methods that call each other. Each method should return its StackTrace.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        method1();
    }

    public static StackTraceElement[] method1()
    {
        method2();
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        return stackTraceElement;
    }

    public static StackTraceElement[] method2()
    {
        method3();
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        return stackTraceElement;
    }

    public static StackTraceElement[] method3()
    {
        method4();
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        return stackTraceElement;
    }

    public static StackTraceElement[] method4()
    {
        method5();
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        return stackTraceElement;
    }

    public static StackTraceElement[] method5()
    {
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        return stackTraceElement;
    }
}
