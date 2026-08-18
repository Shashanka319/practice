package com.javapractice.arrays;

import java.util.Scanner;

public class OneDimentioal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n =sc.nextInt();

        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the Age of the Student:"+(i+1));
            arr[i]=sc.nextInt();
        }
        System.out.println("The Age of the Student:");
        for(int i=0;i<n;i++){

            System.out.println(arr[i]+" ");
        }
    }
}
