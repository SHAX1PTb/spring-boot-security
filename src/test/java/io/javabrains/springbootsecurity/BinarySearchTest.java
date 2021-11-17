package io.javabrains.springbootsecurity;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void binarysearchTest(){

        BinarySearch binarySearch = new BinarySearch();
        int [] nums = {-1,0,3,5,9,12};
        int target = 9;

        Assert.assertEquals(4,binarySearch.search(nums,9));
    }

}