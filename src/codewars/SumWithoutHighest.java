
//Sum all the numbers of the array (in F# and Haskell you get a list) 
//except the highest and the lowest element (the value, not the index!).
//(The highest/lowest element is respectively only one element at each edge,
//even if there are more than one with the same value!)

package codewars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SumWithoutHighest {
    public static void main(String[] args) {
        int[] numbers = {};
        int result = sum(numbers);
        System.out.println(result);
    }
    public static int sum(int[] numbers) {
    	
        int result = 0;
        if (numbers == null || numbers.length <= 1) {
            return 0;
        } else {
            List <Integer> list = new ArrayList<>();
            for (int i = 0; i < numbers.length; i++) {
                list.add(numbers[i]);
            }
            Collections.sort(list);
            list.remove(0);
            list.remove(list.size() - 1);

            for (int sum: list)
                result += sum;
        }
        return result;
    }
    //Arrays.stream(numbers).skip(1).limit(numbers.length - 2).sum();
}
