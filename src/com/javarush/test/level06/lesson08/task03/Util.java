package com.javarush.test.level06.lesson08.task03;

/* Class Util
Implement a static method double getDistance(x1, y1, x2, y2). It should calculate the distance between points.
    Use the method double Math.sqrt(double a) to calculate the square root of the parameter passed.
*/

public class Util
{
    public static double getDistance(int x1, int y1, int x2, int y2)
    {
        int sumX = (x1 + x2) * (x1 + x2);
        int sumY = (y1 + y2) * (y1 + y2);

        int distToSqrt = sumX + sumY;
        double doubleDistToSqrt = (double) distToSqrt;
        return Math.sqrt(doubleDistToSqrt);
    }
}
