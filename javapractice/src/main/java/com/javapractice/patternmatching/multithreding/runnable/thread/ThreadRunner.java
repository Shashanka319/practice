package com.javapractice.patternmatching.multithreding.runnable.thread;

public class ThreadRunner {
    public static void main(String[] args) {
        Threads threads1 = new Threads();
        threads1.start();

        Threads threads2 = new Threads();
        threads2.start();

        Threads threads3 = new Threads();
        threads3.start();
    }
}
