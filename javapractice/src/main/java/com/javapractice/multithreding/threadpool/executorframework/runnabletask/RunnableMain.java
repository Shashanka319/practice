package com.javapractice.multithreding.threadpool.executorframework.runnabletask;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class RunnableMain {
    public static void main(String[] args) {
        RunnableImpl ri=new RunnableImpl(1,"T-shirt",500);
        List<RunnableImpl> list = new ArrayList<RunnableImpl>();
        System.out.println(list.size());
        Executor executor = Executors.newFixedThreadPool(3);
        executor.execute(ri);




    }
}
