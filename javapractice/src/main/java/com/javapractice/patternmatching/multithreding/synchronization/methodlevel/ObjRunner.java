package com.javapractice.patternmatching.multithreding.synchronization.methodlevel;

public class ObjRunner {
    public static void main(String[] args) {
        MethodWithObj obj = new MethodWithObj();
        MethodWithObj obj2 = new MethodWithObj();
        MethodWithObj obj3 = new MethodWithObj();

        Thread thread1 = new Thread(obj);
        Thread thread2 = new Thread(obj2);
        Thread thread3 = new Thread(obj3);

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
