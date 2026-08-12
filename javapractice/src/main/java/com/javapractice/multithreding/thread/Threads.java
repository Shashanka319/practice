package com.javapractice.multithreding.thread;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Threads extends Thread{
    @Override
    public void run(){
        super.run();
        getProcess();
    }
    public void getProcess(){
        log.info("Execute the Thred Process");
        try{
            sleep(3000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        log.info("Thred Process End");
    }


}
