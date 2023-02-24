package com.kingcode;

public class FirstNonRepeated {

    public static Character findFirstNonRepeated(String source) {
        int g = 0;
        for (int element = 0; element < source.length(); element++) {
            int ee = element;
            int count = (int) source.chars().filter(e -> e == source.charAt(ee)).count();
            if (count == 1) {
                return source.charAt(element);
            } else {
                g += count;
            }
        }
        if (g > source.length()) return null;
        return source.charAt(0);
    }
}
