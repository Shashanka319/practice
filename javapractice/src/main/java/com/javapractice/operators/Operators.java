package com.javapractice.operators;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        getPreDec();
    }
    public static void getArithmetic(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number:");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number:");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("Sum:"+sum);

        int sub = a-b;
        System.out.println("Sub:"+sub);

        int mul=a*b;
        System.out.println("Multiplication:"+mul);

        int div = a/b;
        System.out.println("Division - Quitient:"+div);

        int mod=a%b;
        System.out.println("Division - Reminder:"+mod);

    }
    public static void getPreIncr(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number:");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number:");
        int b = sc.nextInt();

        int incre = ++a;
        System.out.println("Increment - "+incre);
        int sum = incre + b;
        System.out.println("Sum after Increment:"+sum);

    }
    public static void getPreDec(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number:");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number:");
        int b = sc.nextInt();

        int dec = --a;
        System.out.println("Decrement value - "+dec);
        int sub = dec-b;
        System.out.println("Sub After Decrement:"+sub);
    }
    public static voif getPostIncre(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number:");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number:");
        int b = sc.nextInt();

        int incre =a++;
        System.out.println("Increment - "+incre);
        int sum = incre + b;
        System.out.println("Sum after Increment:"+sum);
    }
}
