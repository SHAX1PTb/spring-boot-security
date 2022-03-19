/*
 * Copyright (c) 2022.
 * Shankargouda Annigeri
 *
 *
 */

package com.practise.LeetCode;

import java.util.*;

public class GenerateParanthesis {

    public List<String> generateParantesis(int n) {

        List<String> combination = new ArrayList<>();

        genearteAll(new char[2 * n], 0, combination);

        return combination;


    }

    private void genearteAll(char[] current, int pos, List<String> result) {

        if (pos == current.length) {
            if (valid(current)) {
                result.add(new String(current));
            }
        } else {
            current[pos] = '(';
            genearteAll(current, pos + 1, result);
            current[pos] = ')';
            genearteAll(current, pos + 1, result);
           // System.out.println(pos);

        }

    }

    private boolean valid(char[] current) {
        int balance = 0;
        for (char c : current) {
            if (c == '(') balance++;
            else balance--;
            if (balance < 0) return false;
        }

        return (balance == 0);
    }
}
