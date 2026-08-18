package com.javapractice.multithreding.runnable;

public class JoinRunner {
    public static void main(String[] args) throws InterruptedException {
        ThreadJoin threadJoin = new ThreadJoin();
        Runnable runnable = threadJoin::getThreadJoin;
        Thread thread = new Thread(runnable);
        thread.start();

        thread.join();

        Thread thread1 = new Thread(runnable);
        thread1.start();
    }
}
