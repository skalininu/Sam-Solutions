package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1;
        double y1;
        ArrayList<Point> points = new ArrayList<>();
        System.out.println("Enter number");
        do {
            while (!scanner.hasNextDouble()) {
                System.out.println("Wrong format");
                scanner.next();
            }
            for (int i = 0; i < points.s)
             = scanner.nextDouble();

        } while (number != 0);

    }
    private class Point{
        private int x1;
        private int y1;

        public Point(int x1, int y1) {
            this.x1 = x1;
            this.y1 = y1;
        }

        public int getX1() {
            return x1;
        }

        public void setX1(int x1) {
            this.x1 = x1;
        }

        public int getY1() {
            return y1;
        }

        public void setY1(int y1) {
            this.y1 = y1;
        }
    }
}

