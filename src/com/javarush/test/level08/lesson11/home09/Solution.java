package com.javarush.test.level08.lesson11.home09;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;


/* Working with date
1. Implement the method isDateOdd(String date) so that it returns true, if the number of days from the beginning of the year is odd, otherwise it returns false.
    2. String date is passed in the format MAY 1 2013

    JANUARY 1 2000 = true
    JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        String date = "January 1 2018";
        isDateOdd(date);
        System.out.println(isDateOdd(date));
    }

    public static boolean isDateOdd(String date)
    {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("mm dd yyyy", Locale.ENGLISH);
        LocalDate day = LocalDate.parse(date, dateTimeFormatter);

        int chosenDay = day.getDayOfYear();

        if (chosenDay % 2 == 0)
            return false;
        else
            return true;
    }
}
