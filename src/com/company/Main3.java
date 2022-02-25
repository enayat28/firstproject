package com.company;

public class Main3 {
    public static void main(String[] args) {
        int marks[] = new int [5];
        for (int i = 0; i<5; i++){
            marks[i] = 10;
        }
        int s = 0;
        for (int i = 0; i<5; i++){
            s = s+marks[i];
        }
        System.out.println(s);


    }
}
