package com.javapractice.multithreding.synchronization.methodlevel;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class MethodWithClass {
    public static synchronized void getProcess(){
        log.info("Entering to process for synchronized lock with Method Level");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("Exiting to process for synchronized lock with Method Level");

    }
}
