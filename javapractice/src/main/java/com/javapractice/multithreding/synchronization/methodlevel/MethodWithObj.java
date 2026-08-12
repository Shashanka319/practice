package com.javapractice.multithreding.synchronization.methodlevel;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class MethodWithObj implements Runnable{
    @Override
    public  synchronized void run() {
        log.info("Execute the Synchronization with Method level");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("Finished the Synchronization with Method level");
    }
}
