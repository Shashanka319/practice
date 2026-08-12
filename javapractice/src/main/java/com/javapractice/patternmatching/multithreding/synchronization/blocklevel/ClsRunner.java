package com.javapractice.patternmatching.multithreding.synchronization.blocklevel;

public class ClsRunner {
    public static void main(String[] args) {
        BlockWithClass cls = new BlockWithClass();
        BlockWithClass cls2 = new BlockWithClass();
        BlockWithClass cls3 = new BlockWithClass();

        cls.start();
        cls2.start();
        cls3.start();
    }
}
