package com.javarush.test.level05.lesson09.task05;

/* Create a class Rectangle
Create a class Rectangle. Its data will be top, left, width and height. Create for it as much constructors as possible:
    Examples:
    -	4 parameters are set: left, top, width, height
    -	width/height are not set (both equal 0)
    -	height are not set (equal to width), create a square
    -	create a copy of another rectangle (it’s passed in the parameters)
*/

public class Rectangle
{
    private int top, left, width, height;

    public Rectangle(int top, int left, int width, int height)
    {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int top, int left)
    {
        this.top = top;
        this.left = left;
    }

    public Rectangle(int left)
    {
        this.left = left;
    }

    public Rectangle(int top, int left, int width)
    {
        this.top = top;
        this.left = left;
        this.width = width;
    }
}
