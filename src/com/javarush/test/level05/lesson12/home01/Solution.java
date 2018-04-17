package com.javarush.test.level05.lesson12.home01;

/* Three classes
1. Create class Cat and Dog by analogy with the class Duck.
    2. Think of what the toString method should return in the classes Cat and Dog.
    3. In the method main create two objects in each class and display them.
    4. The Duck class objects are created and displaying.
*/

public class Solution
{

    public static void main(String[] args)
    {
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        System.out.println(duck1);
        System.out.println(duck2);

        //add your code here
    }

    public static class Duck
    {
        public String toString() {
            return "Duck";
        }
    }

    //add your code here

}
