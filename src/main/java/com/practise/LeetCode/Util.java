package com.practise.LeetCode;

import org.junit.Assert;


import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class Util {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        String name = "Shankar";

        MultiThreading multiThreading = new MultiThreading(name);

        Thread thread = new Thread(multiThreading);
        thread.start();
        thread.run();


        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<Integer> future = executorService.submit(new callable(1));

        Assert.assertEquals(2,future.get().intValue());


    }
}
