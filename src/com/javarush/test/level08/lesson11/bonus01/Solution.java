package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Month number
The program should read from the keyboard the name of the month and display to the screen its number in following way: «May is 5 month».
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        String[] months = new String[12];
        months[0] ="January";
        months[1] ="February";
        months[2] ="March";
        months[3] ="April";
        months[4] ="May";
        months[5] ="June";
        months[6] ="July";
        months[7] ="August";
        months[8] ="September";
        months[9] ="October";
        months[10] ="November";
        months[11] ="December";

        findMonthNumber(months);
    }

    public static void findMonthNumber(String[] monthList) {

        Scanner scanner = new Scanner(System.in);
        String monthName = scanner.nextLine();

        for (int i = 0; i < monthList.length   ; i++)
        {
            int number = i + 1;
            if (monthList[i].equalsIgnoreCase(monthName))
                System.out.println(monthName + " " + "is " + number + " month");
        }
    }
}
