package com.kingcode.task_one_replace_every_nth;

public class ReplaceChar {

    public String replace(Input input, int occurrences, Character oldValue, Character newValue) {
        if (occurrences <= 0 || occurrences > oldValue) return input.getText();
        int times = 0;
        for (int index = 0; index < input.getText().length(); index++) {
            times = checkIfCharactersAreTheSame(input, oldValue, newValue, occurrences, times, index);
        }
        return input.getText();
    }

    private int checkIfCharactersAreTheSame(Input input, Character oldValue, Character newValue, int occurrences, int times, int index) {
        if (Character.hashCode(input.getText().charAt(index)) == Character.hashCode(oldValue)) {
            times = times + 1;
            replaceCharIfItsOccurrenceTimes(input, newValue, occurrences, times, index);
        }
        return times;
    }

    private void replaceCharIfItsOccurrenceTimes(Input input, Character newValue, int occurrences, int times, int index) {
        if (times % occurrences == 0) {
            input.setText(input.getText().substring(0, index) + newValue + input.getText().substring(index + 1));
        }
    }
}
