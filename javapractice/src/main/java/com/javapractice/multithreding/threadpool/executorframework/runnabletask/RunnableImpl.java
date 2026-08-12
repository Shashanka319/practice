package com.javapractice.multithreding.threadpool.executorframework.runnabletask;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class RunnableImpl implements Runnable {
    int pid;
    String productName;
    double price;

    RunnableImpl(int pid, String productName, double price) {
        this.pid = pid;
        this.productName = productName;
        this.price = price;
    }

    @Override
    public void run() {
        log.info("Starting to Execute Runnable Task using implement Runnable Interface ");
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        log.info("Terminate the Runnable Task using implement Runnable Interface ");
    }
}
