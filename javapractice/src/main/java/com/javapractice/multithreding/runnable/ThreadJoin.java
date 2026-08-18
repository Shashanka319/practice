package com.javapractice.multithreding.runnable;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ThreadJoin {
   public void getThreadJoin(){
       log.info(Thread.currentThread().getName()+"Executing the ThreadJoin");
       try{
           Thread.sleep(5000);
       }catch(InterruptedException e){
           e.printStackTrace();
       }
       log.info(Thread.currentThread().getName()+"Ending the ThreadJoin");
   }
}
