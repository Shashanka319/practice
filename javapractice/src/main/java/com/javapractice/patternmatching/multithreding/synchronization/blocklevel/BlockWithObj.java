package com.javapractice.patternmatching.multithreding.synchronization.blocklevel;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class BlockWithObj extends Thread {
    public void run() {
        log.info("Starting Synchro with Block level using Obj Lock");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("Finished the Synchro with Block level using Obj Lock");
    }
}
