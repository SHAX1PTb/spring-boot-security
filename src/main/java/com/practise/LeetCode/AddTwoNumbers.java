package com.practise.LeetCode;

import java.util.Arrays;

public class AddTwoNumbers {

    public static void main(String[] args) {

        int a[] = {1, 2, 9};
        int b[] = {1, 2, 1};

        int n = a.length;
        int m = b.length;
        System.out.println(Arrays.toString(calcsum(a, b, n, m)));

    }

    private static int[] calcsum(int[] a, int[] b, int n, int m) {

        int[] sum = new int[n];

        int i = n - 1, j = m - 1, k = n - 1;
        int carry = 0, s = 0;

        while (j >= 0) {
            s = a[i] + b[j] + carry;
            sum[k] = (s % 10);
            carry = s / 10;
            k--;
            i--;
            j--;

        }
        while (i >= 0) {
            s = a[i] + carry;
            sum[k] = s % 10;
            carry = s / 10;
            i--;
            k--;
        }
        int ans = 0;


        return sum;
    }
}
