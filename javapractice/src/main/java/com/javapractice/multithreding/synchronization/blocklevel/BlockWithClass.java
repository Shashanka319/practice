package com.javapractice.multithreding.synchronization.blocklevel;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class BlockWithClass extends Thread {
    public void run() {
        synchronized (BlockWithClass.class) {
            log.info("Execute the Synchro with Block level using Class Lock");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            log.info("Finished the Synchro with Block level using Class Lock");
        }
    }
}
