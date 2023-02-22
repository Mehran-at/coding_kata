package com.kingcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CharactersCount {
    //  abaac
    public static List<Map<Character, Integer>> orderedCount(String text) {
        List<Map<Character, Integer>> pairList = new ArrayList<>();

        Map<Character, Integer> list = new HashMap<>();
        for (int index = 0; index < text.length(); index++) {
            int finalIndex = index;
            int count = (int) text.chars().filter(ch -> ch == text.charAt(finalIndex)).count();
            list.put(text.charAt(index), count);
        }
        pairList.add(list);
        return pairList;
    }

}
