package com.javapractice.arrays;

import java.util.Arrays;

public class StudentsArrays {
    public static void main(String[] args) {
        getAge();
        getArray();
    }
    public static void getAge(){
       int[][] a=new int[2][5];
        a[0][0]=10;
        a[0][1]=20;
        a[0][2]=30;
        a[0][3]=40;
        a[0][4]=50;
        a[1][0]=10;
        a[1][1]=20;
        a[1][2]=30;
        a[1][3]=40;
        a[1][4]=50;
        for(int[] row : a){
            System.out.println(Arrays.toString(row));
        }
        System.out.println();

    }


    public static void getArray(){
        int[][] array ={{1,2,3,4,5},{1,2,3,4,5}};
        for(int[]  row : array){
            System.out.println(Arrays.toString(row));
        }
    }
}
