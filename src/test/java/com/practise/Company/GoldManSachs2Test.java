package com.practise.Company;

import com.practise.Company.GoldManSachs_2;
import org.junit.Assert;
import org.junit.Test;

public class GoldManSachs2Test {

    @Test
    public void nonRepeatTest(){

        GoldManSachs_2 nonRepeting = new GoldManSachs_2();

        ;
        Assert.assertEquals("d",nonRepeting.nonRepetingChar("aabbccd"));

    }

}