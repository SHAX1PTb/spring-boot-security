package com.practise.LeetCode;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class IpAddressTest  {

    @Test
    public void testIPAddr(){
        IpAddress ipAddress = new IpAddress();


        Assert.assertEquals("255[.]100[.]50[.]0" ,  ipAddress.defangIPAdrress("255.100.50.0"));

    }

}