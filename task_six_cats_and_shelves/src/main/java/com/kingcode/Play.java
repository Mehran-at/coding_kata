package com.kingcode;

public class Play {

    public static int solution(int start, int finish) {
        // 1 -> 2 -> 3 -> 4 -> 5
        if (start < 0 || finish <= 1) {
            System.out.println(start + " or start has to be a positive number & " + finish + " or finish must be more that 1");
            return -1;
        }
        int jump = 1;
        if (start + jump == finish) return jump;
        jump++;
        if (jump + 1 == finish || jump + 3 == finish) return jump;
        jump++;
        if (jump + 3 + 1 == finish) return jump;
        return jump;
    }
}
