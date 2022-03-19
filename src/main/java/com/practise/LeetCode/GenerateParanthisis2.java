/*
 * Copyright (c) 2022.
 * Shankargouda Annigeri
 *
 *
 */

package com.practise.LeetCode;


import java.util.*;

public class GenerateParanthisis2 {

    public List<String> generateParanthisis2(int n){

        List<String> ans = new ArrayList<>();
        backtrack(ans,new StringBuilder() , 0,0,n);

        return  ans;


    }

    void backtrack(List<String> ans , StringBuilder cur,int open,int close,int max ) {

        if(cur.length() == max*2) {
            ans.add(cur.toString());
        }

        if (open <max ){
            cur.append("(");
            backtrack(ans,cur,open+1,close,max);
        }

        if(close < open){
            cur.append(")");
            backtrack(ans,cur,open,close+1,max);
        }
    }
}
