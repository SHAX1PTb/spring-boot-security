package com.practise.LeetCode;

public class MultiThreading implements Runnable{


    String name;
    public MultiThreading(String name) {
        this.name = name;
    }

    public void run()  {

        System.out.println("Multithreading.. "+name);
    }

}
