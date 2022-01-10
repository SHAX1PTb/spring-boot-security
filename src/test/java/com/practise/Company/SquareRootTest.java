package com.practise.Company;

import com.practise.Company.SquareRoot;
import org.junit.Assert;
import org.junit.Test;

public class SquareRootTest  {

    @Test
    public void suareRootTest(){

        SquareRoot squareRoot = new SquareRoot();

        Assert.assertEquals(Integer.valueOf(2),squareRoot.calSquareRoot(8));

    }

}