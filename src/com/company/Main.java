package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // write your code here

        int i = 0;
        System.out.println(i++);
        System.out.println(i);

        System.out.println(++i);
        System.out.println(i);

        System.out.println(i--);
        System.out.println(i);

        System.out.println(--i);
        System.out.println(i);

        int j = 8;
        System.out.println(i <= j);

        int m = 0;
        System.out.println((m > 1 && m < 100));
        //if m is between 1 and 100 print congratulations otherwise//task2
        if (m > 1 && m < 100) {
            System.out.println("congrats");
        }

        int o = 102;
        System.out.println((m > 1 || m < 100));
        //if m is between 1 and 100 print congratulations otherwise//task2
        if (m > 1 || m < 100) {
            System.out.println("congrats");
        }


        System.out.println("Please enter month number");
        Scanner sc = new Scanner(System.in);
        int nextInt = sc.nextInt();

        int month = 3;

        printdaysinmonth(month);

        int n = 10;

        if (n > 0) {
            System.out.println("positive");
        } else if (n < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }

    }


    public static void printdaysinmonth(int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("31 days");
        }


    }

}
