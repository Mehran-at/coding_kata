package com.kingcode;

import org.apache.commons.lang3.tuple.Pair;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharactersCount {

    public static List<Pair<Character, Integer>> orderedCount1 (String text) {
        Set<Pair<Character, Integer>> pairSet = new HashSet<>();
        for (int index = 0; index < text.length(); index++) {
            int charIndex = index;
            int count = (int) text.chars().filter(ch -> ch == text.charAt(charIndex)).count();
            pairSet.add(Pair.of(text.charAt(index), count));
        }
        return pairSet.stream().toList();
    }
    public static List<Pair<Character, Integer>> orderedCount2(String text) {
        return Arrays.stream(text.split(""))
                .map(s -> s.charAt(0))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .map(entry -> Pair.of(entry.getKey(), entry.getValue().intValue()))
                .toList();
    }
//    public static List<Pair<Character, Integer>> orderedCount2(String text) {
//        List<Pair<Character, Integer>> list = new ArrayList<>();
//        for (Map.Entry<Character, Long> entry : Arrays.stream(text.split(""))
//                .map(s -> s.charAt(0))
//                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
//                .entrySet()) {
//            Pair<Character, Integer> of = Pair.of(entry.getKey(), entry.getValue().intValue());
//            list.add(of);
//        }
//        return list;
//    }

    public static List<Pair<Character, Integer>> orderedCount3(String text) {
        return text
                .chars()
                .boxed()
                .collect(Collectors.toMap(i -> (char) i.intValue(), i -> 1, Integer::sum, LinkedHashMap::new))
                .entrySet()
                .stream()
                .map(entry -> Pair.of(entry.getKey(), entry.getValue()))
                .collect(Collectors.toList());
    }

    public static List<Map.Entry<Character, Integer>> orderedCount4(String input) {
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