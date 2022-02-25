package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main2 {


    public static void main(String[] args) {
        int i = 12;
        //if n>10 then say congrats, otherwise say loose
        if (i > 10) {
            System.out.println("if part");
            System.out.println("congrats");
        } else{
            System.out.println("else part");
            System.out.println("loose");
        }
        System.out.println("bye");

        int x = 70;
        if(x>80){
            System.out.println("first");
        }else if(x>60){
            System.out.println("second");
        }else {
            System.out.println("third");
        }

        int z = 10;
        if(z>0){
            System.out.println("positive");
        }else if(z<0){
            System.out.println("negative");
        }else{
            System.out.println("zero");
        }


        int a = 4;
        int b = 6;
        int c = 8;
        if(a>b&&a>c){
            System.out.println("a is greater");
        }else if(b>a&&b>c){
            System.out.println("b is greater");
        }else{
            System.out.println("c is greater");
        }

        String name = "enayat";
        if(name.startsWith("en")){
            if(name.length()>5){
                System.out.println(name.toUpperCase());
            }else {
                System.out.println(name.toLowerCase());
            }
        }



    }
}
