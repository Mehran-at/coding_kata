package com.kingcode.task_one_replace_every_nth;

public class ReplaceChar {


    public String replace(Input input, Character oldValue, Character newValue, int occurrences) {
        System.out.println("sssss");
        if (occurrences <= 0 || occurrences > oldValue) return input.getText();
        int times = 0;
        for (int index = 0; index < input.getText().length(); index++) {
            if (Character.hashCode(input.getText().charAt(index)) == Character.hashCode(oldValue)) {
                times = times + 1;
                if (times % occurrences == 0) {
                    input.setText(input.getText().substring(0, index) + newValue + input.getText().substring(index + 1));
                }
            }
        }
        return input.getText();
    }
}
