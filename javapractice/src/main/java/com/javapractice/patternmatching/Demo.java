package com.javapractice.patternmatching;

public class Demo {
    public static void main(String[] args) {
       //normalPattern();
       //fullPattern();
       //getNumbers();
        //printStar();
       //printNumbers();
        getcount();
        getPattern();
    }
    public static void normalPattern(){
        System.out.println("Welcome to java Practice World...");
        for(int i=1;i<=5;i++){
            System.out.print("* ");
        }
    }
    public static void fullPattern(){
        System.out.println("full Pattern");
        int i;
        int j;
        for( i = 1; i <=5; i++){
            for(j=1;j<=5;j++){
                System.out.print("* ");

            }
            System.out.println();
        }
    }
    public static void getNumbers(){
        int n=6;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
    public static void printStar(){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1|| i==n || j==1 || j==n){
                System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void printNumbers(){
        System.out.println();
        int n = 9;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print(" "+j);
                }else {
                    System.out.print(" 0");
                }
            }
            System.out.println();
        }
    }
    public static void getcount(){
        int n=5;
        int count =1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(count <10){
                    System.out.print("0");
                }
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
    public static void getPattern(){
        int n=6;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }


}
