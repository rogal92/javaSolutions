//Write a function that takes an array of numbers (integers for the tests) and a target number.
//        It should find two different items in the array that, when added together, give the target value.
//        The indices of these items should then be returned in an array like so: [index1, index2].
//
//        For the purposes of this kata, some tests may have multiple answers; any valid solutions will be accepted.
//
//        The input will always be valid (numbers will be an array of length 2 or greater, and all of the items will be numbers;
//        target will always be the sum of two different items from that array).
//


package codewars;

public class TwoSum {

    public static void main(String[] args) {
        int target = 11;
        int[] array = {4,2,9,3,7};
        int[] result = twoSum(array,target);
        for(Integer in : result)
            System.out.println(in);
    }
    public static int[] twoSum(final int[] numbers, int target)
    {
        int[] targetIndexes = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j <numbers.length ; j++) {
                if (target == numbers[j] + numbers[i]) {
                    targetIndexes[0] = j;
                    targetIndexes[1] = i;
                }
            }
        }
        return targetIndexes;
    }
}
