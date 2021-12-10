package io.javabrains.springbootsecurity;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class LongestCommonPrefixTest  {

    @Test
    public void longcommTest(){

        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

        String [] names = new String[] {"flower","flow","flight"};

        Assert.assertEquals("fl",longestCommonPrefix.longestCommonPrefix(names));

    }

}