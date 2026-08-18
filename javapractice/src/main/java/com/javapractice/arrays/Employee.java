package com.javapractice.arrays;

import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the No Employee : ");
        int name= input.nextInt();

        int[] str = new int[name];
        for(int i=0;i<str.length;i++){
            System.out.print("Enter the Salary of "+(i+1)+":");
            str[i]= input.nextInt();
        }
        System.out.println("Emp[loyee Salary");
        for (int j : str) {
            System.out.println(j);
        }
    }
}
