package com.javapractice.multithreding.runnable;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class RunnableWithLamda {
    public void getProcess(){
        log.info(Thread.currentThread().getName()+"Executing the Process");
        try{
            Thread.sleep(4000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        log.info(Thread.currentThread()+"Ending the Process");
    }
}
