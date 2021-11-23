package io.javabrains.springbootsecurity;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesInStringTest  {

    @Test
    public void TestRemoveDup(){

        RemoveDuplicatesInString removeDuplicatesInString = new RemoveDuplicatesInString();
        Integer aa = removeDuplicatesInString.alternatingCharacters("AAAA");
        Assert.assertEquals(Integer.valueOf(3),aa);
    }

}