//
//A History Lesson
//
//        The Pony Express was a mail service operating in the US in 1859-60.
//
//        Pony Express
//
//        It reduced the time for messages to travel between the Atlantic and Pacific coasts to about 10 days,
//         before it was made obsolete by the transcontinental telegraph.
//
//        How it worked
//
//        There were a number of stations, where:
//
//        The rider switched to a fresh horse and carried on, or
//        The mail bag was handed over to the next rider
//        Kata Task
//
//        stations is a list/array of distances (miles) from one station to the next along the Pony Express route.
//
//        Implement the riders method/function, to return how many riders are necessary to get the mail from one end to the other.
//
//        NOTE: Each rider travels as far as he can, but never more than 100 miles.
//
//        Good Luck.
//        DM.



package codewars;

import java.util.Arrays;

public class ThePonyExpress {
    public static void main(String[] args) {
        int[] stations = {50,38,13,99,15,30,15,45};
        System.out.println(riders(stations));
    }
    public static int riders(final int[] stations) {
        int riders = 0;
        int miles = 0;

        for (int i = 0; i <stations.length ; i++) {
            miles += stations[i];
            if(miles > 100) {
                miles = 0;
                i--;
                riders++;
            }
        }
        if (miles > 0) {
            riders++;
        }
        return riders;
    }
}
