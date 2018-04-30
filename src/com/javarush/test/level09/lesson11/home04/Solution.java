package com.javarush.test.level09.lesson11.home04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* Date converter
Read from the keyboard a date in the format «08/18/2013»
    Display to the screen that date in the form of «AUG 18, 2013».
    Use the objects Date and SimpleDateFormat.
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");


        Date date = simpleDateFormat.parse(s);
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);

        String correctDate = simpleDateFormat1.format(date);
        System.out.println(correctDate.toUpperCase());
    }
}
