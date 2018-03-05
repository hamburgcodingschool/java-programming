package com.hamburgcodingschool;

import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {
        System.out.println("Type in a number:");
        int number = getANumber();
        boolean positive = isPositive(number);
        if (positive) {
            printPositive();
        } else {
            printNegative();
        }
    }

    public static boolean isPositive(int number) {
        return number >= 0;
    }

    public static int getANumber() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }

    public static void printNegative() {
        System.out.println("Number is negative");
    }

    public static void printPositive() {
        System.out.println("Number is positive");
    }
}
