package com.kingcode;

public class PlayGame {

    public int solution(int start, int finish) {
        return isaValidInput(start, finish) ?
                -1
                :
                calculate(start, finish) / 3 + calculate(start, finish) % 3;
    }

    private int calculate(int start, int finish) {
        return finish - start;
    }

    private boolean isaValidInput(int start, int finish) {
        return start < 0 || finish <= start;
    }
}