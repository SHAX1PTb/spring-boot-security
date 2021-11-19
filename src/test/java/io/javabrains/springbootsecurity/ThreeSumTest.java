package io.javabrains.springbootsecurity;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ThreeSumTest  {

    @Test
    public void threesumTest(){
        ThreeSum threeSum = new ThreeSum();

        System.out.println(threeSum.threeSum(new int[]{-1,0,1,2,-1,-4}));
    }

}