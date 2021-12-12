package com.practise.LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class Test20Test  {

    @Test
    public void anagramTest(){

        Test20 test20 = new Test20();
        String one = "School master";
        String two = "The classroom";

        Assert.assertEquals(true,test20.checkAnagram(one,two));

    }

}