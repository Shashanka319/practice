package com.javapractice.operators;

import java.util.Scanner;

public class RelationalOperator {
    public static void main(String[] args) {
        RelationalOperator o = new RelationalOperator();
       // o.getEqual();
        //o.getNumber();
        getData();
    }
    public  void getEqual(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter theb First Data:");
        String a = scn.nextLine().intern();
        System.out.print("Enter theb Second Data:");
        String b = scn.nextLine().intern();//What .intern() actually does is force the JVM to place the string into the String Constant Pool and return that shared pooled reference.

        if (a == b) {
            System.out.println("Data are to be same");
        }else  {
            System.out.println("Data are not to be same");
        }
    }
    public  void getNumber(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter theb First Data:");
        int a = scn.nextInt();
        System.out.print("Enter theb Second Data:");
        int b = scn.nextInt();

        if (a == b) {
            System.out.println("Data are to be same");
        }
        else {
            System.out.println("Data are not to be same");
        }
    }
    public static void getData(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter theb First Data:");
        int a = scn.nextInt();
        System.out.print("Enter theb Second Data:");
        int b = scn.nextInt();

        if (a == b) {
            System.out.println("First Data is equalto Second Data");
        } else if (a>b) {
            System.out.println("First Data is greater than Second Data");

        } else if (a<b) {
            System.out.println("First Data is less than Second Data");

        } else if (a>=b) {
            System.out.println("First Data is greater than or equal to Second Data");

        } else if (a<=b) {
            System.out.println("First Data is less than or equal to Second Data");

        }else  {
            System.out.println("First Data is Not equal to Second Data");
        }
    }
}
