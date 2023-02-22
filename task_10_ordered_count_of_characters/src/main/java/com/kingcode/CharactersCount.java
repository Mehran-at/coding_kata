package com.kingcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CharactersCount {

    public static List<Map<Character, Integer>> orderedCount(String text) {
        List<Map<Character, Integer>> pairList = new ArrayList<>();
        //  abaac
        Map<Character, Integer> list = new HashMap<>();
        int index;
        for (index = 0; index < text.length(); index++) {
            int charIndex = index;
            int count = (int) text.chars().filter(ch -> ch == text.charAt(charIndex)).count();
            list.put(text.charAt(index), count);
        }
        pairList.add(list);
        return pairList;
    }
}