/*
 * Copyright (c) 2022.
 * Shankargouda Annigeri
 *
 *
 */
package com.practise.LeetCode;

import java.util.*;

public class Twitter {
    private static int timestamp =0;

    private Map<Integer,User> userMap;

    public class User {
        public int id;
        public Set<Integer> followed;
      //  public Tweet tweet_head;

        public User(int id){

            this.id = id ;
            followed = new HashSet<>();

        }

    }
}
