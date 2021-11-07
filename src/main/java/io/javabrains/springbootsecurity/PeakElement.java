package io.javabrains.springbootsecurity;

public class PeakElement {

    public static void main(String[] args) {
        int arr[] = { 1, 3, 20, 4, 100, 0 };
        int n = arr.length;
        System.out.print("Index of a peak point is " +
                findPeak(arr, n));
    }

    private static int findPeak(int[] arr, int n) {

        if(n ==1 ){
            System.out.println("here");
            return 0;
        }

        if(arr[0] >= arr[1]){
            System.out.println("here1");
            return 0;
        }



        if(arr[n-1] >= arr[n-2]){

            return arr[n-1];
        }

        for(int i =1;i<n-1;i++){

            if(arr[i] > arr[i+1] && arr[i] > arr[i+1]){
                return arr[i];
            }

        }

        return 0;
    }


}
