package com.javapractice.operators;

import java.util.Scanner;

public class TernariOparator {
    public static void main(String[] args) {
        getResult();
    }
    public static void getResult() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the markes:");
        int markes = input.nextInt();

        if(markes >= 1 && markes<=100){
            String result =(markes>35)? "Pass" : "Fail";
            System.out.println("The result is: " + result);
        }else {
            System.out.println("The markes must be between 1 and 100");
        }
    }
}
