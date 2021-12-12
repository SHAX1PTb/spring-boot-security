package com.practise.LeetCode;

public class FirstLastElementInArray {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 2, 2, 3, 4, 7, 8, 8 };
        int x = 8;
        findFirstAndLast(arr, x);
    }

    private static void findFirstAndLast(int[] arr, int x) {

        int n = arr.length;
        int First = -1;
        int Last = -1;

        for(int i =0;i<arr.length;i++){

            if(arr[i] != x){
                continue;
            }
            if(First == -1){
                First = i;
            } else {
                Last = i;
            }


        }

        System.out.println("First:"+First);
        System.out.println("Last:"+Last);
    }
}
