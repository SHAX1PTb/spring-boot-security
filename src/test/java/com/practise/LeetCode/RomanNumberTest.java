package com.practise.LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumberTest  {

    @Test
    public void romanTest(){

        RomanNumber romanNumber = new RomanNumber();

        Assert.assertEquals("X",romanNumber.intToRoman(10));

    }

}