package io.javabrains.springbootsecurity;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class MaxIntegerTest  {

    @Test
    public void maxIntegerTest(){

        MaxInteger maxInteger = new MaxInteger();

        String result = maxInteger.maxValue("-13",2);
        System.out.println(result);
      //  Assert.assertEquals(0,result);
    }

}