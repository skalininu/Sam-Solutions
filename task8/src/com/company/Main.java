package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int lenght;// = 5;
        int height;// = 5;
        String zalivka;
        String contur;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter lenght: ");
        lenght = scanner.nextInt();
        System.out.println("Enter height: ");
        height = scanner.nextInt();
        System.out.println("Enter zalivka: ");
        zalivka = scanner.next();
        System.out.println("Enter contur: ");
        contur = scanner.next();

        int i;
        for (i = 1; i <= lenght; i++)
            System.out.print(contur);
        System.out.println();
        for (i = 1; i <= height-2; ++i){
            System.out.print(contur);
            for (int j = 1; j <= lenght-2; ++j){
                System.out.print(zalivka);
            }
            System.out.print(contur);
            System.out.println();
        }
        for (i = 1; i <= lenght; i++)
            System.out.print(contur);
    }
}
