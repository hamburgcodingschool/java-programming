package com.hamburgcodingschool.session1;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        System.out.println("Type in a year (numbers only):");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if (year % 4 == 0
                && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("Leap year!");
        } else {
            System.out.println("Not a leap year!");
        }
    }
}
