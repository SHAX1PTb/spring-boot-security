package io.javabrains.springbootsecurity;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;

public class MinimumBribeTest  {

    @Test
    public void TestMinimunBribe(){

        MinimumBribe minimumBribe = new MinimumBribe();

        minimumBribe.minimumBribes(new int[]{1,5,3,4,2});
    }

}