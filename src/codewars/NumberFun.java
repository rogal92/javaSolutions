package codewars;

import java.lang.*;

public class NumberFun {
    public static long findNextSquare(long sq) {

        long square = (long)Math.sqrt(sq);
        long nextSquare = (square + 1) * (square + 1);

        return nextSquare;
    }
    public static void main(String [] args) {
        long sq = 16;
        long result = findNextSquare(sq);
        System.out.println(result);
    }
}