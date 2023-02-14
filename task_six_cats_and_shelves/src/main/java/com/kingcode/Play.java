package com.kingcode;

public class Play {

    public static int solution(int start, int finish) {
        // 1 -> 2 -> 3 -> 4 -> 5
        int jump = 1;
        if (start + jump == finish) return jump;
        jump = 2;
        if (jump + 1 == finish || jump + 3 == finish) return jump;
        jump = 3;
        if (jump + 3 + 1 == finish) return jump;
        return jump;
    }
}

//    int jump = start;
//        for (jump = start; jump < finish;) {
//        if (jump + 1 == finish) return jump;
//        jump++;
//        if (jump + 1 == finish) return jump;
//        jump++;
//        if (jump + 1 == finish) return jump;
//        jump++;
//
//        }