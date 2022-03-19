/*
 * Copyright (c) 2022.
 * Shankargouda Annigeri
 *
 *
 */

package com.practise.LeetCode;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GroupAnagramsTest {

    @Test
    public void groupAnagramTest(){
       GroupAnagrams groupAnagrams1 = new GroupAnagrams();

       String[] a = {"are","bat","ear","code","tab","era"};
        System.out.println(groupAnagrams1.groupAnagram(a));

    }

}