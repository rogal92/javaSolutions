package codewars;

import java.util.Arrays;

public class DingleMouse {
    public static void main(String[] args) {
        int[] array = {4,1,2,3};
        int[] result = sort(array);
        for(Integer in : result)
            System.out.println(in);
     }
    public static int[] sort(final int array[]) {

        int[] newArr = array;

        Arrays.sort(newArr);
        return newArr;
    }
}
