package codewars;

import java.util.Arrays;

public class Average {
    public static double find_average(int[] array){
        return Arrays.stream(array).average().getAsDouble();
    }
}
