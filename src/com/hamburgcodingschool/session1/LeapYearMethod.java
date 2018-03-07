package com.hamburgcodingschool.session1;

import java.util.Scanner;

public class LeapYearMethod {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean leapYear = false;
        while (!leapYear) {
            System.out.println("Guess a leap year:");
            // TODO: call method getAYear() to read user input
            // TODO: call isALeapYear() to calculate if it is a leap year
            // TODO: break the loop if it is (= the user won!)
            // TODO: call printResult()
        }
        scanner.close();
    }

    // TODO: create method getAYear(): read int from scanner

    // TODO: create method isALeapYear(): calculate if given int is a leap year

    // TODO: create method printResult():
    // TODO: print "Leap year! You guessed right!" if year was a leap year,
    // TODO: print "Not a leap year... Try again!" otherwise
}
