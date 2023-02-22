package com.kingcode;

import org.apache.commons.lang3.tuple.Pair;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharactersCount {

    public static List<Map<Character, Integer>> orderedCountt(String text) {
        List<Map<Character, Integer>> pairList = new ArrayList<>();
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

    public static List<Pair<Character, Integer>> orderedCount(String text) {
        return Arrays.stream(text.split(""))
                .map(s -> s.charAt(0))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .map(v -> Pair.of(v.getKey(), v.getValue().intValue()))
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

    public static List<Map.Entry<Character, Integer>> orderedCountttttttt(String input) {
        Map<Character, Integer> count = new HashMap<>();
        Set<Character> sets = new LinkedHashSet<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            sets.add(c);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        List<Map.Entry<Character, Integer>> result = new ArrayList<>();
        for (char s : sets) {
            result.add(new AbstractMap.SimpleEntry<>(s, count.get(s)));
        }
        return result;
    }

}