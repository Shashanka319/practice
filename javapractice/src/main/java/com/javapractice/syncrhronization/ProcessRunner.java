package com.javapractice.syncrhronization;

public class ProcessRunner {
    public static void main(String[] args) {
        Process p1 = new Process();
        Process p2 = new Process();
        Process p3 = new Process();

       Runnable r1 = () ->{
           p1.getProcess();
       };
       Runnable r2 = () ->{
           p2.getProcess();
       };
       Runnable r3 = () ->{
           p3.getProcess();
       };

       Thread t1 = new Thread(r1);
       t1.start();
       Thread t2 = new Thread(r2);
       t2.start();
       Thread t3 = new Thread(r3);
       t3.start();

    }
}
