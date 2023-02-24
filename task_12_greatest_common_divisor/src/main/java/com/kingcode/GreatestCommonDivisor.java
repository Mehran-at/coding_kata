package com.kingcode;

import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GreatestCommonDivisor {

//    public static int compute(int x, int y) {
//        ArrayList<Integer> divisorsX = getDivisors(x);
//        System.out.println(divisorsX);
//        ArrayList<Integer> divisorsY = getDivisors(y);
//        System.out.println(divisorsY);
//        Integer largestDivisibleNumForBothNumbers = 0;
//        for (Integer valueX : divisorsX) {
//            for (Integer valueY : divisorsY) {
//                if (Objects.equals(valueX, valueY)) {
//                    largestDivisibleNumForBothNumbers = valueX;
//                    break;
//                }
//            }
//        }
//        return largestDivisibleNumForBothNumbers;
//    }
//
//    private static ArrayList<Integer> getDivisors(int num) {
//        return IntStream.rangeClosed(1, num).filter(i -> num % i == 0).boxed().collect(Collectors.toCollection(ArrayList::new));
//    }

//    public static int compute(int x, int y) {
//        return (x % y != 0) ? compute(y, x % y) : y;
//    }//Euclidean Algorithm

    public static int compute(int x, int y) {
        return (y == 0) ? x : compute(y, x % y);
    }//Euclidean Algorithm
}
