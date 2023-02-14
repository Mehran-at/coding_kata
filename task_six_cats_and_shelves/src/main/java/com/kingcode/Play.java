package com.kingcode;

public class Play {

    public static int solution(int start, int finish) {
        int jump = start;
        for (jump = start; jump < finish; jump++) {
            if (jump + 1 == finish) return jump;


        }
        return jump;
    }
}
