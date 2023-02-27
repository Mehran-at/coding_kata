package com.kingcode;

public class PlayGame {

    public int solution(int start, int finish) {
        return isaValidInput(start, finish) ?
                -1
                :
                module(start, finish) + divide(start, finish);
    }

    private int module(int start, int finish) {
        return (finish - start) % 3;
    }

    private int divide(int start, int finish) {
        return (finish - start) / 3;
    }


    private boolean isaValidInput(int start, int finish) {
        return start < 0 || finish <= start;
    }
}