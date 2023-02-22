package com.kingcode;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharactersCount {

    public static List<Map<Character, Integer>> orderedCountt(String text) {
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

    static List<Map<Character, Integer>> orderedCount(String text) {
        return Arrays.stream(text.split(""))
                .map(s -> s.charAt(0))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .map(v -> Map.of(v.getKey(), v.getValue().intValue()))
                .toList();
    }

    public static List<Map<Character, Integer>> orderedCounttt(String text) {
        return text
                .chars()
                .boxed()
                .collect(Collectors.toMap(i -> (char) i.intValue(), i -> 1, Integer::sum, LinkedHashMap::new))
                .entrySet()
                .stream()
                .map(entry -> Map.of(entry.getKey(), entry.getValue()))
                .collect(Collectors.toList());
    }

}