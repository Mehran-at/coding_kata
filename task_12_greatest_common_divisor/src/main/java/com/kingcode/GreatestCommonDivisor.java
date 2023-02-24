package com.kingcode;

import java.util.ArrayList;

public class GreatestCommonDivisor {
    public static int compute(int x, int y) {
        ArrayList<Integer> divisors = getDivisors(x);

        return 3333;
    }

    public static ArrayList<Integer> getDivisors(int num) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                integers.add(i);
            }
        }
        System.out.println(integers);
        return integers;
    }
}
