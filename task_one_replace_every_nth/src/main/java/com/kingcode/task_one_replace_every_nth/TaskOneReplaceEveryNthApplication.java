package com.kingcode.task_one_replace_every_nth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaskOneReplaceEveryNthApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskOneReplaceEveryNthApplication.class, args);
        ReplaceChar replaceChar = new ReplaceChar();
        Input input = new Input("Vader said: No, I am your father!");
        System.out.println(replaceChar.replace(input, 'a', 'o', 2));

    }

}
