package io.javabrains.springbootsecurity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class merge {
    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List<Integer> c = new ArrayList<>();

        a.add(1);
        a.add(3);
        b.add(2);
        b.add(4);

       c.addAll(a);
       c.addAll(b);
        Collections.sort(c);
        //System.out.println(c);


        List<Integer> source = Arrays.asList(1, 2, 3);
        List<Integer> dest = Arrays.asList(5, 6, 7, 8, 9, 10);
        Collections.copy(dest, source);
        System.out.println(source);
        System.out.println(dest);
    }
}
