package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double beginningMoney;
        double p = 0.01;
        double newMoney;
        int month;
        System.out.println("Enter $");
        while (!scanner.hasNextDouble()) {
            System.out.println("Wrong format");
            scanner.next();
        }
        beginningMoney = scanner.nextDouble();
        newMoney = beginningMoney;
        for (month  = 1; ; ++month){
            newMoney = newMoney * p + newMoney;
            if (newMoney - beginningMoney >= beginningMoney){
                break;
            }
        }
        System.out.println("money is " + newMoney + " month: " + month);
    }
}
