package com.kingcode;

import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GreatestCommonDivisor {

    public static int compute(int x, int y) {
        ArrayList<Integer> divisorsX = getDivisors(x);
        ArrayList<Integer> divisorsY = getDivisors(y);
        Integer largestDivisableNumForBothNumbers = 0;
        for (Integer value : divisorsX) {
            for (Integer integer : divisorsY) {
                if (Objects.equals(value, integer)) {
                    largestDivisableNumForBothNumbers = value;
                    break;
                }
            }
        }
        return largestDivisableNumForBothNumbers;
    }

    private static ArrayList<Integer> getDivisors(int num) {
        return IntStream.rangeClosed(1, num).filter(i -> num % i == 0).boxed().collect(Collectors.toCollection(ArrayList::new));
    }
}
