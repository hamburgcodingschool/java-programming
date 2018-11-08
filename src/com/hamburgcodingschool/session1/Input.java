package com.hamburgcodingschool.session1;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        System.out.println("Do you want to count forward? (y / n)");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println("Hello " + input + "!");

        // Alternative:
        // System.out.println(String.format("Hello %s!", input));
    }
}
