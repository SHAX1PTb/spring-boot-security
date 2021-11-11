package io.javabrains.springbootsecurity;

public class LearnSingleton {

    static LearnSingleton learnSingleton = new LearnSingleton();


    private LearnSingleton() {

    }

    public static LearnSingleton getlearnSingleton() {

        return learnSingleton;

    }

}
