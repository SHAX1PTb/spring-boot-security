package com.practise.LeetCode;

public class SingTest {

    static  SingTest singTest = new SingTest();

    private SingTest(){

    };

    public  static SingTest getInstance(){
        return singTest;
    }


}
