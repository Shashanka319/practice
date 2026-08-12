package com.javapractice.multithreding.runnable;

public class LamdaRunner {
    public static void main(String[] args) {
        RunnableWithLamda rl1 = new RunnableWithLamda();
        Runnable r1 =  ()->{
         rl1.getProcess();
        };
        Thread t1 = new Thread(r1);
        t1.start();

        RunnableWithLamda rl2= new RunnableWithLamda();
        Runnable r2 = rl2::getProcess;
        Thread t2 = new Thread(r2);
        t2.start();

        RunnableWithLamda rl3 = new RunnableWithLamda();
        Runnable r3 =  () ->{
            rl3.getProcess();
        };
        Thread t3 = new Thread(r3);
        t3.start();

    }
}
