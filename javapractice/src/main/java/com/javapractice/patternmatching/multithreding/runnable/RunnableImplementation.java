package com.javapractice.patternmatching.multithreding.runnable;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class RunnableImplementation implements Runnable{
    @Override
    public void run() {
        log.info(Thread.currentThread().getName()+"Start the Runnable Execution");
        try{
            Thread.sleep(4000);
        }catch(Exception e){
            e.printStackTrace();
        }
        log.info(Thread.currentThread().getName()+"End the Runnable Execution");
    }
}
