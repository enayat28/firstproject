package com.company;

public class Assignment {

    public static void main(String[] args) {
        square(4);
        areaofrectangle(4.1f, 3);
        areaofcircle(5, 2);
        sumofthree(4, 5, 6);
        printfullname("enayat","sidana");
        printable(2);

        System.out.println(4*4);
        System.out.println(4.1f *3);
        System.out.println(5*2*2);
        System.out.println(4+5+6);

    }
    public static void square( int a){
        System.out.println("square of number is:"+a*a);
    }
    public static void areaofrectangle( float length, float breadth ){
        System.out.println("area of rectangle is :"+length*breadth);
    }
    public static void areaofcircle( int pi, int r ){
        System.out.println("area of circle is:"+pi*r*r);
    }
    public static void sumofthree( int a, int b,int c){
        System.out.println("sum of three numbers is:"+a+b+c);
    }
    public static void printfullname(String firstname, String lastname){
        System.out.println("full name is :"+firstname+" "+lastname);
    }
    public static void printable(int n){
        System.out.println(n+"*"+1+"="+(n*1));
        System.out.println(n+"*"+2+"="+(n*2));
        System.out.println(n+"*"+3+"="+(n*3));
        System.out.println(n+"*"+4+"="+(n*4));
        System.out.println(n+"*"+5+"="+(n*5));
        System.out.println(n+"*"+6+"="+(n*6));
        System.out.println(n+"*"+7+"="+(n*7));
        System.out.println(n+"*"+8+"="+(n*8));
        System.out.println(n+"*"+9+"="+(n*9));
        System.out.println(n+"*"+10+"="+(n*10));
    }
}
