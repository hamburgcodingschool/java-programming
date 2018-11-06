package com.hamburgcodingschool.session2;

import java.util.Scanner;

public class LeapYearMethod {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean leapYear = false;
        while (!leapYear) {
            System.out.println("Guess a leap year:");
            int year = getAYear();
            leapYear = isALeapYear(year);
            printResult(leapYear);
        }
        scanner.close();
    }

    private static int getAYear() {
        return scanner.nextInt();
    }

    private static boolean isALeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    private static void printResult(boolean isLeapYear) {
        if (isLeapYear) {
            System.out.println("Leap year! You guessed right!");
        } else {
            System.out.println("Not a leap year... Try again!");
        }
    }
}
