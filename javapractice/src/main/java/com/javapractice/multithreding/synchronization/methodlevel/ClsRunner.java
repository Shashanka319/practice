package com.javapractice.multithreding.synchronization.methodlevel;

public class ClsRunner {
    public static void main(String[] args) {
        MethodWithClass cls = new MethodWithClass();
        MethodWithClass cls2 = new MethodWithClass();
        MethodWithClass cls3 = new MethodWithClass();

        Runnable r1=() -> {MethodWithClass.getProcess();};
        Runnable r2=() -> {MethodWithClass.getProcess();};
        Runnable r3=() -> {MethodWithClass.getProcess();};

        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        Thread t3=new Thread(r3);

        t1.start();
        t2.start();
        t3.start();
    }
}
