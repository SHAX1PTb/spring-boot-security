package com.practise.LeetCode;

import org.junit.Test;

public class MaxIntegerTest  {

    @Test
    public void maxIntegerTest(){

        MaxInteger maxInteger1 = new MaxInteger();

        String result = maxInteger1.maxValue("-13",2);
        System.out.println(result);
      //  Assert.assertEquals(0,result);
    }

}