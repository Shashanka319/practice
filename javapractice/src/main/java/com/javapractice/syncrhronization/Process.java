package com.javapractice.syncrhronization;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Process {
    public  void getProcess(){
        log.info(Thread.currentThread().getName()+"Start the Executing");
        try{
            Thread.sleep(4000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        log.info(Thread.currentThread().getName()+"Tereminate  the Executing");
    }
}
