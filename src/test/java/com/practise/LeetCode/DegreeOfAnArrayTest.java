/*
 * Copyright (c) 2022.
 * Shankargouda Annigeri
 *
 *
 */

package com.practise.LeetCode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DegreeOfAnArrayTest {

    @Test
    public void TestClassDegree() {
        DegreeOfAnArray degreeOfAnArray = new DegreeOfAnArray();

        int [] a = {1,2,2,3,1};
        int ans = degreeOfAnArray.findShortestSubArray(a);
        Assert.assertEquals(2, ans);

    }

}