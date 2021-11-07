package io.javabrains.springbootsecurity;

public class Util {

    public static void main(String[] args) {

        String name = "Shankar";

        MultiThreading multiThreading = new MultiThreading(name);

        Thread thread = new Thread(multiThreading);
        thread.start();
        thread.run();

    }
}
