package io.javabrains.springbootsecurity;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class JumpTest  {

    @Test
    public void testJump(){


        Jump aa = new Jump();

        int[] a = new int[] {2,3,1,1,4};
    Assert.assertEquals(2,aa.jump(a));

    }

}