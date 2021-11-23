package io.javabrains.springbootsecurity;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class FirstLastElementsSortedArrayTest  {

    @Test
    public void TestSearchElement(){

        FirstLastElementsSortedArray firstLastElementsSortedArray = new FirstLastElementsSortedArray();

        int[] a = new int[] {5,7,7,8,8,10};
        int b = 8;

        int[] val = new int[] {3,4};

        int[] ret = firstLastElementsSortedArray.searchRange(a,b);

//    System.out.println(Arrays.toString(ret));
//    System.out.println(Arrays.toString(val));


        Assert.assertArrayEquals(val,ret);
    }

}