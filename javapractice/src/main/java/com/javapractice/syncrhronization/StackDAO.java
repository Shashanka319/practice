package com.javapractice.syncrhronization;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class StackDAO {
    public synchronized void updateStack() {
        log.info(Thread.currentThread().getName() + "Execute the stack");
        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info(Thread.currentThread().getName() + "Terminate the stack");
    }

}
