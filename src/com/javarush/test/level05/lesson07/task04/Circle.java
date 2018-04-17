package com.javarush.test.level05.lesson07.task04;

/* Create a class Circle
Create a class Circle with three initializers:
    - centerX, centerY, radius
    - centerX, centerY, radius, width
    - centerX, centerY, radius, width, color
*/

public class Circle
{
    private int circle;
    private String color;

    public void initialize(int centerX, int centerY, int radius) {
        this.circle = centerX + centerY + radius;
    }

    public void initialize(int centerX, int centerY, int radius, int width) {
        this.circle = centerX + centerY + radius + width;
    }

    public void initialize(int centerX, int centerY, int radius, int width, String color) {
        this.circle = centerX + centerY + radius + width;
        this.color = color;
    }
}
