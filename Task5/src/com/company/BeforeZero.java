package com.company;

import java.util.Scanner;

public class BeforeZero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number;
        double sum = 0;
        int counter = 0;
        System.out.println("Enter number");
        do {
            while (!scanner.hasNextDouble()) {
                System.out.println("Wrong format");
                scanner.next();
            }
            number = scanner.nextDouble();
            sum += number;
            counter++;
        } while (number != 0);

        System.out.println("Sum = " + sum + ", average is " + sum / counter);
    }
}
