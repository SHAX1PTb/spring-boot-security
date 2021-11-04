package io.javabrains.springbootsecurity;

public class SingTest {

    static  SingTest singTest = new SingTest();

    private SingTest(){

    };

    public  static SingTest getInstance(){
        return singTest;
    }


}
