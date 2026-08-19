package com.javapractice.syncrhronization;

public class StackRunner {
    public static void main(String[] args) {
        StackDAO stackDAO = new StackDAO();
        Runnable r1 =() ->{
            stackDAO.updateStack();
        };
        Thread t1 = new Thread(r1);
        t1.start();

        Thread t2 = new Thread(r1);
        t2.start();
    }
}
