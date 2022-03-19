/*
 * Copyright (c) 2022.
 * Shankargouda Annigeri
 *
 *
 */

package com.practise.LeetCode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class FirstMissingPositiveIntegerTest {

    @Test
    public void firstMissingPositiveTest(){

        FirstMissingPositiveInteger firstMissingPositiveInteger = new FirstMissingPositiveInteger();

//        Arrays.asList(1,2,2,3);
        int[] a = {1,5,0,3};
        Integer result = firstMissingPositiveInteger.missingPositive(a);

        //Assert.assertThat(result,3);
        System.out.println(result);
    }
}