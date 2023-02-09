package com.kingcode.task_one_replace_every_nth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceCharTest {

    ReplaceChar replaceChar = new ReplaceChar();

    @Test
    void checkIfMinusNumberReturnOriginalText() {
        String actual = "Vader soid: No, I am your fother!";
        Input input = new Input("Vader said: No, I am your father!");
        String expected = replaceChar.replace(input, 2, 'a', 'o');
        assertEquals(expected, actual);
        assertEquals("Vader soid: No, I am your fother!", replaceChar.replace(new Input("Vader said: No, I am your father!"), 2, 'a', 'o'));
        assertEquals("Vader said: No, I am your fother!", replaceChar.replace(new Input("Vader said: No, I am your father!"), 4, 'a', 'o'));
        assertEquals("Vader said: No, I am your father!", replaceChar.replace(new Input("Vader said: No, I am your father!"), 6, 'a', 'o'));
        assertEquals("Vader said: No, I am your father!", replaceChar.replace(new Input("Vader said: No, I am your father!"), 0, 'a', 'o'));
        assertEquals("Vader said: No, I am your father!", replaceChar.replace(new Input("Vader said: No, I am your father!"), -2, 'a', 'o'));
        assertEquals("Vader sayd: No, I am your father!", replaceChar.replace(new Input("Vader said: No, I am your father!"), 1, 'i', 'y'));
    }
}