package io.javabrains.springbootsecurity;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test4 {

    public static void main(String[] args) {

        int[] a = new int[]{1, 1, 2,  1, 5, 3};
        int[] expected = new int[7];
        //   int b = filter(a);

        Arrays.sort(a);
        int pp= 0;

        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length -1; i++) {
            if (a[i] == a[i + 1]) {
                System.out.println("Skipped" + a[i]);
            } else {
                System.out.println(i);
                expected[pp] = a[i];
                pp++;
            }
        }

        System.out.println(Arrays.toString(expected));
        System.out.println(pp);
    }


}
