package com.company;

import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperatureF;
        System.out.println("Enter temperature degrees Fahrenheit");
        while (!scanner.hasNextInt()) {
            System.out.println("Wrong format");
            scanner.next();
        }
        temperatureF = scanner.nextInt();
        double temperatureC = (temperatureF - 32) * 5 / 9;
        System.out.println("Temperature degrees Celsius " + temperatureC);


    }
}
