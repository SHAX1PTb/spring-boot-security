package io.javabrains.springbootsecurity;

import java.util.Arrays;

import static io.javabrains.springbootsecurity.MinimumBribe.swap;

public class MinimumSwap {

    public int minimumSwaps(int[] arr){

        int swapcount =0;

        int[] temp = Arrays.copyOfRange(arr,0,arr.length);
        Arrays.sort(temp);

        for(int i = 0;i<arr.length-1;i++){

            if(arr[i] != temp[i]){
                swap(arr,i,indexOf(arr,temp[i]));
                swapcount++;
            }

        }
        return swapcount;
    }

    private int indexOf(int[] arr, int exe) {

        for(int i =0;i<arr.length;i++){
            if(arr[i] == exe){
                return i;
            }
        }
        return -1;
    }




}
