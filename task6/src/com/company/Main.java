package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code
        Scanner scanner = new Scanner(System.in);
        Integer value = scanner.nextInt();
        int[] values = new int[6];
        for (int i = 0; i < 6; ++i){
            values[i] = value%10;
            value/=10;
        }
        if (values[0] + values[1] + values[2] == values[3] + values[4] + values[5])
        {
            System.out.println("true");
        }
        else System.out.println("not true");

    }
}
