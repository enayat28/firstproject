package com.company;

public class Calculator {
    public static void main(String[] args) {
        // sum
        int s = sum(2,4);
        int div = divide(4, 2);
        int mul = multiply(2, 2);
        int diff = difference(4, 4);

        System.out.println(sum(2,4));
        System.out.println(divide(4,2));
        System.out.println(multiply(2,2));
        System.out.println(difference(4,4));
    }

    public static int sum(int a, int b){
        return a+b;
    }

    public static int divide( int a, int b){
       return a/b;
    }

    public static int multiply( int a, int b){
        return a*b;
    }

    public static int difference( int a, int b){
        return a-b;
    }
}
