package com.kingcode;

import java.util.ArrayList;
import java.util.Objects;

public class GreatestCommonDivisor {
    public static int compute(int x, int y) {
        ArrayList<Integer> divisorsX = getDivisors(x);
        ArrayList<Integer> divisorsY = getDivisors(y);
        Integer largestDivisableNumForBothNumbers = 0;
        for (int i = 0; i < divisorsX.size(); i++) {
            for (int j = 0; j < divisorsY.size(); j++) {
                if(Objects.equals(divisorsX.get(i), divisorsY.get(j))) {
                    largestDivisableNumForBothNumbers = divisorsX.get(i);
                }
            }
        }
        System.out.println(largestDivisableNumForBothNumbers);
        return largestDivisableNumForBothNumbers;
    }

    public static ArrayList<Integer> getDivisors(int num) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                integers.add(i);
            }
        }
        return integers;
    }
}
