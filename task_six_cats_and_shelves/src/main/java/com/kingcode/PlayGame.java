package com.kingcode;

public class PlayGame {

    public int solution(int start, int finish) {
        if (isaValidInput(start, finish)) return -1;
        return getDivision(start, finish) + getModular(start, finish);
    }
    private int getModular(int start, int finish) {
        return (finish - start) % 3;
    }

    private int getDivision(int start, int finish) {
        return (finish - start) / 3;
    }

    private boolean isaValidInput(int start, int finish) {
        return start < 0 || finish <= start;
    }
}