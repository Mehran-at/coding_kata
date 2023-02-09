package com.kingcode.task_one_replace_every_nth;

public class ReplaceChar {


    public String replace(Input input, Character oldValue, Character newValue, int occurrences) {
        //ToDo If n is 0 or negative or if it is larger than the count of the oldValue, return the original text without a change.
        int times = 0;
        String output = "";

        for (int index = 0; index < input.getText().length(); index++) {
            if (Character.hashCode(input.getText().charAt(index))== Character.hashCode(oldValue)) {
//            if (Character.compare(input.getText().charAt(index), oldValue) == 97) {
                times = times + 1;
                if (times % occurrences == 0) {
                    input.setText(input.getText().substring(0, index) + newValue + input.getText().substring(index + 1));
                }
            }
        }
        return input.getText();
    }
}
