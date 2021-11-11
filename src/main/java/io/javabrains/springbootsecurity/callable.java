package io.javabrains.springbootsecurity;

import java.util.concurrent.Callable;

public class callable implements Callable<Integer> {

    Integer number;

    public callable(Integer number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println("Multithreaded Number is :"+number);

        return number+1;
    }
}
