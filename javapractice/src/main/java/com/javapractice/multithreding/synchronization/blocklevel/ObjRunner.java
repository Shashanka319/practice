package com.javapractice.multithreding.synchronization.blocklevel;

public class ObjRunner {
    public static void main(String[] args) {
        BlockWithObj obj = new BlockWithObj();
        BlockWithObj obj2 = new BlockWithObj();
        BlockWithObj obj3 = new BlockWithObj();

        obj.start();
        obj2.start();
        obj3.start();
    }
}
