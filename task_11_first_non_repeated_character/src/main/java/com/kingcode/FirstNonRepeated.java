package com.kingcode;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeated {

//    public static Character findFirstNonRepeated(String str) {
//        int g = 0;
//        for (int element = 0; element < source.length(); element++) {
//            int ee = element;
//            int count = (int) source.chars().filter(e -> e == source.charAt(ee)).count();
//            if (count == 1) {
//                return source.charAt(element);
//            } else {
//                g += count;
//            }
//        }
//        if (g > source.length()) return 0;
//        return source.charAt(0);
//    }

    public static Character findFirstNonRepeated(String str) {
        for(char ch :str.toCharArray()) if(str.indexOf(ch) == str.lastIndexOf(ch)) return ch;
        return 0;
    }

//    public static Character findFirstNonRepeated(String source) {
//        return source.chars().boxed()
//                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
//                .entrySet().stream()
//                .filter(entry -> entry.getValue() == 1)
//                .findFirst()
//                .map(entry -> (char) entry.getKey().intValue())
//                .orElse(null);
//    }

//    public static Character findFirstNonRepeated(String str) {
//        return str.chars()
//                .mapToObj(ch -> (char) ch)
//                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter(e -> 1 == e.getValue())
//                .map(Map.Entry::getKey)
//                .findFirst()
//                .get();
//    }
}
