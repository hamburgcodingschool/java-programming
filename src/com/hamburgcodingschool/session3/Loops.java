package com.hamburgcodingschool.session3;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        System.out.println("Do you want to count forwards? (yes/no)");
        readDirection();
    }

    public static void readDirection() {
        Scanner scanner = new Scanner(System.in);
        String decision = scanner.next();
        if (decision.equals("yes")) {
            loopForwards();
        } else {
            loopBackwards();
        }
    }

    public static void loopForwards() {
        for (int i = 0; i < 100; i++) {
            printNumber(i);
        }
    }

    public static void loopBackwards() {
        int i = 100;
        while (i > 0) {
            printNumber(i);
            i--;
        }
    }

    public static void printNumber(int i) {
        System.out.println("Counted " + i + " numbers");
    }
}
