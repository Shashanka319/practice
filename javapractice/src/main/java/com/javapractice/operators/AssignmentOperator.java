package com.javapractice.operators;

import java.util.Scanner;

public class AssignmentOperator {
    public static void main(String[] args) {
        AssignmentOperator o1 = new AssignmentOperator();
       o1.getSimple();
        getCompound();
    }
    public int getSimple(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a First Integer:");
        int a = input.nextInt();
        System.out.print("Enter a Second Integer:");
        int b = input.nextInt();

        int result = a + b;
        System.out.println("The result is: " + result);
        return result;
    }
    public static int getCompound(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a First Integer:");
        int a = input.nextInt();
        System.out.print("Enter a Second Integer:");
        int b = input.nextInt();

        a+=b;
        System.out.println("Addition:"+a);
        a-=b;
        System.out.println("Subtraction:"+a);
        a*=b;
        System.out.println("Multiplication:"+a);
        a%=b;
        System.out.println("Remainder:"+a);
        a/=b;
        System.out.println("Division:"+a);
        return 1;

    }
}
