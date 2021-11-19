package io.javabrains.springbootsecurity;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxLengthOfStringTest  {

    @Test
    public void maxlengthTest(){


        MaxLengthOfString maxLengthOfString = new MaxLengthOfString();

        List<String> arr = new ArrayList<>(Arrays.asList(new String[]{"un", "iq", "ue"}));

        int a = maxLengthOfString.maxLength(arr);
        Assert.assertEquals(4,a);
    }

}