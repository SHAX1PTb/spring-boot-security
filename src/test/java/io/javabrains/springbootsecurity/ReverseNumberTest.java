package io.javabrains.springbootsecurity;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class ReverseNumberTest  {

    @Test
    public void reversNumtest(){

        int a = -123;

        ReverseNumber reverseNumber = new ReverseNumber();

//        reverseNumber.reverseNum(a);

        Assert.assertEquals(-321,reverseNumber.reverseNum(a));

    }

}