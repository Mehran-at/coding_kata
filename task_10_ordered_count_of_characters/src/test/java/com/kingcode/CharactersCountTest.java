package com.kingcode;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CharactersCountTest {
    @Test
    void exampleTests() {
        test("abracadabra", List.of(Map.of('a', 5), Map.of('b', 2), Map.of('r', 2), Map.of('c', 1), Map.of('d', 1)));
        test("Code Wars", List.of(Map.of('C', 1), Map.of('o', 1), Map.of('d', 1), Map.of('e', 1), Map.of(' ', 1), Map.of('W', 1), Map.of('a', 1), Map.of('r', 1), Map.of('s', 1)));
        test("233312", List.of(Map.of('2', 2), Map.of('3', 3), Map.of('1', 1)));
    }

    private void test(String text, List<Map<Character, Integer>> expected) {
        assertEquals(expected, CharactersCount.orderedCount(text), "For input: \"" + text + "\"");
    }
}

