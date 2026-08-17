package com.javapractice.operators;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        getLogicalOperator();
    }
    public static void getLogicalOperator(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a First number:");
        int a = sc.nextInt();
        System.out.print("Enter a Second number:");
        int b = sc.nextInt();
        System.out.println("Enter the third number");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println("Print the Data From a:"+a);
        }else if(b>a || b>c){
            System.out.println("Print the Data From b:"+b);
        }else if(a!=b){
            System.out.println("Print the Data from c:"+c);
        }else {
            System.out.println("It is another data");
        }
    }
}
