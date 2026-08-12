package com.javapractice.multithreding.runnable;

public class RunnableMain {
    public static void main(String[] args) {
        RunnableImplementation ri=new RunnableImplementation();
        Thread thread=new Thread(ri);
        thread.run();

        RunnableImplementation ri2=new RunnableImplementation();
        Thread thread2=new Thread(ri2);
        thread2.run();

        RunnableImplementation ri3 =new RunnableImplementation();
        Thread thread3 =new Thread(ri3);
        thread3.setName("Sharth");
        thread3.start();

        RunnableImplementation ri4 =new RunnableImplementation();
        Thread thread4 =new Thread(ri4);
        thread4.setName("Shashank");
        thread4.setPriority(Thread.MAX_PRIORITY);
        thread4.start();


    }
}
