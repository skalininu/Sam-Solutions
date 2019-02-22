package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 3;
        int b = 7;
        for (int c = a; c <= b; ++c){
            for (int d = 1; d <=c; ++d){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
