package com.hamburgcodingschool.session1;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        System.out.println("What's your name?");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println("Hello " + input + "!");
    }
}