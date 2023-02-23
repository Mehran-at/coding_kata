package com.kingcode;

import org.junit.jupiter.api.Test;

import java.util.List;
import org.apache.commons.lang3.tuple.Pair;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CharactersCountTest {

    @Test
    void exampleTests4() {
        test("abracadabra", List.of(Pair.of('a', 5), Pair.of('b', 2), Pair.of('r', 2), Pair.of('c', 1), Pair.of('d', 1)));
        test("Code Wars", List.of(Pair.of('C', 1), Pair.of('o', 1), Pair.of('d', 1), Pair.of('e', 1), Pair.of(' ', 1), Pair.of('W', 1), Pair.of('a', 1), Pair.of('r', 1), Pair.of('s', 1)));
        test("233312", List.of(Pair.of('2', 2), Pair.of('3', 3), Pair.of('1', 1)));
    }

    private void test4(String text, List<Pair<Character, Integer>> expected) {
        assertEquals(expected, CharactersCount.orderedCount4(text), "For input: \"" + text + "\"");
    }
    @Test
    void exampleTests3() {
        test("abracadabra", List.of(Pair.of('a', 5), Pair.of('b', 2), Pair.of('r', 2), Pair.of('c', 1), Pair.of('d', 1)));
        test("Code Wars", List.of(Pair.of('C', 1), Pair.of('o', 1), Pair.of('d', 1), Pair.of('e', 1), Pair.of(' ', 1), Pair.of('W', 1), Pair.of('a', 1), Pair.of('r', 1), Pair.of('s', 1)));
        test("233312", List.of(Pair.of('2', 2), Pair.of('3', 3), Pair.of('1', 1)));
    }

    private void test(String text, List<Pair<Character, Integer>> expected) {
        assertEquals(expected, CharactersCount.orderedCount3(text), "For input: \"" + text + "\"");
    }

    @Test
    void exampleTests2() {
        test("abracadabra", List.of(Pair.of('a', 5), Pair.of('b', 2), Pair.of('r', 2), Pair.of('c', 1), Pair.of('d', 1)));
        test("Code Wars", List.of(Pair.of('C', 1), Pair.of('o', 1), Pair.of('d', 1), Pair.of('e', 1), Pair.of(' ', 1), Pair.of('W', 1), Pair.of('a', 1), Pair.of('r', 1), Pair.of('s', 1)));
        test("233312", List.of(Pair.of('2', 2), Pair.of('3', 3), Pair.of('1', 1)));
    }

    private void test2(String text, List<Pair<Character, Integer>> expected) {
        assertEquals(expected, CharactersCount.orderedCount2(text), "For input: \"" + text + "\"");
    }

    @Test
    void exampleTests1() {
        test("abracadabra", List.of(Pair.of('a', 5), Pair.of('b', 2), Pair.of('r', 2), Pair.of('c', 1), Pair.of('d', 1)));
        test("Code Wars", List.of(Pair.of('C', 1), Pair.of('o', 1), Pair.of('d', 1), Pair.of('e', 1), Pair.of(' ', 1), Pair.of('W', 1), Pair.of('a', 1), Pair.of('r', 1), Pair.of('s', 1)));
        test("233312", List.of(Pair.of('2', 2), Pair.of('3', 3), Pair.of('1', 1)));
    }

    private void test1(String text, List<Pair<Character, Integer>> expected) {
        assertEquals(expected, CharactersCount.orderedCount1(text), "For input: \"" + text + "\"");
    }
}

