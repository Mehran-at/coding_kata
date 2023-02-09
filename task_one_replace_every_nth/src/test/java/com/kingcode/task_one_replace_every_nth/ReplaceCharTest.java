package com.kingcode.task_one_replace_every_nth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceCharTest {

    ReplaceChar replaceChar = new ReplaceChar();

    @Test
    void checkIfMinusNumberReturnOriginalText() {
        String actual = "Vader soid: No, I am your fother!";
        Input input = new Input("Vader said: No, I am your father!");
        String expected = replaceChar.replace(input, 'a', 'o', 2);
        assertEquals(expected, actual);
    }

}